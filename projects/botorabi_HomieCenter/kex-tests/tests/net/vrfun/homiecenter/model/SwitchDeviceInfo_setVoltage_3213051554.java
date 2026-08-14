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

public class SwitchDeviceInfo_setVoltage_3213051554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;
     Object term475;

    public SwitchDeviceInfo_setVoltage_3213051554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term399, term399.getClass(), "on", true);
        setIntField(term399, term399.getClass(), "voltage", 597278769);
        setIntField(term399, term399.getClass(), "power", -1685132342);
        setIntField(term399, term399.getClass(), "energy", -1456670397);
        setIntField(term399, term399.getClass(), "temperature", 1622346318);
        setIntField(term399, term399.getClass(), "temperatureOffset", 1048535127);
        setField(term399, term399.getClass(), "deviceType", "SWITCH");
        setField(term399, term399.getClass(), "id", "aJlieCFVtF");
        setField(term399, term399.getClass(), "ain", "ZiaGIbnzTs");
        setField(term399, term399.getClass(), "name", "tbcdzjIfER");
        setField(term399, term399.getClass(), "firmware", "HyxfbSQYBe");
        setField(term399, term399.getClass(), "productName", "pCTimMblYc");
        setBooleanField(term399, term399.getClass(), "present", false);
        term475 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term475;
        callMethod(klass, "setVoltage", argTypes, term399, args);
    }

};


