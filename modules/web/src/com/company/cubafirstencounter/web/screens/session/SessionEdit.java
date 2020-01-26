package com.company.cubafirstencounter.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubafirstencounter.entity.Session;

@UiController("cubafirstencounter_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}