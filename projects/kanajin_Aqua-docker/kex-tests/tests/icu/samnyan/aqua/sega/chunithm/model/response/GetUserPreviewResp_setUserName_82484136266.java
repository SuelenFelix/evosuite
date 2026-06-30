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

public class GetUserPreviewResp_setUserName_82484136266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25927;

    public GetUserPreviewResp_setUserName_82484136266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25927 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25927, term25927.getClass(), "userId", null);
        setBooleanField(term25927, term25927.getClass(), "isLogin", false);
        setField(term25927, term25927.getClass(), "lastLoginDate", null);
        setField(term25927, term25927.getClass(), "userName", null);
        setIntField(term25927, term25927.getClass(), "reincarnationNum", 0);
        setIntField(term25927, term25927.getClass(), "level", 0);
        setField(term25927, term25927.getClass(), "exp", null);
        setIntField(term25927, term25927.getClass(), "playerRating", 0);
        setField(term25927, term25927.getClass(), "lastGameId", null);
        setField(term25927, term25927.getClass(), "lastRomVersion", null);
        setField(term25927, term25927.getClass(), "lastDataVersion", null);
        setField(term25927, term25927.getClass(), "lastPlayDate", null);
        setIntField(term25927, term25927.getClass(), "trophyId", 0);
        setField(term25927, term25927.getClass(), "userCharacter", null);
        setIntField(term25927, term25927.getClass(), "playerLevel", 0);
        setIntField(term25927, term25927.getClass(), "rating", 0);
        setIntField(term25927, term25927.getClass(), "headphone", 0);
        setIntField(term25927, term25927.getClass(), "chargeState", 0);
        setField(term25927, term25927.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term25927, args);
    }

};


