package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DeviceStats_setTemperature_190321102914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7377;

    public DeviceStats_setTemperature_190321102914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7377 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        setField(term7377, term7377.getClass(), "ain", null);
        setField(term7377, term7377.getClass(), "temperature", null);
        setField(term7377, term7377.getClass(), "power", null);
        setField(term7377, term7377.getClass(), "energy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTemperature", argTypes, term7377, args);
    }

};


