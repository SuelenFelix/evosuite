package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class File_getMeta_8329183399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16892;

    public File_getMeta_8329183399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16893 = new Long(4115148503664117517L);
        Long term16895 = new Long(8527367353497875781L);
        Class<? extends Object> term16978 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term16977 = ((Class) term16978).getDeclaredField((String) "LOCAL");
        ((Field) term16977).setAccessible(true);
        Object enum43 = ((Field) term16977).get((Object) null);
        Long term16943 = new Long(-6489405551733780896L);
        term16892 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term16930 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term16957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16972 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16892, term16892.getClass(), "id", term16893);
        setField(term16892, term16892.getClass(), "userId", term16895);
        setField(term16892, term16892.getClass(), "region", enum43);
        setField(term16892, term16892.getClass(), "bucket", "aWYOWZFyaX");
        setField(term16892, term16892.getClass(), "path", "BRIVNtfUWU");
        setField(term16930, term16930.getClass(), "name", "DbiCVtPPCT");
        setField(term16930, term16930.getClass(), "size", term16943);
        setField(term16930, term16930.getClass(), "type", "WzFopsaDuG");
        setField(term16892, term16892.getClass(), "meta", term16930);
        setIntField(term16958, term16958.getClass(), "year", 2018);
        setShortField(term16958, term16958.getClass(), "month", (short) 2);
        setShortField(term16958, term16958.getClass(), "day", (short) 4);
        setField(term16957, term16957.getClass(), "date", term16958);
        setByteField(term16962, term16962.getClass(), "hour", (byte) 5);
        setByteField(term16962, term16962.getClass(), "minute", (byte) 35);
        setByteField(term16962, term16962.getClass(), "second", (byte) 40);
        setIntField(term16962, term16962.getClass(), "nano", 354661894);
        setField(term16957, term16957.getClass(), "time", term16962);
        setField(term16892, term16892.getClass(), "createdAt", term16957);
        setIntField(term16968, term16968.getClass(), "year", 2010);
        setShortField(term16968, term16968.getClass(), "month", (short) 3);
        setShortField(term16968, term16968.getClass(), "day", (short) 23);
        setField(term16967, term16967.getClass(), "date", term16968);
        setByteField(term16972, term16972.getClass(), "hour", (byte) 17);
        setByteField(term16972, term16972.getClass(), "minute", (byte) 32);
        setByteField(term16972, term16972.getClass(), "second", (byte) 36);
        setIntField(term16972, term16972.getClass(), "nano", 470582535);
        setField(term16967, term16967.getClass(), "time", term16972);
        setField(term16892, term16892.getClass(), "updatedAt", term16967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term16892, args);
    }

};


