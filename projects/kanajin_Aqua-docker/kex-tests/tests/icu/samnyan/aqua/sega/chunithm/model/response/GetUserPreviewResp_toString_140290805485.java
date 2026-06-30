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

public class GetUserPreviewResp_toString_140290805485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26133;

    public GetUserPreviewResp_toString_140290805485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26133 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26133, term26133.getClass(), "userId", null);
        setBooleanField(term26133, term26133.getClass(), "isLogin", false);
        setField(term26133, term26133.getClass(), "lastLoginDate", null);
        setField(term26133, term26133.getClass(), "userName", null);
        setIntField(term26133, term26133.getClass(), "reincarnationNum", 0);
        setIntField(term26133, term26133.getClass(), "level", 0);
        setField(term26133, term26133.getClass(), "exp", null);
        setIntField(term26133, term26133.getClass(), "playerRating", 0);
        setField(term26133, term26133.getClass(), "lastGameId", null);
        setField(term26133, term26133.getClass(), "lastRomVersion", null);
        setField(term26133, term26133.getClass(), "lastDataVersion", null);
        setField(term26133, term26133.getClass(), "lastPlayDate", null);
        setIntField(term26133, term26133.getClass(), "trophyId", 0);
        setField(term26133, term26133.getClass(), "userCharacter", null);
        setIntField(term26133, term26133.getClass(), "playerLevel", 0);
        setIntField(term26133, term26133.getClass(), "rating", 0);
        setIntField(term26133, term26133.getClass(), "headphone", 0);
        setIntField(term26133, term26133.getClass(), "chargeState", 0);
        setField(term26133, term26133.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26133, args);
    }

};


