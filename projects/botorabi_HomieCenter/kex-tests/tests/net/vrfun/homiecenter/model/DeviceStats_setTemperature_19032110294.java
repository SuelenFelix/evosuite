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

public class DeviceStats_setTemperature_19032110294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7251;
     Object term7269;

    public DeviceStats_setTemperature_19032110294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7255 = new ArrayList();
        ArrayList term7260 = new ArrayList();
        ArrayList term7265 = new ArrayList();
        term7251 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7254 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7259 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7264 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7251, term7251.getClass(), "ain", "");
        setField(term7254, term7254.getClass(), "stats", term7255);
        setField(term7251, term7251.getClass(), "temperature", term7254);
        setField(term7259, term7259.getClass(), "stats", term7260);
        setField(term7251, term7251.getClass(), "power", term7259);
        setField(term7264, term7264.getClass(), "stats", term7265);
        setField(term7251, term7251.getClass(), "energy", term7264);
        ArrayList term7270 = new ArrayList();
        term7269 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7269, term7269.getClass(), "stats", term7270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Object[] args = new Object[1];
        args[0] = term7269;
        callMethod(klass, "setTemperature", argTypes, term7251, args);
    }

};


