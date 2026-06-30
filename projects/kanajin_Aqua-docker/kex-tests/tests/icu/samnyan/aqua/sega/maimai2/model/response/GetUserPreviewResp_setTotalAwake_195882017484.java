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
import java.lang.Integer;

public class GetUserPreviewResp_setTotalAwake_195882017484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32357;
     Object term32372;

    public GetUserPreviewResp_setTotalAwake_195882017484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32357 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32357, term32357.getClass(), "userId", 0L);
        setField(term32357, term32357.getClass(), "userName", null);
        setBooleanField(term32357, term32357.getClass(), "isLogin", false);
        setField(term32357, term32357.getClass(), "lastGameId", null);
        setField(term32357, term32357.getClass(), "lastDataVersion", null);
        setField(term32357, term32357.getClass(), "lastRomVersion", null);
        setField(term32357, term32357.getClass(), "lastLoginDate", null);
        setField(term32357, term32357.getClass(), "lastPlayDate", null);
        setIntField(term32357, term32357.getClass(), "playerRating", 0);
        setIntField(term32357, term32357.getClass(), "nameplateId", 0);
        setIntField(term32357, term32357.getClass(), "iconId", 0);
        setIntField(term32357, term32357.getClass(), "trophyId", 0);
        setIntField(term32357, term32357.getClass(), "partnerId", 0);
        setIntField(term32357, term32357.getClass(), "frameId", 0);
        setIntField(term32357, term32357.getClass(), "dispRate", 0);
        setIntField(term32357, term32357.getClass(), "totalAwake", 0);
        setIntField(term32357, term32357.getClass(), "isNetMember", 0);
        setField(term32357, term32357.getClass(), "dailyBonusDate", null);
        setIntField(term32357, term32357.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32357, term32357.getClass(), "isInherit", false);
        setIntField(term32357, term32357.getClass(), "banState", 0);
        term32372 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32372;
        callMethod(klass, "setTotalAwake", argTypes, term32357, args);
    }

};


