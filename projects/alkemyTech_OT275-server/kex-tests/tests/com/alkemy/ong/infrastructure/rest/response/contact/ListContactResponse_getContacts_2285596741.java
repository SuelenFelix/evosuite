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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class ListContactResponse_getContacts_2285596741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term982;

    public ListContactResponse_getContacts_2285596741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term986 = new Long(-316468845751588286L);
        Object term985 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term985, term985.getClass(), "id", term986);
        setField(term985, term985.getClass(), "name", "");
        setField(term985, term985.getClass(), "phone", "");
        setField(term985, term985.getClass(), "email", "");
        Long term992 = new Long(5127676408959197577L);
        Object term991 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term991, term991.getClass(), "id", term992);
        setField(term991, term991.getClass(), "name", "");
        setField(term991, term991.getClass(), "phone", "");
        setField(term991, term991.getClass(), "email", "");
        Long term998 = new Long(-6573104506744284592L);
        Object term997 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term997, term997.getClass(), "id", term998);
        setField(term997, term997.getClass(), "name", "");
        setField(term997, term997.getClass(), "phone", "");
        setField(term997, term997.getClass(), "email", "");
        Long term1004 = new Long(-4920224193275732920L);
        Object term1003 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term1003, term1003.getClass(), "id", term1004);
        setField(term1003, term1003.getClass(), "name", "");
        setField(term1003, term1003.getClass(), "phone", "");
        setField(term1003, term1003.getClass(), "email", "");
        Long term1010 = new Long(8428634514691209827L);
        Object term1009 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term1009, term1009.getClass(), "id", term1010);
        setField(term1009, term1009.getClass(), "name", "");
        setField(term1009, term1009.getClass(), "phone", "");
        setField(term1009, term1009.getClass(), "email", "");
        Long term1016 = new Long(-2585684163342970173L);
        Object term1015 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term1015, term1015.getClass(), "id", term1016);
        setField(term1015, term1015.getClass(), "name", "");
        setField(term1015, term1015.getClass(), "phone", "");
        setField(term1015, term1015.getClass(), "email", "");
        Long term1022 = new Long(8059786003080744426L);
        Object term1021 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term1021, term1021.getClass(), "id", term1022);
        setField(term1021, term1021.getClass(), "name", "");
        setField(term1021, term1021.getClass(), "phone", "");
        setField(term1021, term1021.getClass(), "email", "");
        Long term1028 = new Long(-4365849114644724155L);
        Object term1027 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term1027, term1027.getClass(), "id", term1028);
        setField(term1027, term1027.getClass(), "name", "");
        setField(term1027, term1027.getClass(), "phone", "");
        setField(term1027, term1027.getClass(), "email", "");
        Long term1034 = new Long(2486810210675247493L);
        Object term1033 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term1033, term1033.getClass(), "id", term1034);
        setField(term1033, term1033.getClass(), "name", "");
        setField(term1033, term1033.getClass(), "phone", "");
        setField(term1033, term1033.getClass(), "email", "");
        ArrayList term983 = new ArrayList();
        ((ArrayList) term983).add(term985);
        ((ArrayList) term983).add(term991);
        ((ArrayList) term983).add(term997);
        ((ArrayList) term983).add(term1003);
        ((ArrayList) term983).add(term1009);
        ((ArrayList) term983).add(term1015);
        ((ArrayList) term983).add(term1021);
        ((ArrayList) term983).add(term1027);
        ((ArrayList) term983).add(term1033);
        term982 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.ListContactResponse"));
        setField(term982, term982.getClass(), "contacts", term983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.ListContactResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContacts", argTypes, term982, args);
    }

};


