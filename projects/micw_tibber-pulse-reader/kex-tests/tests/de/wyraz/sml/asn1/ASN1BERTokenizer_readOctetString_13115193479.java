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

public class ASN1BERTokenizer_readOctetString_13115193479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1689;
     Object term1704;

    public ASN1BERTokenizer_readOctetString_13115193479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1708 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term1707 = ((Class) term1708).getDeclaredField((String) "LIST");
        ((Field) term1707).setAccessible(true);
        Object enum6 = ((Field) term1707).get((Object) null);
        term1689 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term1690 = (byte[]) newByteArray(1);
        Object term1703 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term1690, 0, (byte) -85);
        setField(term1689, term1689.getClass(), "message", term1690);
        setIntField(term1689, term1689.getClass(), "offset", -1456670397);
        setField(term1689, term1689.getClass(), "type", enum6);
        setByteField(term1689, term1689.getClass(), "typeValue", (byte) -22);
        setIntField(term1689, term1689.getClass(), "dataLength", 1622346318);
        setField(term1689, term1689.getClass(), "object", term1703);
        term1704 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1704;
        callMethod(klass, "readOctetString", argTypes, term1689, args);
    }

};


