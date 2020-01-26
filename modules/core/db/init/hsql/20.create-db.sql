-- begin CUBAFIRSTENCOUNTER_SESSION
alter table CUBAFIRSTENCOUNTER_SESSION add constraint FK_CUBAFIRSTENCOUNTER_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references CUBAFIRSTENCOUNTER_SPEAKER(ID)^
create index IDX_CUBAFIRSTENCOUNTER_SESSION_ON_SPEAKER on CUBAFIRSTENCOUNTER_SESSION (SPEAKER_ID)^
-- end CUBAFIRSTENCOUNTER_SESSION
-- begin CUBAFIRSTENCOUNTER_SPEAKER
create unique index IDX_CUBAFIRSTENCOUNTER_SPEAKER_UNIQ_EMAIL on CUBAFIRSTENCOUNTER_SPEAKER (EMAIL) ^
-- end CUBAFIRSTENCOUNTER_SPEAKER
