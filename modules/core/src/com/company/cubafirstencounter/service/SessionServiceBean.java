package com.company.cubafirstencounter.service;

import com.company.cubafirstencounter.entity.Session;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;

@Service(SessionService.NAME)
public class SessionServiceBean implements SessionService {

    @Inject
    private DataManager dataManager;

    @Override
    public boolean rescheduleSession(Session session, Date newStartDate) {
        Date newEndDate =  Session.calculateEndDate(newStartDate);

        int sessionsSameTime = dataManager.load(Session.class)
                .query("select s from cubafirstencounter_Session s where " +
                        "s.startDate < :newEndDate and s.endDate > :newStartDate " +
                        "and s.speaker = :speaker " +
                        "and s.id <> :sessionId")
                .parameter("newStartDate", newStartDate)
                .parameter("newEndDate", newEndDate)
                .parameter("speaker", session.getSpeaker())
                .parameter("sessionId", session.getId())
                .list().size();

        if (sessionsSameTime == 0) {
            session.setStartDate(newStartDate);
            dataManager.commit(session);
            return true;
        }

        return false;
    }
}