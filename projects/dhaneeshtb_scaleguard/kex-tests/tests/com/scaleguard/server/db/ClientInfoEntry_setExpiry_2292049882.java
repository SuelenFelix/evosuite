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
import java.lang.Long;

public class ClientInfoEntry_setExpiry_2292049882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5088;
     Object term5164;

    public ClientInfoEntry_setExpiry_2292049882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5088 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5088, term5088.getClass(), "id", "SFqCrhEWLm");
        setField(term5088, term5088.getClass(), "name", "GZdcJyZntS");
        setField(term5088, term5088.getClass(), "description", "OIHoJeysUi");
        setField(term5088, term5088.getClass(), "appid", "WXMWFDGcLB");
        setField(term5088, term5088.getClass(), "clientid", "wKWbJssZuG");
        setLongField(term5088, term5088.getClass(), "expiry", 846579494941632714L);
        setField(term5088, term5088.getClass(), "clientsecret", "NzBMMhkhpT");
        setLongField(term5088, term5088.getClass(), "mts", 6689117472719450333L);
        setLongField(term5088, term5088.getClass(), "uts", 5836128569274066678L);
        term5164 = new Long(-2177368829816872572L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5164;
        callMethod(klass, "setExpiry", argTypes, term5088, args);
    }

};


