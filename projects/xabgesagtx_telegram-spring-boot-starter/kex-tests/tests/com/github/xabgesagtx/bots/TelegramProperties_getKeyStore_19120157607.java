package com.github.xabgesagtx.bots;

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
import static com.github.xabgesagtx.bots.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TelegramProperties_getKeyStore_19120157607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778;

    public TelegramProperties_getKeyStore_19120157607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term778, term778.getClass(), "externalUrl", "Ghbwtircqb");
        setField(term778, term778.getClass(), "internalUrl", "xrwlQZdwCp");
        setField(term778, term778.getClass(), "keyStore", "IDCWpPLRkE");
        setField(term778, term778.getClass(), "keyStorePassword", "nyiiPDVjAc");
        setField(term778, term778.getClass(), "pathToCertificate", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyStore", argTypes, term778, args);
    }

};


