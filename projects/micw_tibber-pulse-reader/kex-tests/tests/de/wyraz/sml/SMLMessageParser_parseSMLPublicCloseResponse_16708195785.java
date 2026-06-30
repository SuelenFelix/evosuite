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

public class SMLMessageParser_parseSMLPublicCloseResponse_16708195785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7655;

    public SMLMessageParser_parseSMLPublicCloseResponse_16708195785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7677 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term7676 = ((Class) term7677).getDeclaredField((String) "NULL");
        ((Field) term7676).setAccessible(true);
        Object enum22 = ((Field) term7676).get((Object) null);
        term7655 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term7656 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term7657 = (byte[]) newByteArray(3);
        Object term7672 = newInstance(Class.forName("java.lang.Object"));
        setField(term7655, term7655.getClass(), "log", null);
        setByteElement(term7657, 0, (byte) 126);
        setByteElement(term7657, 1, (byte) 118);
        setByteElement(term7657, 2, (byte) -114);
        setField(term7656, term7656.getClass(), "message", term7657);
        setIntField(term7656, term7656.getClass(), "offset", -184153539);
        setField(term7656, term7656.getClass(), "type", enum22);
        setByteField(term7656, term7656.getClass(), "typeValue", (byte) 97);
        setIntField(term7656, term7656.getClass(), "dataLength", 493620644);
        setField(term7656, term7656.getClass(), "object", term7672);
        setField(term7655, term7655.getClass(), "tokenizer", term7656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseSMLPublicCloseResponse", argTypes, term7655, args);
    }

};


