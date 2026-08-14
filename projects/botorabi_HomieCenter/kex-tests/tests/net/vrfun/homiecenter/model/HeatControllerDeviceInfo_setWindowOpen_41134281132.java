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

public class HeatControllerDeviceInfo_setWindowOpen_41134281132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4745;
     Object term4755;

    public HeatControllerDeviceInfo_setWindowOpen_41134281132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4745 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4745, term4745.getClass(), "batteryLow", false);
        setIntField(term4745, term4745.getClass(), "batteryLevel", 0);
        setIntField(term4745, term4745.getClass(), "currentTemperature", 0);
        setIntField(term4745, term4745.getClass(), "setTemperature", 0);
        setIntField(term4745, term4745.getClass(), "comfortTemperature", 0);
        setIntField(term4745, term4745.getClass(), "economyTemperature", 0);
        setBooleanField(term4745, term4745.getClass(), "windowOpen", false);
        setIntField(term4745, term4745.getClass(), "errorCode", 0);
        setField(term4745, term4745.getClass(), "deviceType", null);
        setField(term4745, term4745.getClass(), "id", null);
        setField(term4745, term4745.getClass(), "ain", null);
        setField(term4745, term4745.getClass(), "name", null);
        setField(term4745, term4745.getClass(), "firmware", null);
        setField(term4745, term4745.getClass(), "productName", null);
        setBooleanField(term4745, term4745.getClass(), "present", false);
        term4755 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4755;
        callMethod(klass, "setWindowOpen", argTypes, term4745, args);
    }

};


