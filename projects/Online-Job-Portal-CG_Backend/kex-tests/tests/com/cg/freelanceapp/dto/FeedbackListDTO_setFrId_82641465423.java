package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FeedbackListDTO_setFrId_82641465423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16146;

    public FeedbackListDTO_setFrId_82641465423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16146 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term16146, term16146.getClass(), "id", null);
        setField(term16146, term16146.getClass(), "frId", null);
        setField(term16146, term16146.getClass(), "freelancerName", null);
        setField(term16146, term16146.getClass(), "frUName", null);
        setField(term16146, term16146.getClass(), "recId", null);
        setField(term16146, term16146.getClass(), "recruiterName", null);
        setField(term16146, term16146.getClass(), "recUName", null);
        setField(term16146, term16146.getClass(), "rating", null);
        setField(term16146, term16146.getClass(), "comments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFrId", argTypes, term16146, args);
    }

};


