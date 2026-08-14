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

public class HeatControllerDeviceInfo_getSetTemperature_19348540537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2943;

    public HeatControllerDeviceInfo_getSetTemperature_19348540537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2943 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2943, term2943.getClass(), "batteryLow", true);
        setIntField(term2943, term2943.getClass(), "batteryLevel", 1532716628);
        setIntField(term2943, term2943.getClass(), "currentTemperature", -1801760683);
        setIntField(term2943, term2943.getClass(), "setTemperature", 1141317871);
        setIntField(term2943, term2943.getClass(), "comfortTemperature", 890669485);
        setIntField(term2943, term2943.getClass(), "economyTemperature", 691577392);
        setBooleanField(term2943, term2943.getClass(), "windowOpen", false);
        setIntField(term2943, term2943.getClass(), "errorCode", -893623680);
        setField(term2943, term2943.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2943, term2943.getClass(), "id", "sEccwbJKYE");
        setField(term2943, term2943.getClass(), "ain", "AWRooQKkdW");
        setField(term2943, term2943.getClass(), "name", "vjxIhXHxGR");
        setField(term2943, term2943.getClass(), "firmware", "QXzGXbEXMu");
        setField(term2943, term2943.getClass(), "productName", "qxSDVejjiY");
        setBooleanField(term2943, term2943.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSetTemperature", argTypes, term2943, args);
    }

};


