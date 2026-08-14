package net.alenzen.a2l.indexes;

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
import static net.alenzen.a2l.indexes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReferenceNotFoundException_toString_18230906942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3652;

    public ReferenceNotFoundException_toString_18230906942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3652 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceNotFoundException"));
        setField(term3652, term3652.getClass(), "reference", null);
        setField(term3652, term3652.getClass(), "source", null);
        setField(term3652, term3652.getClass(), "indexes", null);
        setField(term3652, term3652.getClass(), "backtrace", null);
        setField(term3652, term3652.getClass(), "detailMessage", null);
        setField(term3652, term3652.getClass(), "cause", null);
        setField(term3652, term3652.getClass(), "stackTrace", null);
        setIntField(term3652, term3652.getClass(), "depth", 0);
        setField(term3652, term3652.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceNotFoundException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3652, args);
    }

};


