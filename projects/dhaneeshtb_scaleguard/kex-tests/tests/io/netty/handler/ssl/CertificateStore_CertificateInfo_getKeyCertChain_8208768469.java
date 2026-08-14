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

public class CertificateStore_CertificateInfo_getKeyCertChain_8208768469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;

    public CertificateStore_CertificateInfo_getKeyCertChain_8208768469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171 = newInstance(Class.forName("io.netty.handler.ssl.CertificateStore$CertificateInfo"));
        setField(term171, term171.getClass(), "keyCertChain", null);
        setField(term171, term171.getClass(), "id", null);
        setField(term171, term171.getClass(), "key", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.netty.handler.ssl.CertificateStore$CertificateInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyCertChain", argTypes, term171, args);
    }

};


