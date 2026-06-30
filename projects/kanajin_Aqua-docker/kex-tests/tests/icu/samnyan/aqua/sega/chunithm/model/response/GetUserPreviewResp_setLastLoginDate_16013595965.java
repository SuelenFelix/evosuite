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

public class GetUserPreviewResp_setLastLoginDate_16013595965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25917;

    public GetUserPreviewResp_setLastLoginDate_16013595965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25917 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25917, term25917.getClass(), "userId", null);
        setBooleanField(term25917, term25917.getClass(), "isLogin", false);
        setField(term25917, term25917.getClass(), "lastLoginDate", null);
        setField(term25917, term25917.getClass(), "userName", null);
        setIntField(term25917, term25917.getClass(), "reincarnationNum", 0);
        setIntField(term25917, term25917.getClass(), "level", 0);
        setField(term25917, term25917.getClass(), "exp", null);
        setIntField(term25917, term25917.getClass(), "playerRating", 0);
        setField(term25917, term25917.getClass(), "lastGameId", null);
        setField(term25917, term25917.getClass(), "lastRomVersion", null);
        setField(term25917, term25917.getClass(), "lastDataVersion", null);
        setField(term25917, term25917.getClass(), "lastPlayDate", null);
        setIntField(term25917, term25917.getClass(), "trophyId", 0);
        setField(term25917, term25917.getClass(), "userCharacter", null);
        setIntField(term25917, term25917.getClass(), "playerLevel", 0);
        setIntField(term25917, term25917.getClass(), "rating", 0);
        setIntField(term25917, term25917.getClass(), "headphone", 0);
        setIntField(term25917, term25917.getClass(), "chargeState", 0);
        setField(term25917, term25917.getClass(), "userNameEx", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastLoginDate", argTypes, term25917, args);
    }

};


