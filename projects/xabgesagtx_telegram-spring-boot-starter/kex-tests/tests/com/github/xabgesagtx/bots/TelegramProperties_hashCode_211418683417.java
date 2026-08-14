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

public class TelegramProperties_hashCode_211418683417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000;

    public TelegramProperties_hashCode_211418683417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term2000, term2000.getClass(), "externalUrl", "swZVeJAxjt");
        setField(term2000, term2000.getClass(), "internalUrl", "xOcJIiQQDu");
        setField(term2000, term2000.getClass(), "keyStore", "GVizqqzXpy");
        setField(term2000, term2000.getClass(), "keyStorePassword", "JqXGgAhZPl");
        setField(term2000, term2000.getClass(), "pathToCertificate", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2000, args);
    }

};


