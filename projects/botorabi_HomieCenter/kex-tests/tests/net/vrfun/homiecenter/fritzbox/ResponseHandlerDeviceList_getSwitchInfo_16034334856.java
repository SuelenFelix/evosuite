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

public class ResponseHandlerDeviceList_getSwitchInfo_16034334856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2158;
     Object term2160;

    public ResponseHandlerDeviceList_getSwitchInfo_16034334856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2158 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList"));
        setBooleanField(term2158, term2158.getClass(), "useCaseSensitiveNames", false);
        term2160 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term2160, term2160.getClass(), "on", true);
        setIntField(term2160, term2160.getClass(), "voltage", -883034806);
        setIntField(term2160, term2160.getClass(), "power", 1585847225);
        setIntField(term2160, term2160.getClass(), "energy", 597278769);
        setIntField(term2160, term2160.getClass(), "temperature", -1685132342);
        setIntField(term2160, term2160.getClass(), "temperatureOffset", -1456670397);
        setField(term2160, term2160.getClass(), "deviceType", "SWITCH");
        setField(term2160, term2160.getClass(), "id", "wGmYcqUkgE");
        setField(term2160, term2160.getClass(), "ain", "idgaQsnJpQ");
        setField(term2160, term2160.getClass(), "name", "VgZnGoIFwQ");
        setField(term2160, term2160.getClass(), "firmware", "jUbSRrkrYZ");
        setField(term2160, term2160.getClass(), "productName", "bWWfajKbEX");
        setBooleanField(term2160, term2160.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2160;
        callMethod(klass, "getSwitchInfo", argTypes, term2158, args);
    }

};


