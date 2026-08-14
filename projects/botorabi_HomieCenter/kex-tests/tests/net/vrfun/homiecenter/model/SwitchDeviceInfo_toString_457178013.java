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

public class SwitchDeviceInfo_toString_457178013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1597;

    public SwitchDeviceInfo_toString_457178013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1597 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1597, term1597.getClass(), "on", false);
        setIntField(term1597, term1597.getClass(), "voltage", 1324040357);
        setIntField(term1597, term1597.getClass(), "power", -1588772968);
        setIntField(term1597, term1597.getClass(), "energy", -93135961);
        setIntField(term1597, term1597.getClass(), "temperature", -112921587);
        setIntField(term1597, term1597.getClass(), "temperatureOffset", 933028652);
        setField(term1597, term1597.getClass(), "deviceType", "SWITCH");
        setField(term1597, term1597.getClass(), "id", "ieCtQFdkii");
        setField(term1597, term1597.getClass(), "ain", "dEnhdmILtU");
        setField(term1597, term1597.getClass(), "name", "hoicvmsovO");
        setField(term1597, term1597.getClass(), "firmware", "eqJfYWRaEL");
        setField(term1597, term1597.getClass(), "productName", "fhkbdRViHi");
        setBooleanField(term1597, term1597.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1597, args);
    }

};


