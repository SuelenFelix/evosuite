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

public class HeatControllerDeviceInfo_setWindowOpen_41134281114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999;
     Object term4085;

    public HeatControllerDeviceInfo_setWindowOpen_41134281114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3999, term3999.getClass(), "batteryLow", true);
        setIntField(term3999, term3999.getClass(), "batteryLevel", 1830648570);
        setIntField(term3999, term3999.getClass(), "currentTemperature", -227365013);
        setIntField(term3999, term3999.getClass(), "setTemperature", 11724947);
        setIntField(term3999, term3999.getClass(), "comfortTemperature", 1953277050);
        setIntField(term3999, term3999.getClass(), "economyTemperature", 1283079251);
        setBooleanField(term3999, term3999.getClass(), "windowOpen", false);
        setIntField(term3999, term3999.getClass(), "errorCode", -523949691);
        setField(term3999, term3999.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3999, term3999.getClass(), "id", "wfaXBpWAUH");
        setField(term3999, term3999.getClass(), "ain", "VMeAzAHwZj");
        setField(term3999, term3999.getClass(), "name", "PznxWXsZME");
        setField(term3999, term3999.getClass(), "firmware", "ZzIujlwVsw");
        setField(term3999, term3999.getClass(), "productName", "LWyEaeIyAo");
        setBooleanField(term3999, term3999.getClass(), "present", false);
        term4085 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4085;
        callMethod(klass, "setWindowOpen", argTypes, term3999, args);
    }

};


