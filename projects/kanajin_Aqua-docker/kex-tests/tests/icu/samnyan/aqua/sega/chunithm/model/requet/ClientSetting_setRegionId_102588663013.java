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

public class ClientSetting_setRegionId_102588663013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78403;

    public ClientSetting_setRegionId_102588663013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78403 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term78403, term78403.getClass(), "placeId", "OFdIUrEOJR");
        setField(term78403, term78403.getClass(), "clientId", "xUODPydxaT");
        setField(term78403, term78403.getClass(), "placeName", "EdjuGrPKel");
        setField(term78403, term78403.getClass(), "regionId", "xKRCOGzNgc");
        setField(term78403, term78403.getClass(), "regionName", "JTfrTZUkVR");
        setField(term78403, term78403.getClass(), "allNetId", "klkctrXEId");
        setField(term78403, term78403.getClass(), "bordId", "HITkgFdUxC");
        setField(term78403, term78403.getClass(), "romVersion", "JtTgctnzIb");
        setField(term78403, term78403.getClass(), "dataVersion", "jkqncveFue");
        setField(term78403, term78403.getClass(), "dumpFileNum", "ORAFZEKabw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lNHeCcQUrM";
        callMethod(klass, "setRegionId", argTypes, term78403, args);
    }

};


