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

public class GetUserPreviewResp_canEqual_112845024883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26113;

    public GetUserPreviewResp_canEqual_112845024883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26113 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26113, term26113.getClass(), "userId", null);
        setBooleanField(term26113, term26113.getClass(), "isLogin", false);
        setField(term26113, term26113.getClass(), "lastLoginDate", null);
        setField(term26113, term26113.getClass(), "userName", null);
        setIntField(term26113, term26113.getClass(), "reincarnationNum", 0);
        setIntField(term26113, term26113.getClass(), "level", 0);
        setField(term26113, term26113.getClass(), "exp", null);
        setIntField(term26113, term26113.getClass(), "playerRating", 0);
        setField(term26113, term26113.getClass(), "lastGameId", null);
        setField(term26113, term26113.getClass(), "lastRomVersion", null);
        setField(term26113, term26113.getClass(), "lastDataVersion", null);
        setField(term26113, term26113.getClass(), "lastPlayDate", null);
        setIntField(term26113, term26113.getClass(), "trophyId", 0);
        setField(term26113, term26113.getClass(), "userCharacter", null);
        setIntField(term26113, term26113.getClass(), "playerLevel", 0);
        setIntField(term26113, term26113.getClass(), "rating", 0);
        setIntField(term26113, term26113.getClass(), "headphone", 0);
        setIntField(term26113, term26113.getClass(), "chargeState", 0);
        setField(term26113, term26113.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term26113, args);
    }

};


