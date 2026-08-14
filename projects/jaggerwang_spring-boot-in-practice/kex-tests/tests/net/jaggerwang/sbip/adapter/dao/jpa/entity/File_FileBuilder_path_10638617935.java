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

public class File_FileBuilder_path_10638617935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1424;

    public File_FileBuilder_path_10638617935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1425 = new Long(-5476826692763582090L);
        Long term1427 = new Long(-872011222785455006L);
        Class<? extends Object> term1522 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term1521 = ((Class) term1522).getDeclaredField((String) "LOCAL");
        ((Field) term1521).setAccessible(true);
        Object enum4 = ((Field) term1521).get((Object) null);
        Long term1475 = new Long(-316468845751588286L);
        term1424 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term1462 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term1489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1504 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1424, term1424.getClass(), "id", term1425);
        setField(term1424, term1424.getClass(), "userId", term1427);
        setField(term1424, term1424.getClass(), "region", enum4);
        setField(term1424, term1424.getClass(), "bucket", "tbcdzjIfER");
        setField(term1424, term1424.getClass(), "path", "HyxfbSQYBe");
        setField(term1462, term1462.getClass(), "name", "pCTimMblYc");
        setField(term1462, term1462.getClass(), "size", term1475);
        setField(term1462, term1462.getClass(), "type", "hNxWaHcfhY");
        setField(term1424, term1424.getClass(), "meta", term1462);
        setIntField(term1490, term1490.getClass(), "year", 2029);
        setShortField(term1490, term1490.getClass(), "month", (short) 8);
        setShortField(term1490, term1490.getClass(), "day", (short) 29);
        setField(term1489, term1489.getClass(), "date", term1490);
        setByteField(term1494, term1494.getClass(), "hour", (byte) 15);
        setByteField(term1494, term1494.getClass(), "minute", (byte) 50);
        setByteField(term1494, term1494.getClass(), "second", (byte) 1);
        setIntField(term1494, term1494.getClass(), "nano", 277971904);
        setField(term1489, term1489.getClass(), "time", term1494);
        setField(term1424, term1424.getClass(), "createdAt", term1489);
        setIntField(term1500, term1500.getClass(), "year", 2022);
        setShortField(term1500, term1500.getClass(), "month", (short) 11);
        setShortField(term1500, term1500.getClass(), "day", (short) 16);
        setField(term1499, term1499.getClass(), "date", term1500);
        setByteField(term1504, term1504.getClass(), "hour", (byte) 15);
        setByteField(term1504, term1504.getClass(), "minute", (byte) 54);
        setByteField(term1504, term1504.getClass(), "second", (byte) 2);
        setIntField(term1504, term1504.getClass(), "nano", 733274103);
        setField(term1499, term1499.getClass(), "time", term1504);
        setField(term1424, term1424.getClass(), "updatedAt", term1499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "path", argTypes, term1424, args);
    }

};


