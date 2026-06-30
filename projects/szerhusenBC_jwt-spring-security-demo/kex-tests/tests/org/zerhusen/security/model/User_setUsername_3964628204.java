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

public class User_setUsername_3964628204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;

    public User_setUsername_3964628204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term510 = new Long(5270370404989704783L);
        HashMap term574 = new HashMap();
        Set<Object> term641 =  ((Map) term574).keySet();
        HashSet term573 = new HashSet((Collection<? extends Object>) term641);
        term509 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term509, term509.getClass(), "id", term510);
        setField(term509, term509.getClass(), "username", "RkybSrpybU");
        setField(term509, term509.getClass(), "password", "xOEqzGAmDU");
        setField(term509, term509.getClass(), "firstname", "eZFUvlxvGV");
        setField(term509, term509.getClass(), "lastname", "BYqFIqCKAV");
        setField(term509, term509.getClass(), "email", "vrQLuWIDJX");
        setBooleanField(term509, term509.getClass(), "activated", false);
        setField(term509, term509.getClass(), "authorities", term573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setUsername", argTypes, term509, args);
    }

};


