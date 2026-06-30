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

public class GameSetting_getRebootInterval_37891551110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3418;

    public GameSetting_getRebootInterval_37891551110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3418 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3418, term3418.getClass(), "isMaintenance", false);
        setIntField(term3418, term3418.getClass(), "requestInterval", 2039538484);
        setField(term3418, term3418.getClass(), "rebootStartTime", "bVbexZPmwW");
        setField(term3418, term3418.getClass(), "rebootEndTime", "tvxYdqiyGc");
        setIntField(term3418, term3418.getClass(), "movieUploadLimit", 1235736068);
        setIntField(term3418, term3418.getClass(), "movieStatus", 329424176);
        setField(term3418, term3418.getClass(), "movieServerUri", "ZEXFoMSKeG");
        setField(term3418, term3418.getClass(), "deliverServerUri", "HvxahUfZcJ");
        setField(term3418, term3418.getClass(), "oldServerUri", "WkLpmqoQxy");
        setField(term3418, term3418.getClass(), "usbDlServerUri", "XiNoscmYhd");
        setIntField(term3418, term3418.getClass(), "rebootInterval", -1897199214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootInterval", argTypes, term3418, args);
    }

};


