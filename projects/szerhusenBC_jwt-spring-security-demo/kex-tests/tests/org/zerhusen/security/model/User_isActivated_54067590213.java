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

public class User_isActivated_54067590213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;

    public User_isActivated_54067590213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1709 = new Long(2535595959091595249L);
        HashMap term1773 = new HashMap();
        Set<Object> term1828 =  ((Map) term1773).keySet();
        HashSet term1772 = new HashSet((Collection<? extends Object>) term1828);
        term1708 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1708, term1708.getClass(), "id", term1709);
        setField(term1708, term1708.getClass(), "username", "IgRJUzaCwW");
        setField(term1708, term1708.getClass(), "password", "JUmudUmaaV");
        setField(term1708, term1708.getClass(), "firstname", "KoyGrUJeJW");
        setField(term1708, term1708.getClass(), "lastname", "HqBOwkVqjD");
        setField(term1708, term1708.getClass(), "email", "MAcUBcBckh");
        setBooleanField(term1708, term1708.getClass(), "activated", false);
        setField(term1708, term1708.getClass(), "authorities", term1772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isActivated", argTypes, term1708, args);
    }

};


