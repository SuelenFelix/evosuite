package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ClientInfo_WrappeClientInfoRecord_setExpiry_11250694993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791;
     Object term865;

    public ClientInfo_WrappeClientInfoRecord_setExpiry_11250694993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term791, term791.getClass(), "id", "Ghbwtircqb");
        setField(term791, term791.getClass(), "name", "xrwlQZdwCp");
        setField(term791, term791.getClass(), "description", "IDCWpPLRkE");
        setField(term791, term791.getClass(), "appid", "nyiiPDVjAc");
        setField(term791, term791.getClass(), "clientid", "aKnKipADSo");
        setField(term791, term791.getClass(), "clientsecret", "wSQxaModmm");
        setLongField(term791, term791.getClass(), "expiry", 7411271909051562686L);
        term865 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term865;
        callMethod(klass, "setExpiry", argTypes, term791, args);
    }

};


