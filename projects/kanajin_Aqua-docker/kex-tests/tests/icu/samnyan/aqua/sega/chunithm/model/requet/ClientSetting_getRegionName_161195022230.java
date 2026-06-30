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

public class ClientSetting_getRegionName_161195022230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81214;

    public ClientSetting_getRegionName_161195022230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81214 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81214, term81214.getClass(), "placeId", null);
        setField(term81214, term81214.getClass(), "clientId", null);
        setField(term81214, term81214.getClass(), "placeName", null);
        setField(term81214, term81214.getClass(), "regionId", null);
        setField(term81214, term81214.getClass(), "regionName", null);
        setField(term81214, term81214.getClass(), "allNetId", null);
        setField(term81214, term81214.getClass(), "bordId", null);
        setField(term81214, term81214.getClass(), "romVersion", null);
        setField(term81214, term81214.getClass(), "dataVersion", null);
        setField(term81214, term81214.getClass(), "dumpFileNum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionName", argTypes, term81214, args);
    }

};


