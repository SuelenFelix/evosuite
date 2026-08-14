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

public class Asap2IdentValidator_isValidPartialString_1616025993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972;

    public Asap2IdentValidator_isValidPartialString_1616025993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term972 = newInstance(Class.forName("net.alenzen.a2l.validation.Asap2IdentValidator"));
        Object term973 = newInstance(Class.forName("java.util.regex.Pattern"));
        Object term1155 = newInstance(Class.forName("java.util.regex.Pattern$Start"));
        Object term1157 = newInstance(Class.forName("java.util.regex.Pattern$BmpCharProperty"));
        Object term1158 = newInstance(Class.forName("java.util.regex.Pattern$BmpCharPropertyGreedy"));
        setField(term973, term973.getClass(), "pattern", "[a-zA-Z_][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*([_\\.][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*)*");
        setIntField(term973, term973.getClass(), "flags", 0);
        setIntField(term973, term973.getClass(), "flags0", 0);
        setBooleanField(term973, term973.getClass(), "compiled", true);
        setField(term973, term973.getClass(), "normalizedPattern", "[a-zA-Z_][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*([_\\.][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*)*");
        setIntField(term1155, term1155.getClass(), "minLength", 1);
        setField(term1157, term1157.getClass(), "predicate", null);
        setField(term1158, term1158.getClass(), "predicate", null);
        setIntField(term1158, term1158.getClass(), "cmin", 0);
        setField(term1158, term1158.getClass(), "next", null);
        setField(term1157, term1157.getClass(), "next", term1158);
        setField(term1155, term1155.getClass(), "next", term1157);
        setField(term973, term973.getClass(), "root", term1155);
        setField(term973, term973.getClass(), "matchRoot", term1157);
        setField(term973, term973.getClass(), "buffer", null);
        setField(term973, term973.getClass(), "predicate", null);
        setField(term973, term973.getClass(), "namedGroups", null);
        setField(term973, term973.getClass(), "groupNodes", null);
        setField(term973, term973.getClass(), "topClosureNodes", null);
        setIntField(term973, term973.getClass(), "localTCNCount", 2);
        setBooleanField(term973, term973.getClass(), "hasGroupRef", false);
        setField(term973, term973.getClass(), "temp", null);
        setIntField(term973, term973.getClass(), "capturingGroupCount", 4);
        setIntField(term973, term973.getClass(), "localCount", 6);
        setIntField(term973, term973.getClass(), "cursor", 87);
        setIntField(term973, term973.getClass(), "patternLength", 0);
        setBooleanField(term973, term973.getClass(), "hasSupplementary", false);
        setField(term972, term972.getClass(), "IDENT_PATTERN", term973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.Asap2IdentValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "isValidPartialString", argTypes, term972, args);
    }

};


