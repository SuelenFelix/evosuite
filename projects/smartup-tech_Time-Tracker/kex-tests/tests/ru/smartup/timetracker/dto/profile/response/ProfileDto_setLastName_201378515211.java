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

public class ProfileDto_setLastName_201378515211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1174;

    public ProfileDto_setLastName_201378515211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1225 = new HashMap();
        Set<Object> term1296 =  ((Map) term1225).keySet();
        HashSet term1224 = new HashSet((Collection<? extends Object>) term1296);
        HashMap term1236 = new HashMap();
        Set<Object> term1297 =  ((Map) term1236).keySet();
        HashSet term1235 = new HashSet((Collection<? extends Object>) term1297);
        term1174 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1174, term1174.getClass(), "id", -522618178);
        setField(term1174, term1174.getClass(), "firstName", "gGSMzuGICf");
        setField(term1174, term1174.getClass(), "middleName", "hxCBltsObl");
        setField(term1174, term1174.getClass(), "lastName", "BndsHwAFMv");
        setField(term1174, term1174.getClass(), "email", "GzFkzHGYFt");
        setField(term1174, term1174.getClass(), "roles", term1224);
        setField(term1174, term1174.getClass(), "projectRoles", term1235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setLastName", argTypes, term1174, args);
    }

};


