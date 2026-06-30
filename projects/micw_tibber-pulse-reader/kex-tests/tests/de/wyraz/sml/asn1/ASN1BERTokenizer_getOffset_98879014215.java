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

public class ASN1BERTokenizer_getOffset_98879014215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3255;

    public ASN1BERTokenizer_getOffset_98879014215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3272 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term3271 = ((Class) term3272).getDeclaredField((String) "NULL");
        ((Field) term3271).setAccessible(true);
        Object enum12 = ((Field) term3271).get((Object) null);
        term3255 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term3256 = (byte[]) newByteArray(1);
        Object term3269 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term3256, 0, (byte) 45);
        setField(term3255, term3255.getClass(), "message", term3256);
        setIntField(term3255, term3255.getClass(), "offset", -244121226);
        setField(term3255, term3255.getClass(), "type", enum12);
        setByteField(term3255, term3255.getClass(), "typeValue", (byte) -39);
        setIntField(term3255, term3255.getClass(), "dataLength", -203030934);
        setField(term3255, term3255.getClass(), "object", term3269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffset", argTypes, term3255, args);
    }

};


