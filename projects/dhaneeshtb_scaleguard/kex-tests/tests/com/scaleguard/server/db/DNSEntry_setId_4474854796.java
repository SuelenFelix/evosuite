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

public class DNSEntry_setId_4474854796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9052;

    public DNSEntry_setId_4474854796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9052 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9052, term9052.getClass(), "id", "PqywFWJlpE");
        setField(term9052, term9052.getClass(), "name", "OzXRsFGTIp");
        setField(term9052, term9052.getClass(), "groupname", "TjWpyghUWN");
        setField(term9052, term9052.getClass(), "type", "dkZFDZxcde");
        setLongField(term9052, term9052.getClass(), "ttl", -1677189124507026637L);
        setField(term9052, term9052.getClass(), "value", "WXcZEtUKlI");
        setLongField(term9052, term9052.getClass(), "mts", 4795660804170399986L);
        setLongField(term9052, term9052.getClass(), "uts", -4030863184426321096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IkpjUOuWQU";
        callMethod(klass, "setId", argTypes, term9052, args);
    }

};


