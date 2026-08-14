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

public class SwitchDeviceInfo_getTemperatureOffset_108511983625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1819;

    public SwitchDeviceInfo_getTemperatureOffset_108511983625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1819 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1819, term1819.getClass(), "on", false);
        setIntField(term1819, term1819.getClass(), "voltage", 0);
        setIntField(term1819, term1819.getClass(), "power", 0);
        setIntField(term1819, term1819.getClass(), "energy", 0);
        setIntField(term1819, term1819.getClass(), "temperature", 0);
        setIntField(term1819, term1819.getClass(), "temperatureOffset", 0);
        setField(term1819, term1819.getClass(), "deviceType", null);
        setField(term1819, term1819.getClass(), "id", null);
        setField(term1819, term1819.getClass(), "ain", null);
        setField(term1819, term1819.getClass(), "name", null);
        setField(term1819, term1819.getClass(), "firmware", null);
        setField(term1819, term1819.getClass(), "productName", null);
        setBooleanField(term1819, term1819.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemperatureOffset", argTypes, term1819, args);
    }

};


