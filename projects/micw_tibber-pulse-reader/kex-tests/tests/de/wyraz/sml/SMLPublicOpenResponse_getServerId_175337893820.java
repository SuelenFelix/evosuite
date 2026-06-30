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

public class SMLPublicOpenResponse_getServerId_175337893820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702;

    public SMLPublicOpenResponse_getServerId_175337893820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        setField(term702, term702.getClass(), "codepage", null);
        setField(term702, term702.getClass(), "clientId", null);
        setField(term702, term702.getClass(), "reqFileId", null);
        setField(term702, term702.getClass(), "serverId", null);
        setField(term702, term702.getClass(), "refTime", null);
        setField(term702, term702.getClass(), "smlVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getServerId", argTypes, term702, args);
    }

};


