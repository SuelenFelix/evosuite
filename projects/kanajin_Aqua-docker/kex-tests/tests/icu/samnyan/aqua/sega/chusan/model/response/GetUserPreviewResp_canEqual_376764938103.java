package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_canEqual_376764938103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53274;

    public GetUserPreviewResp_canEqual_376764938103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53274 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53274, term53274.getClass(), "userId", null);
        setBooleanField(term53274, term53274.getClass(), "isLogin", false);
        setField(term53274, term53274.getClass(), "lastLoginDate", null);
        setField(term53274, term53274.getClass(), "userName", null);
        setIntField(term53274, term53274.getClass(), "reincarnationNum", 0);
        setIntField(term53274, term53274.getClass(), "level", 0);
        setField(term53274, term53274.getClass(), "exp", null);
        setIntField(term53274, term53274.getClass(), "playerRating", 0);
        setField(term53274, term53274.getClass(), "lastGameId", null);
        setField(term53274, term53274.getClass(), "lastRomVersion", null);
        setField(term53274, term53274.getClass(), "lastDataVersion", null);
        setField(term53274, term53274.getClass(), "lastPlayDate", null);
        setIntField(term53274, term53274.getClass(), "emoneyBrandId", 0);
        setIntField(term53274, term53274.getClass(), "trophyId", 0);
        setField(term53274, term53274.getClass(), "userCharacter", null);
        setIntField(term53274, term53274.getClass(), "playerLevel", 0);
        setIntField(term53274, term53274.getClass(), "rating", 0);
        setIntField(term53274, term53274.getClass(), "headphone", 0);
        setIntField(term53274, term53274.getClass(), "chargeState", 0);
        setField(term53274, term53274.getClass(), "userNameEx", null);
        setIntField(term53274, term53274.getClass(), "banState", 0);
        setIntField(term53274, term53274.getClass(), "classEmblemMedal", 0);
        setIntField(term53274, term53274.getClass(), "classEmblemBase", 0);
        setIntField(term53274, term53274.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term53274, args);
    }

};


