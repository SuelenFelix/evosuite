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

public class ClientSetting_setDataVersion_137811815518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79618;

    public ClientSetting_setDataVersion_137811815518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79618 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term79618, term79618.getClass(), "placeId", "xTQmAOqrKo");
        setField(term79618, term79618.getClass(), "clientId", "pJPSrRkLki");
        setField(term79618, term79618.getClass(), "placeName", "CctsyEvwWN");
        setField(term79618, term79618.getClass(), "regionId", "DZhtgksRJV");
        setField(term79618, term79618.getClass(), "regionName", "kEOZgldknG");
        setField(term79618, term79618.getClass(), "allNetId", "TgjFBWvVUx");
        setField(term79618, term79618.getClass(), "bordId", "qyZMBaqUiw");
        setField(term79618, term79618.getClass(), "romVersion", "LScHUVQpVE");
        setField(term79618, term79618.getClass(), "dataVersion", "FbQsgUOoDY");
        setField(term79618, term79618.getClass(), "dumpFileNum", "xUMqyqCvcb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UQNPJMVgtC";
        callMethod(klass, "setDataVersion", argTypes, term79618, args);
    }

};


