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

public class ClientInfoEntry_setMts_157040395316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7126;
     Object term7202;

    public ClientInfoEntry_setMts_157040395316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7126 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7126, term7126.getClass(), "id", "SPBstwKFVr");
        setField(term7126, term7126.getClass(), "name", "WxYUTuqmIq");
        setField(term7126, term7126.getClass(), "description", "OeQLvhVERT");
        setField(term7126, term7126.getClass(), "appid", "IlvgFINwIa");
        setField(term7126, term7126.getClass(), "clientid", "GEJABPlHSI");
        setLongField(term7126, term7126.getClass(), "expiry", 7489064039921396098L);
        setField(term7126, term7126.getClass(), "clientsecret", "aQFUvuaYxd");
        setLongField(term7126, term7126.getClass(), "mts", 6843866297465638866L);
        setLongField(term7126, term7126.getClass(), "uts", -4023935540989049732L);
        term7202 = new Long(855932984568615096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7202;
        callMethod(klass, "setMts", argTypes, term7126, args);
    }

};


