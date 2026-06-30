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
import java.lang.Integer;
import java.lang.Boolean;

public class ASN1BERTokenizer_readListOfElements_11137147257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;
     Object term1197;
     Object term1199;

    public ASN1BERTokenizer_readListOfElements_11137147257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1208 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term1207 = ((Class) term1208).getDeclaredField((String) "OCTET_STRING");
        ((Field) term1207).setAccessible(true);
        Object enum4 = ((Field) term1207).get((Object) null);
        term1169 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term1170 = (byte[]) newByteArray(6);
        Object term1196 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term1170, 0, (byte) 118);
        setByteElement(term1170, 1, (byte) 106);
        setByteElement(term1170, 2, (byte) 98);
        setByteElement(term1170, 3, (byte) 67);
        setByteElement(term1170, 4, (byte) 66);
        setByteElement(term1170, 5, (byte) -121);
        setField(term1169, term1169.getClass(), "message", term1170);
        setIntField(term1169, term1169.getClass(), "offset", 1134449235);
        setField(term1169, term1169.getClass(), "type", enum4);
        setByteField(term1169, term1169.getClass(), "typeValue", (byte) -119);
        setIntField(term1169, term1169.getClass(), "dataLength", -883034806);
        setField(term1169, term1169.getClass(), "object", term1196);
        term1197 = new Integer(1585847225);
        term1199 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1197;
        args[1] = term1199;
        callMethod(klass, "readListOfElements", argTypes, term1169, args);
    }

};


