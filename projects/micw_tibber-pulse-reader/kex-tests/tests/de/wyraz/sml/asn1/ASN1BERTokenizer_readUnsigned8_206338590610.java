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

public class ASN1BERTokenizer_readUnsigned8_206338590610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921;
     Object term1950;

    public ASN1BERTokenizer_readUnsigned8_206338590610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1959 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term1958 = ((Class) term1959).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term1958).setAccessible(true);
        Object enum7 = ((Field) term1958).get((Object) null);
        term1921 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term1922 = (byte[]) newByteArray(6);
        Object term1949 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term1922, 0, (byte) 93);
        setByteElement(term1922, 1, (byte) 69);
        setByteElement(term1922, 2, (byte) -74);
        setByteElement(term1922, 3, (byte) -123);
        setByteElement(term1922, 4, (byte) -23);
        setByteElement(term1922, 5, (byte) 100);
        setField(term1921, term1921.getClass(), "message", term1922);
        setIntField(term1921, term1921.getClass(), "offset", 1048535127);
        setField(term1921, term1921.getClass(), "type", enum7);
        setByteField(term1921, term1921.getClass(), "typeValue", (byte) 106);
        setIntField(term1921, term1921.getClass(), "dataLength", -655067527);
        setField(term1921, term1921.getClass(), "object", term1949);
        term1950 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1950;
        callMethod(klass, "readUnsigned8", argTypes, term1921, args);
    }

};


