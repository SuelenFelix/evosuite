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

public class ProfileDto_getFirstName_2847810142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;

    public ProfileDto_getFirstName_2847810142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term166 = new HashMap();
        Set<Object> term227 =  ((Map) term166).keySet();
        HashSet term165 = new HashSet((Collection<? extends Object>) term227);
        HashMap term179 = new HashMap();
        Set<Object> term228 =  ((Map) term179).keySet();
        HashSet term178 = new HashSet((Collection<? extends Object>) term228);
        term115 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term115, term115.getClass(), "id", 1162663216);
        setField(term115, term115.getClass(), "firstName", "jJCZpVmanW");
        setField(term115, term115.getClass(), "middleName", "EGtDIRbSSb");
        setField(term115, term115.getClass(), "lastName", "SzjVpOQTyS");
        setField(term115, term115.getClass(), "email", "MjGYSRKTNF");
        setField(term115, term115.getClass(), "roles", term165);
        setField(term115, term115.getClass(), "projectRoles", term178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term115, args);
    }

};


