package in.cubestack.apps.blog.admin.resource;

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
import static in.cubestack.apps.blog.admin.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class PersonCandidate_from_14171143316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35008;

    public PersonCandidate_from_14171143316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35214 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term35213 = ((Class) term35214).getDeclaredField((String) "ACTIVE");
        ((Field) term35213).setAccessible(true);
        Object enum82 = ((Field) term35213).get((Object) null);
        ArrayList term35127 = new ArrayList();
        Long term35131 = new Long(7862575738391801707L);
        term35008 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term35133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35148 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35008, term35008.getClass(), "firstName", "mnHyQbMyld");
        setField(term35008, term35008.getClass(), "lastName", "KHtaDOIcJZ");
        setField(term35008, term35008.getClass(), "email", "vgdwrCZczl");
        setField(term35008, term35008.getClass(), "username", "gKMNrpKBpu");
        setField(term35008, term35008.getClass(), "password", "ZbHJVEqcoa");
        setField(term35008, term35008.getClass(), "profileImage", "awDQVEVIKi");
        setField(term35008, term35008.getClass(), "status", enum82);
        setField(term35008, term35008.getClass(), "phone", "HJwNgUzZZR");
        setField(term35008, term35008.getClass(), "countryCode", "FvUCZgTXhq");
        setField(term35008, term35008.getClass(), "salt", "wWWidPCHzx");
        setField(term35008, term35008.getClass(), "personRoles", term35127);
        setField(term35008, term35008.getClass(), "id", term35131);
        setIntField(term35134, term35134.getClass(), "year", 2014);
        setShortField(term35134, term35134.getClass(), "month", (short) 11);
        setShortField(term35134, term35134.getClass(), "day", (short) 8);
        setField(term35133, term35133.getClass(), "date", term35134);
        setByteField(term35138, term35138.getClass(), "hour", (byte) 8);
        setByteField(term35138, term35138.getClass(), "minute", (byte) 43);
        setByteField(term35138, term35138.getClass(), "second", (byte) 32);
        setIntField(term35138, term35138.getClass(), "nano", 154434838);
        setField(term35133, term35133.getClass(), "time", term35138);
        setField(term35008, term35008.getClass(), "createdAt", term35133);
        setIntField(term35144, term35144.getClass(), "year", 2020);
        setShortField(term35144, term35144.getClass(), "month", (short) 5);
        setShortField(term35144, term35144.getClass(), "day", (short) 18);
        setField(term35143, term35143.getClass(), "date", term35144);
        setByteField(term35148, term35148.getClass(), "hour", (byte) 5);
        setByteField(term35148, term35148.getClass(), "minute", (byte) 46);
        setByteField(term35148, term35148.getClass(), "second", (byte) 13);
        setIntField(term35148, term35148.getClass(), "nano", 45893173);
        setField(term35143, term35143.getClass(), "time", term35148);
        setField(term35008, term35008.getClass(), "updatedAt", term35143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Object[] args = new Object[1];
        args[0] = term35008;
        callMethod(klass, "from", argTypes, null, args);
    }

};


