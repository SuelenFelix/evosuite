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

public class ClientSetting_setClientId_206705451311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77917;

    public ClientSetting_setClientId_206705451311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77917 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term77917, term77917.getClass(), "placeId", "BPCRnKSWXh");
        setField(term77917, term77917.getClass(), "clientId", "QawFvvoVNe");
        setField(term77917, term77917.getClass(), "placeName", "JMmYwwRqLn");
        setField(term77917, term77917.getClass(), "regionId", "wiHmWKChBU");
        setField(term77917, term77917.getClass(), "regionName", "slHIDqbhVK");
        setField(term77917, term77917.getClass(), "allNetId", "lcdIOwjGRb");
        setField(term77917, term77917.getClass(), "bordId", "iVMKgSDqtv");
        setField(term77917, term77917.getClass(), "romVersion", "snUMTDsDAQ");
        setField(term77917, term77917.getClass(), "dataVersion", "mLLEZxImzO");
        setField(term77917, term77917.getClass(), "dumpFileNum", "pmCySZHNoC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WvaVoeUTqA";
        callMethod(klass, "setClientId", argTypes, term77917, args);
    }

};


