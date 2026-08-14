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

public class FileBO_getCreatedAt_7101670057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6262;

    public FileBO_getCreatedAt_7101670057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6263 = new Long(-1610676979013636850L);
        Long term6265 = new Long(2062173786000223358L);
        Class<? extends Object> term6348 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term6347 = ((Class) term6348).getDeclaredField((String) "LOCAL");
        ((Field) term6347).setAccessible(true);
        Object enum16 = ((Field) term6347).get((Object) null);
        Long term6313 = new Long(-8658027316505137504L);
        term6262 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term6300 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term6327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6342 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6262, term6262.getClass(), "id", term6263);
        setField(term6262, term6262.getClass(), "userId", term6265);
        setField(term6262, term6262.getClass(), "region", enum16);
        setField(term6262, term6262.getClass(), "bucket", "GVizqqzXpy");
        setField(term6262, term6262.getClass(), "path", "JqXGgAhZPl");
        setField(term6300, term6300.getClass(), "name", "jiKYgYHqIS");
        setField(term6300, term6300.getClass(), "size", term6313);
        setField(term6300, term6300.getClass(), "type", "DfISiziTgG");
        setField(term6262, term6262.getClass(), "meta", term6300);
        setIntField(term6328, term6328.getClass(), "year", 2010);
        setShortField(term6328, term6328.getClass(), "month", (short) 5);
        setShortField(term6328, term6328.getClass(), "day", (short) 2);
        setField(term6327, term6327.getClass(), "date", term6328);
        setByteField(term6332, term6332.getClass(), "hour", (byte) 2);
        setByteField(term6332, term6332.getClass(), "minute", (byte) 22);
        setByteField(term6332, term6332.getClass(), "second", (byte) 33);
        setIntField(term6332, term6332.getClass(), "nano", 530835039);
        setField(term6327, term6327.getClass(), "time", term6332);
        setField(term6262, term6262.getClass(), "createdAt", term6327);
        setIntField(term6338, term6338.getClass(), "year", 2024);
        setShortField(term6338, term6338.getClass(), "month", (short) 4);
        setShortField(term6338, term6338.getClass(), "day", (short) 24);
        setField(term6337, term6337.getClass(), "date", term6338);
        setByteField(term6342, term6342.getClass(), "hour", (byte) 7);
        setByteField(term6342, term6342.getClass(), "minute", (byte) 2);
        setByteField(term6342, term6342.getClass(), "second", (byte) 51);
        setIntField(term6342, term6342.getClass(), "nano", 635502964);
        setField(term6337, term6337.getClass(), "time", term6342);
        setField(term6262, term6262.getClass(), "updatedAt", term6337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term6262, args);
    }

};


