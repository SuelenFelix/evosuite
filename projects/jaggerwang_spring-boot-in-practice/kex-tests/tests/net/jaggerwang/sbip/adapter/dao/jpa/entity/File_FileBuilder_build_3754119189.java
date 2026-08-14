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

public class File_FileBuilder_build_3754119189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2901;

    public File_FileBuilder_build_3754119189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2902 = new Long(-4502405999831680926L);
        Long term2904 = new Long(1967728129628047933L);
        Class<? extends Object> term2987 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term2986 = ((Class) term2987).getDeclaredField((String) "LOCAL");
        ((Field) term2986).setAccessible(true);
        Object enum8 = ((Field) term2986).get((Object) null);
        Long term2952 = new Long(2120084523938730454L);
        term2901 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term2939 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term2966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2981 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2901, term2901.getClass(), "id", term2902);
        setField(term2901, term2901.getClass(), "userId", term2904);
        setField(term2901, term2901.getClass(), "region", enum8);
        setField(term2901, term2901.getClass(), "bucket", "xrwlQZdwCp");
        setField(term2901, term2901.getClass(), "path", "IDCWpPLRkE");
        setField(term2939, term2939.getClass(), "name", "nyiiPDVjAc");
        setField(term2939, term2939.getClass(), "size", term2952);
        setField(term2939, term2939.getClass(), "type", "aKnKipADSo");
        setField(term2901, term2901.getClass(), "meta", term2939);
        setIntField(term2967, term2967.getClass(), "year", 2017);
        setShortField(term2967, term2967.getClass(), "month", (short) 3);
        setShortField(term2967, term2967.getClass(), "day", (short) 5);
        setField(term2966, term2966.getClass(), "date", term2967);
        setByteField(term2971, term2971.getClass(), "hour", (byte) 20);
        setByteField(term2971, term2971.getClass(), "minute", (byte) 34);
        setByteField(term2971, term2971.getClass(), "second", (byte) 55);
        setIntField(term2971, term2971.getClass(), "nano", 78024496);
        setField(term2966, term2966.getClass(), "time", term2971);
        setField(term2901, term2901.getClass(), "createdAt", term2966);
        setIntField(term2977, term2977.getClass(), "year", 2020);
        setShortField(term2977, term2977.getClass(), "month", (short) 7);
        setShortField(term2977, term2977.getClass(), "day", (short) 24);
        setField(term2976, term2976.getClass(), "date", term2977);
        setByteField(term2981, term2981.getClass(), "hour", (byte) 0);
        setByteField(term2981, term2981.getClass(), "minute", (byte) 59);
        setByteField(term2981, term2981.getClass(), "second", (byte) 56);
        setIntField(term2981, term2981.getClass(), "nano", 320219201);
        setField(term2976, term2976.getClass(), "time", term2981);
        setField(term2901, term2901.getClass(), "updatedAt", term2976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2901, args);
    }

};


