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

public class SMLMessageParser_parseSMLMessages_168546272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6846;

    public SMLMessageParser_parseSMLMessages_168546272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6882 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term6881 = ((Class) term6882).getDeclaredField((String) "UNSIGNED");
        ((Field) term6881).setAccessible(true);
        Object enum19 = ((Field) term6881).get((Object) null);
        term6846 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term6847 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term6848 = (byte[]) newByteArray(8);
        Object term6872 = newInstance(Class.forName("java.lang.Object"));
        setField(term6846, term6846.getClass(), "log", null);
        setByteElement(term6848, 0, (byte) -54);
        setByteElement(term6848, 1, (byte) -51);
        setByteElement(term6848, 2, (byte) 101);
        setByteElement(term6848, 3, (byte) 40);
        setByteElement(term6848, 4, (byte) 83);
        setByteElement(term6848, 5, (byte) -41);
        setByteElement(term6848, 6, (byte) -102);
        setByteElement(term6848, 7, (byte) -93);
        setField(term6847, term6847.getClass(), "message", term6848);
        setIntField(term6847, term6847.getClass(), "offset", 454281060);
        setField(term6847, term6847.getClass(), "type", enum19);
        setByteField(term6847, term6847.getClass(), "typeValue", (byte) 111);
        setIntField(term6847, term6847.getClass(), "dataLength", -1786399638);
        setField(term6847, term6847.getClass(), "object", term6872);
        setField(term6846, term6846.getClass(), "tokenizer", term6847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseSMLMessages", argTypes, term6846, args);
    }

};


