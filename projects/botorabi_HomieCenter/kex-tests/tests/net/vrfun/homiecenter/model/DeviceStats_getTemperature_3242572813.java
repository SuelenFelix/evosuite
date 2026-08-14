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
import java.lang.Object;
import java.util.ArrayList;

public class DeviceStats_getTemperature_3242572813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7233;

    public DeviceStats_getTemperature_3242572813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7237 = new ArrayList();
        ArrayList term7242 = new ArrayList();
        ArrayList term7247 = new ArrayList();
        term7233 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7236 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7241 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7246 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7233, term7233.getClass(), "ain", "");
        setField(term7236, term7236.getClass(), "stats", term7237);
        setField(term7233, term7233.getClass(), "temperature", term7236);
        setField(term7241, term7241.getClass(), "stats", term7242);
        setField(term7233, term7233.getClass(), "power", term7241);
        setField(term7246, term7246.getClass(), "stats", term7247);
        setField(term7233, term7233.getClass(), "energy", term7246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemperature", argTypes, term7233, args);
    }

};


