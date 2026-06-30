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

public class ASN1BERTokenizer_getObject_19381535373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public ASN1BERTokenizer_getObject_19381535373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term648 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term647 = ((Class) term648).getDeclaredField((String) "UNSIGNED");
        ((Field) term647).setAccessible(true);
        Object enum2 = ((Field) term647).get((Object) null);
        term621 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term622 = (byte[]) newByteArray(4);
        Object term642 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term622, 0, (byte) -71);
        setByteElement(term622, 1, (byte) 49);
        setByteElement(term622, 2, (byte) -54);
        setByteElement(term622, 3, (byte) 67);
        setField(term621, term621.getClass(), "message", term622);
        setIntField(term621, term621.getClass(), "offset", -1922583790);
        setField(term621, term621.getClass(), "type", enum2);
        setByteField(term621, term621.getClass(), "typeValue", (byte) 78);
        setIntField(term621, term621.getClass(), "dataLength", -616727354);
        setField(term621, term621.getClass(), "object", term642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getObject", argTypes, term621, args);
    }

};


