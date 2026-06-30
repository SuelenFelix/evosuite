package icu.samnyan.aqua.sega.chunithm.model.requet;

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
import static icu.samnyan.aqua.sega.chunithm.model.requet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientSetting_setAllNetId_9683260615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78889;

    public ClientSetting_setAllNetId_9683260615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78889 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term78889, term78889.getClass(), "placeId", "hClrkDuclb");
        setField(term78889, term78889.getClass(), "clientId", "RQGjkjoJid");
        setField(term78889, term78889.getClass(), "placeName", "fqFCsfbRxM");
        setField(term78889, term78889.getClass(), "regionId", "VxtdFZGhCL");
        setField(term78889, term78889.getClass(), "regionName", "NdCqWFAKtC");
        setField(term78889, term78889.getClass(), "allNetId", "brggoDHwgJ");
        setField(term78889, term78889.getClass(), "bordId", "mDOxbNsMUA");
        setField(term78889, term78889.getClass(), "romVersion", "wmcOIwaOzF");
        setField(term78889, term78889.getClass(), "dataVersion", "tvKxAKjRmt");
        setField(term78889, term78889.getClass(), "dumpFileNum", "YqKucvfPsH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yJJLpUySXp";
        callMethod(klass, "setAllNetId", argTypes, term78889, args);
    }

};


