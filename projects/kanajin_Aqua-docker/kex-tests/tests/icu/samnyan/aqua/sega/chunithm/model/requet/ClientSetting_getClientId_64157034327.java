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

public class ClientSetting_getClientId_64157034327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81211;

    public ClientSetting_getClientId_64157034327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81211 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81211, term81211.getClass(), "placeId", null);
        setField(term81211, term81211.getClass(), "clientId", null);
        setField(term81211, term81211.getClass(), "placeName", null);
        setField(term81211, term81211.getClass(), "regionId", null);
        setField(term81211, term81211.getClass(), "regionName", null);
        setField(term81211, term81211.getClass(), "allNetId", null);
        setField(term81211, term81211.getClass(), "bordId", null);
        setField(term81211, term81211.getClass(), "romVersion", null);
        setField(term81211, term81211.getClass(), "dataVersion", null);
        setField(term81211, term81211.getClass(), "dumpFileNum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientId", argTypes, term81211, args);
    }

};


