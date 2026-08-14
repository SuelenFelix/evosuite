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

public class DeviceStats_getAIN_15915329351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7175;

    public DeviceStats_getAIN_15915329351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7179 = new ArrayList();
        ArrayList term7184 = new ArrayList();
        ArrayList term7189 = new ArrayList();
        term7175 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7178 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7183 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7188 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7175, term7175.getClass(), "ain", "");
        setField(term7178, term7178.getClass(), "stats", term7179);
        setField(term7175, term7175.getClass(), "temperature", term7178);
        setField(term7183, term7183.getClass(), "stats", term7184);
        setField(term7175, term7175.getClass(), "power", term7183);
        setField(term7188, term7188.getClass(), "stats", term7189);
        setField(term7175, term7175.getClass(), "energy", term7188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAIN", argTypes, term7175, args);
    }

};


