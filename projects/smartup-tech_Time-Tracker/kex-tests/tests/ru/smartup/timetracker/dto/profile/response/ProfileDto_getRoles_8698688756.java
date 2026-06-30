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

public class ProfileDto_getRoles_8698688756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;

    public ProfileDto_getRoles_8698688756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term620 = new HashMap();
        Set<Object> term681 =  ((Map) term620).keySet();
        HashSet term619 = new HashSet((Collection<? extends Object>) term681);
        HashMap term631 = new HashMap();
        Set<Object> term682 =  ((Map) term631).keySet();
        HashSet term630 = new HashSet((Collection<? extends Object>) term682);
        term569 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term569, term569.getClass(), "id", -616727354);
        setField(term569, term569.getClass(), "firstName", "hNxWaHcfhY");
        setField(term569, term569.getClass(), "middleName", "RkybSrpybU");
        setField(term569, term569.getClass(), "lastName", "xOEqzGAmDU");
        setField(term569, term569.getClass(), "email", "eZFUvlxvGV");
        setField(term569, term569.getClass(), "roles", term619);
        setField(term569, term569.getClass(), "projectRoles", term630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term569, args);
    }

};


