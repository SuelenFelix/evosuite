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

public class HeatControllerDeviceInfo_isWindowOpen_58140050313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3849;

    public HeatControllerDeviceInfo_isWindowOpen_58140050313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3849 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3849, term3849.getClass(), "batteryLow", false);
        setIntField(term3849, term3849.getClass(), "batteryLevel", -1697741339);
        setIntField(term3849, term3849.getClass(), "currentTemperature", 98922530);
        setIntField(term3849, term3849.getClass(), "setTemperature", -1388471422);
        setIntField(term3849, term3849.getClass(), "comfortTemperature", -1498296052);
        setIntField(term3849, term3849.getClass(), "economyTemperature", 2098647989);
        setBooleanField(term3849, term3849.getClass(), "windowOpen", true);
        setIntField(term3849, term3849.getClass(), "errorCode", 1598895173);
        setField(term3849, term3849.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3849, term3849.getClass(), "id", "AKNapTAfmD");
        setField(term3849, term3849.getClass(), "ain", "xJgPlLxpgC");
        setField(term3849, term3849.getClass(), "name", "EYtfuJaxiM");
        setField(term3849, term3849.getClass(), "firmware", "gCWtLVKVVe");
        setField(term3849, term3849.getClass(), "productName", "fWKJoSoCwE");
        setBooleanField(term3849, term3849.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWindowOpen", argTypes, term3849, args);
    }

};


