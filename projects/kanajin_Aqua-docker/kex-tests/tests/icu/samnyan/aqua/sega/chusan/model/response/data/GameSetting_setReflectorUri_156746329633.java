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

public class GameSetting_setReflectorUri_156746329633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10602;

    public GameSetting_setReflectorUri_156746329633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10602 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term10602, term10602.getClass(), "romVersion", "EugWXkztim");
        setField(term10602, term10602.getClass(), "dataVersion", "DvRdOzzihn");
        setBooleanField(term10602, term10602.getClass(), "isMaintenance", true);
        setIntField(term10602, term10602.getClass(), "requestInterval", -725563031);
        setField(term10602, term10602.getClass(), "rebootStartTime", "wIygCdQAKO");
        setField(term10602, term10602.getClass(), "rebootEndTime", "JsXroBYqwr");
        setBooleanField(term10602, term10602.getClass(), "isBackgroundDistribute", false);
        setIntField(term10602, term10602.getClass(), "maxCountCharacter", 228070072);
        setIntField(term10602, term10602.getClass(), "maxCountItem", 1918578349);
        setIntField(term10602, term10602.getClass(), "maxCountMusic", -1585377443);
        setField(term10602, term10602.getClass(), "matchStartTime", "YciMAObLwl");
        setField(term10602, term10602.getClass(), "matchEndTime", "qAmVqwwdyf");
        setIntField(term10602, term10602.getClass(), "matchTimeLimit", -1293961217);
        setIntField(term10602, term10602.getClass(), "matchErrorLimit", -1715210057);
        setField(term10602, term10602.getClass(), "matchingUri", "IXPaHQnEUy");
        setField(term10602, term10602.getClass(), "udpHolePunchUri", "zhcWVVrrjs");
        setField(term10602, term10602.getClass(), "reflectorUri", "EAMaFLdmaG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DYZSJMwbhX";
        callMethod(klass, "setReflectorUri", argTypes, term10602, args);
    }

};


