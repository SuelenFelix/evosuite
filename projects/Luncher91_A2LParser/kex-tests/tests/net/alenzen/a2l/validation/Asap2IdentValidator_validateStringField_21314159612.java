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
import java.lang.String;

public class Asap2IdentValidator_validateStringField_21314159612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term565;

    public Asap2IdentValidator_validateStringField_21314159612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = newInstance(Class.forName("net.alenzen.a2l.validation.Asap2IdentValidator"));
        Object term371 = newInstance(Class.forName("java.util.regex.Pattern"));
        Object term553 = newInstance(Class.forName("java.util.regex.Pattern$Start"));
        Object term555 = newInstance(Class.forName("java.util.regex.Pattern$BmpCharProperty"));
        Object term556 = newInstance(Class.forName("java.util.regex.Pattern$BmpCharPropertyGreedy"));
        setField(term371, term371.getClass(), "pattern", "[a-zA-Z_][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*([_\\.][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*)*");
        setIntField(term371, term371.getClass(), "flags", 0);
        setIntField(term371, term371.getClass(), "flags0", 0);
        setBooleanField(term371, term371.getClass(), "compiled", true);
        setField(term371, term371.getClass(), "normalizedPattern", "[a-zA-Z_][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*([_\\.][a-zA-Z0-9_\\-]*(\\[[a-zA-Z0-9_]+\\])*)*");
        setIntField(term553, term553.getClass(), "minLength", 1);
        setField(term555, term555.getClass(), "predicate", null);
        setField(term556, term556.getClass(), "predicate", null);
        setIntField(term556, term556.getClass(), "cmin", 0);
        setField(term556, term556.getClass(), "next", null);
        setField(term555, term555.getClass(), "next", term556);
        setField(term553, term553.getClass(), "next", term555);
        setField(term371, term371.getClass(), "root", term553);
        setField(term371, term371.getClass(), "matchRoot", term555);
        setField(term371, term371.getClass(), "buffer", null);
        setField(term371, term371.getClass(), "predicate", null);
        setField(term371, term371.getClass(), "namedGroups", null);
        setField(term371, term371.getClass(), "groupNodes", null);
        setField(term371, term371.getClass(), "topClosureNodes", null);
        setIntField(term371, term371.getClass(), "localTCNCount", 2);
        setBooleanField(term371, term371.getClass(), "hasGroupRef", false);
        setField(term371, term371.getClass(), "temp", null);
        setIntField(term371, term371.getClass(), "capturingGroupCount", 4);
        setIntField(term371, term371.getClass(), "localCount", 6);
        setIntField(term371, term371.getClass(), "cursor", 87);
        setIntField(term371, term371.getClass(), "patternLength", 0);
        setBooleanField(term371, term371.getClass(), "hasSupplementary", false);
        setField(term370, term370.getClass(), "IDENT_PATTERN", term371);
        Class<? extends Object> term867 = Class.forName((String) "java.util.Currency");
        term565 = ((Class) term867).getDeclaredField((String) "mainTable");
        ((Field) term565).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.Asap2IdentValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        Object[] args = new Object[2];
        args[0] = term565;
        args[1] = null;
        callMethod(klass, "validateStringField", argTypes, term370, args);
    }

};


