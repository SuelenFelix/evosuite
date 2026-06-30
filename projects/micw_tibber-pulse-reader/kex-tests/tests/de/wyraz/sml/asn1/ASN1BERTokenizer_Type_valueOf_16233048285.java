package de.wyraz.sml.asn1;

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
import static de.wyraz.sml.asn1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ASN1BERTokenizer_Type_valueOf_16233048285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum21;

    public ASN1BERTokenizer_Type_valueOf_16233048285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6273 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term6272 = ((Class) term6273).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term6272).setAccessible(true);
        enum21 = ((Field) term6272).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueOf", argTypes, enum21, args);
    }

};


