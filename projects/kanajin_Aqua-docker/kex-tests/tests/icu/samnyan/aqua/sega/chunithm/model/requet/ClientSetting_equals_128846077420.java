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

public class ClientSetting_equals_128846077420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80104;
     Object term80225;

    public ClientSetting_equals_128846077420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80104 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term80104, term80104.getClass(), "placeId", "mEuPBmaYON");
        setField(term80104, term80104.getClass(), "clientId", "ObPGyohonw");
        setField(term80104, term80104.getClass(), "placeName", "gQKUmoXhdM");
        setField(term80104, term80104.getClass(), "regionId", "tvvzjEdEMh");
        setField(term80104, term80104.getClass(), "regionName", "MxEEwZkyaW");
        setField(term80104, term80104.getClass(), "allNetId", "lOGWYEqHxj");
        setField(term80104, term80104.getClass(), "bordId", "bfmcuNDfeS");
        setField(term80104, term80104.getClass(), "romVersion", "oNwwaNwhoB");
        setField(term80104, term80104.getClass(), "dataVersion", "YVrwLJWJoI");
        setField(term80104, term80104.getClass(), "dumpFileNum", "IDBsGgnCMF");
        term80225 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80225;
        callMethod(klass, "equals", argTypes, term80104, args);
    }

};


