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

public class Person_getUsername_10440708388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6577;

    public Person_getUsername_10440708388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6783 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term6782 = ((Class) term6783).getDeclaredField((String) "ACTIVE");
        ((Field) term6782).setAccessible(true);
        Object enum15 = ((Field) term6782).get((Object) null);
        ArrayList term6696 = new ArrayList();
        Long term6700 = new Long(-316468845751588286L);
        term6577 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term6702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6717 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6577, term6577.getClass(), "firstName", "jiKYgYHqIS");
        setField(term6577, term6577.getClass(), "lastName", "DfISiziTgG");
        setField(term6577, term6577.getClass(), "email", "XqgfKFvPSD");
        setField(term6577, term6577.getClass(), "username", "JiVRgTZvKc");
        setField(term6577, term6577.getClass(), "password", "XPKmummaqg");
        setField(term6577, term6577.getClass(), "profileImage", "BKLfkLiZTH");
        setField(term6577, term6577.getClass(), "status", enum15);
        setField(term6577, term6577.getClass(), "phone", "SPpkrGcPRr");
        setField(term6577, term6577.getClass(), "countryCode", "sEccwbJKYE");
        setField(term6577, term6577.getClass(), "salt", "AWRooQKkdW");
        setField(term6577, term6577.getClass(), "personRoles", term6696);
        setField(term6577, term6577.getClass(), "id", term6700);
        setIntField(term6703, term6703.getClass(), "year", 2012);
        setShortField(term6703, term6703.getClass(), "month", (short) 3);
        setShortField(term6703, term6703.getClass(), "day", (short) 27);
        setField(term6702, term6702.getClass(), "date", term6703);
        setByteField(term6707, term6707.getClass(), "hour", (byte) 17);
        setByteField(term6707, term6707.getClass(), "minute", (byte) 49);
        setByteField(term6707, term6707.getClass(), "second", (byte) 24);
        setIntField(term6707, term6707.getClass(), "nano", 530647398);
        setField(term6702, term6702.getClass(), "time", term6707);
        setField(term6577, term6577.getClass(), "createdAt", term6702);
        setIntField(term6713, term6713.getClass(), "year", 2010);
        setShortField(term6713, term6713.getClass(), "month", (short) 6);
        setShortField(term6713, term6713.getClass(), "day", (short) 14);
        setField(term6712, term6712.getClass(), "date", term6713);
        setByteField(term6717, term6717.getClass(), "hour", (byte) 6);
        setByteField(term6717, term6717.getClass(), "minute", (byte) 22);
        setByteField(term6717, term6717.getClass(), "second", (byte) 20);
        setIntField(term6717, term6717.getClass(), "nano", 25133051);
        setField(term6712, term6712.getClass(), "time", term6717);
        setField(term6577, term6577.getClass(), "updatedAt", term6712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term6577, args);
    }

};


