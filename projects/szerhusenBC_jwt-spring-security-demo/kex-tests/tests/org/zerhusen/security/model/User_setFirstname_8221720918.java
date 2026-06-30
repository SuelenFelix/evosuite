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

public class User_setFirstname_8221720918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1037;

    public User_setFirstname_8221720918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1038 = new Long(-7237588299778557629L);
        HashMap term1102 = new HashMap();
        Set<Object> term1169 =  ((Map) term1102).keySet();
        HashSet term1101 = new HashSet((Collection<? extends Object>) term1169);
        term1037 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1037, term1037.getClass(), "id", term1038);
        setField(term1037, term1037.getClass(), "username", "hxCBltsObl");
        setField(term1037, term1037.getClass(), "password", "BndsHwAFMv");
        setField(term1037, term1037.getClass(), "firstname", "GzFkzHGYFt");
        setField(term1037, term1037.getClass(), "lastname", "tShwQLRGNe");
        setField(term1037, term1037.getClass(), "email", "LvtrsXUliU");
        setBooleanField(term1037, term1037.getClass(), "activated", true);
        setField(term1037, term1037.getClass(), "authorities", term1101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setFirstname", argTypes, term1037, args);
    }

};


