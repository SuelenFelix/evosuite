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

public class GameSetting_getRebootEndTime_45637793345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11920;

    public GameSetting_getRebootEndTime_45637793345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11920 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11920, term11920.getClass(), "romVersion", null);
        setField(term11920, term11920.getClass(), "dataVersion", null);
        setBooleanField(term11920, term11920.getClass(), "isMaintenance", false);
        setIntField(term11920, term11920.getClass(), "requestInterval", 0);
        setField(term11920, term11920.getClass(), "rebootStartTime", null);
        setField(term11920, term11920.getClass(), "rebootEndTime", null);
        setBooleanField(term11920, term11920.getClass(), "isBackgroundDistribute", false);
        setIntField(term11920, term11920.getClass(), "maxCountCharacter", 0);
        setIntField(term11920, term11920.getClass(), "maxCountItem", 0);
        setIntField(term11920, term11920.getClass(), "maxCountMusic", 0);
        setField(term11920, term11920.getClass(), "matchStartTime", null);
        setField(term11920, term11920.getClass(), "matchEndTime", null);
        setIntField(term11920, term11920.getClass(), "matchTimeLimit", 0);
        setIntField(term11920, term11920.getClass(), "matchErrorLimit", 0);
        setField(term11920, term11920.getClass(), "matchingUri", null);
        setField(term11920, term11920.getClass(), "udpHolePunchUri", null);
        setField(term11920, term11920.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term11920, args);
    }

};


