package net.vrfun.homiecenter.fritzbox;

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
import static net.vrfun.homiecenter.fritzbox.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResponseHandlerDeviceList_getHeadControllerInfo_656248357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2292;
     Object term2294;

    public ResponseHandlerDeviceList_getHeadControllerInfo_656248357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2292 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList"));
        setBooleanField(term2292, term2292.getClass(), "useCaseSensitiveNames", false);
        term2294 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2294, term2294.getClass(), "batteryLow", true);
        setIntField(term2294, term2294.getClass(), "batteryLevel", 1622346318);
        setIntField(term2294, term2294.getClass(), "currentTemperature", 1048535127);
        setIntField(term2294, term2294.getClass(), "setTemperature", -655067527);
        setIntField(term2294, term2294.getClass(), "comfortTemperature", -6029667);
        setIntField(term2294, term2294.getClass(), "economyTemperature", -2068769794);
        setBooleanField(term2294, term2294.getClass(), "windowOpen", true);
        setIntField(term2294, term2294.getClass(), "errorCode", -117576464);
        setField(term2294, term2294.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2294, term2294.getClass(), "id", "cAPeiZHKGJ");
        setField(term2294, term2294.getClass(), "ain", "LvJFtLBaxj");
        setField(term2294, term2294.getClass(), "name", "PHvxnGHptP");
        setField(term2294, term2294.getClass(), "firmware", "TimdotUuNC");
        setField(term2294, term2294.getClass(), "productName", "PkWMRdJcBb");
        setBooleanField(term2294, term2294.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2294;
        callMethod(klass, "getHeadControllerInfo", argTypes, term2292, args);
    }

};


