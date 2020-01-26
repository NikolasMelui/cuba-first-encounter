package com.company.cubafirstencounter.service;

import com.company.cubafirstencounter.entity.Session;

import java.util.Date;

public interface SessionService {
    String NAME = "cubafirstencounter_SessionService";

    boolean rescheduleSession(Session session, Date newStartDate);

}