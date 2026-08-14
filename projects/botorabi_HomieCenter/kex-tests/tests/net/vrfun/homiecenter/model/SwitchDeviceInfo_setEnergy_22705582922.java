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

public class SwitchDeviceInfo_setEnergy_22705582922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1791;
     Object term1799;

    public SwitchDeviceInfo_setEnergy_22705582922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1791 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1791, term1791.getClass(), "on", false);
        setIntField(term1791, term1791.getClass(), "voltage", 0);
        setIntField(term1791, term1791.getClass(), "power", 0);
        setIntField(term1791, term1791.getClass(), "energy", 0);
        setIntField(term1791, term1791.getClass(), "temperature", 0);
        setIntField(term1791, term1791.getClass(), "temperatureOffset", 0);
        setField(term1791, term1791.getClass(), "deviceType", null);
        setField(term1791, term1791.getClass(), "id", null);
        setField(term1791, term1791.getClass(), "ain", null);
        setField(term1791, term1791.getClass(), "name", null);
        setField(term1791, term1791.getClass(), "firmware", null);
        setField(term1791, term1791.getClass(), "productName", null);
        setBooleanField(term1791, term1791.getClass(), "present", false);
        term1799 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1799;
        callMethod(klass, "setEnergy", argTypes, term1791, args);
    }

};


