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

public class ResponseHandlerDeviceList_getSwitchInfo_160343348510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11718;
     Object term11720;

    public ResponseHandlerDeviceList_getSwitchInfo_160343348510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11718 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList"));
        setBooleanField(term11718, term11718.getClass(), "useCaseSensitiveNames", false);
        term11720 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term11720, term11720.getClass(), "on", true);
        setIntField(term11720, term11720.getClass(), "voltage", -1410220680);
        setIntField(term11720, term11720.getClass(), "power", 389427431);
        setIntField(term11720, term11720.getClass(), "energy", -1945706126);
        setIntField(term11720, term11720.getClass(), "temperature", 1152356969);
        setIntField(term11720, term11720.getClass(), "temperatureOffset", -1667990367);
        setField(term11720, term11720.getClass(), "deviceType", "SWITCH");
        setField(term11720, term11720.getClass(), "id", "BJhjdJUhkz");
        setField(term11720, term11720.getClass(), "ain", "cdHYQDgUZR");
        setField(term11720, term11720.getClass(), "name", "KAORSSPSeV");
        setField(term11720, term11720.getClass(), "firmware", "UimMMORkzd");
        setField(term11720, term11720.getClass(), "productName", "huVIXUWLtI");
        setBooleanField(term11720, term11720.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11720;
        callMethod(klass, "getSwitchInfo", argTypes, term11718, args);
    }

};


