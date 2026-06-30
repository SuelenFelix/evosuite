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
import java.lang.Boolean;

public class SMLMessageParser_parseSMLValue_7077704979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8625;
     Object term8649;

    public SMLMessageParser_parseSMLValue_7077704979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8652 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term8651 = ((Class) term8652).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term8651).setAccessible(true);
        Object enum26 = ((Field) term8651).get((Object) null);
        term8625 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term8626 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term8627 = (byte[]) newByteArray(0);
        Object term8648 = newInstance(Class.forName("java.lang.Object"));
        setField(term8625, term8625.getClass(), "log", null);
        setField(term8626, term8626.getClass(), "message", term8627);
        setIntField(term8626, term8626.getClass(), "offset", -1588772968);
        setField(term8626, term8626.getClass(), "type", enum26);
        setByteField(term8626, term8626.getClass(), "typeValue", (byte) 8);
        setIntField(term8626, term8626.getClass(), "dataLength", -93135961);
        setField(term8626, term8626.getClass(), "object", term8648);
        setField(term8625, term8625.getClass(), "tokenizer", term8626);
        term8649 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8649;
        callMethod(klass, "parseSMLValue", argTypes, term8625, args);
    }

};


