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

public class PrimitiveSpecimen_create_6124342332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3648;
     Object term3686;
     Object term3695;

    public PrimitiveSpecimen_create_6124342332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3651 = Class.forName((String) "java.nio.channels.MembershipKey");
        term3648 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.PrimitiveSpecimen"));
        Object term3649 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term3650 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term3664 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term3665 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term3666 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term3667 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term3668 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3669 = newInstance(Class.forName("java.util.Random"));
        Object term3670 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term3674 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3679 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3680 = newInstance(Class.forName("java.time.Instant"));
        Object term3683 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term3650, term3650.getClass(), "genericDeclaration", term3651);
        setField(term3650, term3650.getClass(), "name", "T");
        setField(term3665, term3665.getClass(), "path", null);
        setElement(term3664, 0, term3665);
        setField(term3650, term3650.getClass(), "bounds", term3664);
        setField(term3666, term3666.getClass(), "decl", term3651);
        setField(term3667, term3667.getClass(), "recvr", term3651);
        setField(term3667, term3667.getClass(), "enclosingScope", null);
        setField(term3666, term3666.getClass(), "scope", term3667);
        setField(term3650, term3650.getClass(), "factory", term3666);
        setField(term3649, term3649.getClass(), "type", term3650);
        setField(term3648, term3648.getClass(), "type", term3649);
        setLongField(term3670, term3670.getClass(), "value", 175852691844306L);
        setField(term3669, term3669.getClass(), "seed", term3670);
        setDoubleField(term3669, term3669.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3669, term3669.getClass(), "haveNextNextGaussian", false);
        setField(term3668, term3668.getClass(), "random", term3669);
        setField(term3648, term3648.getClass(), "pseudoRandom", term3668);
        setIntField(term3674, term3674.getClass(), "maxCollectionSize", 10);
        setIntField(term3674, term3674.getClass(), "minCollectionSize", 2);
        setIntField(term3674, term3674.getClass(), "streamSize", 3);
        setBooleanField(term3674, term3674.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term3680, term3680.getClass(), "seconds", 1786472235L);
        setIntField(term3680, term3680.getClass(), "nanos", 942794000);
        setField(term3679, term3679.getClass(), "instant", term3680);
        setIntField(term3683, term3683.getClass(), "totalSeconds", 0);
        setField(term3683, term3683.getClass(), "id", "");
        setField(term3679, term3679.getClass(), "zone", term3683);
        setField(term3674, term3674.getClass(), "clock", term3679);
        setField(term3648, term3648.getClass(), "configuration", term3674);
        HashMap term3689 = new HashMap();
        term3686 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term3687 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3688 = (Object[]) newArray("java.lang.Object", 0);
        setField(term3687, term3687.getClass(), "elements", term3688);
        setField(term3686, term3686.getClass(), "ignoredFields", term3687);
        setField(term3686, term3686.getClass(), "customFields", term3689);
        setBooleanField(term3686, term3686.getClass(), "useRandomConstructor", true);
        term3695 = (Object[]) newArray("java.lang.annotation.Annotation", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.PrimitiveSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3686;
        args[1] = term3695;
        callMethod(klass, "create", argTypes, term3648, args);
    }

};


