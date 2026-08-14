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

public class CollectionSpecimen_createEnumSet_18344592482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2964;
     Object term3020;

    public CollectionSpecimen_createEnumSet_18344592482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2967 = Class.forName((String) "java.lang.LiveStackFrameInfo$PrimitiveSlot32");
        HashMap term2996 = new HashMap();
        HashMap term3009 = new HashMap();
        term2964 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen"));
        Object term2965 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term2966 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term2980 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term2981 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term2982 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term2983 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term2984 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2985 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2990 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2991 = newInstance(Class.forName("java.time.Instant"));
        Object term2994 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3001 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term3002 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term3003 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3004 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3014 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3015 = newInstance(Class.forName("java.util.Random"));
        Object term3016 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term2966, term2966.getClass(), "genericDeclaration", term2967);
        setField(term2966, term2966.getClass(), "name", "T");
        setField(term2981, term2981.getClass(), "path", null);
        setElement(term2980, 0, term2981);
        setField(term2966, term2966.getClass(), "bounds", term2980);
        setField(term2982, term2982.getClass(), "decl", term2967);
        setField(term2983, term2983.getClass(), "recvr", term2967);
        setField(term2983, term2983.getClass(), "enclosingScope", null);
        setField(term2982, term2982.getClass(), "scope", term2983);
        setField(term2966, term2966.getClass(), "factory", term2982);
        setField(term2965, term2965.getClass(), "type", term2966);
        setField(term2964, term2964.getClass(), "type", term2965);
        setIntField(term2985, term2985.getClass(), "maxCollectionSize", 10);
        setIntField(term2985, term2985.getClass(), "minCollectionSize", 2);
        setIntField(term2985, term2985.getClass(), "streamSize", 3);
        setBooleanField(term2985, term2985.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term2991, term2991.getClass(), "seconds", 1786472235L);
        setIntField(term2991, term2991.getClass(), "nanos", 19529000);
        setField(term2990, term2990.getClass(), "instant", term2991);
        setIntField(term2994, term2994.getClass(), "totalSeconds", 0);
        setField(term2994, term2994.getClass(), "id", null);
        setField(term2990, term2990.getClass(), "zone", term2994);
        setField(term2985, term2985.getClass(), "clock", term2990);
        setField(term2984, term2984.getClass(), "configuration", term2985);
        setField(term2984, term2984.getClass(), "cache", term2996);
        setField(term2964, term2964.getClass(), "context", term2984);
        setField(term2964, term2964.getClass(), "specimen", null);
        setIntField(term3004, term3004.getClass(), "maxCollectionSize", 10);
        setIntField(term3004, term3004.getClass(), "minCollectionSize", 2);
        setIntField(term3004, term3004.getClass(), "streamSize", 3);
        setBooleanField(term3004, term3004.getClass(), "usePositiveNumbersOnly", false);
        setField(term3004, term3004.getClass(), "clock", null);
        setField(term3003, term3003.getClass(), "configuration", term3004);
        setField(term3003, term3003.getClass(), "cache", term3009);
        setField(term3002, term3002.getClass(), "context", term3003);
        setField(term3001, term3001.getClass(), "specimenFactory", term3002);
        setLongField(term3016, term3016.getClass(), "value", 97346408585214L);
        setField(term3015, term3015.getClass(), "seed", term3016);
        setDoubleField(term3015, term3015.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3015, term3015.getClass(), "haveNextNextGaussian", false);
        setField(term3014, term3014.getClass(), "random", term3015);
        setField(term3001, term3001.getClass(), "random", term3014);
        setField(term2964, term2964.getClass(), "instanceFactory", term3001);
        HashMap term3023 = new HashMap();
        term3020 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term3021 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3022 = (Object[]) newArray("java.lang.Object", 0);
        setField(term3021, term3021.getClass(), "elements", term3022);
        setField(term3020, term3020.getClass(), "ignoredFields", term3021);
        setField(term3020, term3020.getClass(), "customFields", term3023);
        setBooleanField(term3020, term3020.getClass(), "useRandomConstructor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[1];
        args[0] = term3020;
        callMethod(klass, "createEnumSet", argTypes, term2964, args);
    }

};


