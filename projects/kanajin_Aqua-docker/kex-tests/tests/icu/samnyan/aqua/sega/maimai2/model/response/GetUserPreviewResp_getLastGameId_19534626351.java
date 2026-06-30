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

public class GetUserPreviewResp_getLastGameId_19534626351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31844;

    public GetUserPreviewResp_getLastGameId_19534626351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31844 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31844, term31844.getClass(), "userId", 0L);
        setField(term31844, term31844.getClass(), "userName", null);
        setBooleanField(term31844, term31844.getClass(), "isLogin", false);
        setField(term31844, term31844.getClass(), "lastGameId", null);
        setField(term31844, term31844.getClass(), "lastDataVersion", null);
        setField(term31844, term31844.getClass(), "lastRomVersion", null);
        setField(term31844, term31844.getClass(), "lastLoginDate", null);
        setField(term31844, term31844.getClass(), "lastPlayDate", null);
        setIntField(term31844, term31844.getClass(), "playerRating", 0);
        setIntField(term31844, term31844.getClass(), "nameplateId", 0);
        setIntField(term31844, term31844.getClass(), "iconId", 0);
        setIntField(term31844, term31844.getClass(), "trophyId", 0);
        setIntField(term31844, term31844.getClass(), "partnerId", 0);
        setIntField(term31844, term31844.getClass(), "frameId", 0);
        setIntField(term31844, term31844.getClass(), "dispRate", 0);
        setIntField(term31844, term31844.getClass(), "totalAwake", 0);
        setIntField(term31844, term31844.getClass(), "isNetMember", 0);
        setField(term31844, term31844.getClass(), "dailyBonusDate", null);
        setIntField(term31844, term31844.getClass(), "headPhoneVolume", 0);
        setBooleanField(term31844, term31844.getClass(), "isInherit", false);
        setIntField(term31844, term31844.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term31844, args);
    }

};


