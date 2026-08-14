package com.getindata.connectors.http.internal.sink.httpclient;

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
import static com.getindata.connectors.http.internal.sink.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PerRequestSubmitter_buildHttpRequest_7898886652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2967;
     Object term3078;
     Object term3098;

    public PerRequestSubmitter_buildHttpRequest_7898886652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2967 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestSubmitter"));
        Object[] term2969 = (Object[]) newArray("java.lang.String", 9);
        setField(term2967, term2967.getClass(), "publishingThreadPool", null);
        setIntField(term2967, term2967.getClass(), "httpRequestTimeOutSeconds", -522618178);
        setElement(term2969, 0, "BKLfkLiZTH");
        setElement(term2969, 1, "SPpkrGcPRr");
        setElement(term2969, 2, "sEccwbJKYE");
        setElement(term2969, 3, "AWRooQKkdW");
        setElement(term2969, 4, "vjxIhXHxGR");
        setElement(term2969, 5, "QXzGXbEXMu");
        setElement(term2969, 6, "qxSDVejjiY");
        setElement(term2969, 7, "xBsXSDjXYK");
        setElement(term2969, 8, "sEnIVFtZuQ");
        setField(term2967, term2967.getClass(), "headersAndValues", term2969);
        setField(term2967, term2967.getClass(), "httpClient", null);
        term3078 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        byte[] term3091 = (byte[]) newByteArray(6);
        setField(term3078, term3078.getClass(), "method", "ZVecLZMLHF");
        setByteElement(term3091, 0, (byte) -99);
        setByteElement(term3091, 1, (byte) 59);
        setByteElement(term3091, 2, (byte) -99);
        setByteElement(term3091, 3, (byte) 61);
        setByteElement(term3091, 4, (byte) 100);
        setByteElement(term3091, 5, (byte) 55);
        setField(term3078, term3078.getClass(), "element", term3091);
        term3098 = newInstance(Class.forName("java.net.URI"));
        setField(term3098, term3098.getClass(), "scheme", "mailto");
        setField(term3098, term3098.getClass(), "fragment", null);
        setField(term3098, term3098.getClass(), "authority", null);
        setField(term3098, term3098.getClass(), "userInfo", null);
        setField(term3098, term3098.getClass(), "host", null);
        setIntField(term3098, term3098.getClass(), "port", -1);
        setField(term3098, term3098.getClass(), "path", null);
        setField(term3098, term3098.getClass(), "query", null);
        setField(term3098, term3098.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term3098, term3098.getClass(), "hash", 0);
        setField(term3098, term3098.getClass(), "decodedUserInfo", null);
        setField(term3098, term3098.getClass(), "decodedAuthority", null);
        setField(term3098, term3098.getClass(), "decodedPath", null);
        setField(term3098, term3098.getClass(), "decodedQuery", null);
        setField(term3098, term3098.getClass(), "decodedFragment", null);
        setField(term3098, term3098.getClass(), "decodedSchemeSpecificPart", null);
        setField(term3098, term3098.getClass(), "string", "mailto:John.Doe@example.com");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry");
        argTypes[1] = Class.forName("java.net.URI");
        Object[] args = new Object[2];
        args[0] = term3078;
        args[1] = term3098;
        callMethod(klass, "buildHttpRequest", argTypes, term2967, args);
    }

};


