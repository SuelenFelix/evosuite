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

public class ASN1BERTokenizer_readUnsigned32_199497803712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2471;
     Object term2493;

    public ASN1BERTokenizer_readUnsigned32_199497803712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2501 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term2500 = ((Class) term2501).getDeclaredField((String) "UNKNOWN");
        ((Field) term2500).setAccessible(true);
        Object enum9 = ((Field) term2500).get((Object) null);
        term2471 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term2472 = (byte[]) newByteArray(5);
        Object term2492 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term2472, 0, (byte) -42);
        setByteElement(term2472, 1, (byte) 116);
        setByteElement(term2472, 2, (byte) -81);
        setByteElement(term2472, 3, (byte) 102);
        setByteElement(term2472, 4, (byte) -118);
        setField(term2471, term2471.getClass(), "message", term2472);
        setIntField(term2471, term2471.getClass(), "offset", -117576464);
        setField(term2471, term2471.getClass(), "type", enum9);
        setByteField(term2471, term2471.getClass(), "typeValue", (byte) -126);
        setIntField(term2471, term2471.getClass(), "dataLength", -1007160944);
        setField(term2471, term2471.getClass(), "object", term2492);
        term2493 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2493;
        callMethod(klass, "readUnsigned32", argTypes, term2471, args);
    }

};


