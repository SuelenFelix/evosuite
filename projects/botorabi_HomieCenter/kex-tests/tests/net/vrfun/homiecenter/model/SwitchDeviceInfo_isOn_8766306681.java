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

public class SwitchDeviceInfo_isOn_8766306681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SwitchDeviceInfo_isOn_8766306681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1, term1.getClass(), "on", false);
        setIntField(term1, term1.getClass(), "voltage", 568599855);
        setIntField(term1, term1.getClass(), "power", 1162663216);
        setIntField(term1, term1.getClass(), "energy", 1484323161);
        setIntField(term1, term1.getClass(), "temperature", 391863371);
        setIntField(term1, term1.getClass(), "temperatureOffset", -1922583790);
        setField(term1, term1.getClass(), "deviceType", "SWITCH");
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "ain", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "name", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "firmware", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "productName", "jJCZpVmanW");
        setBooleanField(term1, term1.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOn", argTypes, term1, args);
    }

};


