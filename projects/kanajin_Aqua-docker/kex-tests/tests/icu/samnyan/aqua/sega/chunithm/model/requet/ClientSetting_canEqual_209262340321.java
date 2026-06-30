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

public class ClientSetting_canEqual_209262340321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80326;
     Object term80447;

    public ClientSetting_canEqual_209262340321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80326 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term80326, term80326.getClass(), "placeId", "zogoMEslwR");
        setField(term80326, term80326.getClass(), "clientId", "SfWNBumWCS");
        setField(term80326, term80326.getClass(), "placeName", "fHJImkGpKa");
        setField(term80326, term80326.getClass(), "regionId", "FFuRCJTPFU");
        setField(term80326, term80326.getClass(), "regionName", "TFqQgSYtAg");
        setField(term80326, term80326.getClass(), "allNetId", "qIbUvSzenQ");
        setField(term80326, term80326.getClass(), "bordId", "syLbtpcFxr");
        setField(term80326, term80326.getClass(), "romVersion", "FKHboGOFMY");
        setField(term80326, term80326.getClass(), "dataVersion", "JAYIoLDVzT");
        setField(term80326, term80326.getClass(), "dumpFileNum", "nxzYMTIyjg");
        term80447 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80447;
        callMethod(klass, "canEqual", argTypes, term80326, args);
    }

};


