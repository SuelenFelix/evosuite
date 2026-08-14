package dev.zevolution.netflixhexaarch.configs;

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
import static dev.zevolution.netflixhexaarch.configs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RESTAPIException_getError_17463961228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public RESTAPIException_getError_17463961228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.configs.RESTAPIException"));
        setField(term7, term7.getClass(), "userMessage", null);
        setField(term7, term7.getClass(), "developerMessage", null);
        setIntField(term7, term7.getClass(), "status", 0);
        setField(term7, term7.getClass(), "error", null);
        setField(term7, term7.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.configs.RESTAPIException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getError", argTypes, term7, args);
    }

};


