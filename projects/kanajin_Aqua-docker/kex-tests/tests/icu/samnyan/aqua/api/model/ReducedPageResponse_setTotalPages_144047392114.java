package icu.samnyan.aqua.api.model;

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
import static icu.samnyan.aqua.api.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReducedPageResponse_setTotalPages_144047392114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653599;

    public ReducedPageResponse_setTotalPages_144047392114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5653599 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653599, term5653599.getClass(), "content", null);
        setField(term5653599, term5653599.getClass(), "page", null);
        setField(term5653599, term5653599.getClass(), "totalPages", null);
        setField(term5653599, term5653599.getClass(), "totalElements", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTotalPages", argTypes, term5653599, args);
    }

};


