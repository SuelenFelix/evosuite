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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class ASN1BERTokenizer_readSigned8_135506697313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2723;
     Object term2746;

    public ASN1BERTokenizer_readSigned8_135506697313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2751 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term2750 = ((Class) term2751).getDeclaredField((String) "END_OF_FILE");
        ((Field) term2750).setAccessible(true);
        Object enum10 = ((Field) term2750).get((Object) null);
        term2723 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term2724 = (byte[]) newByteArray(2);
        Object term2745 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term2724, 0, (byte) -91);
        setByteElement(term2724, 1, (byte) -104);
        setField(term2723, term2723.getClass(), "message", term2724);
        setIntField(term2723, term2723.getClass(), "offset", 1135664017);
        setField(term2723, term2723.getClass(), "type", enum10);
        setByteField(term2723, term2723.getClass(), "typeValue", (byte) -89);
        setIntField(term2723, term2723.getClass(), "dataLength", 590364439);
        setField(term2723, term2723.getClass(), "object", term2745);
        term2746 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2746;
        callMethod(klass, "readSigned8", argTypes, term2723, args);
    }

};


