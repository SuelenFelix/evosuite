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

public class GetUserPreviewResp_getUserId_165801938148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31799;

    public GetUserPreviewResp_getUserId_165801938148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31799 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term31799, term31799.getClass(), "userId", 0L);
        setField(term31799, term31799.getClass(), "userName", null);
        setBooleanField(term31799, term31799.getClass(), "isLogin", false);
        setField(term31799, term31799.getClass(), "lastGameId", null);
        setField(term31799, term31799.getClass(), "lastDataVersion", null);
        setField(term31799, term31799.getClass(), "lastRomVersion", null);
        setField(term31799, term31799.getClass(), "lastLoginDate", null);
        setField(term31799, term31799.getClass(), "lastPlayDate", null);
        setIntField(term31799, term31799.getClass(), "playerRating", 0);
        setIntField(term31799, term31799.getClass(), "nameplateId", 0);
        setIntField(term31799, term31799.getClass(), "iconId", 0);
        setIntField(term31799, term31799.getClass(), "trophyId", 0);
        setIntField(term31799, term31799.getClass(), "partnerId", 0);
        setIntField(term31799, term31799.getClass(), "frameId", 0);
        setIntField(term31799, term31799.getClass(), "dispRate", 0);
        setIntField(term31799, term31799.getClass(), "totalAwake", 0);
        setIntField(term31799, term31799.getClass(), "isNetMember", 0);
        setField(term31799, term31799.getClass(), "dailyBonusDate", null);
        setIntField(term31799, term31799.getClass(), "headPhoneVolume", 0);
        setBooleanField(term31799, term31799.getClass(), "isInherit", false);
        setIntField(term31799, term31799.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term31799, args);
    }

};


