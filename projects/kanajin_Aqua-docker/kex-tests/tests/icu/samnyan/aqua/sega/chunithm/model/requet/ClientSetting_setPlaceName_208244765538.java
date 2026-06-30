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

public class ClientSetting_setPlaceName_208244765538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81222;

    public ClientSetting_setPlaceName_208244765538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81222 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81222, term81222.getClass(), "placeId", null);
        setField(term81222, term81222.getClass(), "clientId", null);
        setField(term81222, term81222.getClass(), "placeName", null);
        setField(term81222, term81222.getClass(), "regionId", null);
        setField(term81222, term81222.getClass(), "regionName", null);
        setField(term81222, term81222.getClass(), "allNetId", null);
        setField(term81222, term81222.getClass(), "bordId", null);
        setField(term81222, term81222.getClass(), "romVersion", null);
        setField(term81222, term81222.getClass(), "dataVersion", null);
        setField(term81222, term81222.getClass(), "dumpFileNum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlaceName", argTypes, term81222, args);
    }

};


