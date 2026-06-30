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

public class ASN1BERTokenizer_dump_78867537441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5781;
     Object term5785;
     Object term5787;

    public ASN1BERTokenizer_dump_78867537441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5781 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        setField(term5781, term5781.getClass(), "message", null);
        setIntField(term5781, term5781.getClass(), "offset", 0);
        setField(term5781, term5781.getClass(), "type", null);
        setByteField(term5781, term5781.getClass(), "typeValue", (byte) 0);
        setIntField(term5781, term5781.getClass(), "dataLength", 0);
        setField(term5781, term5781.getClass(), "object", null);
        term5785 = new Integer(0);
        term5787 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.PrintStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5785;
        args[2] = term5787;
        callMethod(klass, "dump", argTypes, term5781, args);
    }

};


