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
import java.lang.Integer;
import java.lang.Boolean;

public class ASN1BERTokenizer_expect_73861028717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3975;
     Object enum15;
     Object term3995;
     Object term3997;

    public ASN1BERTokenizer_expect_73861028717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4002 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term4001 = ((Class) term4002).getDeclaredField((String) "UNSIGNED");
        ((Field) term4001).setAccessible(true);
        enum15 = ((Field) term4001).get((Object) null);
        term3975 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term3976 = (byte[]) newByteArray(2);
        Object term3994 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term3976, 0, (byte) 10);
        setByteElement(term3976, 1, (byte) 77);
        setField(term3975, term3975.getClass(), "message", term3976);
        setIntField(term3975, term3975.getClass(), "offset", 1193880199);
        setField(term3975, term3975.getClass(), "type", enum15);
        setByteField(term3975, term3975.getClass(), "typeValue", (byte) 14);
        setIntField(term3975, term3975.getClass(), "dataLength", -1087774327);
        setField(term3975, term3975.getClass(), "object", term3994);
        term3995 = new Integer(-1530420153);
        term3997 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum15;
        args[1] = term3995;
        args[2] = term3997;
        callMethod(klass, "expect", argTypes, term3975, args);
    }

};


