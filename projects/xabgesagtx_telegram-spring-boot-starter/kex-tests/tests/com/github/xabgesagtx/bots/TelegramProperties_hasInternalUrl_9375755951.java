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

public class TelegramProperties_hasInternalUrl_9375755951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public TelegramProperties_hasInternalUrl_9375755951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term223, term223.getClass(), "externalUrl", "NRdvgJlhkX");
        setField(term223, term223.getClass(), "internalUrl", "uuaPigETmJ");
        setField(term223, term223.getClass(), "keyStore", "MxlszYVzRf");
        setField(term223, term223.getClass(), "keyStorePassword", "LQFpaHEwXR");
        setField(term223, term223.getClass(), "pathToCertificate", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasInternalUrl", argTypes, term223, args);
    }

};


