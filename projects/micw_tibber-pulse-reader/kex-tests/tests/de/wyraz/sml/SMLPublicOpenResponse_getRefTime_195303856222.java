package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SMLPublicOpenResponse_getRefTime_195303856222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704;

    public SMLPublicOpenResponse_getRefTime_195303856222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        setField(term704, term704.getClass(), "codepage", null);
        setField(term704, term704.getClass(), "clientId", null);
        setField(term704, term704.getClass(), "reqFileId", null);
        setField(term704, term704.getClass(), "serverId", null);
        setField(term704, term704.getClass(), "refTime", null);
        setField(term704, term704.getClass(), "smlVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefTime", argTypes, term704, args);
    }

};


