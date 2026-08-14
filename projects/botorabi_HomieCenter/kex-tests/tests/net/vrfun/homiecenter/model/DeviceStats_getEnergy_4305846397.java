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

public class DeviceStats_getEnergy_4305846397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7315;

    public DeviceStats_getEnergy_4305846397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7319 = new ArrayList();
        ArrayList term7324 = new ArrayList();
        ArrayList term7329 = new ArrayList();
        term7315 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7318 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7323 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7328 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7315, term7315.getClass(), "ain", "");
        setField(term7318, term7318.getClass(), "stats", term7319);
        setField(term7315, term7315.getClass(), "temperature", term7318);
        setField(term7323, term7323.getClass(), "stats", term7324);
        setField(term7315, term7315.getClass(), "power", term7323);
        setField(term7328, term7328.getClass(), "stats", term7329);
        setField(term7315, term7315.getClass(), "energy", term7328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnergy", argTypes, term7315, args);
    }

};


