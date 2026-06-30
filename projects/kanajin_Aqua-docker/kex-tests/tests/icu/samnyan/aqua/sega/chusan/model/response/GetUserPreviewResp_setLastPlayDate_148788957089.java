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

public class GetUserPreviewResp_setLastPlayDate_148788957089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53044;

    public GetUserPreviewResp_setLastPlayDate_148788957089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53044 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53044, term53044.getClass(), "userId", null);
        setBooleanField(term53044, term53044.getClass(), "isLogin", false);
        setField(term53044, term53044.getClass(), "lastLoginDate", null);
        setField(term53044, term53044.getClass(), "userName", null);
        setIntField(term53044, term53044.getClass(), "reincarnationNum", 0);
        setIntField(term53044, term53044.getClass(), "level", 0);
        setField(term53044, term53044.getClass(), "exp", null);
        setIntField(term53044, term53044.getClass(), "playerRating", 0);
        setField(term53044, term53044.getClass(), "lastGameId", null);
        setField(term53044, term53044.getClass(), "lastRomVersion", null);
        setField(term53044, term53044.getClass(), "lastDataVersion", null);
        setField(term53044, term53044.getClass(), "lastPlayDate", null);
        setIntField(term53044, term53044.getClass(), "emoneyBrandId", 0);
        setIntField(term53044, term53044.getClass(), "trophyId", 0);
        setField(term53044, term53044.getClass(), "userCharacter", null);
        setIntField(term53044, term53044.getClass(), "playerLevel", 0);
        setIntField(term53044, term53044.getClass(), "rating", 0);
        setIntField(term53044, term53044.getClass(), "headphone", 0);
        setIntField(term53044, term53044.getClass(), "chargeState", 0);
        setField(term53044, term53044.getClass(), "userNameEx", null);
        setIntField(term53044, term53044.getClass(), "banState", 0);
        setIntField(term53044, term53044.getClass(), "classEmblemMedal", 0);
        setIntField(term53044, term53044.getClass(), "classEmblemBase", 0);
        setIntField(term53044, term53044.getClass(), "battleRankId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term53044, args);
    }

};


