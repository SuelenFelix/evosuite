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

public class GetUserPreviewResp_setLastRomVersion_64487108274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32193;

    public GetUserPreviewResp_setLastRomVersion_64487108274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32193, term32193.getClass(), "userId", 0L);
        setField(term32193, term32193.getClass(), "userName", null);
        setBooleanField(term32193, term32193.getClass(), "isLogin", false);
        setField(term32193, term32193.getClass(), "lastGameId", null);
        setField(term32193, term32193.getClass(), "lastDataVersion", null);
        setField(term32193, term32193.getClass(), "lastRomVersion", null);
        setField(term32193, term32193.getClass(), "lastLoginDate", null);
        setField(term32193, term32193.getClass(), "lastPlayDate", null);
        setIntField(term32193, term32193.getClass(), "playerRating", 0);
        setIntField(term32193, term32193.getClass(), "nameplateId", 0);
        setIntField(term32193, term32193.getClass(), "iconId", 0);
        setIntField(term32193, term32193.getClass(), "trophyId", 0);
        setIntField(term32193, term32193.getClass(), "partnerId", 0);
        setIntField(term32193, term32193.getClass(), "frameId", 0);
        setIntField(term32193, term32193.getClass(), "dispRate", 0);
        setIntField(term32193, term32193.getClass(), "totalAwake", 0);
        setIntField(term32193, term32193.getClass(), "isNetMember", 0);
        setField(term32193, term32193.getClass(), "dailyBonusDate", null);
        setIntField(term32193, term32193.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32193, term32193.getClass(), "isInherit", false);
        setIntField(term32193, term32193.getClass(), "banState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term32193, args);
    }

};


