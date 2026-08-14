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

public class DeviceStats_setPower_5804626606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7292;
     Object term7310;

    public DeviceStats_setPower_5804626606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7296 = new ArrayList();
        ArrayList term7301 = new ArrayList();
        ArrayList term7306 = new ArrayList();
        term7292 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStats"));
        Object term7295 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7300 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        Object term7305 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7292, term7292.getClass(), "ain", "");
        setField(term7295, term7295.getClass(), "stats", term7296);
        setField(term7292, term7292.getClass(), "temperature", term7295);
        setField(term7300, term7300.getClass(), "stats", term7301);
        setField(term7292, term7292.getClass(), "power", term7300);
        setField(term7305, term7305.getClass(), "stats", term7306);
        setField(term7292, term7292.getClass(), "energy", term7305);
        ArrayList term7311 = new ArrayList();
        term7310 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term7310, term7310.getClass(), "stats", term7311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Object[] args = new Object[1];
        args[0] = term7310;
        callMethod(klass, "setPower", argTypes, term7292, args);
    }

};


