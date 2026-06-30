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

public class GameSetting_setRebootEndTime_134088133542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6000;

    public GameSetting_setRebootEndTime_134088133542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6000 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term6000, term6000.getClass(), "isMaintenance", false);
        setIntField(term6000, term6000.getClass(), "requestInterval", 0);
        setField(term6000, term6000.getClass(), "rebootStartTime", null);
        setField(term6000, term6000.getClass(), "rebootEndTime", null);
        setIntField(term6000, term6000.getClass(), "movieUploadLimit", 0);
        setIntField(term6000, term6000.getClass(), "movieStatus", 0);
        setField(term6000, term6000.getClass(), "movieServerUri", null);
        setField(term6000, term6000.getClass(), "deliverServerUri", null);
        setField(term6000, term6000.getClass(), "oldServerUri", null);
        setField(term6000, term6000.getClass(), "usbDlServerUri", null);
        setIntField(term6000, term6000.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRebootEndTime", argTypes, term6000, args);
    }

};


