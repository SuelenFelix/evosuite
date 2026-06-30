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

public class GetUserPreviewResp_setChargeState_60179610680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26081;
     Object term26091;

    public GetUserPreviewResp_setChargeState_60179610680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26081 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp"));
        setField(term26081, term26081.getClass(), "userId", null);
        setBooleanField(term26081, term26081.getClass(), "isLogin", false);
        setField(term26081, term26081.getClass(), "lastLoginDate", null);
        setField(term26081, term26081.getClass(), "userName", null);
        setIntField(term26081, term26081.getClass(), "reincarnationNum", 0);
        setIntField(term26081, term26081.getClass(), "level", 0);
        setField(term26081, term26081.getClass(), "exp", null);
        setIntField(term26081, term26081.getClass(), "playerRating", 0);
        setField(term26081, term26081.getClass(), "lastGameId", null);
        setField(term26081, term26081.getClass(), "lastRomVersion", null);
        setField(term26081, term26081.getClass(), "lastDataVersion", null);
        setField(term26081, term26081.getClass(), "lastPlayDate", null);
        setIntField(term26081, term26081.getClass(), "trophyId", 0);
        setField(term26081, term26081.getClass(), "userCharacter", null);
        setIntField(term26081, term26081.getClass(), "playerLevel", 0);
        setIntField(term26081, term26081.getClass(), "rating", 0);
        setIntField(term26081, term26081.getClass(), "headphone", 0);
        setIntField(term26081, term26081.getClass(), "chargeState", 0);
        setField(term26081, term26081.getClass(), "userNameEx", null);
        term26091 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26091;
        callMethod(klass, "setChargeState", argTypes, term26081, args);
    }

};


