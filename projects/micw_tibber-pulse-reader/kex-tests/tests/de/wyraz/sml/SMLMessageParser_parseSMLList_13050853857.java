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
import java.lang.Integer;

public class SMLMessageParser_parseSMLList_13050853857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8119;
     Object term8142;

    public SMLMessageParser_parseSMLList_13050853857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8150 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term8149 = ((Class) term8150).getDeclaredField((String) "UNKNOWN");
        ((Field) term8149).setAccessible(true);
        Object enum24 = ((Field) term8149).get((Object) null);
        term8119 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term8120 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term8121 = (byte[]) newByteArray(5);
        Object term8141 = newInstance(Class.forName("java.lang.Object"));
        setField(term8119, term8119.getClass(), "log", null);
        setByteElement(term8121, 0, (byte) 52);
        setByteElement(term8121, 1, (byte) -128);
        setByteElement(term8121, 2, (byte) 120);
        setByteElement(term8121, 3, (byte) 49);
        setByteElement(term8121, 4, (byte) 74);
        setField(term8120, term8120.getClass(), "message", term8121);
        setIntField(term8120, term8120.getClass(), "offset", 97029295);
        setField(term8120, term8120.getClass(), "type", enum24);
        setByteField(term8120, term8120.getClass(), "typeValue", (byte) 37);
        setIntField(term8120, term8120.getClass(), "dataLength", -1371869594);
        setField(term8120, term8120.getClass(), "object", term8141);
        setField(term8119, term8119.getClass(), "tokenizer", term8120);
        term8142 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8142;
        callMethod(klass, "parseSMLList", argTypes, term8119, args);
    }

};


