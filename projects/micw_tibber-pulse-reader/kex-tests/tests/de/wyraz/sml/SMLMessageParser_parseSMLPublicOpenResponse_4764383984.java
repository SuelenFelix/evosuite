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

public class SMLMessageParser_parseSMLPublicOpenResponse_4764383984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7378;

    public SMLMessageParser_parseSMLPublicOpenResponse_4764383984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7415 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term7414 = ((Class) term7415).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term7414).setAccessible(true);
        Object enum21 = ((Field) term7414).get((Object) null);
        term7378 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term7379 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term7380 = (byte[]) newByteArray(6);
        Object term7407 = newInstance(Class.forName("java.lang.Object"));
        setField(term7378, term7378.getClass(), "log", null);
        setByteElement(term7380, 0, (byte) -103);
        setByteElement(term7380, 1, (byte) 122);
        setByteElement(term7380, 2, (byte) -75);
        setByteElement(term7380, 3, (byte) -72);
        setByteElement(term7380, 4, (byte) -19);
        setByteElement(term7380, 5, (byte) 56);
        setField(term7379, term7379.getClass(), "message", term7380);
        setIntField(term7379, term7379.getClass(), "offset", 292681826);
        setField(term7379, term7379.getClass(), "type", enum21);
        setByteField(term7379, term7379.getClass(), "typeValue", (byte) -47);
        setIntField(term7379, term7379.getClass(), "dataLength", 458147407);
        setField(term7379, term7379.getClass(), "object", term7407);
        setField(term7378, term7378.getClass(), "tokenizer", term7379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseSMLPublicOpenResponse", argTypes, term7378, args);
    }

};


