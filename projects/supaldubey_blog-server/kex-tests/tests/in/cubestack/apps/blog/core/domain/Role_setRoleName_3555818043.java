package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Role_setRoleName_3555818043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1220;

    public Role_setRoleName_3555818043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1233 = new Long(6375119433582206027L);
        term1220 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term1235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1250 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1220, term1220.getClass(), "roleName", "jJCZpVmanW");
        setField(term1220, term1220.getClass(), "id", term1233);
        setIntField(term1236, term1236.getClass(), "year", 2015);
        setShortField(term1236, term1236.getClass(), "month", (short) 9);
        setShortField(term1236, term1236.getClass(), "day", (short) 19);
        setField(term1235, term1235.getClass(), "date", term1236);
        setByteField(term1240, term1240.getClass(), "hour", (byte) 9);
        setByteField(term1240, term1240.getClass(), "minute", (byte) 4);
        setByteField(term1240, term1240.getClass(), "second", (byte) 10);
        setIntField(term1240, term1240.getClass(), "nano", 401765865);
        setField(term1235, term1235.getClass(), "time", term1240);
        setField(term1220, term1220.getClass(), "createdAt", term1235);
        setIntField(term1246, term1246.getClass(), "year", 2015);
        setShortField(term1246, term1246.getClass(), "month", (short) 4);
        setShortField(term1246, term1246.getClass(), "day", (short) 14);
        setField(term1245, term1245.getClass(), "date", term1246);
        setByteField(term1250, term1250.getClass(), "hour", (byte) 18);
        setByteField(term1250, term1250.getClass(), "minute", (byte) 24);
        setByteField(term1250, term1250.getClass(), "second", (byte) 32);
        setIntField(term1250, term1250.getClass(), "nano", 369233818);
        setField(term1245, term1245.getClass(), "time", term1250);
        setField(term1220, term1220.getClass(), "updatedAt", term1245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "setRoleName", argTypes, term1220, args);
    }

};


