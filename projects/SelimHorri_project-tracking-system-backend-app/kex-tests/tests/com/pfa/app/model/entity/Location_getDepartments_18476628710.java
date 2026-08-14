package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Location_getDepartments_18476628710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10664;

    public Location_getDepartments_18476628710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10665 = new Integer(1717232691);
        HashMap term10704 = new HashMap();
        Set<Object> term10746 =  ((Map) term10704).keySet();
        HashSet term10703 = new HashSet((Collection<? extends Object>) term10746);
        term10664 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10664, term10664.getClass(), "locationId", term10665);
        setField(term10664, term10664.getClass(), "adr", "dubNMHmdjy");
        setField(term10664, term10664.getClass(), "postalCode", "vYzdCPfleW");
        setField(term10664, term10664.getClass(), "city", "AXVMtieJQT");
        setField(term10664, term10664.getClass(), "departments", term10703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartments", argTypes, term10664, args);
    }

};


