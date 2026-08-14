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

public class HeatControllerDeviceInfo_getErrorCode_31168801815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4151;

    public HeatControllerDeviceInfo_getErrorCode_31168801815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4151 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4151, term4151.getClass(), "batteryLow", false);
        setIntField(term4151, term4151.getClass(), "batteryLevel", 1398204340);
        setIntField(term4151, term4151.getClass(), "currentTemperature", 229204365);
        setIntField(term4151, term4151.getClass(), "setTemperature", -461771056);
        setIntField(term4151, term4151.getClass(), "comfortTemperature", -243422082);
        setIntField(term4151, term4151.getClass(), "economyTemperature", 1384592638);
        setBooleanField(term4151, term4151.getClass(), "windowOpen", false);
        setIntField(term4151, term4151.getClass(), "errorCode", -1002370457);
        setField(term4151, term4151.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term4151, term4151.getClass(), "id", "yVMkkQhvmN");
        setField(term4151, term4151.getClass(), "ain", "mvrkADEgpp");
        setField(term4151, term4151.getClass(), "name", "pXOkjyeIRb");
        setField(term4151, term4151.getClass(), "firmware", "GgZWSjxjyE");
        setField(term4151, term4151.getClass(), "productName", "EeBVbzjcCI");
        setBooleanField(term4151, term4151.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCode", argTypes, term4151, args);
    }

};


