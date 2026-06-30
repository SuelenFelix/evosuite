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

public class ReducedPageResponse_setPage_3626555686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653555;
     Object term5653566;

    public ReducedPageResponse_setPage_3626555686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5653556 = new ArrayList();
        Integer term5653560 = new Integer(-735574672);
        Integer term5653562 = new Integer(-2067044834);
        Long term5653564 = new Long(4550244066712056450L);
        term5653555 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653555, term5653555.getClass(), "content", term5653556);
        setField(term5653555, term5653555.getClass(), "page", term5653560);
        setField(term5653555, term5653555.getClass(), "totalPages", term5653562);
        setField(term5653555, term5653555.getClass(), "totalElements", term5653564);
        term5653566 = new Integer(-626419373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5653566;
        callMethod(klass, "setPage", argTypes, term5653555, args);
    }

};


