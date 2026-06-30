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

public class GetUserPreviewResp_setLastRomVersion_178594020272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25993;

    public GetUserPreviewResp_setLastRomVersion_178594020272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25993 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25993, term25993.getClass(), "userId", null);
        setBooleanField(term25993, term25993.getClass(), "isLogin", false);
        setField(term25993, term25993.getClass(), "lastLoginDate", null);
        setField(term25993, term25993.getClass(), "userName", null);
        setIntField(term25993, term25993.getClass(), "reincarnationNum", 0);
        setIntField(term25993, term25993.getClass(), "level", 0);
        setField(term25993, term25993.getClass(), "exp", null);
        setIntField(term25993, term25993.getClass(), "playerRating", 0);
        setField(term25993, term25993.getClass(), "lastGameId", null);
        setField(term25993, term25993.getClass(), "lastRomVersion", null);
        setField(term25993, term25993.getClass(), "lastDataVersion", null);
        setField(term25993, term25993.getClass(), "lastPlayDate", null);
        setIntField(term25993, term25993.getClass(), "trophyId", 0);
        setField(term25993, term25993.getClass(), "userCharacter", null);
        setIntField(term25993, term25993.getClass(), "playerLevel", 0);
        setIntField(term25993, term25993.getClass(), "rating", 0);
        setIntField(term25993, term25993.getClass(), "headphone", 0);
        setIntField(term25993, term25993.getClass(), "chargeState", 0);
        setField(term25993, term25993.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term25993, args);
    }

};


