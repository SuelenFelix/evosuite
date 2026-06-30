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

public class ProfileDto_setFirstName_4475384549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;

    public ProfileDto_setFirstName_4475384549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term960 = new HashMap();
        Set<Object> term1026 =  ((Map) term960).keySet();
        HashSet term959 = new HashSet((Collection<? extends Object>) term1026);
        HashMap term966 = new HashMap();
        Set<Object> term1027 =  ((Map) term966).keySet();
        HashSet term965 = new HashSet((Collection<? extends Object>) term1027);
        term909 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term909, term909.getClass(), "id", -1339778481);
        setField(term909, term909.getClass(), "firstName", "AijpHYOFuy");
        setField(term909, term909.getClass(), "middleName", "SbAoxhfrkn");
        setField(term909, term909.getClass(), "lastName", "kuTXqwMtDB");
        setField(term909, term909.getClass(), "email", "Ghbwtircqb");
        setField(term909, term909.getClass(), "roles", term959);
        setField(term909, term909.getClass(), "projectRoles", term965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "setFirstName", argTypes, term909, args);
    }

};


