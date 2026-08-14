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

public class DeviceStats_toString_14188141799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7356;

    public DeviceStats_toString_14188141799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7360 = new ArrayList();
        ArrayList term7365 = new ArrayList();
        ArrayList term7370 = new ArrayList();
        term7356 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7359 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7364 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7369 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7356, term7356.getClass(), "ain", "");
        setField(term7359, term7359.getClass(), "stats", term7360);
        setField(term7356, term7356.getClass(), "temperature", term7359);
        setField(term7364, term7364.getClass(), "stats", term7365);
        setField(term7356, term7356.getClass(), "power", term7364);
        setField(term7369, term7369.getClass(), "stats", term7370);
        setField(term7356, term7356.getClass(), "energy", term7369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7356, args);
    }

};


