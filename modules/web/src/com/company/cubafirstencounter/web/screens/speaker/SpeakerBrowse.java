package com.company.cubafirstencounter.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubafirstencounter.entity.Speaker;

@UiController("cubafirstencounter_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}