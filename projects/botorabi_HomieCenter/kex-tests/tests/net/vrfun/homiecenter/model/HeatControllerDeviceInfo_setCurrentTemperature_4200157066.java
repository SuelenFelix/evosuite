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

public class HeatControllerDeviceInfo_setCurrentTemperature_4200157066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2791;
     Object term2877;

    public HeatControllerDeviceInfo_setCurrentTemperature_4200157066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2791 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2791, term2791.getClass(), "batteryLow", false);
        setIntField(term2791, term2791.getClass(), "batteryLevel", -268815336);
        setIntField(term2791, term2791.getClass(), "currentTemperature", -1210583429);
        setIntField(term2791, term2791.getClass(), "setTemperature", -663691365);
        setIntField(term2791, term2791.getClass(), "comfortTemperature", 339854490);
        setIntField(term2791, term2791.getClass(), "economyTemperature", -615654495);
        setBooleanField(term2791, term2791.getClass(), "windowOpen", true);
        setIntField(term2791, term2791.getClass(), "errorCode", -1476117762);
        setField(term2791, term2791.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2791, term2791.getClass(), "id", "XqgfKFvPSD");
        setField(term2791, term2791.getClass(), "ain", "JiVRgTZvKc");
        setField(term2791, term2791.getClass(), "name", "XPKmummaqg");
        setField(term2791, term2791.getClass(), "firmware", "BKLfkLiZTH");
        setField(term2791, term2791.getClass(), "productName", "SPpkrGcPRr");
        setBooleanField(term2791, term2791.getClass(), "present", true);
        term2877 = new Integer(-341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2877;
        callMethod(klass, "setCurrentTemperature", argTypes, term2791, args);
    }

};


