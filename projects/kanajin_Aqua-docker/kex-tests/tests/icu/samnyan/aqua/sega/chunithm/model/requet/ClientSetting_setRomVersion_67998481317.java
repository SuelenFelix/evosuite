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

public class ClientSetting_setRomVersion_67998481317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79375;

    public ClientSetting_setRomVersion_67998481317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79375 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term79375, term79375.getClass(), "placeId", "kssWCPGFlA");
        setField(term79375, term79375.getClass(), "clientId", "MswayHAKlw");
        setField(term79375, term79375.getClass(), "placeName", "qICSGozwUr");
        setField(term79375, term79375.getClass(), "regionId", "dTLPQyRkQI");
        setField(term79375, term79375.getClass(), "regionName", "bLgBVBwSSr");
        setField(term79375, term79375.getClass(), "allNetId", "LoKsDbhNbo");
        setField(term79375, term79375.getClass(), "bordId", "GWRasXJpVB");
        setField(term79375, term79375.getClass(), "romVersion", "NxETFVBNah");
        setField(term79375, term79375.getClass(), "dataVersion", "djQXCEqeOZ");
        setField(term79375, term79375.getClass(), "dumpFileNum", "jQItbqdgru");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eESpOcBzik";
        callMethod(klass, "setRomVersion", argTypes, term79375, args);
    }

};


