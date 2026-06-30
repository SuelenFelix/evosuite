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

public class ClientSetting_getPlaceId_33633341726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81210;

    public ClientSetting_getPlaceId_33633341726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81210 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81210, term81210.getClass(), "placeId", null);
        setField(term81210, term81210.getClass(), "clientId", null);
        setField(term81210, term81210.getClass(), "placeName", null);
        setField(term81210, term81210.getClass(), "regionId", null);
        setField(term81210, term81210.getClass(), "regionName", null);
        setField(term81210, term81210.getClass(), "allNetId", null);
        setField(term81210, term81210.getClass(), "bordId", null);
        setField(term81210, term81210.getClass(), "romVersion", null);
        setField(term81210, term81210.getClass(), "dataVersion", null);
        setField(term81210, term81210.getClass(), "dumpFileNum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term81210, args);
    }

};


