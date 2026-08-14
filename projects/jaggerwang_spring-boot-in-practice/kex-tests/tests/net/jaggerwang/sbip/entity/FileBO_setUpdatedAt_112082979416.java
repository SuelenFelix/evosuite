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

public class FileBO_setUpdatedAt_112082979416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9490;
     Object term9575;

    public FileBO_setUpdatedAt_112082979416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9491 = new Long(-8463029266761149071L);
        Long term9493 = new Long(3133860696238261492L);
        Class<? extends Object> term9586 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term9585 = ((Class) term9586).getDeclaredField((String) "LOCAL");
        ((Field) term9585).setAccessible(true);
        Object enum25 = ((Field) term9585).get((Object) null);
        Long term9541 = new Long(7247160664318067468L);
        term9490 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term9528 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term9555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9570 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9490, term9490.getClass(), "id", term9491);
        setField(term9490, term9490.getClass(), "userId", term9493);
        setField(term9490, term9490.getClass(), "region", enum25);
        setField(term9490, term9490.getClass(), "bucket", "xJgPlLxpgC");
        setField(term9490, term9490.getClass(), "path", "EYtfuJaxiM");
        setField(term9528, term9528.getClass(), "name", "gCWtLVKVVe");
        setField(term9528, term9528.getClass(), "size", term9541);
        setField(term9528, term9528.getClass(), "type", "fWKJoSoCwE");
        setField(term9490, term9490.getClass(), "meta", term9528);
        setIntField(term9556, term9556.getClass(), "year", 2012);
        setShortField(term9556, term9556.getClass(), "month", (short) 7);
        setShortField(term9556, term9556.getClass(), "day", (short) 21);
        setField(term9555, term9555.getClass(), "date", term9556);
        setByteField(term9560, term9560.getClass(), "hour", (byte) 13);
        setByteField(term9560, term9560.getClass(), "minute", (byte) 41);
        setByteField(term9560, term9560.getClass(), "second", (byte) 44);
        setIntField(term9560, term9560.getClass(), "nano", 394467282);
        setField(term9555, term9555.getClass(), "time", term9560);
        setField(term9490, term9490.getClass(), "createdAt", term9555);
        setIntField(term9566, term9566.getClass(), "year", 2025);
        setShortField(term9566, term9566.getClass(), "month", (short) 9);
        setShortField(term9566, term9566.getClass(), "day", (short) 25);
        setField(term9565, term9565.getClass(), "date", term9566);
        setByteField(term9570, term9570.getClass(), "hour", (byte) 20);
        setByteField(term9570, term9570.getClass(), "minute", (byte) 0);
        setByteField(term9570, term9570.getClass(), "second", (byte) 25);
        setIntField(term9570, term9570.getClass(), "nano", 65871584);
        setField(term9565, term9565.getClass(), "time", term9570);
        setField(term9490, term9490.getClass(), "updatedAt", term9565);
        term9575 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9576 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9580 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9576, term9576.getClass(), "year", 2011);
        setShortField(term9576, term9576.getClass(), "month", (short) 9);
        setShortField(term9576, term9576.getClass(), "day", (short) 25);
        setField(term9575, term9575.getClass(), "date", term9576);
        setByteField(term9580, term9580.getClass(), "hour", (byte) 16);
        setByteField(term9580, term9580.getClass(), "minute", (byte) 45);
        setByteField(term9580, term9580.getClass(), "second", (byte) 19);
        setIntField(term9580, term9580.getClass(), "nano", 962864785);
        setField(term9575, term9575.getClass(), "time", term9580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9575;
        callMethod(klass, "setUpdatedAt", argTypes, term9490, args);
    }

};


