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
import java.util.LinkedList;

public class BatchRequestSubmitter_buildHttpRequest_14577182124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2714;
     Object term2730;
     Object term2733;

    public BatchRequestSubmitter_buildHttpRequest_14577182124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2714 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter"));
        Object[] term2717 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term2714, term2714.getClass(), "httpRequestBatchSize", 1227103734);
        setField(term2714, term2714.getClass(), "publishingThreadPool", null);
        setIntField(term2714, term2714.getClass(), "httpRequestTimeOutSeconds", -1339778481);
        setElement(term2717, 0, "XqgfKFvPSD");
        setField(term2714, term2714.getClass(), "headersAndValues", term2717);
        setField(term2714, term2714.getClass(), "httpClient", null);
        term2730 = new LinkedList();
        term2733 = newInstance(Class.forName("java.net.URI"));
        setField(term2733, term2733.getClass(), "scheme", "telnet");
        setField(term2733, term2733.getClass(), "fragment", null);
        setField(term2733, term2733.getClass(), "authority", "192.0.2.16:80");
        setField(term2733, term2733.getClass(), "userInfo", null);
        setField(term2733, term2733.getClass(), "host", "192.0.2.16");
        setIntField(term2733, term2733.getClass(), "port", 80);
        setField(term2733, term2733.getClass(), "path", "/");
        setField(term2733, term2733.getClass(), "query", null);
        setField(term2733, term2733.getClass(), "schemeSpecificPart", null);
        setIntField(term2733, term2733.getClass(), "hash", 0);
        setField(term2733, term2733.getClass(), "decodedUserInfo", null);
        setField(term2733, term2733.getClass(), "decodedAuthority", null);
        setField(term2733, term2733.getClass(), "decodedPath", null);
        setField(term2733, term2733.getClass(), "decodedQuery", null);
        setField(term2733, term2733.getClass(), "decodedFragment", null);
        setField(term2733, term2733.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2733, term2733.getClass(), "string", "telnet://192.0.2.16:80/");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.net.URI");
        Object[] args = new Object[2];
        args[0] = term2730;
        args[1] = term2733;
        callMethod(klass, "buildHttpRequest", argTypes, term2714, args);
    }

};


