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

public class Person_setPassword_60934775126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15730;

    public Person_setPassword_60934775126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15948 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term15947 = ((Class) term15948).getDeclaredField((String) "ACTIVE");
        ((Field) term15947).setAccessible(true);
        Object enum33 = ((Field) term15947).get((Object) null);
        ArrayList term15849 = new ArrayList();
        Long term15853 = new Long(1233889271256172047L);
        term15730 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term15855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15860 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15865 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15866 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15870 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15730, term15730.getClass(), "firstName", "SOrEHbcbmn");
        setField(term15730, term15730.getClass(), "lastName", "bnsyeQXFdu");
        setField(term15730, term15730.getClass(), "email", "BwtdjiefJn");
        setField(term15730, term15730.getClass(), "username", "jDmhBrIoDa");
        setField(term15730, term15730.getClass(), "password", "SPtPatHeOm");
        setField(term15730, term15730.getClass(), "profileImage", "ywmcuThdfL");
        setField(term15730, term15730.getClass(), "status", enum33);
        setField(term15730, term15730.getClass(), "phone", "GBOEuByOfr");
        setField(term15730, term15730.getClass(), "countryCode", "NHbOFFjyVK");
        setField(term15730, term15730.getClass(), "salt", "zaloBqlrSo");
        setField(term15730, term15730.getClass(), "personRoles", term15849);
        setField(term15730, term15730.getClass(), "id", term15853);
        setIntField(term15856, term15856.getClass(), "year", 2022);
        setShortField(term15856, term15856.getClass(), "month", (short) 4);
        setShortField(term15856, term15856.getClass(), "day", (short) 15);
        setField(term15855, term15855.getClass(), "date", term15856);
        setByteField(term15860, term15860.getClass(), "hour", (byte) 20);
        setByteField(term15860, term15860.getClass(), "minute", (byte) 58);
        setByteField(term15860, term15860.getClass(), "second", (byte) 46);
        setIntField(term15860, term15860.getClass(), "nano", 435562727);
        setField(term15855, term15855.getClass(), "time", term15860);
        setField(term15730, term15730.getClass(), "createdAt", term15855);
        setIntField(term15866, term15866.getClass(), "year", 2026);
        setShortField(term15866, term15866.getClass(), "month", (short) 10);
        setShortField(term15866, term15866.getClass(), "day", (short) 31);
        setField(term15865, term15865.getClass(), "date", term15866);
        setByteField(term15870, term15870.getClass(), "hour", (byte) 17);
        setByteField(term15870, term15870.getClass(), "minute", (byte) 6);
        setByteField(term15870, term15870.getClass(), "second", (byte) 30);
        setIntField(term15870, term15870.getClass(), "nano", 785931660);
        setField(term15865, term15865.getClass(), "time", term15870);
        setField(term15730, term15730.getClass(), "updatedAt", term15865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vvoLrMGCoN";
        callMethod(klass, "setPassword", argTypes, term15730, args);
    }

};


