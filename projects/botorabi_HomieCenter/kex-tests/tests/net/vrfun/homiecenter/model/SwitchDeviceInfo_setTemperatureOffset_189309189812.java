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

public class SwitchDeviceInfo_setTemperatureOffset_189309189812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463;
     Object term1539;

    public SwitchDeviceInfo_setTemperatureOffset_189309189812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1463 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1463, term1463.getClass(), "on", true);
        setIntField(term1463, term1463.getClass(), "voltage", 1328271830);
        setIntField(term1463, term1463.getClass(), "power", 1596070772);
        setIntField(term1463, term1463.getClass(), "energy", 97029295);
        setIntField(term1463, term1463.getClass(), "temperature", -1371869594);
        setIntField(term1463, term1463.getClass(), "temperatureOffset", -2095575670);
        setField(term1463, term1463.getClass(), "deviceType", "SWITCH");
        setField(term1463, term1463.getClass(), "id", "YRHGsAkhxb");
        setField(term1463, term1463.getClass(), "ain", "ffYhPOzlUs");
        setField(term1463, term1463.getClass(), "name", "MLqYREekMl");
        setField(term1463, term1463.getClass(), "firmware", "ytSBIKXogI");
        setField(term1463, term1463.getClass(), "productName", "nHXjMycHlU");
        setBooleanField(term1463, term1463.getClass(), "present", true);
        term1539 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1539;
        callMethod(klass, "setTemperatureOffset", argTypes, term1463, args);
    }

};


