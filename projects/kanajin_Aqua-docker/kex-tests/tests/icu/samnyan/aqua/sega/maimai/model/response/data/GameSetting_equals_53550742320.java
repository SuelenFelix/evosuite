package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_equals_53550742320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5445;
     Object term5522;

    public GameSetting_equals_53550742320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term5445, term5445.getClass(), "isMaintenance", false);
        setIntField(term5445, term5445.getClass(), "requestInterval", -683868408);
        setField(term5445, term5445.getClass(), "rebootStartTime", "sHMXNUzNeM");
        setField(term5445, term5445.getClass(), "rebootEndTime", "gPzGDOEPPw");
        setIntField(term5445, term5445.getClass(), "movieUploadLimit", -381130069);
        setIntField(term5445, term5445.getClass(), "movieStatus", 885769749);
        setField(term5445, term5445.getClass(), "movieServerUri", "rwKoAngzCu");
        setField(term5445, term5445.getClass(), "deliverServerUri", "VUkRVwROTl");
        setField(term5445, term5445.getClass(), "oldServerUri", "UDlkdccCRn");
        setField(term5445, term5445.getClass(), "usbDlServerUri", "McpzErOcYb");
        term5522 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5522;
        callMethod(klass, "equals", argTypes, term5445, args);
    }

};


