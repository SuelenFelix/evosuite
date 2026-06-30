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

public class ProfileDto_getEmail_15178272875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;

    public ProfileDto_getEmail_15178272875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term506 = new HashMap();
        Set<Object> term567 =  ((Map) term506).keySet();
        HashSet term505 = new HashSet((Collection<? extends Object>) term567);
        HashMap term519 = new HashMap();
        Set<Object> term568 =  ((Map) term519).keySet();
        HashSet term518 = new HashSet((Collection<? extends Object>) term568);
        term455 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term455, term455.getClass(), "id", -1922583790);
        setField(term455, term455.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term455, term455.getClass(), "middleName", "tbcdzjIfER");
        setField(term455, term455.getClass(), "lastName", "HyxfbSQYBe");
        setField(term455, term455.getClass(), "email", "pCTimMblYc");
        setField(term455, term455.getClass(), "roles", term505);
        setField(term455, term455.getClass(), "projectRoles", term518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term455, args);
    }

};


