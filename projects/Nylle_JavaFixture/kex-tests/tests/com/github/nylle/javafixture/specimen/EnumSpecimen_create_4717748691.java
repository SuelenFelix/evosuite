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

public class EnumSpecimen_create_4717748691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3167;
     Object term3192;
     Object term3201;

    public EnumSpecimen_create_4717748691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3170 = Class.forName((String) "java.util.stream.Streams$ConcatSpliterator$OfLong");
        term3167 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.EnumSpecimen"));
        Object term3168 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term3169 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term3183 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term3184 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term3185 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term3186 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term3187 = newInstance(Class.forName("java.util.Random"));
        Object term3188 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term3169, term3169.getClass(), "genericDeclaration", term3170);
        setField(term3169, term3169.getClass(), "name", "T");
        setField(term3184, term3184.getClass(), "path", null);
        setElement(term3183, 0, term3184);
        setField(term3169, term3169.getClass(), "bounds", term3183);
        setField(term3185, term3185.getClass(), "decl", term3170);
        setField(term3186, term3186.getClass(), "recvr", term3170);
        setField(term3186, term3186.getClass(), "enclosingScope", null);
        setField(term3185, term3185.getClass(), "scope", term3186);
        setField(term3169, term3169.getClass(), "factory", term3185);
        setField(term3168, term3168.getClass(), "type", term3169);
        setField(term3167, term3167.getClass(), "type", term3168);
        setLongField(term3188, term3188.getClass(), "value", 210294578940669L);
        setField(term3187, term3187.getClass(), "seed", term3188);
        setDoubleField(term3187, term3187.getClass(), "nextNextGaussian", 0.3455959125047594);
        setBooleanField(term3187, term3187.getClass(), "haveNextNextGaussian", true);
        setField(term3167, term3167.getClass(), "random", term3187);
        HashMap term3195 = new HashMap();
        term3192 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term3193 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3194 = (Object[]) newArray("java.lang.Object", 0);
        setField(term3193, term3193.getClass(), "elements", term3194);
        setField(term3192, term3192.getClass(), "ignoredFields", term3193);
        setField(term3192, term3192.getClass(), "customFields", term3195);
        setBooleanField(term3192, term3192.getClass(), "useRandomConstructor", false);
        term3201 = (Object[]) newArray("java.lang.annotation.Annotation", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.EnumSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3192;
        args[1] = term3201;
        callMethod(klass, "create", argTypes, term3167, args);
    }

};


