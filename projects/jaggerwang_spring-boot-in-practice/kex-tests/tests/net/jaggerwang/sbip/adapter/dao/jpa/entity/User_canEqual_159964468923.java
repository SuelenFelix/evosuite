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
import java.lang.Object;

public class User_canEqual_159964468923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30576;
     Object term30661;

    public User_canEqual_159964468923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30577 = new Long(-7966859634511305171L);
        Long term30627 = new Long(5885163998873132588L);
        term30576 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30656 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30576, term30576.getClass(), "id", term30577);
        setField(term30576, term30576.getClass(), "username", "KSJeYkkvpk");
        setField(term30576, term30576.getClass(), "password", "qUtkFGMNUV");
        setField(term30576, term30576.getClass(), "mobile", "mGRiYhnMcR");
        setField(term30576, term30576.getClass(), "email", "NFlvfJCVPO");
        setField(term30576, term30576.getClass(), "avatarId", term30627);
        setField(term30576, term30576.getClass(), "intro", "KarbTXFmUU");
        setIntField(term30642, term30642.getClass(), "year", 2012);
        setShortField(term30642, term30642.getClass(), "month", (short) 6);
        setShortField(term30642, term30642.getClass(), "day", (short) 7);
        setField(term30641, term30641.getClass(), "date", term30642);
        setByteField(term30646, term30646.getClass(), "hour", (byte) 19);
        setByteField(term30646, term30646.getClass(), "minute", (byte) 20);
        setByteField(term30646, term30646.getClass(), "second", (byte) 29);
        setIntField(term30646, term30646.getClass(), "nano", 953959934);
        setField(term30641, term30641.getClass(), "time", term30646);
        setField(term30576, term30576.getClass(), "createdAt", term30641);
        setIntField(term30652, term30652.getClass(), "year", 2024);
        setShortField(term30652, term30652.getClass(), "month", (short) 3);
        setShortField(term30652, term30652.getClass(), "day", (short) 21);
        setField(term30651, term30651.getClass(), "date", term30652);
        setByteField(term30656, term30656.getClass(), "hour", (byte) 1);
        setByteField(term30656, term30656.getClass(), "minute", (byte) 21);
        setByteField(term30656, term30656.getClass(), "second", (byte) 2);
        setIntField(term30656, term30656.getClass(), "nano", 692012262);
        setField(term30651, term30651.getClass(), "time", term30656);
        setField(term30576, term30576.getClass(), "updatedAt", term30651);
        term30661 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30661;
        callMethod(klass, "canEqual", argTypes, term30576, args);
    }

};


