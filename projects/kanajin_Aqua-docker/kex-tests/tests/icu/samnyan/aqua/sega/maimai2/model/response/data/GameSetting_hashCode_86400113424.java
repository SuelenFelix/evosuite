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

public class GameSetting_hashCode_86400113424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5494;

    public GameSetting_hashCode_86400113424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5494 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5494, term5494.getClass(), "isMaintenance", false);
        setIntField(term5494, term5494.getClass(), "requestInterval", 1841731593);
        setField(term5494, term5494.getClass(), "rebootStartTime", "KbwxawvYsw");
        setField(term5494, term5494.getClass(), "rebootEndTime", "gvjdfHNzOa");
        setIntField(term5494, term5494.getClass(), "movieUploadLimit", -1854929057);
        setIntField(term5494, term5494.getClass(), "movieStatus", 1703814701);
        setField(term5494, term5494.getClass(), "movieServerUri", "HqitWglYWX");
        setField(term5494, term5494.getClass(), "deliverServerUri", "pOuFRlHmbK");
        setField(term5494, term5494.getClass(), "oldServerUri", "WrzdBkinqV");
        setField(term5494, term5494.getClass(), "usbDlServerUri", "vydWXHfFTw");
        setIntField(term5494, term5494.getClass(), "rebootInterval", 1370246522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5494, args);
    }

};


