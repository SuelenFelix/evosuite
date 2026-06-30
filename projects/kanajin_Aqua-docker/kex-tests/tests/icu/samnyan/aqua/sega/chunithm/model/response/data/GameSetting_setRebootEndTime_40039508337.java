package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_setRebootEndTime_40039508337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1927;

    public GameSetting_setRebootEndTime_40039508337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1927 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1927, term1927.getClass(), "dataVersion", 0);
        setBooleanField(term1927, term1927.getClass(), "isMaintenance", false);
        setIntField(term1927, term1927.getClass(), "requestInterval", 0);
        setField(term1927, term1927.getClass(), "rebootStartTime", null);
        setField(term1927, term1927.getClass(), "rebootEndTime", null);
        setBooleanField(term1927, term1927.getClass(), "isBackgroundDistribute", false);
        setIntField(term1927, term1927.getClass(), "maxCountCharacter", 0);
        setIntField(term1927, term1927.getClass(), "maxCountItem", 0);
        setIntField(term1927, term1927.getClass(), "maxCountMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRebootEndTime", argTypes, term1927, args);
    }

};


