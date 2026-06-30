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
import java.lang.Byte;
import java.lang.Integer;

public class ASN1BERTokenizer_Type_1_describe_1427789933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum28;
     Object term8038;
     Object term8040;

    public ASN1BERTokenizer_Type_1_describe_1427789933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8043 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term8042 = ((Class) term8043).getDeclaredField((String) "UNKNOWN");
        ((Field) term8042).setAccessible(true);
        enum28 = ((Field) term8042).get((Object) null);
        term8038 = new Byte((byte) 0);
        term8040 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer$Type$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = byte.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term8038;
        args[1] = term8040;
        args[2] = null;
        callMethod(klass, "describe", argTypes, enum28, args);
    }

};


