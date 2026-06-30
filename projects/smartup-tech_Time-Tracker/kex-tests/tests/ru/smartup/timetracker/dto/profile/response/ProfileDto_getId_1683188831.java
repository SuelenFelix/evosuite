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

public class ProfileDto_getId_1683188831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProfileDto_getId_1683188831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term52 = new HashMap();
        Set<Object> term113 =  ((Map) term52).keySet();
        HashSet term51 = new HashSet((Collection<? extends Object>) term113);
        HashMap term65 = new HashMap();
        Set<Object> term114 =  ((Map) term65).keySet();
        HashSet term64 = new HashSet((Collection<? extends Object>) term114);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setField(term1, term1.getClass(), "firstName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "middleName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "lastName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "email", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "roles", term51);
        setField(term1, term1.getClass(), "projectRoles", term64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


