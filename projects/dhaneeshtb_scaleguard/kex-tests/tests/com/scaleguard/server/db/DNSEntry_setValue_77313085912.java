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

public class DNSEntry_setValue_77313085912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9802;

    public DNSEntry_setValue_77313085912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9802 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9802, term9802.getClass(), "id", "SScVQYSvWH");
        setField(term9802, term9802.getClass(), "name", "MnovcqFhCl");
        setField(term9802, term9802.getClass(), "groupname", "qYtAeLzOhW");
        setField(term9802, term9802.getClass(), "type", "tJzmOfcUnY");
        setLongField(term9802, term9802.getClass(), "ttl", 8540994973773607992L);
        setField(term9802, term9802.getClass(), "value", "TKlccZUpjz");
        setLongField(term9802, term9802.getClass(), "mts", -2338103433822116635L);
        setLongField(term9802, term9802.getClass(), "uts", -1885698929232124806L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GGzwMoHZXC";
        callMethod(klass, "setValue", argTypes, term9802, args);
    }

};


