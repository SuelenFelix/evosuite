package io.netty.handler.ssl;

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
import static io.netty.handler.ssl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CertificateStore_CertificateInfo_setKeyCertChain_5062842203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term109;

    public CertificateStore_CertificateInfo_setKeyCertChain_5062842203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("io.netty.handler.ssl.CertificateStore$CertificateInfo"));
        Object[] term96 = (Object[]) newArray("java.security.cert.X509Certificate", 4);
        setField(term95, term95.getClass(), "keyCertChain", term96);
        setField(term95, term95.getClass(), "id", "jJCZpVmanW");
        setField(term95, term95.getClass(), "key", null);
        term109 = (Object[]) newArray("java.security.cert.X509Certificate", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.netty.handler.ssl.CertificateStore$CertificateInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term109;
        callMethod(klass, "setKeyCertChain", argTypes, term95, args);
    }

};


