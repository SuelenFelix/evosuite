package com.alkemy.ong.infrastructure.rest.mapper.contact;

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
import static com.alkemy.ong.infrastructure.rest.mapper.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Long;

public class ListContactMapper_toResponse_6738244150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term187;

    public ListContactMapper_toResponse_6738244150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.ListContactMapper"));
        Object term186 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.GetContactMapper"));
        setField(term185, term185.getClass(), "getContactMapper", term186);
        Long term191 = new Long(6375119433582206027L);
        Object term190 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term190, term190.getClass(), "id", term191);
        setField(term190, term190.getClass(), "name", "hRNSzYYIrc");
        setField(term190, term190.getClass(), "phone", "RMFIsYGgne");
        setField(term190, term190.getClass(), "email", "NRdvgJlhkX");
        setField(term190, term190.getClass(), "message", "uuaPigETmJ");
        Long term243 = new Long(-8257434502486459194L);
        Object term242 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term242, term242.getClass(), "id", term243);
        setField(term242, term242.getClass(), "name", "");
        setField(term242, term242.getClass(), "phone", "");
        setField(term242, term242.getClass(), "email", "");
        setField(term242, term242.getClass(), "message", "");
        Long term251 = new Long(-8400487765614892086L);
        Object term250 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term250, term250.getClass(), "id", term251);
        setField(term250, term250.getClass(), "name", null);
        setField(term250, term250.getClass(), "phone", null);
        setField(term250, term250.getClass(), "email", null);
        setField(term250, term250.getClass(), "message", null);
        term187 = new LinkedList();
        ((LinkedList) term187).add(term190);
        ((LinkedList) term187).add(term242);
        ((LinkedList) term187).add(term250);
        ((LinkedList) term187).add((Object)null);
        ((LinkedList) term187).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.ListContactMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term187;
        callMethod(klass, "toResponse", argTypes, term185, args);
    }

};


