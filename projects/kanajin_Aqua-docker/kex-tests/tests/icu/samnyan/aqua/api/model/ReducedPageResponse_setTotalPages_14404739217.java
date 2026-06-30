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

public class ReducedPageResponse_setTotalPages_14404739217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653568;
     Object term5653579;

    public ReducedPageResponse_setTotalPages_14404739217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5653569 = new ArrayList();
        Integer term5653573 = new Integer(-1266872592);
        Integer term5653575 = new Integer(-1078848410);
        Long term5653577 = new Long(-247811548697582090L);
        term5653568 = newInstance(Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse"));
        setField(term5653568, term5653568.getClass(), "content", term5653569);
        setField(term5653568, term5653568.getClass(), "page", term5653573);
        setField(term5653568, term5653568.getClass(), "totalPages", term5653575);
        setField(term5653568, term5653568.getClass(), "totalElements", term5653577);
        term5653579 = new Integer(-1693716421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.ReducedPageResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5653579;
        callMethod(klass, "setTotalPages", argTypes, term5653568, args);
    }

};


