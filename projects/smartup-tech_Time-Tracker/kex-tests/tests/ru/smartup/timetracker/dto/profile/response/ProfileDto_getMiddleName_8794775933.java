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

public class ProfileDto_getMiddleName_8794775933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public ProfileDto_getMiddleName_8794775933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term280 = new HashMap();
        Set<Object> term339 =  ((Map) term280).keySet();
        HashSet term279 = new HashSet((Collection<? extends Object>) term339);
        HashMap term289 = new HashMap();
        Set<Object> term340 =  ((Map) term289).keySet();
        HashSet term288 = new HashSet((Collection<? extends Object>) term340);
        term229 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term229, term229.getClass(), "id", 1484323161);
        setField(term229, term229.getClass(), "firstName", "hRNSzYYIrc");
        setField(term229, term229.getClass(), "middleName", "RMFIsYGgne");
        setField(term229, term229.getClass(), "lastName", "NRdvgJlhkX");
        setField(term229, term229.getClass(), "email", "uuaPigETmJ");
        setField(term229, term229.getClass(), "roles", term279);
        setField(term229, term229.getClass(), "projectRoles", term288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term229, args);
    }

};


