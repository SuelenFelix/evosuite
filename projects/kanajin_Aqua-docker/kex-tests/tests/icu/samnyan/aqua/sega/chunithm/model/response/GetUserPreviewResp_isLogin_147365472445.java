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

public class GetUserPreviewResp_isLogin_147365472445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25715;

    public GetUserPreviewResp_isLogin_147365472445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25715 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25715, term25715.getClass(), "userId", null);
        setBooleanField(term25715, term25715.getClass(), "isLogin", false);
        setField(term25715, term25715.getClass(), "lastLoginDate", null);
        setField(term25715, term25715.getClass(), "userName", null);
        setIntField(term25715, term25715.getClass(), "reincarnationNum", 0);
        setIntField(term25715, term25715.getClass(), "level", 0);
        setField(term25715, term25715.getClass(), "exp", null);
        setIntField(term25715, term25715.getClass(), "playerRating", 0);
        setField(term25715, term25715.getClass(), "lastGameId", null);
        setField(term25715, term25715.getClass(), "lastRomVersion", null);
        setField(term25715, term25715.getClass(), "lastDataVersion", null);
        setField(term25715, term25715.getClass(), "lastPlayDate", null);
        setIntField(term25715, term25715.getClass(), "trophyId", 0);
        setField(term25715, term25715.getClass(), "userCharacter", null);
        setIntField(term25715, term25715.getClass(), "playerLevel", 0);
        setIntField(term25715, term25715.getClass(), "rating", 0);
        setIntField(term25715, term25715.getClass(), "headphone", 0);
        setIntField(term25715, term25715.getClass(), "chargeState", 0);
        setField(term25715, term25715.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogin", argTypes, term25715, args);
    }

};


