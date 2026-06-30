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

public class ClientSetting_setDumpFileNum_197525453119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79861;

    public ClientSetting_setDumpFileNum_197525453119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79861 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term79861, term79861.getClass(), "placeId", "YxqBgErhNo");
        setField(term79861, term79861.getClass(), "clientId", "WquZFpGWYY");
        setField(term79861, term79861.getClass(), "placeName", "DVdLunspbQ");
        setField(term79861, term79861.getClass(), "regionId", "OUQVWAHprD");
        setField(term79861, term79861.getClass(), "regionName", "ptFvDczffY");
        setField(term79861, term79861.getClass(), "allNetId", "yDXeFOuvlq");
        setField(term79861, term79861.getClass(), "bordId", "gvnDtiMlxS");
        setField(term79861, term79861.getClass(), "romVersion", "UQbUgGUwXM");
        setField(term79861, term79861.getClass(), "dataVersion", "IsNPwCcyyl");
        setField(term79861, term79861.getClass(), "dumpFileNum", "zoWVYvefpE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxWXWoDENr";
        callMethod(klass, "setDumpFileNum", argTypes, term79861, args);
    }

};


