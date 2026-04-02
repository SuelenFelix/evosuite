package com.alkemy.ong.infrastructure.rest.response.contact;

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
import static com.alkemy.ong.infrastructure.rest.response.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class ListContactResponse_init_653167070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;

    public ListContactResponse_init_653167070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term861 = new Long(-8885298608300233488L);
        Object term860 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term860, term860.getClass(), "id", term861);
        setField(term860, term860.getClass(), "name", "IDCWpPLRkE");
        setField(term860, term860.getClass(), "phone", "nyiiPDVjAc");
        setField(term860, term860.getClass(), "email", "aKnKipADSo");
        Long term901 = new Long(-4325723315152823407L);
        Object term900 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term900, term900.getClass(), "id", term901);
        setField(term900, term900.getClass(), "name", "");
        setField(term900, term900.getClass(), "phone", "");
        setField(term900, term900.getClass(), "email", "");
        Long term908 = new Long(2535595959091595249L);
        Object term907 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term907, term907.getClass(), "id", term908);
        setField(term907, term907.getClass(), "name", null);
        setField(term907, term907.getClass(), "phone", null);
        setField(term907, term907.getClass(), "email", null);
        term857 = new LinkedList();
        ((LinkedList) term857).add(term860);
        ((LinkedList) term857).add(term900);
        ((LinkedList) term857).add(term907);
        ((LinkedList) term857).add((Object)null);
        ((LinkedList) term857).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.ListContactResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term857;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


