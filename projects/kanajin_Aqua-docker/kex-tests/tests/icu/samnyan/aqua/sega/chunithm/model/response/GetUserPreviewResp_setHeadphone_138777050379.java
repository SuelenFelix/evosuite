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
import java.lang.Integer;

public class GetUserPreviewResp_setHeadphone_138777050379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26069;
     Object term26079;

    public GetUserPreviewResp_setHeadphone_138777050379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26069 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26069, term26069.getClass(), "userId", null);
        setBooleanField(term26069, term26069.getClass(), "isLogin", false);
        setField(term26069, term26069.getClass(), "lastLoginDate", null);
        setField(term26069, term26069.getClass(), "userName", null);
        setIntField(term26069, term26069.getClass(), "reincarnationNum", 0);
        setIntField(term26069, term26069.getClass(), "level", 0);
        setField(term26069, term26069.getClass(), "exp", null);
        setIntField(term26069, term26069.getClass(), "playerRating", 0);
        setField(term26069, term26069.getClass(), "lastGameId", null);
        setField(term26069, term26069.getClass(), "lastRomVersion", null);
        setField(term26069, term26069.getClass(), "lastDataVersion", null);
        setField(term26069, term26069.getClass(), "lastPlayDate", null);
        setIntField(term26069, term26069.getClass(), "trophyId", 0);
        setField(term26069, term26069.getClass(), "userCharacter", null);
        setIntField(term26069, term26069.getClass(), "playerLevel", 0);
        setIntField(term26069, term26069.getClass(), "rating", 0);
        setIntField(term26069, term26069.getClass(), "headphone", 0);
        setIntField(term26069, term26069.getClass(), "chargeState", 0);
        setField(term26069, term26069.getClass(), "userNameEx", null);
        term26079 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26079;
        callMethod(klass, "setHeadphone", argTypes, term26069, args);
    }

};


