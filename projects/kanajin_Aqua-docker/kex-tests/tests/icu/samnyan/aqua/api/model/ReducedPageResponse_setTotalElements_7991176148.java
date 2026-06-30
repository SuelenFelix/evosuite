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

public class ReducedPageResponse_setTotalElements_7991176148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653581;
     Object term5653592;

    public ReducedPageResponse_setTotalElements_7991176148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5653582 = new ArrayList();
        Integer term5653586 = new Integer(165867345);
        Integer term5653588 = new Integer(483143938);
        Long term5653590 = new Long(-6350435453272604172L);
        term5653581 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653581, term5653581.getClass(), "content", term5653582);
        setField(term5653581, term5653581.getClass(), "page", term5653586);
        setField(term5653581, term5653581.getClass(), "totalPages", term5653588);
        setField(term5653581, term5653581.getClass(), "totalElements", term5653590);
        term5653592 = new Long(4574497079154829577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5653592;
        callMethod(klass, "setTotalElements", argTypes, term5653581, args);
    }

};


