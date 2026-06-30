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

public class Person_setCountryCode_193579227723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14201;

    public Person_setCountryCode_193579227723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14419 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term14418 = ((Class) term14419).getDeclaredField((String) "ACTIVE");
        ((Field) term14418).setAccessible(true);
        Object enum30 = ((Field) term14418).get((Object) null);
        ArrayList term14320 = new ArrayList();
        Long term14324 = new Long(5262507301787091109L);
        term14201 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term14326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14341 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14201, term14201.getClass(), "firstName", "ShIELyuULw");
        setField(term14201, term14201.getClass(), "lastName", "IpQuOGMgmj");
        setField(term14201, term14201.getClass(), "email", "pJbnHTYrxn");
        setField(term14201, term14201.getClass(), "username", "iIRsCSYqXH");
        setField(term14201, term14201.getClass(), "password", "nghfqDXyCG");
        setField(term14201, term14201.getClass(), "profileImage", "WBAOTqErtm");
        setField(term14201, term14201.getClass(), "status", enum30);
        setField(term14201, term14201.getClass(), "phone", "PqtVXXZMqK");
        setField(term14201, term14201.getClass(), "countryCode", "rYbtIDVdnd");
        setField(term14201, term14201.getClass(), "salt", "UKAReurpHG");
        setField(term14201, term14201.getClass(), "personRoles", term14320);
        setField(term14201, term14201.getClass(), "id", term14324);
        setIntField(term14327, term14327.getClass(), "year", 2028);
        setShortField(term14327, term14327.getClass(), "month", (short) 1);
        setShortField(term14327, term14327.getClass(), "day", (short) 18);
        setField(term14326, term14326.getClass(), "date", term14327);
        setByteField(term14331, term14331.getClass(), "hour", (byte) 12);
        setByteField(term14331, term14331.getClass(), "minute", (byte) 4);
        setByteField(term14331, term14331.getClass(), "second", (byte) 39);
        setIntField(term14331, term14331.getClass(), "nano", 651287093);
        setField(term14326, term14326.getClass(), "time", term14331);
        setField(term14201, term14201.getClass(), "createdAt", term14326);
        setIntField(term14337, term14337.getClass(), "year", 2027);
        setShortField(term14337, term14337.getClass(), "month", (short) 7);
        setShortField(term14337, term14337.getClass(), "day", (short) 23);
        setField(term14336, term14336.getClass(), "date", term14337);
        setByteField(term14341, term14341.getClass(), "hour", (byte) 12);
        setByteField(term14341, term14341.getClass(), "minute", (byte) 6);
        setByteField(term14341, term14341.getClass(), "second", (byte) 19);
        setIntField(term14341, term14341.getClass(), "nano", 8025683);
        setField(term14336, term14336.getClass(), "time", term14341);
        setField(term14201, term14201.getClass(), "updatedAt", term14336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "setCountryCode", argTypes, term14201, args);
    }

};


