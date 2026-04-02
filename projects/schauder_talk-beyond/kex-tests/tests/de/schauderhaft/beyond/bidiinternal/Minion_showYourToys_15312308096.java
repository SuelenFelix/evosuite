package de.schauderhaft.beyond.bidiinternal;

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
import static de.schauderhaft.beyond.bidiinternal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Minion_showYourToys_15312308096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;

    public Minion_showYourToys_15312308096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Minion"));
        setField(term353, term353.getClass(), "id", null);
        setField(term353, term353.getClass(), "name", null);
        setField(term353, term353.getClass(), "toys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.schauderhaft.beyond.bidiinternal.Minion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showYourToys", argTypes, term353, args);
    }

};


