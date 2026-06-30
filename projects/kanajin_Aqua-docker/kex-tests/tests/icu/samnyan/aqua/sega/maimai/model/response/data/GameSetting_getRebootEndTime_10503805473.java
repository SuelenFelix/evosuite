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

public class GameSetting_getRebootEndTime_10503805473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2976;

    public GameSetting_getRebootEndTime_10503805473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2976 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term2976, term2976.getClass(), "isMaintenance", true);
        setIntField(term2976, term2976.getClass(), "requestInterval", 1044519085);
        setField(term2976, term2976.getClass(), "rebootStartTime", "avhRaGZaBF");
        setField(term2976, term2976.getClass(), "rebootEndTime", "JkgoRtImdE");
        setIntField(term2976, term2976.getClass(), "movieUploadLimit", 2095699770);
        setIntField(term2976, term2976.getClass(), "movieStatus", -1365904757);
        setField(term2976, term2976.getClass(), "movieServerUri", "qFGKIJjlmV");
        setField(term2976, term2976.getClass(), "deliverServerUri", "IHqvyhMtuM");
        setField(term2976, term2976.getClass(), "oldServerUri", "dAldIGYAXV");
        setField(term2976, term2976.getClass(), "usbDlServerUri", "mLwibAPEsa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term2976, args);
    }

};


