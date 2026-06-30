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

public class SMLMessageParser_parseSMLGetListResponse_8328397406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7890;

    public SMLMessageParser_parseSMLGetListResponse_8328397406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7906 = Class.forName((String) "de.wyraz.sml.asn1.ASN1BERTokenizer$Type");
        Field term7905 = ((Class) term7906).getDeclaredField((String) "NULL");
        ((Field) term7905).setAccessible(true);
        Object enum23 = ((Field) term7905).get((Object) null);
        term7890 = newInstance(Class.forName("de.wyraz.sml.SMLMessageParser"));
        Object term7891 = newInstance(Class.forName("de.wyraz.sml.asn1.ASN1BERTokenizer"));
        byte[] term7892 = (byte[]) newByteArray(0);
        Object term7904 = newInstance(Class.forName("java.lang.Object"));
        setField(term7890, term7890.getClass(), "log", null);
        setField(term7891, term7891.getClass(), "message", term7892);
        setIntField(term7891, term7891.getClass(), "offset", 1328271830);
        setField(term7891, term7891.getClass(), "type", enum23);
        setByteField(term7891, term7891.getClass(), "typeValue", (byte) -75);
        setIntField(term7891, term7891.getClass(), "dataLength", 1596070772);
        setField(term7891, term7891.getClass(), "object", term7904);
        setField(term7890, term7890.getClass(), "tokenizer", term7891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseSMLGetListResponse", argTypes, term7890, args);
    }

};


