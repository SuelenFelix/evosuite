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

public class ClientSetting_getDataVersion_14811689718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77232;

    public ClientSetting_getDataVersion_14811689718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77232 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term77232, term77232.getClass(), "placeId", "OuLKyvvPWX");
        setField(term77232, term77232.getClass(), "clientId", "XCikiAMbLv");
        setField(term77232, term77232.getClass(), "placeName", "VnvZpXcWbJ");
        setField(term77232, term77232.getClass(), "regionId", "CqfTXppaYd");
        setField(term77232, term77232.getClass(), "regionName", "vGKebDDKcW");
        setField(term77232, term77232.getClass(), "allNetId", "MkwJQnHQbf");
        setField(term77232, term77232.getClass(), "bordId", "yPMIDJRkkP");
        setField(term77232, term77232.getClass(), "romVersion", "FYrHZjWNQJ");
        setField(term77232, term77232.getClass(), "dataVersion", "kroCMCDLFI");
        setField(term77232, term77232.getClass(), "dumpFileNum", "KkIBmxvzcL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataVersion", argTypes, term77232, args);
    }

};


