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

public class Person_setProfileImage_130862989012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8557;

    public Person_setProfileImage_130862989012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8775 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term8774 = ((Class) term8775).getDeclaredField((String) "ACTIVE");
        ((Field) term8774).setAccessible(true);
        Object enum19 = ((Field) term8774).get((Object) null);
        ArrayList term8676 = new ArrayList();
        Long term8680 = new Long(8428634514691209827L);
        term8557 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term8682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8687 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8697 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8557, term8557.getClass(), "firstName", "OJJtVNPyKZ");
        setField(term8557, term8557.getClass(), "lastName", "AKNapTAfmD");
        setField(term8557, term8557.getClass(), "email", "xJgPlLxpgC");
        setField(term8557, term8557.getClass(), "username", "EYtfuJaxiM");
        setField(term8557, term8557.getClass(), "password", "gCWtLVKVVe");
        setField(term8557, term8557.getClass(), "profileImage", "fWKJoSoCwE");
        setField(term8557, term8557.getClass(), "status", enum19);
        setField(term8557, term8557.getClass(), "phone", "wfaXBpWAUH");
        setField(term8557, term8557.getClass(), "countryCode", "VMeAzAHwZj");
        setField(term8557, term8557.getClass(), "salt", "PznxWXsZME");
        setField(term8557, term8557.getClass(), "personRoles", term8676);
        setField(term8557, term8557.getClass(), "id", term8680);
        setIntField(term8683, term8683.getClass(), "year", 2015);
        setShortField(term8683, term8683.getClass(), "month", (short) 12);
        setShortField(term8683, term8683.getClass(), "day", (short) 23);
        setField(term8682, term8682.getClass(), "date", term8683);
        setByteField(term8687, term8687.getClass(), "hour", (byte) 14);
        setByteField(term8687, term8687.getClass(), "minute", (byte) 17);
        setByteField(term8687, term8687.getClass(), "second", (byte) 50);
        setIntField(term8687, term8687.getClass(), "nano", 325544804);
        setField(term8682, term8682.getClass(), "time", term8687);
        setField(term8557, term8557.getClass(), "createdAt", term8682);
        setIntField(term8693, term8693.getClass(), "year", 2027);
        setShortField(term8693, term8693.getClass(), "month", (short) 11);
        setShortField(term8693, term8693.getClass(), "day", (short) 8);
        setField(term8692, term8692.getClass(), "date", term8693);
        setByteField(term8697, term8697.getClass(), "hour", (byte) 11);
        setByteField(term8697, term8697.getClass(), "minute", (byte) 59);
        setByteField(term8697, term8697.getClass(), "second", (byte) 14);
        setIntField(term8697, term8697.getClass(), "nano", 322375591);
        setField(term8692, term8692.getClass(), "time", term8697);
        setField(term8557, term8557.getClass(), "updatedAt", term8692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "setProfileImage", argTypes, term8557, args);
    }

};


