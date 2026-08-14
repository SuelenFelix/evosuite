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
import java.util.ArrayList;
import java.lang.Integer;

public class DeviceStatsValues_Stats_getGrid_12101175851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1865;

    public DeviceStatsValues_Stats_getGrid_12101175851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1869 = new Integer(-616727354);
        Integer term1871 = new Integer(-1955890973);
        Integer term1873 = new Integer(-2038273078);
        Integer term1875 = new Integer(1227103734);
        Integer term1877 = new Integer(-1339778481);
        Integer term1879 = new Integer(1725571209);
        Integer term1881 = new Integer(-522618178);
        Integer term1883 = new Integer(1134449235);
        Integer term1885 = new Integer(-883034806);
        ArrayList term1867 = new ArrayList();
        ((ArrayList) term1867).add(term1869);
        ((ArrayList) term1867).add(term1871);
        ((ArrayList) term1867).add(term1873);
        ((ArrayList) term1867).add(term1875);
        ((ArrayList) term1867).add(term1877);
        ((ArrayList) term1867).add(term1879);
        ((ArrayList) term1867).add(term1881);
        ((ArrayList) term1867).add(term1883);
        ((ArrayList) term1867).add(term1885);
        term1865 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues$Stats"));
        setIntField(term1865, term1865.getClass(), "grid", 962840079);
        setField(term1865, term1865.getClass(), "values", term1867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues$Stats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGrid", argTypes, term1865, args);
    }

};


