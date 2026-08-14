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
import java.lang.Boolean;

public class SwitchDeviceInfo_setOn_20028892462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term209;

    public SwitchDeviceInfo_setOn_20028892462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term133, term133.getClass(), "on", false);
        setIntField(term133, term133.getClass(), "voltage", -616727354);
        setIntField(term133, term133.getClass(), "power", -1955890973);
        setIntField(term133, term133.getClass(), "energy", -2038273078);
        setIntField(term133, term133.getClass(), "temperature", 1227103734);
        setIntField(term133, term133.getClass(), "temperatureOffset", -1339778481);
        setField(term133, term133.getClass(), "deviceType", "SWITCH");
        setField(term133, term133.getClass(), "id", "EGtDIRbSSb");
        setField(term133, term133.getClass(), "ain", "SzjVpOQTyS");
        setField(term133, term133.getClass(), "name", "MjGYSRKTNF");
        setField(term133, term133.getClass(), "firmware", "hRNSzYYIrc");
        setField(term133, term133.getClass(), "productName", "RMFIsYGgne");
        setBooleanField(term133, term133.getClass(), "present", false);
        term209 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term209;
        callMethod(klass, "setOn", argTypes, term133, args);
    }

};


