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

public class GameSetting_setDeliverServerUri_61556136246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6028;

    public GameSetting_setDeliverServerUri_61556136246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6028 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term6028, term6028.getClass(), "isMaintenance", false);
        setIntField(term6028, term6028.getClass(), "requestInterval", 0);
        setField(term6028, term6028.getClass(), "rebootStartTime", null);
        setField(term6028, term6028.getClass(), "rebootEndTime", null);
        setIntField(term6028, term6028.getClass(), "movieUploadLimit", 0);
        setIntField(term6028, term6028.getClass(), "movieStatus", 0);
        setField(term6028, term6028.getClass(), "movieServerUri", null);
        setField(term6028, term6028.getClass(), "deliverServerUri", null);
        setField(term6028, term6028.getClass(), "oldServerUri", null);
        setField(term6028, term6028.getClass(), "usbDlServerUri", null);
        setIntField(term6028, term6028.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDeliverServerUri", argTypes, term6028, args);
    }

};


