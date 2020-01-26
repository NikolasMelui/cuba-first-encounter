package com.company.cubafirstencounter.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubafirstencounter.entity.Speaker;

@UiController("cubafirstencounter_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}