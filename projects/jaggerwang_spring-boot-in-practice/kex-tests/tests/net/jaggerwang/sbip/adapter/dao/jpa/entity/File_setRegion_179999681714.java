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

public class File_setRegion_179999681714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18631;
     Object enum48;

    public File_setRegion_179999681714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18632 = new Long(206360660645917003L);
        Long term18634 = new Long(8680715663951713735L);
        Class<? extends Object> term18717 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term18716 = ((Class) term18717).getDeclaredField((String) "LOCAL");
        ((Field) term18716).setAccessible(true);
        enum48 = ((Field) term18716).get((Object) null);
        Long term18682 = new Long(-4905558793519537969L);
        term18631 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term18669 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term18696 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18697 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18701 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18711 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18631, term18631.getClass(), "id", term18632);
        setField(term18631, term18631.getClass(), "userId", term18634);
        setField(term18631, term18631.getClass(), "region", enum48);
        setField(term18631, term18631.getClass(), "bucket", "VGizxZnyHX");
        setField(term18631, term18631.getClass(), "path", "kVEZMHmRtR");
        setField(term18669, term18669.getClass(), "name", "ekxGuOYIwi");
        setField(term18669, term18669.getClass(), "size", term18682);
        setField(term18669, term18669.getClass(), "type", "RbVQXSpxXy");
        setField(term18631, term18631.getClass(), "meta", term18669);
        setIntField(term18697, term18697.getClass(), "year", 2025);
        setShortField(term18697, term18697.getClass(), "month", (short) 2);
        setShortField(term18697, term18697.getClass(), "day", (short) 23);
        setField(term18696, term18696.getClass(), "date", term18697);
        setByteField(term18701, term18701.getClass(), "hour", (byte) 16);
        setByteField(term18701, term18701.getClass(), "minute", (byte) 39);
        setByteField(term18701, term18701.getClass(), "second", (byte) 42);
        setIntField(term18701, term18701.getClass(), "nano", 342777686);
        setField(term18696, term18696.getClass(), "time", term18701);
        setField(term18631, term18631.getClass(), "createdAt", term18696);
        setIntField(term18707, term18707.getClass(), "year", 2029);
        setShortField(term18707, term18707.getClass(), "month", (short) 8);
        setShortField(term18707, term18707.getClass(), "day", (short) 14);
        setField(term18706, term18706.getClass(), "date", term18707);
        setByteField(term18711, term18711.getClass(), "hour", (byte) 10);
        setByteField(term18711, term18711.getClass(), "minute", (byte) 28);
        setByteField(term18711, term18711.getClass(), "second", (byte) 23);
        setIntField(term18711, term18711.getClass(), "nano", 676524979);
        setField(term18706, term18706.getClass(), "time", term18711);
        setField(term18631, term18631.getClass(), "updatedAt", term18706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = enum48;
        callMethod(klass, "setRegion", argTypes, term18631, args);
    }

};


