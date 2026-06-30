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

public class GameSetting_setUsbDlServerUri_109176792948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6040;

    public GameSetting_setUsbDlServerUri_109176792948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6040 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term6040, term6040.getClass(), "isMaintenance", false);
        setIntField(term6040, term6040.getClass(), "requestInterval", 0);
        setField(term6040, term6040.getClass(), "rebootStartTime", null);
        setField(term6040, term6040.getClass(), "rebootEndTime", null);
        setIntField(term6040, term6040.getClass(), "movieUploadLimit", 0);
        setIntField(term6040, term6040.getClass(), "movieStatus", 0);
        setField(term6040, term6040.getClass(), "movieServerUri", null);
        setField(term6040, term6040.getClass(), "deliverServerUri", null);
        setField(term6040, term6040.getClass(), "oldServerUri", null);
        setField(term6040, term6040.getClass(), "usbDlServerUri", null);
        setIntField(term6040, term6040.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsbDlServerUri", argTypes, term6040, args);
    }

};


