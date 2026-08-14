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

public class ResponseHandlerDeviceList_getHeadControllerInfo_6562483511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11852;
     Object term11854;

    public ResponseHandlerDeviceList_getHeadControllerInfo_6562483511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11852 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList"));
        setBooleanField(term11852, term11852.getClass(), "useCaseSensitiveNames", false);
        term11854 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term11854, term11854.getClass(), "batteryLow", true);
        setIntField(term11854, term11854.getClass(), "batteryLevel", -1214628358);
        setIntField(term11854, term11854.getClass(), "currentTemperature", 1102721075);
        setIntField(term11854, term11854.getClass(), "setTemperature", -426764678);
        setIntField(term11854, term11854.getClass(), "comfortTemperature", -1222614956);
        setIntField(term11854, term11854.getClass(), "economyTemperature", -1870495012);
        setBooleanField(term11854, term11854.getClass(), "windowOpen", true);
        setIntField(term11854, term11854.getClass(), "errorCode", -1310015129);
        setField(term11854, term11854.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term11854, term11854.getClass(), "id", "vhKzFyKPOT");
        setField(term11854, term11854.getClass(), "ain", "nQhIgWXdRc");
        setField(term11854, term11854.getClass(), "name", "EusenEbIoF");
        setField(term11854, term11854.getClass(), "firmware", "SScVQYSvWH");
        setField(term11854, term11854.getClass(), "productName", "MnovcqFhCl");
        setBooleanField(term11854, term11854.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11854;
        callMethod(klass, "getHeadControllerInfo", argTypes, term11852, args);
    }

};


