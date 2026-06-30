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

public class ASN1BERTokenizer_getType_5177349771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public ASN1BERTokenizer_getType_5177349771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term154 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term153 = ((Class) term154).getDeclaredField((String) "UNSIGNED");
        ((Field) term153).setAccessible(true);
        Object enum0 = ((Field) term153).get((Object) null);
        term12 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term13 = (byte[]) newByteArray(4);
        Object term33 = newInstance(Class.forName("java.lang.Object"));
        setByteElement(term13, 0, (byte) -58);
        setByteElement(term13, 1, (byte) -29);
        setByteElement(term13, 2, (byte) -54);
        setByteElement(term13, 3, (byte) -10);
        setField(term12, term12.getClass(), "message", term13);
        setIntField(term12, term12.getClass(), "offset", 568599855);
        setField(term12, term12.getClass(), "type", enum0);
        setByteField(term12, term12.getClass(), "typeValue", (byte) 79);
        setIntField(term12, term12.getClass(), "dataLength", 1162663216);
        setField(term12, term12.getClass(), "object", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term12, args);
    }

};


