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

public class SwitchDeviceInfo_getTemperatureOffset_108511983611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1331;

    public SwitchDeviceInfo_getTemperatureOffset_108511983611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1331 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term1331, term1331.getClass(), "on", true);
        setIntField(term1331, term1331.getClass(), "voltage", -1048298087);
        setIntField(term1331, term1331.getClass(), "power", 292681826);
        setIntField(term1331, term1331.getClass(), "energy", 458147407);
        setIntField(term1331, term1331.getClass(), "temperature", -184153539);
        setIntField(term1331, term1331.getClass(), "temperatureOffset", 493620644);
        setField(term1331, term1331.getClass(), "deviceType", "SWITCH");
        setField(term1331, term1331.getClass(), "id", "nGKItKLYNC");
        setField(term1331, term1331.getClass(), "ain", "UiUYnPrcCi");
        setField(term1331, term1331.getClass(), "name", "UoYtihxVaS");
        setField(term1331, term1331.getClass(), "firmware", "JDswTTCZHV");
        setField(term1331, term1331.getClass(), "productName", "onpbIeEKoi");
        setBooleanField(term1331, term1331.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemperatureOffset", argTypes, term1331, args);
    }

};


