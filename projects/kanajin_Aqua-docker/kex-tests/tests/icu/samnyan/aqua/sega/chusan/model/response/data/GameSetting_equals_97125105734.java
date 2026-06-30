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

public class GameSetting_equals_97125105734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10831;
     Object term10948;

    public GameSetting_equals_97125105734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10831 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term10831, term10831.getClass(), "romVersion", "QGcshsIIWo");
        setField(term10831, term10831.getClass(), "dataVersion", "dPHtrzKWgf");
        setBooleanField(term10831, term10831.getClass(), "isMaintenance", true);
        setIntField(term10831, term10831.getClass(), "requestInterval", 118463203);
        setField(term10831, term10831.getClass(), "rebootStartTime", "olmFxfIVeh");
        setField(term10831, term10831.getClass(), "rebootEndTime", "iSPirUEhXs");
        setBooleanField(term10831, term10831.getClass(), "isBackgroundDistribute", false);
        setIntField(term10831, term10831.getClass(), "maxCountCharacter", -2062733514);
        setIntField(term10831, term10831.getClass(), "maxCountItem", 901520301);
        setIntField(term10831, term10831.getClass(), "maxCountMusic", -1536684680);
        setField(term10831, term10831.getClass(), "matchStartTime", "WWyLFmYpAy");
        setField(term10831, term10831.getClass(), "matchEndTime", "vbSWeJWOQh");
        setIntField(term10831, term10831.getClass(), "matchTimeLimit", -322159635);
        setIntField(term10831, term10831.getClass(), "matchErrorLimit", 366996139);
        setField(term10831, term10831.getClass(), "matchingUri", "hyvFdAvkOr");
        setField(term10831, term10831.getClass(), "udpHolePunchUri", "ewbQRtustW");
        setField(term10831, term10831.getClass(), "reflectorUri", "cABEHYBnys");
        term10948 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10948;
        callMethod(klass, "equals", argTypes, term10831, args);
    }

};


