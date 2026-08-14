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

public class SwitchDeviceInfo_getVoltage_18739250373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public SwitchDeviceInfo_getVoltage_18739250373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term267, term267.getClass(), "on", true);
        setIntField(term267, term267.getClass(), "voltage", 1725571209);
        setIntField(term267, term267.getClass(), "power", -522618178);
        setIntField(term267, term267.getClass(), "energy", 1134449235);
        setIntField(term267, term267.getClass(), "temperature", -883034806);
        setIntField(term267, term267.getClass(), "temperatureOffset", 1585847225);
        setField(term267, term267.getClass(), "deviceType", "SWITCH");
        setField(term267, term267.getClass(), "id", "NRdvgJlhkX");
        setField(term267, term267.getClass(), "ain", "uuaPigETmJ");
        setField(term267, term267.getClass(), "name", "MxlszYVzRf");
        setField(term267, term267.getClass(), "firmware", "LQFpaHEwXR");
        setField(term267, term267.getClass(), "productName", "oVcInYnLWB");
        setBooleanField(term267, term267.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVoltage", argTypes, term267, args);
    }

};


