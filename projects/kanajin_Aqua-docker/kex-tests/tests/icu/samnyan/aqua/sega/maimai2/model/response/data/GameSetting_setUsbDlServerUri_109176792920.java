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

public class GameSetting_setUsbDlServerUri_109176792920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916;

    public GameSetting_setUsbDlServerUri_109176792920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term4916, term4916.getClass(), "isMaintenance", true);
        setIntField(term4916, term4916.getClass(), "requestInterval", 229989439);
        setField(term4916, term4916.getClass(), "rebootStartTime", "JKGueoHesL");
        setField(term4916, term4916.getClass(), "rebootEndTime", "CRAUqtVBkU");
        setIntField(term4916, term4916.getClass(), "movieUploadLimit", -1620126913);
        setIntField(term4916, term4916.getClass(), "movieStatus", -1095121979);
        setField(term4916, term4916.getClass(), "movieServerUri", "DddqUYfomL");
        setField(term4916, term4916.getClass(), "deliverServerUri", "YQwoogpPyi");
        setField(term4916, term4916.getClass(), "oldServerUri", "rnPhHoorxj");
        setField(term4916, term4916.getClass(), "usbDlServerUri", "GuwJLKquuI");
        setIntField(term4916, term4916.getClass(), "rebootInterval", -1674851914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vYMCjgnztg";
        callMethod(klass, "setUsbDlServerUri", argTypes, term4916, args);
    }

};


