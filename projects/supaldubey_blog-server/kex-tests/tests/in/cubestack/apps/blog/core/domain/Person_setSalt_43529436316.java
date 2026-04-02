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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Person_setSalt_43529436316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10604;

    public Person_setSalt_43529436316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10810 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term10809 = ((Class) term10810).getDeclaredField((String) "ACTIVE");
        ((Field) term10809).setAccessible(true);
        Object enum23 = ((Field) term10809).get((Object) null);
        ArrayList term10723 = new ArrayList();
        Long term10727 = new Long(7009926388951271268L);
        term10604 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term10729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10744 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10604, term10604.getClass(), "firstName", "OYbzXylRWW");
        setField(term10604, term10604.getClass(), "lastName", "DSNsTGYXDF");
        setField(term10604, term10604.getClass(), "email", "sQvGcVjdEx");
        setField(term10604, term10604.getClass(), "username", "rLHAoqXgPh");
        setField(term10604, term10604.getClass(), "password", "zUlRdimJtU");
        setField(term10604, term10604.getClass(), "profileImage", "vwbEQQNQrx");
        setField(term10604, term10604.getClass(), "status", enum23);
        setField(term10604, term10604.getClass(), "phone", "xtftXXMbem");
        setField(term10604, term10604.getClass(), "countryCode", "cudZvLMQon");
        setField(term10604, term10604.getClass(), "salt", "lihXWlGDxk");
        setField(term10604, term10604.getClass(), "personRoles", term10723);
        setField(term10604, term10604.getClass(), "id", term10727);
        setIntField(term10730, term10730.getClass(), "year", 2024);
        setShortField(term10730, term10730.getClass(), "month", (short) 5);
        setShortField(term10730, term10730.getClass(), "day", (short) 6);
        setField(term10729, term10729.getClass(), "date", term10730);
        setByteField(term10734, term10734.getClass(), "hour", (byte) 20);
        setByteField(term10734, term10734.getClass(), "minute", (byte) 14);
        setByteField(term10734, term10734.getClass(), "second", (byte) 27);
        setIntField(term10734, term10734.getClass(), "nano", 900636101);
        setField(term10729, term10729.getClass(), "time", term10734);
        setField(term10604, term10604.getClass(), "createdAt", term10729);
        setIntField(term10740, term10740.getClass(), "year", 2021);
        setShortField(term10740, term10740.getClass(), "month", (short) 4);
        setShortField(term10740, term10740.getClass(), "day", (short) 17);
        setField(term10739, term10739.getClass(), "date", term10740);
        setByteField(term10744, term10744.getClass(), "hour", (byte) 4);
        setByteField(term10744, term10744.getClass(), "minute", (byte) 11);
        setByteField(term10744, term10744.getClass(), "second", (byte) 16);
        setIntField(term10744, term10744.getClass(), "nano", 509895858);
        setField(term10739, term10739.getClass(), "time", term10744);
        setField(term10604, term10604.getClass(), "updatedAt", term10739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setSalt", argTypes, term10604, args);
    }

};


