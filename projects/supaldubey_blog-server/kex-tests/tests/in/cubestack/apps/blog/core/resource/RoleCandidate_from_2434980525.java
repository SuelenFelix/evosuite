package in.cubestack.apps.blog.core.resource;

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
import static in.cubestack.apps.blog.core.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleCandidate_from_2434980525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public RoleCandidate_from_2434980525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132 = new Long(-8400487765614892086L);
        term119 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119, term119.getClass(), "roleName", "EGtDIRbSSb");
        setField(term119, term119.getClass(), "id", term132);
        setIntField(term135, term135.getClass(), "year", 2012);
        setShortField(term135, term135.getClass(), "month", (short) 8);
        setShortField(term135, term135.getClass(), "day", (short) 25);
        setField(term134, term134.getClass(), "date", term135);
        setByteField(term139, term139.getClass(), "hour", (byte) 5);
        setByteField(term139, term139.getClass(), "minute", (byte) 20);
        setByteField(term139, term139.getClass(), "second", (byte) 50);
        setIntField(term139, term139.getClass(), "nano", 345595912);
        setField(term134, term134.getClass(), "time", term139);
        setField(term119, term119.getClass(), "createdAt", term134);
        setIntField(term145, term145.getClass(), "year", 2021);
        setShortField(term145, term145.getClass(), "month", (short) 1);
        setShortField(term145, term145.getClass(), "day", (short) 18);
        setField(term144, term144.getClass(), "date", term145);
        setByteField(term149, term149.getClass(), "hour", (byte) 13);
        setByteField(term149, term149.getClass(), "minute", (byte) 38);
        setByteField(term149, term149.getClass(), "second", (byte) 26);
        setIntField(term149, term149.getClass(), "nano", 544608644);
        setField(term144, term144.getClass(), "time", term149);
        setField(term119, term119.getClass(), "updatedAt", term144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Role");
        Object[] args = new Object[1];
        args[0] = term119;
        callMethod(klass, "from", argTypes, null, args);
    }

};


