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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Long;

public class PersonRole_getRole_10067841703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2425;

    public PersonRole_getRole_10067841703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2689 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term2688 = ((Class) term2689).getDeclaredField((String) "ACTIVE");
        ((Field) term2688).setAccessible(true);
        Object enum6 = ((Field) term2688).get((Object) null);
        ArrayList term2545 = new ArrayList();
        Long term2549 = new Long(6811161968424632369L);
        Long term2584 = new Long(-7237588299778557629L);
        Long term2606 = new Long(6967924379644551255L);
        term2425 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.PersonRole"));
        Object term2426 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term2551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2571 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term2586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2623 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2426, term2426.getClass(), "firstName", "flxyYxBRtu");
        setField(term2426, term2426.getClass(), "lastName", "OclPbYPkcH");
        setField(term2426, term2426.getClass(), "email", "IoAlmYsBwc");
        setField(term2426, term2426.getClass(), "username", "TEParAifyi");
        setField(term2426, term2426.getClass(), "password", "OWDIEULEFu");
        setField(term2426, term2426.getClass(), "profileImage", "dWRymuLBtr");
        setField(term2426, term2426.getClass(), "status", enum6);
        setField(term2426, term2426.getClass(), "phone", "AijpHYOFuy");
        setField(term2426, term2426.getClass(), "countryCode", "SbAoxhfrkn");
        setField(term2426, term2426.getClass(), "salt", "kuTXqwMtDB");
        setField(term2426, term2426.getClass(), "personRoles", term2545);
        setField(term2426, term2426.getClass(), "id", term2549);
        setIntField(term2552, term2552.getClass(), "year", 2012);
        setShortField(term2552, term2552.getClass(), "month", (short) 2);
        setShortField(term2552, term2552.getClass(), "day", (short) 19);
        setField(term2551, term2551.getClass(), "date", term2552);
        setByteField(term2556, term2556.getClass(), "hour", (byte) 8);
        setByteField(term2556, term2556.getClass(), "minute", (byte) 4);
        setByteField(term2556, term2556.getClass(), "second", (byte) 43);
        setIntField(term2556, term2556.getClass(), "nano", 114930008);
        setField(term2551, term2551.getClass(), "time", term2556);
        setField(term2426, term2426.getClass(), "createdAt", term2551);
        setIntField(term2562, term2562.getClass(), "year", 2017);
        setShortField(term2562, term2562.getClass(), "month", (short) 6);
        setShortField(term2562, term2562.getClass(), "day", (short) 8);
        setField(term2561, term2561.getClass(), "date", term2562);
        setByteField(term2566, term2566.getClass(), "hour", (byte) 0);
        setByteField(term2566, term2566.getClass(), "minute", (byte) 18);
        setByteField(term2566, term2566.getClass(), "second", (byte) 55);
        setIntField(term2566, term2566.getClass(), "nano", 680586717);
        setField(term2561, term2561.getClass(), "time", term2566);
        setField(term2426, term2426.getClass(), "updatedAt", term2561);
        setField(term2425, term2425.getClass(), "person", term2426);
        setField(term2571, term2571.getClass(), "roleName", "Ghbwtircqb");
        setField(term2571, term2571.getClass(), "id", term2584);
        setIntField(term2587, term2587.getClass(), "year", 2015);
        setShortField(term2587, term2587.getClass(), "month", (short) 9);
        setShortField(term2587, term2587.getClass(), "day", (short) 16);
        setField(term2586, term2586.getClass(), "date", term2587);
        setByteField(term2591, term2591.getClass(), "hour", (byte) 6);
        setByteField(term2591, term2591.getClass(), "minute", (byte) 19);
        setByteField(term2591, term2591.getClass(), "second", (byte) 42);
        setIntField(term2591, term2591.getClass(), "nano", 630084975);
        setField(term2586, term2586.getClass(), "time", term2591);
        setField(term2571, term2571.getClass(), "createdAt", term2586);
        setIntField(term2597, term2597.getClass(), "year", 2029);
        setShortField(term2597, term2597.getClass(), "month", (short) 6);
        setShortField(term2597, term2597.getClass(), "day", (short) 23);
        setField(term2596, term2596.getClass(), "date", term2597);
        setByteField(term2601, term2601.getClass(), "hour", (byte) 21);
        setByteField(term2601, term2601.getClass(), "minute", (byte) 55);
        setByteField(term2601, term2601.getClass(), "second", (byte) 27);
        setIntField(term2601, term2601.getClass(), "nano", 66889274);
        setField(term2596, term2596.getClass(), "time", term2601);
        setField(term2571, term2571.getClass(), "updatedAt", term2596);
        setField(term2425, term2425.getClass(), "role", term2571);
        setField(term2425, term2425.getClass(), "id", term2606);
        setIntField(term2609, term2609.getClass(), "year", 2017);
        setShortField(term2609, term2609.getClass(), "month", (short) 3);
        setShortField(term2609, term2609.getClass(), "day", (short) 5);
        setField(term2608, term2608.getClass(), "date", term2609);
        setByteField(term2613, term2613.getClass(), "hour", (byte) 20);
        setByteField(term2613, term2613.getClass(), "minute", (byte) 34);
        setByteField(term2613, term2613.getClass(), "second", (byte) 55);
        setIntField(term2613, term2613.getClass(), "nano", 78024496);
        setField(term2608, term2608.getClass(), "time", term2613);
        setField(term2425, term2425.getClass(), "createdAt", term2608);
        setIntField(term2619, term2619.getClass(), "year", 2020);
        setShortField(term2619, term2619.getClass(), "month", (short) 7);
        setShortField(term2619, term2619.getClass(), "day", (short) 24);
        setField(term2618, term2618.getClass(), "date", term2619);
        setByteField(term2623, term2623.getClass(), "hour", (byte) 0);
        setByteField(term2623, term2623.getClass(), "minute", (byte) 59);
        setByteField(term2623, term2623.getClass(), "second", (byte) 56);
        setIntField(term2623, term2623.getClass(), "nano", 320219201);
        setField(term2618, term2618.getClass(), "time", term2623);
        setField(term2425, term2425.getClass(), "updatedAt", term2618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.PersonRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term2425, args);
    }

};


