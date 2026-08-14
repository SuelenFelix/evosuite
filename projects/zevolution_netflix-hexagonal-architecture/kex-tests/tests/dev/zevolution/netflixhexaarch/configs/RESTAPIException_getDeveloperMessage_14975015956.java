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

public class RESTAPIException_getDeveloperMessage_14975015956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public RESTAPIException_getDeveloperMessage_14975015956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.configs.RESTAPIException"));
        setField(term3, term3.getClass(), "userMessage", null);
        setField(term3, term3.getClass(), "developerMessage", null);
        setIntField(term3, term3.getClass(), "status", 0);
        setField(term3, term3.getClass(), "error", null);
        setField(term3, term3.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.configs.RESTAPIException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeveloperMessage", argTypes, term3, args);
    }

};


