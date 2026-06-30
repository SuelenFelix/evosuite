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
import java.lang.Boolean;

public class SMLMessageParser_parseSMLTime_206547253410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8892;
     Object term8917;

    public SMLMessageParser_parseSMLTime_206547253410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8923 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term8922 = ((Class) term8923).getDeclaredField((String) "END_OF_FILE");
        ((Field) term8922).setAccessible(true);
        Object enum27 = ((Field) term8922).get((Object) null);
        term8892 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term8893 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term8894 = (byte[]) newByteArray(3);
        Object term8916 = newInstance(Class.forName("java.lang.Object"));
        setField(term8892, term8892.getClass(), "log", null);
        setByteElement(term8894, 0, (byte) 25);
        setByteElement(term8894, 1, (byte) 103);
        setByteElement(term8894, 2, (byte) 111);
        setField(term8893, term8893.getClass(), "message", term8894);
        setIntField(term8893, term8893.getClass(), "offset", -112921587);
        setField(term8893, term8893.getClass(), "type", enum27);
        setByteField(term8893, term8893.getClass(), "typeValue", (byte) -43);
        setIntField(term8893, term8893.getClass(), "dataLength", 933028652);
        setField(term8893, term8893.getClass(), "object", term8916);
        setField(term8892, term8892.getClass(), "tokenizer", term8893);
        term8917 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8917;
        callMethod(klass, "parseSMLTime", argTypes, term8892, args);
    }

};


