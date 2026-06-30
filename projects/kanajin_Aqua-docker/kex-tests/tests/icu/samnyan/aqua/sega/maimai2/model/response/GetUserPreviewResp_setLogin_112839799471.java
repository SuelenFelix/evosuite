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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_112839799471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32146;
     Object term32161;

    public GetUserPreviewResp_setLogin_112839799471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32146 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32146, term32146.getClass(), "userId", 0L);
        setField(term32146, term32146.getClass(), "userName", null);
        setBooleanField(term32146, term32146.getClass(), "isLogin", false);
        setField(term32146, term32146.getClass(), "lastGameId", null);
        setField(term32146, term32146.getClass(), "lastDataVersion", null);
        setField(term32146, term32146.getClass(), "lastRomVersion", null);
        setField(term32146, term32146.getClass(), "lastLoginDate", null);
        setField(term32146, term32146.getClass(), "lastPlayDate", null);
        setIntField(term32146, term32146.getClass(), "playerRating", 0);
        setIntField(term32146, term32146.getClass(), "nameplateId", 0);
        setIntField(term32146, term32146.getClass(), "iconId", 0);
        setIntField(term32146, term32146.getClass(), "trophyId", 0);
        setIntField(term32146, term32146.getClass(), "partnerId", 0);
        setIntField(term32146, term32146.getClass(), "frameId", 0);
        setIntField(term32146, term32146.getClass(), "dispRate", 0);
        setIntField(term32146, term32146.getClass(), "totalAwake", 0);
        setIntField(term32146, term32146.getClass(), "isNetMember", 0);
        setField(term32146, term32146.getClass(), "dailyBonusDate", null);
        setIntField(term32146, term32146.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32146, term32146.getClass(), "isInherit", false);
        setIntField(term32146, term32146.getClass(), "banState", 0);
        term32161 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term32161;
        callMethod(klass, "setLogin", argTypes, term32146, args);
    }

};


