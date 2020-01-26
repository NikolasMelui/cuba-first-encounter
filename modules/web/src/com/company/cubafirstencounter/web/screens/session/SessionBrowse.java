package com.company.cubafirstencounter.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubafirstencounter.entity.Session;

@UiController("cubafirstencounter_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}