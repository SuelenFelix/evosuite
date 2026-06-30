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

public class GetUserPreviewResp_setUserId_100999955463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25895;

    public GetUserPreviewResp_setUserId_100999955463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25895 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25895, term25895.getClass(), "userId", null);
        setBooleanField(term25895, term25895.getClass(), "isLogin", false);
        setField(term25895, term25895.getClass(), "lastLoginDate", null);
        setField(term25895, term25895.getClass(), "userName", null);
        setIntField(term25895, term25895.getClass(), "reincarnationNum", 0);
        setIntField(term25895, term25895.getClass(), "level", 0);
        setField(term25895, term25895.getClass(), "exp", null);
        setIntField(term25895, term25895.getClass(), "playerRating", 0);
        setField(term25895, term25895.getClass(), "lastGameId", null);
        setField(term25895, term25895.getClass(), "lastRomVersion", null);
        setField(term25895, term25895.getClass(), "lastDataVersion", null);
        setField(term25895, term25895.getClass(), "lastPlayDate", null);
        setIntField(term25895, term25895.getClass(), "trophyId", 0);
        setField(term25895, term25895.getClass(), "userCharacter", null);
        setIntField(term25895, term25895.getClass(), "playerLevel", 0);
        setIntField(term25895, term25895.getClass(), "rating", 0);
        setIntField(term25895, term25895.getClass(), "headphone", 0);
        setIntField(term25895, term25895.getClass(), "chargeState", 0);
        setField(term25895, term25895.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserId", argTypes, term25895, args);
    }

};


