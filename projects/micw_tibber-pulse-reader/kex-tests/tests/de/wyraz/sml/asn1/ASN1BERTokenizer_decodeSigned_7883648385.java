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
import java.lang.Integer;

public class ASN1BERTokenizer_decodeSigned_7883648385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;
     Object term887;
     Object term889;

    public ASN1BERTokenizer_decodeSigned_7883648385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880 = (byte[]) newByteArray(6);
        setByteElement(term880, 0, (byte) 121);
        setByteElement(term880, 1, (byte) -99);
        setByteElement(term880, 2, (byte) -2);
        setByteElement(term880, 3, (byte) -16);
        setByteElement(term880, 4, (byte) -112);
        setByteElement(term880, 5, (byte) -111);
        term887 = new Integer(1227103734);
        term889 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term880;
        args[1] = term887;
        args[2] = term889;
        callMethod(klass, "decodeSigned", argTypes, null, args);
    }

};


