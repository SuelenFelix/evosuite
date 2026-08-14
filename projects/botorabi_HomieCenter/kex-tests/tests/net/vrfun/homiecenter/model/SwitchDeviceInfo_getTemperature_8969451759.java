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

public class SwitchDeviceInfo_getTemperature_8969451759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;

    public SwitchDeviceInfo_getTemperature_8969451759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1065 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1065, term1065.getClass(), "on", true);
        setIntField(term1065, term1065.getClass(), "voltage", -157887805);
        setIntField(term1065, term1065.getClass(), "power", 1876565163);
        setIntField(term1065, term1065.getClass(), "energy", -817164822);
        setIntField(term1065, term1065.getClass(), "temperature", -1016503459);
        setIntField(term1065, term1065.getClass(), "temperatureOffset", -1968847291);
        setField(term1065, term1065.getClass(), "deviceType", "SWITCH");
        setField(term1065, term1065.getClass(), "id", "wSQxaModmm");
        setField(term1065, term1065.getClass(), "ain", "UlajhuVLaP");
        setField(term1065, term1065.getClass(), "name", "gGSMzuGICf");
        setField(term1065, term1065.getClass(), "firmware", "hxCBltsObl");
        setField(term1065, term1065.getClass(), "productName", "BndsHwAFMv");
        setBooleanField(term1065, term1065.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemperature", argTypes, term1065, args);
    }

};


