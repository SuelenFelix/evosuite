package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DNSEntry_getMts_32345385513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9938;

    public DNSEntry_getMts_32345385513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9938 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9938, term9938.getClass(), "id", "IpmgwHTgnG");
        setField(term9938, term9938.getClass(), "name", "tIpkeYIezR");
        setField(term9938, term9938.getClass(), "groupname", "YkZtEtthvz");
        setField(term9938, term9938.getClass(), "type", "dwlZSxlXOo");
        setLongField(term9938, term9938.getClass(), "ttl", 5731563613239387113L);
        setField(term9938, term9938.getClass(), "value", "lKrEAkypza");
        setLongField(term9938, term9938.getClass(), "mts", 3381333711768010594L);
        setLongField(term9938, term9938.getClass(), "uts", 3580984732036213717L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMts", argTypes, term9938, args);
    }

};


