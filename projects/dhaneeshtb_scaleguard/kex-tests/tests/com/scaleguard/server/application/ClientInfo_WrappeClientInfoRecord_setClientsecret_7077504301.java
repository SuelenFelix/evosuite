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

public class ClientInfo_WrappeClientInfoRecord_setClientsecret_7077504301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;

    public ClientInfo_WrappeClientInfoRecord_setClientsecret_7077504301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term501, term501.getClass(), "id", "xOEqzGAmDU");
        setField(term501, term501.getClass(), "name", "eZFUvlxvGV");
        setField(term501, term501.getClass(), "description", "BYqFIqCKAV");
        setField(term501, term501.getClass(), "appid", "vrQLuWIDJX");
        setField(term501, term501.getClass(), "clientid", "flxyYxBRtu");
        setField(term501, term501.getClass(), "clientsecret", "OclPbYPkcH");
        setLongField(term501, term501.getClass(), "expiry", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setClientsecret", argTypes, term501, args);
    }

};


