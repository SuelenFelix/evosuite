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

public class ClientSetting_getRegionId_5604558103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76127;

    public ClientSetting_getRegionId_5604558103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76127 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term76127, term76127.getClass(), "placeId", "RNRZKctZBC");
        setField(term76127, term76127.getClass(), "clientId", "OzqbIrAqJB");
        setField(term76127, term76127.getClass(), "placeName", "oHBNAywdjX");
        setField(term76127, term76127.getClass(), "regionId", "LtXEvmsGft");
        setField(term76127, term76127.getClass(), "regionName", "lQlNRkcQRY");
        setField(term76127, term76127.getClass(), "allNetId", "tGFJhbkqHf");
        setField(term76127, term76127.getClass(), "bordId", "IPPRLZGZBn");
        setField(term76127, term76127.getClass(), "romVersion", "FvDAlgSUBA");
        setField(term76127, term76127.getClass(), "dataVersion", "RSpTPOOWxv");
        setField(term76127, term76127.getClass(), "dumpFileNum", "mJAIaSwRTZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionId", argTypes, term76127, args);
    }

};


