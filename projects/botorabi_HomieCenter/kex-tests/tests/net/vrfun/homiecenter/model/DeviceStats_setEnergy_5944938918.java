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

public class DeviceStats_setEnergy_5944938918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7333;
     Object term7351;

    public DeviceStats_setEnergy_5944938918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7337 = new ArrayList();
        ArrayList term7342 = new ArrayList();
        ArrayList term7347 = new ArrayList();
        term7333 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7336 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7341 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7346 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7333, term7333.getClass(), "ain", "");
        setField(term7336, term7336.getClass(), "stats", term7337);
        setField(term7333, term7333.getClass(), "temperature", term7336);
        setField(term7341, term7341.getClass(), "stats", term7342);
        setField(term7333, term7333.getClass(), "power", term7341);
        setField(term7346, term7346.getClass(), "stats", term7347);
        setField(term7333, term7333.getClass(), "energy", term7346);
        ArrayList term7352 = new ArrayList();
        term7351 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7351, term7351.getClass(), "stats", term7352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Object[] args = new Object[1];
        args[0] = term7351;
        callMethod(klass, "setEnergy", argTypes, term7333, args);
    }

};


