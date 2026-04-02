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

public class Role_getRoleName_19419242442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1175;

    public Role_getRoleName_19419242442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1188 = new Long(2442117782898005296L);
        term1175 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term1190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1195 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1205 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1175, term1175.getClass(), "roleName", "xxtlPwDYFs");
        setField(term1175, term1175.getClass(), "id", term1188);
        setIntField(term1191, term1191.getClass(), "year", 2012);
        setShortField(term1191, term1191.getClass(), "month", (short) 8);
        setShortField(term1191, term1191.getClass(), "day", (short) 25);
        setField(term1190, term1190.getClass(), "date", term1191);
        setByteField(term1195, term1195.getClass(), "hour", (byte) 5);
        setByteField(term1195, term1195.getClass(), "minute", (byte) 20);
        setByteField(term1195, term1195.getClass(), "second", (byte) 50);
        setIntField(term1195, term1195.getClass(), "nano", 345595912);
        setField(term1190, term1190.getClass(), "time", term1195);
        setField(term1175, term1175.getClass(), "createdAt", term1190);
        setIntField(term1201, term1201.getClass(), "year", 2021);
        setShortField(term1201, term1201.getClass(), "month", (short) 1);
        setShortField(term1201, term1201.getClass(), "day", (short) 18);
        setField(term1200, term1200.getClass(), "date", term1201);
        setByteField(term1205, term1205.getClass(), "hour", (byte) 13);
        setByteField(term1205, term1205.getClass(), "minute", (byte) 38);
        setByteField(term1205, term1205.getClass(), "second", (byte) 26);
        setIntField(term1205, term1205.getClass(), "nano", 544608644);
        setField(term1200, term1200.getClass(), "time", term1205);
        setField(term1175, term1175.getClass(), "updatedAt", term1200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoleName", argTypes, term1175, args);
    }

};


