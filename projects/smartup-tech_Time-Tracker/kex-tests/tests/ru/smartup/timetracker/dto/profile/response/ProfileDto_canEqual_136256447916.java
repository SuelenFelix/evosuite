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

public class ProfileDto_canEqual_136256447916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1803;
     Object term1877;

    public ProfileDto_canEqual_136256447916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1854 = new HashMap();
        Set<Object> term1918 =  ((Map) term1854).keySet();
        HashSet term1853 = new HashSet((Collection<? extends Object>) term1918);
        HashMap term1867 = new HashMap();
        Set<Object> term1919 =  ((Map) term1867).keySet();
        HashSet term1866 = new HashSet((Collection<? extends Object>) term1919);
        term1803 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1803, term1803.getClass(), "id", -1685132342);
        setField(term1803, term1803.getClass(), "firstName", "fhkbdRViHi");
        setField(term1803, term1803.getClass(), "middleName", "uWHnvSvaPl");
        setField(term1803, term1803.getClass(), "lastName", "kBdSllIBVz");
        setField(term1803, term1803.getClass(), "email", "TJmVBGfTML");
        setField(term1803, term1803.getClass(), "roles", term1853);
        setField(term1803, term1803.getClass(), "projectRoles", term1866);
        term1877 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1877;
        callMethod(klass, "canEqual", argTypes, term1803, args);
    }

};


