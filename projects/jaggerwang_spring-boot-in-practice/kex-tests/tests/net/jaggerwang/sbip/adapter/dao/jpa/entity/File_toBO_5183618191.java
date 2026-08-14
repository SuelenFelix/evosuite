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

public class File_toBO_5183618191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14463;

    public File_toBO_5183618191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14464 = new Long(-6108006981756732593L);
        Long term14466 = new Long(-3565554762799701668L);
        Class<? extends Object> term14549 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term14548 = ((Class) term14549).getDeclaredField((String) "LOCAL");
        ((Field) term14548).setAccessible(true);
        Object enum36 = ((Field) term14548).get((Object) null);
        Long term14514 = new Long(-6837989212848250735L);
        term14463 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term14501 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term14528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14533 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14543 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14463, term14463.getClass(), "id", term14464);
        setField(term14463, term14463.getClass(), "userId", term14466);
        setField(term14463, term14463.getClass(), "region", enum36);
        setField(term14463, term14463.getClass(), "bucket", "EYtfuJaxiM");
        setField(term14463, term14463.getClass(), "path", "gCWtLVKVVe");
        setField(term14501, term14501.getClass(), "name", "fWKJoSoCwE");
        setField(term14501, term14501.getClass(), "size", term14514);
        setField(term14501, term14501.getClass(), "type", "wfaXBpWAUH");
        setField(term14463, term14463.getClass(), "meta", term14501);
        setIntField(term14529, term14529.getClass(), "year", 2027);
        setShortField(term14529, term14529.getClass(), "month", (short) 8);
        setShortField(term14529, term14529.getClass(), "day", (short) 16);
        setField(term14528, term14528.getClass(), "date", term14529);
        setByteField(term14533, term14533.getClass(), "hour", (byte) 8);
        setByteField(term14533, term14533.getClass(), "minute", (byte) 3);
        setByteField(term14533, term14533.getClass(), "second", (byte) 15);
        setIntField(term14533, term14533.getClass(), "nano", 332963320);
        setField(term14528, term14528.getClass(), "time", term14533);
        setField(term14463, term14463.getClass(), "createdAt", term14528);
        setIntField(term14539, term14539.getClass(), "year", 2021);
        setShortField(term14539, term14539.getClass(), "month", (short) 11);
        setShortField(term14539, term14539.getClass(), "day", (short) 12);
        setField(term14538, term14538.getClass(), "date", term14539);
        setByteField(term14543, term14543.getClass(), "hour", (byte) 0);
        setByteField(term14543, term14543.getClass(), "minute", (byte) 51);
        setByteField(term14543, term14543.getClass(), "second", (byte) 55);
        setIntField(term14543, term14543.getClass(), "nano", 745543124);
        setField(term14538, term14538.getClass(), "time", term14543);
        setField(term14463, term14463.getClass(), "updatedAt", term14538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term14463, args);
    }

};


