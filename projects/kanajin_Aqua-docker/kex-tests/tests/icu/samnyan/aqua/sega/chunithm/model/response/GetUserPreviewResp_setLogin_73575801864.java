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
import java.lang.Boolean;

public class GetUserPreviewResp_setLogin_73575801864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25905;
     Object term25915;

    public GetUserPreviewResp_setLogin_73575801864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25905 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term25905, term25905.getClass(), "userId", null);
        setBooleanField(term25905, term25905.getClass(), "isLogin", false);
        setField(term25905, term25905.getClass(), "lastLoginDate", null);
        setField(term25905, term25905.getClass(), "userName", null);
        setIntField(term25905, term25905.getClass(), "reincarnationNum", 0);
        setIntField(term25905, term25905.getClass(), "level", 0);
        setField(term25905, term25905.getClass(), "exp", null);
        setIntField(term25905, term25905.getClass(), "playerRating", 0);
        setField(term25905, term25905.getClass(), "lastGameId", null);
        setField(term25905, term25905.getClass(), "lastRomVersion", null);
        setField(term25905, term25905.getClass(), "lastDataVersion", null);
        setField(term25905, term25905.getClass(), "lastPlayDate", null);
        setIntField(term25905, term25905.getClass(), "trophyId", 0);
        setField(term25905, term25905.getClass(), "userCharacter", null);
        setIntField(term25905, term25905.getClass(), "playerLevel", 0);
        setIntField(term25905, term25905.getClass(), "rating", 0);
        setIntField(term25905, term25905.getClass(), "headphone", 0);
        setIntField(term25905, term25905.getClass(), "chargeState", 0);
        setField(term25905, term25905.getClass(), "userNameEx", null);
        term25915 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term25915;
        callMethod(klass, "setLogin", argTypes, term25905, args);
    }

};


