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

public class HeatControllerDeviceInfo_getEconomyTemperature_34422195111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3547;

    public HeatControllerDeviceInfo_getEconomyTemperature_34422195111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3547 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3547, term3547.getClass(), "batteryLow", false);
        setIntField(term3547, term3547.getClass(), "batteryLevel", 1202361360);
        setIntField(term3547, term3547.getClass(), "currentTemperature", -2015048153);
        setIntField(term3547, term3547.getClass(), "setTemperature", -2063457669);
        setIntField(term3547, term3547.getClass(), "comfortTemperature", -1222006000);
        setIntField(term3547, term3547.getClass(), "economyTemperature", 2095798786);
        setBooleanField(term3547, term3547.getClass(), "windowOpen", false);
        setIntField(term3547, term3547.getClass(), "errorCode", -1565502840);
        setField(term3547, term3547.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3547, term3547.getClass(), "id", "hCWPJQKpdc");
        setField(term3547, term3547.getClass(), "ain", "WzMEhMXkKx");
        setField(term3547, term3547.getClass(), "name", "XOiDvlDhdc");
        setField(term3547, term3547.getClass(), "firmware", "AdxvLJhNLe");
        setField(term3547, term3547.getClass(), "productName", "lHfTrWKMPk");
        setBooleanField(term3547, term3547.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEconomyTemperature", argTypes, term3547, args);
    }

};


