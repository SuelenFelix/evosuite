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

public class GetUserPreviewResp_setIconId_110161965379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32272;
     Object term32287;

    public GetUserPreviewResp_setIconId_110161965379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32272 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp"));
        setLongField(term32272, term32272.getClass(), "userId", 0L);
        setField(term32272, term32272.getClass(), "userName", null);
        setBooleanField(term32272, term32272.getClass(), "isLogin", false);
        setField(term32272, term32272.getClass(), "lastGameId", null);
        setField(term32272, term32272.getClass(), "lastDataVersion", null);
        setField(term32272, term32272.getClass(), "lastRomVersion", null);
        setField(term32272, term32272.getClass(), "lastLoginDate", null);
        setField(term32272, term32272.getClass(), "lastPlayDate", null);
        setIntField(term32272, term32272.getClass(), "playerRating", 0);
        setIntField(term32272, term32272.getClass(), "nameplateId", 0);
        setIntField(term32272, term32272.getClass(), "iconId", 0);
        setIntField(term32272, term32272.getClass(), "trophyId", 0);
        setIntField(term32272, term32272.getClass(), "partnerId", 0);
        setIntField(term32272, term32272.getClass(), "frameId", 0);
        setIntField(term32272, term32272.getClass(), "dispRate", 0);
        setIntField(term32272, term32272.getClass(), "totalAwake", 0);
        setIntField(term32272, term32272.getClass(), "isNetMember", 0);
        setField(term32272, term32272.getClass(), "dailyBonusDate", null);
        setIntField(term32272, term32272.getClass(), "headPhoneVolume", 0);
        setBooleanField(term32272, term32272.getClass(), "isInherit", false);
        setIntField(term32272, term32272.getClass(), "banState", 0);
        term32287 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32287;
        callMethod(klass, "setIconId", argTypes, term32272, args);
    }

};


