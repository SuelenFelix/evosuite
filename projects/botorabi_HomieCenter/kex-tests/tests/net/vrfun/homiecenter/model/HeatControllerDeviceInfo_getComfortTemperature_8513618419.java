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

public class HeatControllerDeviceInfo_getComfortTemperature_8513618419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3245;

    public HeatControllerDeviceInfo_getComfortTemperature_8513618419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3245 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3245, term3245.getClass(), "batteryLow", false);
        setIntField(term3245, term3245.getClass(), "batteryLevel", 568954359);
        setIntField(term3245, term3245.getClass(), "currentTemperature", 53410913);
        setIntField(term3245, term3245.getClass(), "setTemperature", -375014958);
        setIntField(term3245, term3245.getClass(), "comfortTemperature", 1107176718);
        setIntField(term3245, term3245.getClass(), "economyTemperature", 480137250);
        setBooleanField(term3245, term3245.getClass(), "windowOpen", true);
        setIntField(term3245, term3245.getClass(), "errorCode", -341152642);
        setField(term3245, term3245.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3245, term3245.getClass(), "id", "SJiQaLvSKv");
        setField(term3245, term3245.getClass(), "ain", "OEXDRUKcFl");
        setField(term3245, term3245.getClass(), "name", "RYdKCNNMBR");
        setField(term3245, term3245.getClass(), "firmware", "yGtHPyvYiQ");
        setField(term3245, term3245.getClass(), "productName", "MvRIxilFMJ");
        setBooleanField(term3245, term3245.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComfortTemperature", argTypes, term3245, args);
    }

};


