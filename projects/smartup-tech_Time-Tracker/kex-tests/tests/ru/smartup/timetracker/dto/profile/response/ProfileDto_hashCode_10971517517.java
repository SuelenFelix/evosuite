package ru.smartup.timetracker.dto.profile.response;

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
import static ru.smartup.timetracker.dto.profile.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProfileDto_hashCode_10971517517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;

    public ProfileDto_hashCode_10971517517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1971 = new HashMap();
        Set<Object> term2030 =  ((Map) term1971).keySet();
        HashSet term1970 = new HashSet((Collection<? extends Object>) term2030);
        HashMap term1982 = new HashMap();
        Set<Object> term2031 =  ((Map) term1982).keySet();
        HashSet term1981 = new HashSet((Collection<? extends Object>) term2031);
        term1920 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1920, term1920.getClass(), "id", -1456670397);
        setField(term1920, term1920.getClass(), "firstName", "tPlsykYBqO");
        setField(term1920, term1920.getClass(), "middleName", "bLPjGVBhlX");
        setField(term1920, term1920.getClass(), "lastName", "whBvTVIIlC");
        setField(term1920, term1920.getClass(), "email", "IgRJUzaCwW");
        setField(term1920, term1920.getClass(), "roles", term1970);
        setField(term1920, term1920.getClass(), "projectRoles", term1981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1920, args);
    }

};


