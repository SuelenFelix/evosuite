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

public class DeviceStats_setAIN_13300531772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7193;

    public DeviceStats_setAIN_13300531772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7197 = new ArrayList();
        ArrayList term7202 = new ArrayList();
        ArrayList term7207 = new ArrayList();
        term7193 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7196 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7201 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7206 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7193, term7193.getClass(), "ain", "");
        setField(term7196, term7196.getClass(), "stats", term7197);
        setField(term7193, term7193.getClass(), "temperature", term7196);
        setField(term7201, term7201.getClass(), "stats", term7202);
        setField(term7193, term7193.getClass(), "power", term7201);
        setField(term7206, term7206.getClass(), "stats", term7207);
        setField(term7193, term7193.getClass(), "energy", term7206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sNQFlATEeQ";
        callMethod(klass, "setAIN", argTypes, term7193, args);
    }

};


