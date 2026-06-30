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

public class ASN1BERTokenizer_getDataLength_17155238732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;

    public ASN1BERTokenizer_getDataLength_17155238732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term402 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term401 = ((Class) term402).getDeclaredField((String) "SIGNED");
        ((Field) term401).setAccessible(true);
        Object enum1 = ((Field) term401).get((Object) null);
        term379 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term380 = (byte[]) newByteArray(3);
        Object term397 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term380, 0, (byte) -119);
        setByteElement(term380, 1, (byte) -66);
        setByteElement(term380, 2, (byte) 83);
        setField(term379, term379.getClass(), "message", term380);
        setIntField(term379, term379.getClass(), "offset", 1484323161);
        setField(term379, term379.getClass(), "type", enum1);
        setByteField(term379, term379.getClass(), "typeValue", (byte) 74);
        setIntField(term379, term379.getClass(), "dataLength", 391863371);
        setField(term379, term379.getClass(), "object", term397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataLength", argTypes, term379, args);
    }

};


