package icu.samnyan.aqua.sega.maimai2.model.response;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_getTotalAwake_142176734415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26194;

    public GetUserPreviewResp_getTotalAwake_142176734415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26194 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term26194, term26194.getClass(), "userId", 3229827238251743416L);
        setField(term26194, term26194.getClass(), "userName", "NACnGDmVPl");
        setBooleanField(term26194, term26194.getClass(), "isLogin", false);
        setField(term26194, term26194.getClass(), "lastGameId", "SfWiFjkLGW");
        setField(term26194, term26194.getClass(), "lastDataVersion", "urBahuOkUQ");
        setField(term26194, term26194.getClass(), "lastRomVersion", "zHcZrTMdOT");
        setField(term26194, term26194.getClass(), "lastLoginDate", "zIAIXHeKXt");
        setField(term26194, term26194.getClass(), "lastPlayDate", "fVkSkOqFEO");
        setIntField(term26194, term26194.getClass(), "playerRating", 850063561);
        setIntField(term26194, term26194.getClass(), "nameplateId", -1157169769);
        setIntField(term26194, term26194.getClass(), "iconId", -718673454);
        setIntField(term26194, term26194.getClass(), "trophyId", -662035181);
        setIntField(term26194, term26194.getClass(), "partnerId", 430345693);
        setIntField(term26194, term26194.getClass(), "frameId", -516065529);
        setIntField(term26194, term26194.getClass(), "dispRate", 334889421);
        setIntField(term26194, term26194.getClass(), "totalAwake", 624371858);
        setIntField(term26194, term26194.getClass(), "isNetMember", -460751227);
        setField(term26194, term26194.getClass(), "dailyBonusDate", "DLfgyAqDDu");
        setIntField(term26194, term26194.getClass(), "headPhoneVolume", 1608431617);
        setBooleanField(term26194, term26194.getClass(), "isInherit", true);
        setIntField(term26194, term26194.getClass(), "banState", 112321383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAwake", argTypes, term26194, args);
    }

};


