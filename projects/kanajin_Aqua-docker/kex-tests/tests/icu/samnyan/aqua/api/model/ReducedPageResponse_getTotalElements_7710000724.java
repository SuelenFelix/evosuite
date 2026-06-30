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

public class ReducedPageResponse_getTotalElements_7710000724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653543;

    public ReducedPageResponse_getTotalElements_7710000724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5653544 = new ArrayList();
        Integer term5653548 = new Integer(545058087);
        Integer term5653550 = new Integer(277397630);
        Long term5653552 = new Long(4330210697154841448L);
        term5653543 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653543, term5653543.getClass(), "content", term5653544);
        setField(term5653543, term5653543.getClass(), "page", term5653548);
        setField(term5653543, term5653543.getClass(), "totalPages", term5653550);
        setField(term5653543, term5653543.getClass(), "totalElements", term5653552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalElements", argTypes, term5653543, args);
    }

};


