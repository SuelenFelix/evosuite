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
import java.lang.Long;
import java.lang.Integer;

public class FeedbackListDTO_setFrId_8264146544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14242;
     Object term14311;

    public FeedbackListDTO_setFrId_8264146544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14243 = new Long(-5587528177305224828L);
        Long term14245 = new Long(7950532649535587877L);
        Long term14271 = new Long(7799452759993694308L);
        Integer term14297 = new Integer(679763016);
        term14242 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14242, term14242.getClass(), "id", term14243);
        setField(term14242, term14242.getClass(), "frId", term14245);
        setField(term14242, term14242.getClass(), "freelancerName", "KHtaDOIcJZ");
        setField(term14242, term14242.getClass(), "frUName", "vgdwrCZczl");
        setField(term14242, term14242.getClass(), "recId", term14271);
        setField(term14242, term14242.getClass(), "recruiterName", "gKMNrpKBpu");
        setField(term14242, term14242.getClass(), "recUName", "ZbHJVEqcoa");
        setField(term14242, term14242.getClass(), "rating", term14297);
        setField(term14242, term14242.getClass(), "comments", "awDQVEVIKi");
        term14311 = new Long(-1571034605670661708L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term14311;
        callMethod(klass, "setFrId", argTypes, term14242, args);
    }

};


