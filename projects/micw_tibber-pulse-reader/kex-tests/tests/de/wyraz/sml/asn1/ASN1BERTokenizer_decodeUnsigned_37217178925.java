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

public class ASN1BERTokenizer_decodeUnsigned_37217178925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5685;
     Object term5689;
     Object term5691;

    public ASN1BERTokenizer_decodeUnsigned_37217178925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5685 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5685, term5685.getClass(), "message", null);
        setIntField(term5685, term5685.getClass(), "offset", 0);
        setField(term5685, term5685.getClass(), "type", null);
        setByteField(term5685, term5685.getClass(), "typeValue", (byte) 0);
        setIntField(term5685, term5685.getClass(), "dataLength", 0);
        setField(term5685, term5685.getClass(), "object", null);
        term5689 = new Integer(0);
        term5691 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5689;
        args[2] = term5691;
        callMethod(klass, "decodeUnsigned", argTypes, term5685, args);
    }

};


