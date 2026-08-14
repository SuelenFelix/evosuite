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

public class HeatControllerDeviceInfo_getCurrentTemperature_18190524525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2641;

    public HeatControllerDeviceInfo_getCurrentTemperature_18190524525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2641 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2641, term2641.getClass(), "batteryLow", false);
        setIntField(term2641, term2641.getClass(), "batteryLevel", -894662986);
        setIntField(term2641, term2641.getClass(), "currentTemperature", 304775596);
        setIntField(term2641, term2641.getClass(), "setTemperature", -1347665717);
        setIntField(term2641, term2641.getClass(), "comfortTemperature", -1888585309);
        setIntField(term2641, term2641.getClass(), "economyTemperature", 683666002);
        setBooleanField(term2641, term2641.getClass(), "windowOpen", true);
        setIntField(term2641, term2641.getClass(), "errorCode", 1596213415);
        setField(term2641, term2641.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2641, term2641.getClass(), "id", "xOcJIiQQDu");
        setField(term2641, term2641.getClass(), "ain", "GVizqqzXpy");
        setField(term2641, term2641.getClass(), "name", "JqXGgAhZPl");
        setField(term2641, term2641.getClass(), "firmware", "jiKYgYHqIS");
        setField(term2641, term2641.getClass(), "productName", "DfISiziTgG");
        setBooleanField(term2641, term2641.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentTemperature", argTypes, term2641, args);
    }

};


