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

public class GameSetting_setRebootEndTime_39005945313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4372;

    public GameSetting_setRebootEndTime_39005945313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4372 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4372, term4372.getClass(), "isMaintenance", true);
        setIntField(term4372, term4372.getClass(), "requestInterval", -1051941387);
        setField(term4372, term4372.getClass(), "rebootStartTime", "UkKvaeJfEC");
        setField(term4372, term4372.getClass(), "rebootEndTime", "WPxXsahPRq");
        setIntField(term4372, term4372.getClass(), "movieUploadLimit", -640763660);
        setIntField(term4372, term4372.getClass(), "movieStatus", -1189468129);
        setField(term4372, term4372.getClass(), "movieServerUri", "IENRuqmwUU");
        setField(term4372, term4372.getClass(), "deliverServerUri", "GsWxOwXvSu");
        setField(term4372, term4372.getClass(), "oldServerUri", "bKBSncrMEZ");
        setField(term4372, term4372.getClass(), "usbDlServerUri", "yeSXGqQExb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uXYcXVYJZM";
        callMethod(klass, "setRebootEndTime", argTypes, term4372, args);
    }

};


