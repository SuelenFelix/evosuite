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
import java.lang.Boolean;

public class ASN1BERTokenizer_readListOfElements_111371472528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5705;
     Object term5709;
     Object term5711;

    public ASN1BERTokenizer_readListOfElements_111371472528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5705 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5705, term5705.getClass(), "message", null);
        setIntField(term5705, term5705.getClass(), "offset", 0);
        setField(term5705, term5705.getClass(), "type", null);
        setByteField(term5705, term5705.getClass(), "typeValue", (byte) 0);
        setIntField(term5705, term5705.getClass(), "dataLength", 0);
        setField(term5705, term5705.getClass(), "object", null);
        term5709 = new Integer(0);
        term5711 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5709;
        args[1] = term5711;
        callMethod(klass, "readListOfElements", argTypes, term5705, args);
    }

};


