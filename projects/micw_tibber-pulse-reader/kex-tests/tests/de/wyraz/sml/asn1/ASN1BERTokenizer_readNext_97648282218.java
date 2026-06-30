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

public class ASN1BERTokenizer_readNext_97648282218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4227;

    public ASN1BERTokenizer_readNext_97648282218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4267 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term4266 = ((Class) term4267).getDeclaredField((String) "BEGIN_OF_FILE");
        ((Field) term4266).setAccessible(true);
        Object enum16 = ((Field) term4266).get((Object) null);
        term4227 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term4228 = (byte[]) newByteArray(8);
        Object term4257 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term4228, 0, (byte) -101);
        setByteElement(term4228, 1, (byte) 35);
        setByteElement(term4228, 2, (byte) 66);
        setByteElement(term4228, 3, (byte) 123);
        setByteElement(term4228, 4, (byte) -5);
        setByteElement(term4228, 5, (byte) 84);
        setByteElement(term4228, 6, (byte) -97);
        setByteElement(term4228, 7, (byte) -24);
        setField(term4227, term4227.getClass(), "message", term4228);
        setIntField(term4227, term4227.getClass(), "offset", -469968304);
        setField(term4227, term4227.getClass(), "type", enum16);
        setByteField(term4227, term4227.getClass(), "typeValue", (byte) 88);
        setIntField(term4227, term4227.getClass(), "dataLength", -1145578966);
        setField(term4227, term4227.getClass(), "object", term4257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readNext", argTypes, term4227, args);
    }

};


