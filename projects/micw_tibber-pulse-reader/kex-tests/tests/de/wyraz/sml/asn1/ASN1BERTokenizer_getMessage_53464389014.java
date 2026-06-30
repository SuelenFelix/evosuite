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

public class ASN1BERTokenizer_getMessage_53464389014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2985;

    public ASN1BERTokenizer_getMessage_53464389014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3015 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term3014 = ((Class) term3015).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term3014).setAccessible(true);
        Object enum11 = ((Field) term3014).get((Object) null);
        term2985 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term2986 = (byte[]) newByteArray(3);
        Object term3010 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term2986, 0, (byte) 13);
        setByteElement(term2986, 1, (byte) 44);
        setByteElement(term2986, 2, (byte) -63);
        setField(term2985, term2985.getClass(), "message", term2986);
        setIntField(term2985, term2985.getClass(), "offset", 865208305);
        setField(term2985, term2985.getClass(), "type", enum11);
        setByteField(term2985, term2985.getClass(), "typeValue", (byte) 15);
        setIntField(term2985, term2985.getClass(), "dataLength", -1275173084);
        setField(term2985, term2985.getClass(), "object", term3010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term2985, args);
    }

};


