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

public class GetUserPreviewResp_equals_1180927567102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53259;

    public GetUserPreviewResp_equals_1180927567102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53259 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53259, term53259.getClass(), "userId", null);
        setBooleanField(term53259, term53259.getClass(), "isLogin", false);
        setField(term53259, term53259.getClass(), "lastLoginDate", null);
        setField(term53259, term53259.getClass(), "userName", null);
        setIntField(term53259, term53259.getClass(), "reincarnationNum", 0);
        setIntField(term53259, term53259.getClass(), "level", 0);
        setField(term53259, term53259.getClass(), "exp", null);
        setIntField(term53259, term53259.getClass(), "playerRating", 0);
        setField(term53259, term53259.getClass(), "lastGameId", null);
        setField(term53259, term53259.getClass(), "lastRomVersion", null);
        setField(term53259, term53259.getClass(), "lastDataVersion", null);
        setField(term53259, term53259.getClass(), "lastPlayDate", null);
        setIntField(term53259, term53259.getClass(), "emoneyBrandId", 0);
        setIntField(term53259, term53259.getClass(), "trophyId", 0);
        setField(term53259, term53259.getClass(), "userCharacter", null);
        setIntField(term53259, term53259.getClass(), "playerLevel", 0);
        setIntField(term53259, term53259.getClass(), "rating", 0);
        setIntField(term53259, term53259.getClass(), "headphone", 0);
        setIntField(term53259, term53259.getClass(), "chargeState", 0);
        setField(term53259, term53259.getClass(), "userNameEx", null);
        setIntField(term53259, term53259.getClass(), "banState", 0);
        setIntField(term53259, term53259.getClass(), "classEmblemMedal", 0);
        setIntField(term53259, term53259.getClass(), "classEmblemBase", 0);
        setIntField(term53259, term53259.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term53259, args);
    }

};


