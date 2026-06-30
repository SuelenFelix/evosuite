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

public class GameSetting_getRebootStartTime_184102944644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11911;

    public GameSetting_getRebootStartTime_184102944644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11911 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11911, term11911.getClass(), "romVersion", null);
        setField(term11911, term11911.getClass(), "dataVersion", null);
        setBooleanField(term11911, term11911.getClass(), "isMaintenance", false);
        setIntField(term11911, term11911.getClass(), "requestInterval", 0);
        setField(term11911, term11911.getClass(), "rebootStartTime", null);
        setField(term11911, term11911.getClass(), "rebootEndTime", null);
        setBooleanField(term11911, term11911.getClass(), "isBackgroundDistribute", false);
        setIntField(term11911, term11911.getClass(), "maxCountCharacter", 0);
        setIntField(term11911, term11911.getClass(), "maxCountItem", 0);
        setIntField(term11911, term11911.getClass(), "maxCountMusic", 0);
        setField(term11911, term11911.getClass(), "matchStartTime", null);
        setField(term11911, term11911.getClass(), "matchEndTime", null);
        setIntField(term11911, term11911.getClass(), "matchTimeLimit", 0);
        setIntField(term11911, term11911.getClass(), "matchErrorLimit", 0);
        setField(term11911, term11911.getClass(), "matchingUri", null);
        setField(term11911, term11911.getClass(), "udpHolePunchUri", null);
        setField(term11911, term11911.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term11911, args);
    }

};


