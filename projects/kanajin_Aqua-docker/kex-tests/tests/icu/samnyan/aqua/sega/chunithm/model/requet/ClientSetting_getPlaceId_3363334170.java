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

public class ClientSetting_getPlaceId_3363334170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75464;

    public ClientSetting_getPlaceId_3363334170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75464 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term75464, term75464.getClass(), "placeId", "bstKSThCsH");
        setField(term75464, term75464.getClass(), "clientId", "QuJUFXGoAL");
        setField(term75464, term75464.getClass(), "placeName", "NHyvoceYPA");
        setField(term75464, term75464.getClass(), "regionId", "zvfYpTBhsN");
        setField(term75464, term75464.getClass(), "regionName", "SInylFGlyL");
        setField(term75464, term75464.getClass(), "allNetId", "vTqdPzKttw");
        setField(term75464, term75464.getClass(), "bordId", "UaULhxzYkE");
        setField(term75464, term75464.getClass(), "romVersion", "DkwiMryAQU");
        setField(term75464, term75464.getClass(), "dataVersion", "mVdlxSSqUp");
        setField(term75464, term75464.getClass(), "dumpFileNum", "uLrjpWhGzA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term75464, args);
    }

};


