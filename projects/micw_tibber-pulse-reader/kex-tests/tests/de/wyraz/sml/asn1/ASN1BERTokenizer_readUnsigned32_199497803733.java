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

public class ASN1BERTokenizer_readUnsigned32_199497803733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5737;
     Object term5741;

    public ASN1BERTokenizer_readUnsigned32_199497803733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5737 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5737, term5737.getClass(), "message", null);
        setIntField(term5737, term5737.getClass(), "offset", 0);
        setField(term5737, term5737.getClass(), "type", null);
        setByteField(term5737, term5737.getClass(), "typeValue", (byte) 0);
        setIntField(term5737, term5737.getClass(), "dataLength", 0);
        setField(term5737, term5737.getClass(), "object", null);
        term5741 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5741;
        callMethod(klass, "readUnsigned32", argTypes, term5737, args);
    }

};


