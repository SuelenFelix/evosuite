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
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Long;

public class ReducedPageResponse_getContent_16803588361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653510;

    public ReducedPageResponse_getContent_16803588361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5653511 = new ArrayList();
        Integer term5653515 = new Integer(2137622499);
        Integer term5653517 = new Integer(1999042147);
        Long term5653519 = new Long(1584468811860131003L);
        term5653510 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653510, term5653510.getClass(), "content", term5653511);
        setField(term5653510, term5653510.getClass(), "page", term5653515);
        setField(term5653510, term5653510.getClass(), "totalPages", term5653517);
        setField(term5653510, term5653510.getClass(), "totalElements", term5653519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term5653510, args);
    }

};


