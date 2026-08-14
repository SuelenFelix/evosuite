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

public class SwitchDeviceInfo_setPower_14020123806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;
     Object term741;

    public SwitchDeviceInfo_setPower_14020123806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term665, term665.getClass(), "on", true);
        setIntField(term665, term665.getClass(), "voltage", 590364439);
        setIntField(term665, term665.getClass(), "power", 865208305);
        setIntField(term665, term665.getClass(), "energy", -1275173084);
        setIntField(term665, term665.getClass(), "temperature", -244121226);
        setIntField(term665, term665.getClass(), "temperatureOffset", -203030934);
        setField(term665, term665.getClass(), "deviceType", "SWITCH");
        setField(term665, term665.getClass(), "id", "vrQLuWIDJX");
        setField(term665, term665.getClass(), "ain", "flxyYxBRtu");
        setField(term665, term665.getClass(), "name", "OclPbYPkcH");
        setField(term665, term665.getClass(), "firmware", "IoAlmYsBwc");
        setField(term665, term665.getClass(), "productName", "TEParAifyi");
        setBooleanField(term665, term665.getClass(), "present", false);
        term741 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term741;
        callMethod(klass, "setPower", argTypes, term665, args);
    }

};


