package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CachedResponse_getProxyRequest_16984823161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5495;

    public CachedResponse_getProxyRequest_16984823161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5754 = new HashMap();
        term5495 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term5496 = newInstance(Class.forName("java.lang.Object"));
        Object term5497 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term5536 = (Object[]) newArray("java.lang.String", 9);
        Object term5657 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term5495, term5495.getClass(), "response", term5496);
        setField(term5497, term5497.getClass(), "pattern", "zaloBqlrSo");
        setField(term5497, term5497.getClass(), "method", "vvoLrMGCoN");
        setBooleanField(term5497, term5497.getClass(), "cached", false);
        setBooleanField(term5497, term5497.getClass(), "async", false);
        setField(term5497, term5497.getClass(), "keyLookupType", "pXdglvyrQe");
        setElement(term5536, 0, "OcfNzHYdki");
        setElement(term5536, 1, "uPuCVuZYOI");
        setElement(term5536, 2, "TweMFhxNdj");
        setElement(term5536, 3, "NBrvVzvQHe");
        setElement(term5536, 4, "FjOiNAfBOc");
        setElement(term5536, 5, "iCCsaLHohG");
        setElement(term5536, 6, "NJhGgctbdj");
        setElement(term5536, 7, "MYWYUeLGOp");
        setElement(term5536, 8, "tsTGdgQYUL");
        setField(term5497, term5497.getClass(), "keyLookupHeaders", term5536);
        setField(term5497, term5497.getClass(), "keyLookupClass", "TtGbVmKcnX");
        setField(term5495, term5495.getClass(), "resource", term5497);
        setField(term5657, term5657.getClass(), "id", "GJVkUrCVdD");
        setField(term5657, term5657.getClass(), "method", "zNdorvdUgu");
        setField(term5657, term5657.getClass(), "scheme", "oPxuZbkYio");
        setField(term5657, term5657.getClass(), "groupId", "vKitydDVnM");
        setField(term5657, term5657.getClass(), "hostGrpId", "urCiQnUFBM");
        setField(term5657, term5657.getClass(), "host", "EKjQdtKxAM");
        setField(term5657, term5657.getClass(), "port", "TXZAIPQJHt");
        setField(term5657, term5657.getClass(), "uri", "DIbeDHICho");
        setField(term5657, term5657.getClass(), "headers", term5754);
        setField(term5657, term5657.getClass(), "body", "wBGfLpNNiZ");
        setField(term5495, term5495.getClass(), "proxyRequest", term5657);
        setField(term5495, term5495.getClass(), "key", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProxyRequest", argTypes, term5495, args);
    }

};


