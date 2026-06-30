package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameSetting_setMaxCountCharacter_124957646124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8641;
     Object term8758;

    public GameSetting_setMaxCountCharacter_124957646124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8641 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term8641, term8641.getClass(), "romVersion", "taPBiMFNEZ");
        setField(term8641, term8641.getClass(), "dataVersion", "NoAFAfGyYL");
        setBooleanField(term8641, term8641.getClass(), "isMaintenance", false);
        setIntField(term8641, term8641.getClass(), "requestInterval", 1313599240);
        setField(term8641, term8641.getClass(), "rebootStartTime", "MFtfkBMyOD");
        setField(term8641, term8641.getClass(), "rebootEndTime", "rdiIyXfRtL");
        setBooleanField(term8641, term8641.getClass(), "isBackgroundDistribute", true);
        setIntField(term8641, term8641.getClass(), "maxCountCharacter", 1889501733);
        setIntField(term8641, term8641.getClass(), "maxCountItem", 1316243148);
        setIntField(term8641, term8641.getClass(), "maxCountMusic", 1524913540);
        setField(term8641, term8641.getClass(), "matchStartTime", "douzkltmiI");
        setField(term8641, term8641.getClass(), "matchEndTime", "MFKjhvLtpe");
        setIntField(term8641, term8641.getClass(), "matchTimeLimit", -1924743705);
        setIntField(term8641, term8641.getClass(), "matchErrorLimit", -1829672767);
        setField(term8641, term8641.getClass(), "matchingUri", "xpbLKEsput");
        setField(term8641, term8641.getClass(), "udpHolePunchUri", "urlyLwPBVn");
        setField(term8641, term8641.getClass(), "reflectorUri", "SPQVzOlOzZ");
        term8758 = new Integer(-311098933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8758;
        callMethod(klass, "setMaxCountCharacter", argTypes, term8641, args);
    }

};


