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

public class HeatControllerDeviceInfo_setSetTemperature_82001263726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4679;
     Object term4689;

    public HeatControllerDeviceInfo_setSetTemperature_82001263726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4679 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4679, term4679.getClass(), "batteryLow", false);
        setIntField(term4679, term4679.getClass(), "batteryLevel", 0);
        setIntField(term4679, term4679.getClass(), "currentTemperature", 0);
        setIntField(term4679, term4679.getClass(), "setTemperature", 0);
        setIntField(term4679, term4679.getClass(), "comfortTemperature", 0);
        setIntField(term4679, term4679.getClass(), "economyTemperature", 0);
        setBooleanField(term4679, term4679.getClass(), "windowOpen", false);
        setIntField(term4679, term4679.getClass(), "errorCode", 0);
        setField(term4679, term4679.getClass(), "deviceType", null);
        setField(term4679, term4679.getClass(), "id", null);
        setField(term4679, term4679.getClass(), "ain", null);
        setField(term4679, term4679.getClass(), "name", null);
        setField(term4679, term4679.getClass(), "firmware", null);
        setField(term4679, term4679.getClass(), "productName", null);
        setBooleanField(term4679, term4679.getClass(), "present", false);
        term4689 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4689;
        callMethod(klass, "setSetTemperature", argTypes, term4679, args);
    }

};


