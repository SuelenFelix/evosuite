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

public class ASN1BERTokenizer_readEndOfMessage_7444141708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1445;
     Object term1466;

    public ASN1BERTokenizer_readEndOfMessage_7444141708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1476 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term1475 = ((Class) term1476).getDeclaredField((String) "NULL");
        ((Field) term1475).setAccessible(true);
        Object enum5 = ((Field) term1475).get((Object) null);
        term1445 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term1446 = (byte[]) newByteArray(7);
        Object term1465 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term1446, 0, (byte) 71);
        setByteElement(term1446, 1, (byte) 80);
        setByteElement(term1446, 2, (byte) 42);
        setByteElement(term1446, 3, (byte) 72);
        setByteElement(term1446, 4, (byte) 111);
        setByteElement(term1446, 5, (byte) 99);
        setByteElement(term1446, 6, (byte) -12);
        setField(term1445, term1445.getClass(), "message", term1446);
        setIntField(term1445, term1445.getClass(), "offset", 597278769);
        setField(term1445, term1445.getClass(), "type", enum5);
        setByteField(term1445, term1445.getClass(), "typeValue", (byte) -61);
        setIntField(term1445, term1445.getClass(), "dataLength", -1685132342);
        setField(term1445, term1445.getClass(), "object", term1465);
        term1466 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1466;
        callMethod(klass, "readEndOfMessage", argTypes, term1445, args);
    }

};


