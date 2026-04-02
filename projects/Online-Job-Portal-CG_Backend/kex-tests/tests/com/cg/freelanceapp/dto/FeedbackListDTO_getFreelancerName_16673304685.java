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

public class FeedbackListDTO_getFreelancerName_16673304685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14363;

    public FeedbackListDTO_getFreelancerName_16673304685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14364 = new Long(-7983954942068142191L);
        Long term14366 = new Long(2274723545906746965L);
        Long term14392 = new Long(1353683663053784647L);
        Integer term14418 = new Integer(1962444399);
        term14363 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14363, term14363.getClass(), "id", term14364);
        setField(term14363, term14363.getClass(), "frId", term14366);
        setField(term14363, term14363.getClass(), "freelancerName", "HJwNgUzZZR");
        setField(term14363, term14363.getClass(), "frUName", "FvUCZgTXhq");
        setField(term14363, term14363.getClass(), "recId", term14392);
        setField(term14363, term14363.getClass(), "recruiterName", "wWWidPCHzx");
        setField(term14363, term14363.getClass(), "recUName", "OwPIiBRuKK");
        setField(term14363, term14363.getClass(), "rating", term14418);
        setField(term14363, term14363.getClass(), "comments", "sgfGySMODT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term14363, args);
    }

};


