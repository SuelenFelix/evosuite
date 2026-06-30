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

public class GetUserPreviewResp_toString_2140373932105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53304;

    public GetUserPreviewResp_toString_2140373932105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53304 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53304, term53304.getClass(), "userId", null);
        setBooleanField(term53304, term53304.getClass(), "isLogin", false);
        setField(term53304, term53304.getClass(), "lastLoginDate", null);
        setField(term53304, term53304.getClass(), "userName", null);
        setIntField(term53304, term53304.getClass(), "reincarnationNum", 0);
        setIntField(term53304, term53304.getClass(), "level", 0);
        setField(term53304, term53304.getClass(), "exp", null);
        setIntField(term53304, term53304.getClass(), "playerRating", 0);
        setField(term53304, term53304.getClass(), "lastGameId", null);
        setField(term53304, term53304.getClass(), "lastRomVersion", null);
        setField(term53304, term53304.getClass(), "lastDataVersion", null);
        setField(term53304, term53304.getClass(), "lastPlayDate", null);
        setIntField(term53304, term53304.getClass(), "emoneyBrandId", 0);
        setIntField(term53304, term53304.getClass(), "trophyId", 0);
        setField(term53304, term53304.getClass(), "userCharacter", null);
        setIntField(term53304, term53304.getClass(), "playerLevel", 0);
        setIntField(term53304, term53304.getClass(), "rating", 0);
        setIntField(term53304, term53304.getClass(), "headphone", 0);
        setIntField(term53304, term53304.getClass(), "chargeState", 0);
        setField(term53304, term53304.getClass(), "userNameEx", null);
        setIntField(term53304, term53304.getClass(), "banState", 0);
        setIntField(term53304, term53304.getClass(), "classEmblemMedal", 0);
        setIntField(term53304, term53304.getClass(), "classEmblemBase", 0);
        setIntField(term53304, term53304.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term53304, args);
    }

};


