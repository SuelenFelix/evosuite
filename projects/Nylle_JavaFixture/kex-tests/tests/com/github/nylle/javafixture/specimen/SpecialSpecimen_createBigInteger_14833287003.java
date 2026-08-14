package com.github.nylle.javafixture.specimen;

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
import static com.github.nylle.javafixture.specimen.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class SpecialSpecimen_createBigInteger_14833287003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1667;

    public SpecialSpecimen_createBigInteger_14833287003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1670 = Class.forName((String) "java.lang.reflect.GenericDeclaration");
        HashMap term1699 = new HashMap();
        term1667 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen"));
        Object term1668 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term1669 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term1683 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term1684 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term1685 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term1686 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term1687 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1688 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1693 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1694 = newInstance(Class.forName("java.time.Instant"));
        Object term1697 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term1669, term1669.getClass(), "genericDeclaration", term1670);
        setField(term1669, term1669.getClass(), "name", "T");
        setField(term1684, term1684.getClass(), "path", null);
        setElement(term1683, 0, term1684);
        setField(term1669, term1669.getClass(), "bounds", term1683);
        setField(term1685, term1685.getClass(), "decl", term1670);
        setField(term1686, term1686.getClass(), "recvr", term1670);
        setField(term1686, term1686.getClass(), "enclosingScope", null);
        setField(term1685, term1685.getClass(), "scope", term1686);
        setField(term1669, term1669.getClass(), "factory", term1685);
        setField(term1668, term1668.getClass(), "type", term1669);
        setField(term1667, term1667.getClass(), "type", term1668);
        setIntField(term1688, term1688.getClass(), "maxCollectionSize", 10);
        setIntField(term1688, term1688.getClass(), "minCollectionSize", 2);
        setIntField(term1688, term1688.getClass(), "streamSize", 3);
        setBooleanField(term1688, term1688.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term1694, term1694.getClass(), "seconds", 1786472233L);
        setIntField(term1694, term1694.getClass(), "nanos", 641436000);
        setField(term1693, term1693.getClass(), "instant", term1694);
        setIntField(term1697, term1697.getClass(), "totalSeconds", 0);
        setField(term1697, term1697.getClass(), "id", null);
        setField(term1693, term1693.getClass(), "zone", term1697);
        setField(term1688, term1688.getClass(), "clock", term1693);
        setField(term1687, term1687.getClass(), "configuration", term1688);
        setField(term1687, term1687.getClass(), "cache", term1699);
        setField(term1667, term1667.getClass(), "context", term1687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createBigInteger", argTypes, term1667, args);
    }

};


