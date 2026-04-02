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

public class User_getLastname_19645502499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;

    public User_getLastname_19645502499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1181 = new Long(6967924379644551255L);
        HashMap term1245 = new HashMap();
        Set<Object> term1300 =  ((Map) term1245).keySet();
        HashSet term1244 = new HashSet((Collection<? extends Object>) term1300);
        term1180 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1180, term1180.getClass(), "id", term1181);
        setField(term1180, term1180.getClass(), "username", "jDtqGUpnZN");
        setField(term1180, term1180.getClass(), "password", "nGKItKLYNC");
        setField(term1180, term1180.getClass(), "firstname", "UiUYnPrcCi");
        setField(term1180, term1180.getClass(), "lastname", "UoYtihxVaS");
        setField(term1180, term1180.getClass(), "email", "JDswTTCZHV");
        setBooleanField(term1180, term1180.getClass(), "activated", false);
        setField(term1180, term1180.getClass(), "authorities", term1244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastname", argTypes, term1180, args);
    }

};


