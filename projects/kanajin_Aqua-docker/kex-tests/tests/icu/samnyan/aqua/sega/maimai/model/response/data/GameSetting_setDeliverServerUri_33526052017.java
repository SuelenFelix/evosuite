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

public class GameSetting_setDeliverServerUri_33526052017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4968;

    public GameSetting_setDeliverServerUri_33526052017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4968 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4968, term4968.getClass(), "isMaintenance", false);
        setIntField(term4968, term4968.getClass(), "requestInterval", -402072606);
        setField(term4968, term4968.getClass(), "rebootStartTime", "KtuuNAqGCQ");
        setField(term4968, term4968.getClass(), "rebootEndTime", "OGQsfjmReM");
        setIntField(term4968, term4968.getClass(), "movieUploadLimit", -477355193);
        setIntField(term4968, term4968.getClass(), "movieStatus", 168425089);
        setField(term4968, term4968.getClass(), "movieServerUri", "YsUtbngnRO");
        setField(term4968, term4968.getClass(), "deliverServerUri", "JisaWUxcNb");
        setField(term4968, term4968.getClass(), "oldServerUri", "NxgmYPzWCI");
        setField(term4968, term4968.getClass(), "usbDlServerUri", "SqjyKmayBx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XjDhvToxJy";
        callMethod(klass, "setDeliverServerUri", argTypes, term4968, args);
    }

};


