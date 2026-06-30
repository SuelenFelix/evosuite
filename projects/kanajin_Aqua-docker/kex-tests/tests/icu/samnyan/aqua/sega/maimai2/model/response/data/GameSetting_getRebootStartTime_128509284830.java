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

public class GameSetting_getRebootStartTime_128509284830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5924;

    public GameSetting_getRebootStartTime_128509284830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5924 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5924, term5924.getClass(), "isMaintenance", false);
        setIntField(term5924, term5924.getClass(), "requestInterval", 0);
        setField(term5924, term5924.getClass(), "rebootStartTime", null);
        setField(term5924, term5924.getClass(), "rebootEndTime", null);
        setIntField(term5924, term5924.getClass(), "movieUploadLimit", 0);
        setIntField(term5924, term5924.getClass(), "movieStatus", 0);
        setField(term5924, term5924.getClass(), "movieServerUri", null);
        setField(term5924, term5924.getClass(), "deliverServerUri", null);
        setField(term5924, term5924.getClass(), "oldServerUri", null);
        setField(term5924, term5924.getClass(), "usbDlServerUri", null);
        setIntField(term5924, term5924.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term5924, args);
    }

};


