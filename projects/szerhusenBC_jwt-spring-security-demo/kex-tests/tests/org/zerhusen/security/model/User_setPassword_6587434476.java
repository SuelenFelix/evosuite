package org.zerhusen.security.model;

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
import static org.zerhusen.security.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setPassword_6587434476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773;

    public User_setPassword_6587434476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term774 = new Long(4872422362414183754L);
        HashMap term838 = new HashMap();
        Set<Object> term905 =  ((Map) term838).keySet();
        HashSet term837 = new HashSet((Collection<? extends Object>) term905);
        term773 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term773, term773.getClass(), "id", term774);
        setField(term773, term773.getClass(), "username", "AijpHYOFuy");
        setField(term773, term773.getClass(), "password", "SbAoxhfrkn");
        setField(term773, term773.getClass(), "firstname", "kuTXqwMtDB");
        setField(term773, term773.getClass(), "lastname", "Ghbwtircqb");
        setField(term773, term773.getClass(), "email", "xrwlQZdwCp");
        setBooleanField(term773, term773.getClass(), "activated", true);
        setField(term773, term773.getClass(), "authorities", term837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setPassword", argTypes, term773, args);
    }

};


