package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRebootStartTime_12850928482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2314;

    public GameSetting_getRebootStartTime_12850928482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2314 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2314, term2314.getClass(), "isMaintenance", false);
        setIntField(term2314, term2314.getClass(), "requestInterval", 1086709736);
        setField(term2314, term2314.getClass(), "rebootStartTime", "DuKcNfVVYR");
        setField(term2314, term2314.getClass(), "rebootEndTime", "fRujHWvXjJ");
        setIntField(term2314, term2314.getClass(), "movieUploadLimit", -1606698075);
        setIntField(term2314, term2314.getClass(), "movieStatus", 90996421);
        setField(term2314, term2314.getClass(), "movieServerUri", "EAIAAStlTz");
        setField(term2314, term2314.getClass(), "deliverServerUri", "yIWXcOQTgy");
        setField(term2314, term2314.getClass(), "oldServerUri", "xAWekqanqc");
        setField(term2314, term2314.getClass(), "usbDlServerUri", "GSOWFHMlbF");
        setIntField(term2314, term2314.getClass(), "rebootInterval", -1805802783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term2314, args);
    }

};


