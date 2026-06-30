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

public class SMLMessageParser_parseSMLMessageBody_16313969723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7107;

    public SMLMessageParser_parseSMLMessageBody_16313969723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7141 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term7140 = ((Class) term7141).getDeclaredField((String) "OCTET_STRING");
        ((Field) term7140).setAccessible(true);
        Object enum20 = ((Field) term7140).get((Object) null);
        term7107 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term7108 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term7109 = (byte[]) newByteArray(5);
        Object term7134 = newInstance(Class.forName("java.lang.Object"));
        setField(term7107, term7107.getClass(), "log", null);
        setByteElement(term7109, 0, (byte) -4);
        setByteElement(term7109, 1, (byte) -68);
        setByteElement(term7109, 2, (byte) -7);
        setByteElement(term7109, 3, (byte) -109);
        setByteElement(term7109, 4, (byte) 69);
        setField(term7108, term7108.getClass(), "message", term7109);
        setIntField(term7108, term7108.getClass(), "offset", 2055867847);
        setField(term7108, term7108.getClass(), "type", enum20);
        setByteField(term7108, term7108.getClass(), "typeValue", (byte) -50);
        setIntField(term7108, term7108.getClass(), "dataLength", -1048298087);
        setField(term7108, term7108.getClass(), "object", term7134);
        setField(term7107, term7107.getClass(), "tokenizer", term7108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseSMLMessageBody", argTypes, term7107, args);
    }

};


