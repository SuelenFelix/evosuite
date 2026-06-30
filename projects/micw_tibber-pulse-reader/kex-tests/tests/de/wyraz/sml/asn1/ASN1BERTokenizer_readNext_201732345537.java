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

public class ASN1BERTokenizer_readNext_201732345537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5757;
     Object term5761;
     Object term5763;

    public ASN1BERTokenizer_readNext_201732345537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5757 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5757, term5757.getClass(), "message", null);
        setIntField(term5757, term5757.getClass(), "offset", 0);
        setField(term5757, term5757.getClass(), "type", null);
        setByteField(term5757, term5757.getClass(), "typeValue", (byte) 0);
        setIntField(term5757, term5757.getClass(), "dataLength", 0);
        setField(term5757, term5757.getClass(), "object", null);
        term5761 = new Integer(0);
        term5763 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5761;
        args[2] = term5763;
        callMethod(klass, "readNext", argTypes, term5757, args);
    }

};


