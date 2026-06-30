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

public class ASN1BERTokenizer_dump_90745323040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5777;

    public ASN1BERTokenizer_dump_90745323040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5777 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5777, term5777.getClass(), "message", null);
        setIntField(term5777, term5777.getClass(), "offset", 0);
        setField(term5777, term5777.getClass(), "type", null);
        setByteField(term5777, term5777.getClass(), "typeValue", (byte) 0);
        setIntField(term5777, term5777.getClass(), "dataLength", 0);
        setField(term5777, term5777.getClass(), "object", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.PrintStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "dump", argTypes, term5777, args);
    }

};


