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

public class HeatControllerDeviceInfo_setBatteryLevel_546240984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2489;
     Object term2575;

    public HeatControllerDeviceInfo_setBatteryLevel_546240984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2489 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2489, term2489.getClass(), "batteryLow", true);
        setIntField(term2489, term2489.getClass(), "batteryLevel", -1845499264);
        setIntField(term2489, term2489.getClass(), "currentTemperature", -505439934);
        setIntField(term2489, term2489.getClass(), "setTemperature", -344842608);
        setIntField(term2489, term2489.getClass(), "comfortTemperature", 941650513);
        setIntField(term2489, term2489.getClass(), "economyTemperature", 444029505);
        setBooleanField(term2489, term2489.getClass(), "windowOpen", false);
        setIntField(term2489, term2489.getClass(), "errorCode", -1034506028);
        setField(term2489, term2489.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2489, term2489.getClass(), "id", "PHvxnGHptP");
        setField(term2489, term2489.getClass(), "ain", "TimdotUuNC");
        setField(term2489, term2489.getClass(), "name", "PkWMRdJcBb");
        setField(term2489, term2489.getClass(), "firmware", "jSpAteRute");
        setField(term2489, term2489.getClass(), "productName", "swZVeJAxjt");
        setBooleanField(term2489, term2489.getClass(), "present", false);
        term2575 = new Integer(-1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2575;
        callMethod(klass, "setBatteryLevel", argTypes, term2489, args);
    }

};


