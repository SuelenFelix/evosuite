package in.cubestack.apps.blog.core.service;

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
import static in.cubestack.apps.blog.core.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class TokenAuthenticationService_generateToken_4000153081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656;
     Object term669;

    public TokenAuthenticationService_generateToken_4000153081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term656 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.TokenAuthenticationService"));
        setField(term656, term656.getClass(), "jwtSecret", "TEParAifyi");
        Class<? extends Object> term918 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term917 = ((Class) term918).getDeclaredField((String) "ACTIVE");
        ((Field) term917).setAccessible(true);
        Object enum0 = ((Field) term917).get((Object) null);
        ArrayList term788 = new ArrayList();
        Long term792 = new Long(4872422362414183754L);
        term669 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term799 = newInstance(Class.forName("java.time.LocalTime"));
        Object term804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term809 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term669, term669.getClass(), "firstName", "OWDIEULEFu");
        setField(term669, term669.getClass(), "lastName", "dWRymuLBtr");
        setField(term669, term669.getClass(), "email", "AijpHYOFuy");
        setField(term669, term669.getClass(), "username", "SbAoxhfrkn");
        setField(term669, term669.getClass(), "password", "kuTXqwMtDB");
        setField(term669, term669.getClass(), "profileImage", "Ghbwtircqb");
        setField(term669, term669.getClass(), "status", enum0);
        setField(term669, term669.getClass(), "phone", "xrwlQZdwCp");
        setField(term669, term669.getClass(), "countryCode", "IDCWpPLRkE");
        setField(term669, term669.getClass(), "salt", "nyiiPDVjAc");
        setField(term669, term669.getClass(), "personRoles", term788);
        setField(term669, term669.getClass(), "id", term792);
        setIntField(term795, term795.getClass(), "year", 2012);
        setShortField(term795, term795.getClass(), "month", (short) 8);
        setShortField(term795, term795.getClass(), "day", (short) 25);
        setField(term794, term794.getClass(), "date", term795);
        setByteField(term799, term799.getClass(), "hour", (byte) 5);
        setByteField(term799, term799.getClass(), "minute", (byte) 20);
        setByteField(term799, term799.getClass(), "second", (byte) 50);
        setIntField(term799, term799.getClass(), "nano", 345595912);
        setField(term794, term794.getClass(), "time", term799);
        setField(term669, term669.getClass(), "createdAt", term794);
        setIntField(term805, term805.getClass(), "year", 2021);
        setShortField(term805, term805.getClass(), "month", (short) 1);
        setShortField(term805, term805.getClass(), "day", (short) 18);
        setField(term804, term804.getClass(), "date", term805);
        setByteField(term809, term809.getClass(), "hour", (byte) 13);
        setByteField(term809, term809.getClass(), "minute", (byte) 38);
        setByteField(term809, term809.getClass(), "second", (byte) 26);
        setIntField(term809, term809.getClass(), "nano", 544608644);
        setField(term804, term804.getClass(), "time", term809);
        setField(term669, term669.getClass(), "updatedAt", term804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.TokenAuthenticationService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Object[] args = new Object[1];
        args[0] = term669;
        callMethod(klass, "generateToken", argTypes, term656, args);
    }

};


