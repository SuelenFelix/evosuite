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

public class GetUserPreviewResp_getIsNetMember_94619611264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32039;

    public GetUserPreviewResp_getIsNetMember_94619611264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32039 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32039, term32039.getClass(), "userId", 0L);
        setField(term32039, term32039.getClass(), "userName", null);
        setBooleanField(term32039, term32039.getClass(), "isLogin", false);
        setField(term32039, term32039.getClass(), "lastGameId", null);
        setField(term32039, term32039.getClass(), "lastDataVersion", null);
        setField(term32039, term32039.getClass(), "lastRomVersion", null);
        setField(term32039, term32039.getClass(), "lastLoginDate", null);
        setField(term32039, term32039.getClass(), "lastPlayDate", null);
        setIntField(term32039, term32039.getClass(), "playerRating", 0);
        setIntField(term32039, term32039.getClass(), "nameplateId", 0);
        setIntField(term32039, term32039.getClass(), "iconId", 0);
        setIntField(term32039, term32039.getClass(), "trophyId", 0);
        setIntField(term32039, term32039.getClass(), "partnerId", 0);
        setIntField(term32039, term32039.getClass(), "frameId", 0);
        setIntField(term32039, term32039.getClass(), "dispRate", 0);
        setIntField(term32039, term32039.getClass(), "totalAwake", 0);
        setIntField(term32039, term32039.getClass(), "isNetMember", 0);
        setField(term32039, term32039.getClass(), "dailyBonusDate", null);
        setIntField(term32039, term32039.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32039, term32039.getClass(), "isInherit", false);
        setIntField(term32039, term32039.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNetMember", argTypes, term32039, args);
    }

};


