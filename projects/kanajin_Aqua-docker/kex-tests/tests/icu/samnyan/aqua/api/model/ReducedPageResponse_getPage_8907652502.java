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

public class ReducedPageResponse_getPage_8907652502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653521;

    public ReducedPageResponse_getPage_8907652502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5653522 = new ArrayList();
        Integer term5653526 = new Integer(-105005664);
        Integer term5653528 = new Integer(-118190113);
        Long term5653530 = new Long(2490157212398889918L);
        term5653521 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653521, term5653521.getClass(), "content", term5653522);
        setField(term5653521, term5653521.getClass(), "page", term5653526);
        setField(term5653521, term5653521.getClass(), "totalPages", term5653528);
        setField(term5653521, term5653521.getClass(), "totalElements", term5653530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPage", argTypes, term5653521, args);
    }

};


