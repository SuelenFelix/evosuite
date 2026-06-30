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

public class ASN1BERTokenizer_hasMoreData_202996526227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5701;

    public ASN1BERTokenizer_hasMoreData_202996526227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5701 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5701, term5701.getClass(), "message", null);
        setIntField(term5701, term5701.getClass(), "offset", 0);
        setField(term5701, term5701.getClass(), "type", null);
        setByteField(term5701, term5701.getClass(), "typeValue", (byte) 0);
        setIntField(term5701, term5701.getClass(), "dataLength", 0);
        setField(term5701, term5701.getClass(), "object", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMoreData", argTypes, term5701, args);
    }

};


