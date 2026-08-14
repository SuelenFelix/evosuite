package net.alenzen.a2l.validation;

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
import static net.alenzen.a2l.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Asap2IdentValidator_validate_2447184941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Asap2IdentValidator_validate_2447184941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.alenzen.a2l.validation.Asap2IdentValidator"));
        Object term2 = newInstance(Class.forName("java.util.regex.Pattern"));
        Object term184 = newInstance(Class.forName("java.util.regex.Pattern$Start"));
        Object term186 = newInstance(Class.forName("java.util.regex.Pattern$BmpCharProperty"));
        Object term187 = newInstance(Class.forName("java.util.regex.Pattern$BmpCharPropertyGreedy"));
        setField(term2, term2.getClass(), "pattern", "[a-zA-Z_][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*([_\\.][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*)*");
        setIntField(term2, term2.getClass(), "flags", 0);
        setIntField(term2, term2.getClass(), "flags0", 0);
        setBooleanField(term2, term2.getClass(), "compiled", true);
        setField(term2, term2.getClass(), "normalizedPattern", "[a-zA-Z_][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*([_\\.][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*)*");
        setIntField(term184, term184.getClass(), "minLength", 1);
        setField(term186, term186.getClass(), "predicate", null);
        setField(term187, term187.getClass(), "predicate", null);
        setIntField(term187, term187.getClass(), "cmin", 0);
        setField(term187, term187.getClass(), "next", null);
        setField(term186, term186.getClass(), "next", term187);
        setField(term184, term184.getClass(), "next", term186);
        setField(term2, term2.getClass(), "root", term184);
        setField(term2, term2.getClass(), "matchRoot", term186);
        setField(term2, term2.getClass(), "buffer", null);
        setField(term2, term2.getClass(), "predicate", null);
        setField(term2, term2.getClass(), "namedGroups", null);
        setField(term2, term2.getClass(), "groupNodes", null);
        setField(term2, term2.getClass(), "topClosureNodes", null);
        setIntField(term2, term2.getClass(), "localTCNCount", 2);
        setBooleanField(term2, term2.getClass(), "hasGroupRef", false);
        setField(term2, term2.getClass(), "temp", null);
        setIntField(term2, term2.getClass(), "capturingGroupCount", 4);
        setIntField(term2, term2.getClass(), "localCount", 6);
        setIntField(term2, term2.getClass(), "cursor", 87);
        setIntField(term2, term2.getClass(), "patternLength", 0);
        setBooleanField(term2, term2.getClass(), "hasSupplementary", false);
        setField(term1, term1.getClass(), "IDENT_PATTERN", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.Asap2IdentValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validate", argTypes, term1, args);
    }

};


