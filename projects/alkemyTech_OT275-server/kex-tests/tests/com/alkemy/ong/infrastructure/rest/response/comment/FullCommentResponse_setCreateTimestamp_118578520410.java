package com.alkemy.ong.infrastructure.rest.response.comment;

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
import static com.alkemy.ong.infrastructure.rest.response.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class FullCommentResponse_setCreateTimestamp_118578520410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;
     Object term759;

    public FullCommentResponse_setCreateTimestamp_118578520410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term718 = new Long(-2813493605142626659L);
        term717 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term756 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term717, term717.getClass(), "id", term718);
        setField(term717, term717.getClass(), "body", "OWDIEULEFu");
        setField(term717, term717.getClass(), "createdBy", "dWRymuLBtr");
        setField(term717, term717.getClass(), "associatedNews", "AijpHYOFuy");
        setIntField(term756, term756.getClass(), "nanos", 23000000);
        setLongField(term756, term756.getClass(), "fastTime", 1500710268000L);
        setField(term756, term756.getClass(), "cdate", null);
        setField(term717, term717.getClass(), "createTimestamp", term756);
        term759 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term759, term759.getClass(), "nanos", 25000000);
        setLongField(term759, term759.getClass(), "fastTime", 1797192828000L);
        setField(term759, term759.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term759;
        callMethod(klass, "setCreateTimestamp", argTypes, term717, args);
    }

};


