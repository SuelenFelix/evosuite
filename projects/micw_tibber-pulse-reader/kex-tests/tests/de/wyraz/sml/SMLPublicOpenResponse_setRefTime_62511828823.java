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

public class SMLPublicOpenResponse_setRefTime_62511828823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;

    public SMLPublicOpenResponse_setRefTime_62511828823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        setField(term705, term705.getClass(), "codepage", null);
        setField(term705, term705.getClass(), "clientId", null);
        setField(term705, term705.getClass(), "reqFileId", null);
        setField(term705, term705.getClass(), "serverId", null);
        setField(term705, term705.getClass(), "refTime", null);
        setField(term705, term705.getClass(), "smlVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.sml.SMLTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRefTime", argTypes, term705, args);
    }

};


