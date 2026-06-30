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

public class ProfileDto_setEmail_109415887112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308;

    public ProfileDto_setEmail_109415887112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1359 = new HashMap();
        Set<Object> term1434 =  ((Map) term1359).keySet();
        HashSet term1358 = new HashSet((Collection<? extends Object>) term1434);
        HashMap term1372 = new HashMap();
        Set<Object> term1435 =  ((Map) term1372).keySet();
        HashSet term1371 = new HashSet((Collection<? extends Object>) term1435);
        term1308 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1308, term1308.getClass(), "id", 1134449235);
        setField(term1308, term1308.getClass(), "firstName", "LvtrsXUliU");
        setField(term1308, term1308.getClass(), "middleName", "xLbjWUgOIL");
        setField(term1308, term1308.getClass(), "lastName", "jDtqGUpnZN");
        setField(term1308, term1308.getClass(), "email", "nGKItKLYNC");
        setField(term1308, term1308.getClass(), "roles", term1358);
        setField(term1308, term1308.getClass(), "projectRoles", term1371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setEmail", argTypes, term1308, args);
    }

};


