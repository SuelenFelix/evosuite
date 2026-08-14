package dev.zevolution.transportlayers.openapi.model;

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
import static dev.zevolution.transportlayers.openapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SoftwareByAuthorResult_score_182580496924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1249;

    public SoftwareByAuthorResult_score_182580496924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1249 = newInstance(Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult"));
        setField(term1249, term1249.getClass(), "name", null);
        setField(term1249, term1249.getClass(), "description", null);
        setField(term1249, term1249.getClass(), "score", null);
        setField(term1249, term1249.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "score", argTypes, term1249, args);
    }

};


