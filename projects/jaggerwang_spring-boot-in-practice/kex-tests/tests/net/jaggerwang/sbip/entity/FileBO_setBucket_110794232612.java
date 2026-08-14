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

public class FileBO_setBucket_110794232612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8001;

    public FileBO_setBucket_110794232612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8002 = new Long(5510783420697225605L);
        Long term8004 = new Long(6005241913654469005L);
        Class<? extends Object> term8099 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term8098 = ((Class) term8099).getDeclaredField((String) "LOCAL");
        ((Field) term8098).setAccessible(true);
        Object enum21 = ((Field) term8098).get((Object) null);
        Long term8052 = new Long(-1983291584002806658L);
        term8001 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term8039 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term8066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8081 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8001, term8001.getClass(), "id", term8002);
        setField(term8001, term8001.getClass(), "userId", term8004);
        setField(term8001, term8001.getClass(), "region", enum21);
        setField(term8001, term8001.getClass(), "bucket", "OEXDRUKcFl");
        setField(term8001, term8001.getClass(), "path", "RYdKCNNMBR");
        setField(term8039, term8039.getClass(), "name", "yGtHPyvYiQ");
        setField(term8039, term8039.getClass(), "size", term8052);
        setField(term8039, term8039.getClass(), "type", "MvRIxilFMJ");
        setField(term8001, term8001.getClass(), "meta", term8039);
        setIntField(term8067, term8067.getClass(), "year", 2020);
        setShortField(term8067, term8067.getClass(), "month", (short) 5);
        setShortField(term8067, term8067.getClass(), "day", (short) 18);
        setField(term8066, term8066.getClass(), "date", term8067);
        setByteField(term8071, term8071.getClass(), "hour", (byte) 5);
        setByteField(term8071, term8071.getClass(), "minute", (byte) 46);
        setByteField(term8071, term8071.getClass(), "second", (byte) 13);
        setIntField(term8071, term8071.getClass(), "nano", 45893173);
        setField(term8066, term8066.getClass(), "time", term8071);
        setField(term8001, term8001.getClass(), "createdAt", term8066);
        setIntField(term8077, term8077.getClass(), "year", 2017);
        setShortField(term8077, term8077.getClass(), "month", (short) 4);
        setShortField(term8077, term8077.getClass(), "day", (short) 3);
        setField(term8076, term8076.getClass(), "date", term8077);
        setByteField(term8081, term8081.getClass(), "hour", (byte) 6);
        setByteField(term8081, term8081.getClass(), "minute", (byte) 51);
        setByteField(term8081, term8081.getClass(), "second", (byte) 10);
        setIntField(term8081, term8081.getClass(), "nano", 316377166);
        setField(term8076, term8076.getClass(), "time", term8081);
        setField(term8001, term8001.getClass(), "updatedAt", term8076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setBucket", argTypes, term8001, args);
    }

};


