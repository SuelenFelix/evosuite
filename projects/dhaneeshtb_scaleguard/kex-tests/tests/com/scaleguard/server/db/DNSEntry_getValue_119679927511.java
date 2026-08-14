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

public class DNSEntry_getValue_119679927511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9688;

    public DNSEntry_getValue_119679927511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9688 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9688, term9688.getClass(), "id", "UimMMORkzd");
        setField(term9688, term9688.getClass(), "name", "huVIXUWLtI");
        setField(term9688, term9688.getClass(), "groupname", "vhKzFyKPOT");
        setField(term9688, term9688.getClass(), "type", "nQhIgWXdRc");
        setLongField(term9688, term9688.getClass(), "ttl", 8863790908271299748L);
        setField(term9688, term9688.getClass(), "value", "EusenEbIoF");
        setLongField(term9688, term9688.getClass(), "mts", 9205327385733285058L);
        setLongField(term9688, term9688.getClass(), "uts", 4199886998224701110L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term9688, args);
    }

};


