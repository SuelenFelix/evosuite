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
import java.lang.Object;

public class RoleBO_RoleBOBuilder_build_18798778955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19991;

    public RoleBO_RoleBOBuilder_build_18798778955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19992 = new Long(-7283193381993602128L);
        term19991 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder"));
        Object term20006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20021 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19991, term19991.getClass(), "id", term19992);
        setField(term19991, term19991.getClass(), "name", "wzsPSPcRdj");
        setIntField(term20007, term20007.getClass(), "year", 2021);
        setShortField(term20007, term20007.getClass(), "month", (short) 5);
        setShortField(term20007, term20007.getClass(), "day", (short) 6);
        setField(term20006, term20006.getClass(), "date", term20007);
        setByteField(term20011, term20011.getClass(), "hour", (byte) 21);
        setByteField(term20011, term20011.getClass(), "minute", (byte) 10);
        setByteField(term20011, term20011.getClass(), "second", (byte) 43);
        setIntField(term20011, term20011.getClass(), "nano", 123313014);
        setField(term20006, term20006.getClass(), "time", term20011);
        setField(term19991, term19991.getClass(), "createdAt", term20006);
        setIntField(term20017, term20017.getClass(), "year", 2011);
        setShortField(term20017, term20017.getClass(), "month", (short) 6);
        setShortField(term20017, term20017.getClass(), "day", (short) 21);
        setField(term20016, term20016.getClass(), "date", term20017);
        setByteField(term20021, term20021.getClass(), "hour", (byte) 3);
        setByteField(term20021, term20021.getClass(), "minute", (byte) 19);
        setByteField(term20021, term20021.getClass(), "second", (byte) 41);
        setIntField(term20021, term20021.getClass(), "nano", 920537748);
        setField(term20016, term20016.getClass(), "time", term20021);
        setField(term19991, term19991.getClass(), "updatedAt", term20016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term19991, args);
    }

};


