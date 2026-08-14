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

public class SwitchDeviceInfo_setTemperatureOffset_189309189826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;
     Object term1835;

    public SwitchDeviceInfo_setTemperatureOffset_189309189826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1827 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1827, term1827.getClass(), "on", false);
        setIntField(term1827, term1827.getClass(), "voltage", 0);
        setIntField(term1827, term1827.getClass(), "power", 0);
        setIntField(term1827, term1827.getClass(), "energy", 0);
        setIntField(term1827, term1827.getClass(), "temperature", 0);
        setIntField(term1827, term1827.getClass(), "temperatureOffset", 0);
        setField(term1827, term1827.getClass(), "deviceType", null);
        setField(term1827, term1827.getClass(), "id", null);
        setField(term1827, term1827.getClass(), "ain", null);
        setField(term1827, term1827.getClass(), "name", null);
        setField(term1827, term1827.getClass(), "firmware", null);
        setField(term1827, term1827.getClass(), "productName", null);
        setBooleanField(term1827, term1827.getClass(), "present", false);
        term1835 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1835;
        callMethod(klass, "setTemperatureOffset", argTypes, term1827, args);
    }

};


