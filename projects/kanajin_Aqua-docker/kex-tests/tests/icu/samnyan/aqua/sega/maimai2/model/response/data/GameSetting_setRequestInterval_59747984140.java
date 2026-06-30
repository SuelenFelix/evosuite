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
import java.lang.Integer;

public class GameSetting_setRequestInterval_59747984140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5986;
     Object term5992;

    public GameSetting_setRequestInterval_59747984140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5986 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5986, term5986.getClass(), "isMaintenance", false);
        setIntField(term5986, term5986.getClass(), "requestInterval", 0);
        setField(term5986, term5986.getClass(), "rebootStartTime", null);
        setField(term5986, term5986.getClass(), "rebootEndTime", null);
        setIntField(term5986, term5986.getClass(), "movieUploadLimit", 0);
        setIntField(term5986, term5986.getClass(), "movieStatus", 0);
        setField(term5986, term5986.getClass(), "movieServerUri", null);
        setField(term5986, term5986.getClass(), "deliverServerUri", null);
        setField(term5986, term5986.getClass(), "oldServerUri", null);
        setField(term5986, term5986.getClass(), "usbDlServerUri", null);
        setIntField(term5986, term5986.getClass(), "rebootInterval", 0);
        term5992 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5992;
        callMethod(klass, "setRequestInterval", argTypes, term5986, args);
    }

};


