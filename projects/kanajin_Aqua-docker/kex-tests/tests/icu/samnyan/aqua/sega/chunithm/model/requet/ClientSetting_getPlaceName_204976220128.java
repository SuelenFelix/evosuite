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

public class ClientSetting_getPlaceName_204976220128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81212;

    public ClientSetting_getPlaceName_204976220128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81212 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81212, term81212.getClass(), "placeId", null);
        setField(term81212, term81212.getClass(), "clientId", null);
        setField(term81212, term81212.getClass(), "placeName", null);
        setField(term81212, term81212.getClass(), "regionId", null);
        setField(term81212, term81212.getClass(), "regionName", null);
        setField(term81212, term81212.getClass(), "allNetId", null);
        setField(term81212, term81212.getClass(), "bordId", null);
        setField(term81212, term81212.getClass(), "romVersion", null);
        setField(term81212, term81212.getClass(), "dataVersion", null);
        setField(term81212, term81212.getClass(), "dumpFileNum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term81212, args);
    }

};


