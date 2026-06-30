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

public class ProfileDto_setMiddleName_196576857510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1038;

    public ProfileDto_setMiddleName_196576857510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1089 = new HashMap();
        Set<Object> term1162 =  ((Map) term1089).keySet();
        HashSet term1088 = new HashSet((Collection<? extends Object>) term1162);
        HashMap term1100 = new HashMap();
        Set<Object> term1163 =  ((Map) term1100).keySet();
        HashSet term1099 = new HashSet((Collection<? extends Object>) term1163);
        term1038 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1038, term1038.getClass(), "id", 1725571209);
        setField(term1038, term1038.getClass(), "firstName", "IDCWpPLRkE");
        setField(term1038, term1038.getClass(), "middleName", "nyiiPDVjAc");
        setField(term1038, term1038.getClass(), "lastName", "aKnKipADSo");
        setField(term1038, term1038.getClass(), "email", "wSQxaModmm");
        setField(term1038, term1038.getClass(), "roles", term1088);
        setField(term1038, term1038.getClass(), "projectRoles", term1099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setMiddleName", argTypes, term1038, args);
    }

};


