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

public class ProfileDto_getProjectRoles_13801404087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;

    public ProfileDto_getProjectRoles_13801404087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term734 = new HashMap();
        Set<Object> term793 =  ((Map) term734).keySet();
        HashSet term733 = new HashSet((Collection<? extends Object>) term793);
        HashMap term745 = new HashMap();
        Set<Object> term794 =  ((Map) term745).keySet();
        HashSet term744 = new HashSet((Collection<? extends Object>) term794);
        term683 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term683, term683.getClass(), "id", -1955890973);
        setField(term683, term683.getClass(), "firstName", "BYqFIqCKAV");
        setField(term683, term683.getClass(), "middleName", "vrQLuWIDJX");
        setField(term683, term683.getClass(), "lastName", "flxyYxBRtu");
        setField(term683, term683.getClass(), "email", "OclPbYPkcH");
        setField(term683, term683.getClass(), "roles", term733);
        setField(term683, term683.getClass(), "projectRoles", term744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectRoles", argTypes, term683, args);
    }

};


