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

public class ClientSetting_getRomVersion_7697363157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77011;

    public ClientSetting_getRomVersion_7697363157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77011 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term77011, term77011.getClass(), "placeId", "llOXbdniOh");
        setField(term77011, term77011.getClass(), "clientId", "COqsWjaVOy");
        setField(term77011, term77011.getClass(), "placeName", "PJOXWELqDU");
        setField(term77011, term77011.getClass(), "regionId", "qxYfLsDxVm");
        setField(term77011, term77011.getClass(), "regionName", "IyiMbCQwHK");
        setField(term77011, term77011.getClass(), "allNetId", "qgMxuDOVlx");
        setField(term77011, term77011.getClass(), "bordId", "zjOGGlnQSZ");
        setField(term77011, term77011.getClass(), "romVersion", "lqDEahPiir");
        setField(term77011, term77011.getClass(), "dataVersion", "GyYnoejQdg");
        setField(term77011, term77011.getClass(), "dumpFileNum", "NuDZzHrXrn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRomVersion", argTypes, term77011, args);
    }

};


