package io.github.juliengalet.reactorflow.report;

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
import static io.github.juliengalet.reactorflow.report.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Report_getWarnings_196960719611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936;

    public Report_getWarnings_196960719611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term937 = new ArrayList();
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ((ArrayList) term937).add((Object)null);
        ArrayList term941 = new ArrayList();
        ((ArrayList) term941).add((Object)null);
        ((ArrayList) term941).add((Object)null);
        ((ArrayList) term941).add((Object)null);
        term936 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Report"));
        setField(term936, term936.getClass(), "errors", term937);
        setField(term936, term936.getClass(), "warnings", term941);
        setField(term936, term936.getClass(), "context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarnings", argTypes, term936, args);
    }

};


