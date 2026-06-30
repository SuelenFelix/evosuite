package com.kv.webflux.logging.client.request.message;

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
import static com.kv.webflux.logging.client.request.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class BaseRequestMessageCreator_init_21058810731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term358;
     Object term361;

    public BaseRequestMessageCreator_init_21058810731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term246 = (Object[]) newArray("java.lang.String", 4);
        Object[] term296 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term231, term231.getClass(), "logRequestId", true);
        setField(term231, term231.getClass(), "requestIdPrefix", "NRdvgJlhkX");
        setBooleanField(term231, term231.getClass(), "logHeaders", true);
        setElement(term246, 0, "uuaPigETmJ");
        setElement(term246, 1, "MxlszYVzRf");
        setElement(term246, 2, "LQFpaHEwXR");
        setElement(term246, 3, "oVcInYnLWB");
        setField(term231, term231.getClass(), "maskedHeaders", term246);
        setBooleanField(term231, term231.getClass(), "logCookies", true);
        setElement(term296, 0, "aJlieCFVtF");
        setElement(term296, 1, "ZiaGIbnzTs");
        setElement(term296, 2, "tbcdzjIfER");
        setElement(term296, 3, "HyxfbSQYBe");
        setElement(term296, 4, "pCTimMblYc");
        setField(term231, term231.getClass(), "maskedCookies", term296);
        setBooleanField(term231, term231.getClass(), "logBody", true);
        term358 = new LinkedList();
        term361 = newInstance(Class.forName("com.kv.webflux.logging.client.request.message.formatter.BodyClientRequestFormatter"));
        Object term362 = newInstance(Class.forName("com.kv.webflux.logging.client.request.message.formatter.extractor.RequestBodyExtractor"));
        Object term363 = newInstance(Class.forName("com.kv.webflux.logging.client.request.message.formatter.extractor.RequestBodyMapper"));
        Object term364 = newInstance(Class.forName("com.kv.webflux.logging.provider.BodyProvider"));
        setField(term362, term362.getClass(), "bodyMapper", term363);
        setField(term361, term361.getClass(), "bodyExtractor", term362);
        setField(term361, term361.getClass(), "bodyProvider", term364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.request.message.BaseRequestMessageCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.kv.webflux.logging.client.request.message.formatter.BodyClientRequestFormatter");
        Object[] args = new Object[3];
        args[0] = term231;
        args[1] = term358;
        args[2] = term361;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


