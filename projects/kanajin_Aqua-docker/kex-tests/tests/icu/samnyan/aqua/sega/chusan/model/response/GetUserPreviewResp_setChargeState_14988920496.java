package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setChargeState_14988920496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53159;
     Object term53174;

    public GetUserPreviewResp_setChargeState_14988920496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53159 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp"));
        setField(term53159, term53159.getClass(), "userId", null);
        setBooleanField(term53159, term53159.getClass(), "isLogin", false);
        setField(term53159, term53159.getClass(), "lastLoginDate", null);
        setField(term53159, term53159.getClass(), "userName", null);
        setIntField(term53159, term53159.getClass(), "reincarnationNum", 0);
        setIntField(term53159, term53159.getClass(), "level", 0);
        setField(term53159, term53159.getClass(), "exp", null);
        setIntField(term53159, term53159.getClass(), "playerRating", 0);
        setField(term53159, term53159.getClass(), "lastGameId", null);
        setField(term53159, term53159.getClass(), "lastRomVersion", null);
        setField(term53159, term53159.getClass(), "lastDataVersion", null);
        setField(term53159, term53159.getClass(), "lastPlayDate", null);
        setIntField(term53159, term53159.getClass(), "emoneyBrandId", 0);
        setIntField(term53159, term53159.getClass(), "trophyId", 0);
        setField(term53159, term53159.getClass(), "userCharacter", null);
        setIntField(term53159, term53159.getClass(), "playerLevel", 0);
        setIntField(term53159, term53159.getClass(), "rating", 0);
        setIntField(term53159, term53159.getClass(), "headphone", 0);
        setIntField(term53159, term53159.getClass(), "chargeState", 0);
        setField(term53159, term53159.getClass(), "userNameEx", null);
        setIntField(term53159, term53159.getClass(), "banState", 0);
        setIntField(term53159, term53159.getClass(), "classEmblemMedal", 0);
        setIntField(term53159, term53159.getClass(), "classEmblemBase", 0);
        setIntField(term53159, term53159.getClass(), "battleRankId", 0);
        term53174 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53174;
        callMethod(klass, "setChargeState", argTypes, term53159, args);
    }

};


