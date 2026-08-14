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

public class File_canEqual_161378909021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21172;
     Object term21257;

    public File_canEqual_161378909021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21173 = new Long(1550364590565203407L);
        Long term21175 = new Long(4530705892517898929L);
        Class<? extends Object> term21259 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term21258 = ((Class) term21259).getDeclaredField((String) "LOCAL");
        ((Field) term21258).setAccessible(true);
        Object enum55 = ((Field) term21258).get((Object) null);
        Long term21223 = new Long(7450734758126089960L);
        term21172 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term21210 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term21237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21252 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21172, term21172.getClass(), "id", term21173);
        setField(term21172, term21172.getClass(), "userId", term21175);
        setField(term21172, term21172.getClass(), "region", enum55);
        setField(term21172, term21172.getClass(), "bucket", "NnpwZBUTvx");
        setField(term21172, term21172.getClass(), "path", "tlQSNgTkQX");
        setField(term21210, term21210.getClass(), "name", "PCipZnmBOF");
        setField(term21210, term21210.getClass(), "size", term21223);
        setField(term21210, term21210.getClass(), "type", "zcorEihhLK");
        setField(term21172, term21172.getClass(), "meta", term21210);
        setIntField(term21238, term21238.getClass(), "year", 2010);
        setShortField(term21238, term21238.getClass(), "month", (short) 9);
        setShortField(term21238, term21238.getClass(), "day", (short) 26);
        setField(term21237, term21237.getClass(), "date", term21238);
        setByteField(term21242, term21242.getClass(), "hour", (byte) 17);
        setByteField(term21242, term21242.getClass(), "minute", (byte) 5);
        setByteField(term21242, term21242.getClass(), "second", (byte) 52);
        setIntField(term21242, term21242.getClass(), "nano", 138292575);
        setField(term21237, term21237.getClass(), "time", term21242);
        setField(term21172, term21172.getClass(), "createdAt", term21237);
        setIntField(term21248, term21248.getClass(), "year", 2022);
        setShortField(term21248, term21248.getClass(), "month", (short) 10);
        setShortField(term21248, term21248.getClass(), "day", (short) 14);
        setField(term21247, term21247.getClass(), "date", term21248);
        setByteField(term21252, term21252.getClass(), "hour", (byte) 10);
        setByteField(term21252, term21252.getClass(), "minute", (byte) 28);
        setByteField(term21252, term21252.getClass(), "second", (byte) 24);
        setIntField(term21252, term21252.getClass(), "nano", 117469048);
        setField(term21247, term21247.getClass(), "time", term21252);
        setField(term21172, term21172.getClass(), "updatedAt", term21247);
        term21257 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21257;
        callMethod(klass, "canEqual", argTypes, term21172, args);
    }

};


