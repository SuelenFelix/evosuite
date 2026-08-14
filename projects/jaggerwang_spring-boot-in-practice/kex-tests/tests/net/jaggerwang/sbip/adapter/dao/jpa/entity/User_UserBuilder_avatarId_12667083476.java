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

public class User_UserBuilder_avatarId_12667083476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12776;
     Object term12861;

    public User_UserBuilder_avatarId_12667083476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12777 = new Long(-8692119547314358088L);
        Long term12827 = new Long(-2083524977884307536L);
        term12776 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12846 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12856 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12776, term12776.getClass(), "id", term12777);
        setField(term12776, term12776.getClass(), "username", "XPKmummaqg");
        setField(term12776, term12776.getClass(), "password", "BKLfkLiZTH");
        setField(term12776, term12776.getClass(), "mobile", "SPpkrGcPRr");
        setField(term12776, term12776.getClass(), "email", "sEccwbJKYE");
        setField(term12776, term12776.getClass(), "avatarId", term12827);
        setField(term12776, term12776.getClass(), "intro", "AWRooQKkdW");
        setIntField(term12842, term12842.getClass(), "year", 2029);
        setShortField(term12842, term12842.getClass(), "month", (short) 7);
        setShortField(term12842, term12842.getClass(), "day", (short) 14);
        setField(term12841, term12841.getClass(), "date", term12842);
        setByteField(term12846, term12846.getClass(), "hour", (byte) 17);
        setByteField(term12846, term12846.getClass(), "minute", (byte) 37);
        setByteField(term12846, term12846.getClass(), "second", (byte) 39);
        setIntField(term12846, term12846.getClass(), "nano", 333402299);
        setField(term12841, term12841.getClass(), "time", term12846);
        setField(term12776, term12776.getClass(), "createdAt", term12841);
        setIntField(term12852, term12852.getClass(), "year", 2025);
        setShortField(term12852, term12852.getClass(), "month", (short) 10);
        setShortField(term12852, term12852.getClass(), "day", (short) 30);
        setField(term12851, term12851.getClass(), "date", term12852);
        setByteField(term12856, term12856.getClass(), "hour", (byte) 1);
        setByteField(term12856, term12856.getClass(), "minute", (byte) 4);
        setByteField(term12856, term12856.getClass(), "second", (byte) 18);
        setIntField(term12856, term12856.getClass(), "nano", 717716253);
        setField(term12851, term12851.getClass(), "time", term12856);
        setField(term12776, term12776.getClass(), "updatedAt", term12851);
        term12861 = new Long(-2691996476200751382L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12861;
        callMethod(klass, "avatarId", argTypes, term12776, args);
    }

};


