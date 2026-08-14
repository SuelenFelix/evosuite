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
import java.lang.Boolean;

public class SwitchDeviceInfo_setOn_200288924616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1737;
     Object term1745;

    public SwitchDeviceInfo_setOn_200288924616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1737 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1737, term1737.getClass(), "on", false);
        setIntField(term1737, term1737.getClass(), "voltage", 0);
        setIntField(term1737, term1737.getClass(), "power", 0);
        setIntField(term1737, term1737.getClass(), "energy", 0);
        setIntField(term1737, term1737.getClass(), "temperature", 0);
        setIntField(term1737, term1737.getClass(), "temperatureOffset", 0);
        setField(term1737, term1737.getClass(), "deviceType", null);
        setField(term1737, term1737.getClass(), "id", null);
        setField(term1737, term1737.getClass(), "ain", null);
        setField(term1737, term1737.getClass(), "name", null);
        setField(term1737, term1737.getClass(), "firmware", null);
        setField(term1737, term1737.getClass(), "productName", null);
        setBooleanField(term1737, term1737.getClass(), "present", false);
        term1745 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1745;
        callMethod(klass, "setOn", argTypes, term1737, args);
    }

};


