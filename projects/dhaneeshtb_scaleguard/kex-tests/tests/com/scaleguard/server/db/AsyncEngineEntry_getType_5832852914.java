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

public class AsyncEngineEntry_getType_5832852914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;

    public AsyncEngineEntry_getType_5832852914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term495, term495.getClass(), "id", "xOEqzGAmDU");
        setField(term495, term495.getClass(), "name", "eZFUvlxvGV");
        setField(term495, term495.getClass(), "description", "BYqFIqCKAV");
        setField(term495, term495.getClass(), "payload", "vrQLuWIDJX");
        setField(term495, term495.getClass(), "type", "flxyYxBRtu");
        setLongField(term495, term495.getClass(), "mts", 5270370404989704783L);
        setLongField(term495, term495.getClass(), "uts", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term495, args);
    }

};


