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
import java.lang.Boolean;

public class ASN1BERTokenizer_readUnsigned16_118430709311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199;
     Object term2226;

    public ASN1BERTokenizer_readUnsigned16_118430709311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2234 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term2233 = ((Class) term2234).getDeclaredField((String) "OCTET_STRING");
        ((Field) term2233).setAccessible(true);
        Object enum8 = ((Field) term2233).get((Object) null);
        term2199 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term2200 = (byte[]) newByteArray(5);
        Object term2225 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term2200, 0, (byte) -57);
        setByteElement(term2200, 1, (byte) -103);
        setByteElement(term2200, 2, (byte) 98);
        setByteElement(term2200, 3, (byte) 79);
        setByteElement(term2200, 4, (byte) 61);
        setField(term2199, term2199.getClass(), "message", term2200);
        setIntField(term2199, term2199.getClass(), "offset", -6029667);
        setField(term2199, term2199.getClass(), "type", enum8);
        setByteField(term2199, term2199.getClass(), "typeValue", (byte) -92);
        setIntField(term2199, term2199.getClass(), "dataLength", -2068769794);
        setField(term2199, term2199.getClass(), "object", term2225);
        term2226 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2226;
        callMethod(klass, "readUnsigned16", argTypes, term2199, args);
    }

};


