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
import java.lang.Integer;

public class GetUserPreviewResp_setRating_58751074494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53125;
     Object term53140;

    public GetUserPreviewResp_setRating_58751074494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53125 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53125, term53125.getClass(), "userId", null);
        setBooleanField(term53125, term53125.getClass(), "isLogin", false);
        setField(term53125, term53125.getClass(), "lastLoginDate", null);
        setField(term53125, term53125.getClass(), "userName", null);
        setIntField(term53125, term53125.getClass(), "reincarnationNum", 0);
        setIntField(term53125, term53125.getClass(), "level", 0);
        setField(term53125, term53125.getClass(), "exp", null);
        setIntField(term53125, term53125.getClass(), "playerRating", 0);
        setField(term53125, term53125.getClass(), "lastGameId", null);
        setField(term53125, term53125.getClass(), "lastRomVersion", null);
        setField(term53125, term53125.getClass(), "lastDataVersion", null);
        setField(term53125, term53125.getClass(), "lastPlayDate", null);
        setIntField(term53125, term53125.getClass(), "emoneyBrandId", 0);
        setIntField(term53125, term53125.getClass(), "trophyId", 0);
        setField(term53125, term53125.getClass(), "userCharacter", null);
        setIntField(term53125, term53125.getClass(), "playerLevel", 0);
        setIntField(term53125, term53125.getClass(), "rating", 0);
        setIntField(term53125, term53125.getClass(), "headphone", 0);
        setIntField(term53125, term53125.getClass(), "chargeState", 0);
        setField(term53125, term53125.getClass(), "userNameEx", null);
        setIntField(term53125, term53125.getClass(), "banState", 0);
        setIntField(term53125, term53125.getClass(), "classEmblemMedal", 0);
        setIntField(term53125, term53125.getClass(), "classEmblemBase", 0);
        setIntField(term53125, term53125.getClass(), "battleRankId", 0);
        term53140 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53140;
        callMethod(klass, "setRating", argTypes, term53125, args);
    }

};


