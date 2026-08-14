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

public class DNSEntry_setName_20035740718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9302;

    public DNSEntry_setName_20035740718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9302 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9302, term9302.getClass(), "id", "oKwCDqywym");
        setField(term9302, term9302.getClass(), "name", "zjZYTddemL");
        setField(term9302, term9302.getClass(), "groupname", "QtrylgCLiF");
        setField(term9302, term9302.getClass(), "type", "orEuhCStGM");
        setLongField(term9302, term9302.getClass(), "ttl", 6698455537431331246L);
        setField(term9302, term9302.getClass(), "value", "HhEaSXWvrY");
        setLongField(term9302, term9302.getClass(), "mts", -8327432141027603933L);
        setLongField(term9302, term9302.getClass(), "uts", -433040798405298080L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CVRGEomOth";
        callMethod(klass, "setName", argTypes, term9302, args);
    }

};


