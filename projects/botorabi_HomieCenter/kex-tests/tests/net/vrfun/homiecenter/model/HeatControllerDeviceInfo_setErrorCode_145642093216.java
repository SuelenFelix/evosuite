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

public class HeatControllerDeviceInfo_setErrorCode_145642093216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301;
     Object term4387;

    public HeatControllerDeviceInfo_setErrorCode_145642093216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4301 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4301, term4301.getClass(), "batteryLow", false);
        setIntField(term4301, term4301.getClass(), "batteryLevel", -2014576105);
        setIntField(term4301, term4301.getClass(), "currentTemperature", 1296895584);
        setIntField(term4301, term4301.getClass(), "setTemperature", 628918458);
        setIntField(term4301, term4301.getClass(), "comfortTemperature", -1274456137);
        setIntField(term4301, term4301.getClass(), "economyTemperature", 1041916673);
        setBooleanField(term4301, term4301.getClass(), "windowOpen", true);
        setIntField(term4301, term4301.getClass(), "errorCode", -601863069);
        setField(term4301, term4301.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term4301, term4301.getClass(), "id", "UfQtPRyWRC");
        setField(term4301, term4301.getClass(), "ain", "FPvxVzzSvD");
        setField(term4301, term4301.getClass(), "name", "WHcwFgsGFC");
        setField(term4301, term4301.getClass(), "firmware", "HzqpegHiRq");
        setField(term4301, term4301.getClass(), "productName", "jwsfVjMoJT");
        setBooleanField(term4301, term4301.getClass(), "present", false);
        term4387 = new Integer(663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4387;
        callMethod(klass, "setErrorCode", argTypes, term4301, args);
    }

};


