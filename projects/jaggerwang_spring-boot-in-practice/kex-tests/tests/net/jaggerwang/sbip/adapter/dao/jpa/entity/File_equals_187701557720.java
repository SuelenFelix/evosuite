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

public class File_equals_187701557720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20824;
     Object term20909;

    public File_equals_187701557720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20825 = new Long(6323132402520425961L);
        Long term20827 = new Long(-354905832180781372L);
        Class<? extends Object> term20911 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term20910 = ((Class) term20911).getDeclaredField((String) "LOCAL");
        ((Field) term20910).setAccessible(true);
        Object enum54 = ((Field) term20910).get((Object) null);
        Long term20875 = new Long(-5967061076297699457L);
        term20824 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term20862 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term20889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20904 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20824, term20824.getClass(), "id", term20825);
        setField(term20824, term20824.getClass(), "userId", term20827);
        setField(term20824, term20824.getClass(), "region", enum54);
        setField(term20824, term20824.getClass(), "bucket", "FwPbDZcHmB");
        setField(term20824, term20824.getClass(), "path", "hOncybyCAH");
        setField(term20862, term20862.getClass(), "name", "QduALnDSVo");
        setField(term20862, term20862.getClass(), "size", term20875);
        setField(term20862, term20862.getClass(), "type", "izPpKDErnQ");
        setField(term20824, term20824.getClass(), "meta", term20862);
        setIntField(term20890, term20890.getClass(), "year", 2029);
        setShortField(term20890, term20890.getClass(), "month", (short) 1);
        setShortField(term20890, term20890.getClass(), "day", (short) 21);
        setField(term20889, term20889.getClass(), "date", term20890);
        setByteField(term20894, term20894.getClass(), "hour", (byte) 9);
        setByteField(term20894, term20894.getClass(), "minute", (byte) 46);
        setByteField(term20894, term20894.getClass(), "second", (byte) 1);
        setIntField(term20894, term20894.getClass(), "nano", 276350652);
        setField(term20889, term20889.getClass(), "time", term20894);
        setField(term20824, term20824.getClass(), "createdAt", term20889);
        setIntField(term20900, term20900.getClass(), "year", 2019);
        setShortField(term20900, term20900.getClass(), "month", (short) 12);
        setShortField(term20900, term20900.getClass(), "day", (short) 20);
        setField(term20899, term20899.getClass(), "date", term20900);
        setByteField(term20904, term20904.getClass(), "hour", (byte) 22);
        setByteField(term20904, term20904.getClass(), "minute", (byte) 20);
        setByteField(term20904, term20904.getClass(), "second", (byte) 29);
        setIntField(term20904, term20904.getClass(), "nano", 582302461);
        setField(term20899, term20899.getClass(), "time", term20904);
        setField(term20824, term20824.getClass(), "updatedAt", term20899);
        term20909 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20909;
        callMethod(klass, "equals", argTypes, term20824, args);
    }

};


