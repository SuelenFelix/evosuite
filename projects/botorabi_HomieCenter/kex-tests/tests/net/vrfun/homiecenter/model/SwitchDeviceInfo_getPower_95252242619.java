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

public class SwitchDeviceInfo_getPower_95252242619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1765;

    public SwitchDeviceInfo_getPower_95252242619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1765 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1765, term1765.getClass(), "on", false);
        setIntField(term1765, term1765.getClass(), "voltage", 0);
        setIntField(term1765, term1765.getClass(), "power", 0);
        setIntField(term1765, term1765.getClass(), "energy", 0);
        setIntField(term1765, term1765.getClass(), "temperature", 0);
        setIntField(term1765, term1765.getClass(), "temperatureOffset", 0);
        setField(term1765, term1765.getClass(), "deviceType", null);
        setField(term1765, term1765.getClass(), "id", null);
        setField(term1765, term1765.getClass(), "ain", null);
        setField(term1765, term1765.getClass(), "name", null);
        setField(term1765, term1765.getClass(), "firmware", null);
        setField(term1765, term1765.getClass(), "productName", null);
        setBooleanField(term1765, term1765.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term1765, args);
    }

};


