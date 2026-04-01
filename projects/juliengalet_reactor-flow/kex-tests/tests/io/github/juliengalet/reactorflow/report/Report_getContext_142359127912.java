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

public class Report_getContext_142359127912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945;

    public Report_getContext_142359127912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term946 = new ArrayList();
        ((ArrayList) term946).add((Object)null);
        ((ArrayList) term946).add((Object)null);
        ((ArrayList) term946).add((Object)null);
        ((ArrayList) term946).add((Object)null);
        ((ArrayList) term946).add((Object)null);
        ((ArrayList) term946).add((Object)null);
        ((ArrayList) term946).add((Object)null);
        ArrayList term950 = new ArrayList();
        term945 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Report"));
        setField(term945, term945.getClass(), "errors", term946);
        setField(term945, term945.getClass(), "warnings", term950);
        setField(term945, term945.getClass(), "context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Report");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContext", argTypes, term945, args);
    }

};


