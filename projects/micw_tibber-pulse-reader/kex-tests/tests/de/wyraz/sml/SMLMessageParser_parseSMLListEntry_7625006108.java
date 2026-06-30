package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SMLMessageParser_parseSMLListEntry_7625006108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8372;

    public SMLMessageParser_parseSMLListEntry_7625006108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8403 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term8402 = ((Class) term8403).getDeclaredField((String) "UNKNOWN");
        ((Field) term8402).setAccessible(true);
        Object enum25 = ((Field) term8402).get((Object) null);
        term8372 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term8373 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term8374 = (byte[]) newByteArray(6);
        Object term8395 = newInstance(Class.forName("java.lang.Object"));
        setField(term8372, term8372.getClass(), "log", null);
        setByteElement(term8374, 0, (byte) -78);
        setByteElement(term8374, 1, (byte) 3);
        setByteElement(term8374, 2, (byte) -30);
        setByteElement(term8374, 3, (byte) -67);
        setByteElement(term8374, 4, (byte) -67);
        setByteElement(term8374, 5, (byte) -94);
        setField(term8373, term8373.getClass(), "message", term8374);
        setIntField(term8373, term8373.getClass(), "offset", 1225272962);
        setField(term8373, term8373.getClass(), "type", enum25);
        setByteField(term8373, term8373.getClass(), "typeValue", (byte) 78);
        setIntField(term8373, term8373.getClass(), "dataLength", 1324040357);
        setField(term8373, term8373.getClass(), "object", term8395);
        setField(term8372, term8372.getClass(), "tokenizer", term8373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseSMLListEntry", argTypes, term8372, args);
    }

};


