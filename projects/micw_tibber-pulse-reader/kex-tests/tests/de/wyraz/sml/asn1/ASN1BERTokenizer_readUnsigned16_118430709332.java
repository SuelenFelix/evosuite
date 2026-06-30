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
import java.lang.Boolean;

public class ASN1BERTokenizer_readUnsigned16_118430709332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5731;
     Object term5735;

    public ASN1BERTokenizer_readUnsigned16_118430709332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5731 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5731, term5731.getClass(), "message", null);
        setIntField(term5731, term5731.getClass(), "offset", 0);
        setField(term5731, term5731.getClass(), "type", null);
        setByteField(term5731, term5731.getClass(), "typeValue", (byte) 0);
        setIntField(term5731, term5731.getClass(), "dataLength", 0);
        setField(term5731, term5731.getClass(), "object", null);
        term5735 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5735;
        callMethod(klass, "readUnsigned16", argTypes, term5731, args);
    }

};


