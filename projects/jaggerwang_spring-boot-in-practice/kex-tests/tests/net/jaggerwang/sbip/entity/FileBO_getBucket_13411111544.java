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

public class FileBO_getBucket_13411111544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5221;

    public FileBO_getBucket_13411111544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5222 = new Long(-2644215923136513282L);
        Long term5224 = new Long(-1468719814009985452L);
        Class<? extends Object> term5307 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term5306 = ((Class) term5307).getDeclaredField((String) "LOCAL");
        ((Field) term5306).setAccessible(true);
        Object enum13 = ((Field) term5306).get((Object) null);
        Long term5272 = new Long(-7738503207562305297L);
        term5221 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term5259 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term5286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5291 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5296 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5297 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5301 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5221, term5221.getClass(), "id", term5222);
        setField(term5221, term5221.getClass(), "userId", term5224);
        setField(term5221, term5221.getClass(), "region", enum13);
        setField(term5221, term5221.getClass(), "bucket", "idgaQsnJpQ");
        setField(term5221, term5221.getClass(), "path", "VgZnGoIFwQ");
        setField(term5259, term5259.getClass(), "name", "jUbSRrkrYZ");
        setField(term5259, term5259.getClass(), "size", term5272);
        setField(term5259, term5259.getClass(), "type", "bWWfajKbEX");
        setField(term5221, term5221.getClass(), "meta", term5259);
        setIntField(term5287, term5287.getClass(), "year", 2021);
        setShortField(term5287, term5287.getClass(), "month", (short) 8);
        setShortField(term5287, term5287.getClass(), "day", (short) 12);
        setField(term5286, term5286.getClass(), "date", term5287);
        setByteField(term5291, term5291.getClass(), "hour", (byte) 2);
        setByteField(term5291, term5291.getClass(), "minute", (byte) 17);
        setByteField(term5291, term5291.getClass(), "second", (byte) 51);
        setIntField(term5291, term5291.getClass(), "nano", 207375141);
        setField(term5286, term5286.getClass(), "time", term5291);
        setField(term5221, term5221.getClass(), "createdAt", term5286);
        setIntField(term5297, term5297.getClass(), "year", 2025);
        setShortField(term5297, term5297.getClass(), "month", (short) 11);
        setShortField(term5297, term5297.getClass(), "day", (short) 3);
        setField(term5296, term5296.getClass(), "date", term5297);
        setByteField(term5301, term5301.getClass(), "hour", (byte) 21);
        setByteField(term5301, term5301.getClass(), "minute", (byte) 24);
        setByteField(term5301, term5301.getClass(), "second", (byte) 23);
        setIntField(term5301, term5301.getClass(), "nano", 210986721);
        setField(term5296, term5296.getClass(), "time", term5301);
        setField(term5221, term5221.getClass(), "updatedAt", term5296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBucket", argTypes, term5221, args);
    }

};


