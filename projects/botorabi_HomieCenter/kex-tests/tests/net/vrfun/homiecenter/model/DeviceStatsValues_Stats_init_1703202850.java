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
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class DeviceStatsValues_Stats_init_1703202850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1845;
     Object term1847;

    public DeviceStatsValues_Stats_init_1703202850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1845 = new Integer(287287233);
        Integer term1850 = new Integer(568599855);
        Integer term1853 = new Integer(1162663216);
        Integer term1856 = new Integer(1484323161);
        Integer term1859 = new Integer(391863371);
        term1847 = new LinkedList();
        ((LinkedList) term1847).add(term1850);
        ((LinkedList) term1847).add(term1853);
        ((LinkedList) term1847).add(term1856);
        ((LinkedList) term1847).add(term1859);
        ((LinkedList) term1847).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues$Stats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1845;
        args[1] = term1847;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


