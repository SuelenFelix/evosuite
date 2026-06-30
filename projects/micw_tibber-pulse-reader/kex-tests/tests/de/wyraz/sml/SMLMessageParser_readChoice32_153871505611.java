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

public class SMLMessageParser_readChoice32_153871505611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9157;

    public SMLMessageParser_readChoice32_153871505611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9177 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term9176 = ((Class) term9177).getDeclaredField((String) "SIGNED");
        ((Field) term9176).setAccessible(true);
        Object enum28 = ((Field) term9176).get((Object) null);
        term9157 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term9158 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term9159 = (byte[]) newByteArray(1);
        Object term9174 = newInstance(Class.forName("java.lang.Object"));
        setField(term9157, term9157.getClass(), "log", null);
        setByteElement(term9159, 0, (byte) 35);
        setField(term9158, term9158.getClass(), "message", term9159);
        setIntField(term9158, term9158.getClass(), "offset", 287287233);
        setField(term9158, term9158.getClass(), "type", enum28);
        setByteField(term9158, term9158.getClass(), "typeValue", (byte) 62);
        setIntField(term9158, term9158.getClass(), "dataLength", 962840079);
        setField(term9158, term9158.getClass(), "object", term9174);
        setField(term9157, term9157.getClass(), "tokenizer", term9158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readChoice32", argTypes, term9157, args);
    }

};


