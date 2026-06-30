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

public class ASN1BERTokenizer_hasMoreData_20299652626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;

    public ASN1BERTokenizer_hasMoreData_20299652626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term926 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term925 = ((Class) term926).getDeclaredField((String) "END_OF_MESSAGE");
        ((Field) term925).setAccessible(true);
        Object enum3 = ((Field) term925).get((Object) null);
        term897 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term898 = (byte[]) newByteArray(2);
        Object term922 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term898, 0, (byte) 23);
        setByteElement(term898, 1, (byte) -15);
        setField(term897, term897.getClass(), "message", term898);
        setIntField(term897, term897.getClass(), "offset", 1725571209);
        setField(term897, term897.getClass(), "type", enum3);
        setByteField(term897, term897.getClass(), "typeValue", (byte) 36);
        setIntField(term897, term897.getClass(), "dataLength", -522618178);
        setField(term897, term897.getClass(), "object", term922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMoreData", argTypes, term897, args);
    }

};


