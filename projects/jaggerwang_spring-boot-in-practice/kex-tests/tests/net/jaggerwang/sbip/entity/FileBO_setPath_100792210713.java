package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FileBO_setPath_100792210713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8370;

    public FileBO_setPath_100792210713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8371 = new Long(5946780097489996391L);
        Long term8373 = new Long(-8652538484981166496L);
        Class<? extends Object> term8468 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term8467 = ((Class) term8468).getDeclaredField((String) "LOCAL");
        ((Field) term8467).setAccessible(true);
        Object enum22 = ((Field) term8467).get((Object) null);
        Long term8421 = new Long(2701184207686293431L);
        term8370 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term8408 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term8435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8450 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8370, term8370.getClass(), "id", term8371);
        setField(term8370, term8370.getClass(), "userId", term8373);
        setField(term8370, term8370.getClass(), "region", enum22);
        setField(term8370, term8370.getClass(), "bucket", "XylxrMBraH");
        setField(term8370, term8370.getClass(), "path", "pORebkoRdD");
        setField(term8408, term8408.getClass(), "name", "mXGCWJDOqA");
        setField(term8408, term8408.getClass(), "size", term8421);
        setField(term8408, term8408.getClass(), "type", "dpNsDgfPso");
        setField(term8370, term8370.getClass(), "meta", term8408);
        setIntField(term8436, term8436.getClass(), "year", 2027);
        setShortField(term8436, term8436.getClass(), "month", (short) 8);
        setShortField(term8436, term8436.getClass(), "day", (short) 23);
        setField(term8435, term8435.getClass(), "date", term8436);
        setByteField(term8440, term8440.getClass(), "hour", (byte) 15);
        setByteField(term8440, term8440.getClass(), "minute", (byte) 12);
        setByteField(term8440, term8440.getClass(), "second", (byte) 6);
        setIntField(term8440, term8440.getClass(), "nano", 541218258);
        setField(term8435, term8435.getClass(), "time", term8440);
        setField(term8370, term8370.getClass(), "createdAt", term8435);
        setIntField(term8446, term8446.getClass(), "year", 2013);
        setShortField(term8446, term8446.getClass(), "month", (short) 5);
        setShortField(term8446, term8446.getClass(), "day", (short) 26);
        setField(term8445, term8445.getClass(), "date", term8446);
        setByteField(term8450, term8450.getClass(), "hour", (byte) 4);
        setByteField(term8450, term8450.getClass(), "minute", (byte) 39);
        setByteField(term8450, term8450.getClass(), "second", (byte) 5);
        setIntField(term8450, term8450.getClass(), "nano", 392869354);
        setField(term8445, term8445.getClass(), "time", term8450);
        setField(term8370, term8370.getClass(), "updatedAt", term8445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setPath", argTypes, term8370, args);
    }

};


