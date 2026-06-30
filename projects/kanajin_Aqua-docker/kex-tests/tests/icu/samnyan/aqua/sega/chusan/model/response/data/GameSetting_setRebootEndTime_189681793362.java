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

public class GameSetting_setRebootEndTime_189681793362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12077;

    public GameSetting_setRebootEndTime_189681793362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12077 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12077, term12077.getClass(), "romVersion", null);
        setField(term12077, term12077.getClass(), "dataVersion", null);
        setBooleanField(term12077, term12077.getClass(), "isMaintenance", false);
        setIntField(term12077, term12077.getClass(), "requestInterval", 0);
        setField(term12077, term12077.getClass(), "rebootStartTime", null);
        setField(term12077, term12077.getClass(), "rebootEndTime", null);
        setBooleanField(term12077, term12077.getClass(), "isBackgroundDistribute", false);
        setIntField(term12077, term12077.getClass(), "maxCountCharacter", 0);
        setIntField(term12077, term12077.getClass(), "maxCountItem", 0);
        setIntField(term12077, term12077.getClass(), "maxCountMusic", 0);
        setField(term12077, term12077.getClass(), "matchStartTime", null);
        setField(term12077, term12077.getClass(), "matchEndTime", null);
        setIntField(term12077, term12077.getClass(), "matchTimeLimit", 0);
        setIntField(term12077, term12077.getClass(), "matchErrorLimit", 0);
        setField(term12077, term12077.getClass(), "matchingUri", null);
        setField(term12077, term12077.getClass(), "udpHolePunchUri", null);
        setField(term12077, term12077.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRebootEndTime", argTypes, term12077, args);
    }

};


