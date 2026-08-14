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

public class DeviceStats_getPower_15252103205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7274;

    public DeviceStats_getPower_15252103205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7278 = new ArrayList();
        ArrayList term7283 = new ArrayList();
        ArrayList term7288 = new ArrayList();
        term7274 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7277 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7282 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7287 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7274, term7274.getClass(), "ain", "");
        setField(term7277, term7277.getClass(), "stats", term7278);
        setField(term7274, term7274.getClass(), "temperature", term7277);
        setField(term7282, term7282.getClass(), "stats", term7283);
        setField(term7274, term7274.getClass(), "power", term7282);
        setField(term7287, term7287.getClass(), "stats", term7288);
        setField(term7274, term7274.getClass(), "energy", term7287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term7274, args);
    }

};


