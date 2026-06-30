package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewResp_setLastPlayDate_73620426074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26013;

    public GetUserPreviewResp_setLastPlayDate_73620426074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26013 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26013, term26013.getClass(), "userId", null);
        setBooleanField(term26013, term26013.getClass(), "isLogin", false);
        setField(term26013, term26013.getClass(), "lastLoginDate", null);
        setField(term26013, term26013.getClass(), "userName", null);
        setIntField(term26013, term26013.getClass(), "reincarnationNum", 0);
        setIntField(term26013, term26013.getClass(), "level", 0);
        setField(term26013, term26013.getClass(), "exp", null);
        setIntField(term26013, term26013.getClass(), "playerRating", 0);
        setField(term26013, term26013.getClass(), "lastGameId", null);
        setField(term26013, term26013.getClass(), "lastRomVersion", null);
        setField(term26013, term26013.getClass(), "lastDataVersion", null);
        setField(term26013, term26013.getClass(), "lastPlayDate", null);
        setIntField(term26013, term26013.getClass(), "trophyId", 0);
        setField(term26013, term26013.getClass(), "userCharacter", null);
        setIntField(term26013, term26013.getClass(), "playerLevel", 0);
        setIntField(term26013, term26013.getClass(), "rating", 0);
        setIntField(term26013, term26013.getClass(), "headphone", 0);
        setIntField(term26013, term26013.getClass(), "chargeState", 0);
        setField(term26013, term26013.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term26013, args);
    }

};


