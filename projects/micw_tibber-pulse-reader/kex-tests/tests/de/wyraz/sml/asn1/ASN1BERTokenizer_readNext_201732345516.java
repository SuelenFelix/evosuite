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

public class ASN1BERTokenizer_readNext_201732345516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3485;
     Object enum14;
     Object term3516;
     Object term3518;

    public ASN1BERTokenizer_readNext_201732345516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3521 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term3520 = ((Class) term3521).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term3520).setAccessible(true);
        Object enum13 = ((Field) term3520).get((Object) null);
        term3485 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term3486 = (byte[]) newByteArray(0);
        Object term3507 = newInstance(Class.forName("java.lang.Object"));
        setField(term3485, term3485.getClass(), "message", term3486);
        setIntField(term3485, term3485.getClass(), "offset", -1179120542);
        setField(term3485, term3485.getClass(), "type", enum13);
        setByteField(term3485, term3485.getClass(), "typeValue", (byte) -20);
        setIntField(term3485, term3485.getClass(), "dataLength", -73683645);
        setField(term3485, term3485.getClass(), "object", term3507);
        Class<? extends Object> term3762 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term3761 = ((Class) term3762).getDeclaredField((String) "LIST");
        ((Field) term3761).setAccessible(true);
        enum14 = ((Field) term3761).get((Object) null);
        term3516 = new Integer(-226514366);
        term3518 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum14;
        args[1] = term3516;
        args[2] = term3518;
        callMethod(klass, "readNext", argTypes, term3485, args);
    }

};


