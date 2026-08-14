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

public class SwitchDeviceInfo_setTemperature_157020654710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;
     Object term1273;

    public SwitchDeviceInfo_setTemperature_157020654710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1197, term1197.getClass(), "on", false);
        setIntField(term1197, term1197.getClass(), "voltage", 579005622);
        setIntField(term1197, term1197.getClass(), "power", -14890619);
        setIntField(term1197, term1197.getClass(), "energy", 1632125673);
        setIntField(term1197, term1197.getClass(), "temperature", 454281060);
        setIntField(term1197, term1197.getClass(), "temperatureOffset", -1786399638);
        setField(term1197, term1197.getClass(), "deviceType", "SWITCH");
        setField(term1197, term1197.getClass(), "id", "GzFkzHGYFt");
        setField(term1197, term1197.getClass(), "ain", "tShwQLRGNe");
        setField(term1197, term1197.getClass(), "name", "LvtrsXUliU");
        setField(term1197, term1197.getClass(), "firmware", "xLbjWUgOIL");
        setField(term1197, term1197.getClass(), "productName", "jDtqGUpnZN");
        setBooleanField(term1197, term1197.getClass(), "present", true);
        term1273 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1273;
        callMethod(klass, "setTemperature", argTypes, term1197, args);
    }

};


