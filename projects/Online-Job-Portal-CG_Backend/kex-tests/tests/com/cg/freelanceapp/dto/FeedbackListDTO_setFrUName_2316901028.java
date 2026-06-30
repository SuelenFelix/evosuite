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

public class FeedbackListDTO_setFrUName_2316901028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14742;

    public FeedbackListDTO_setFrUName_2316901028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14743 = new Long(-5534222035915952617L);
        Long term14745 = new Long(8073378116544724166L);
        Long term14771 = new Long(-8303973304709662279L);
        Integer term14797 = new Integer(-157887805);
        term14742 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14742, term14742.getClass(), "id", term14743);
        setField(term14742, term14742.getClass(), "frId", term14745);
        setField(term14742, term14742.getClass(), "freelancerName", "aZKOWhHMEh");
        setField(term14742, term14742.getClass(), "frUName", "YfkhviKZwl");
        setField(term14742, term14742.getClass(), "recId", term14771);
        setField(term14742, term14742.getClass(), "recruiterName", "DcOhhAfJTI");
        setField(term14742, term14742.getClass(), "recUName", "gYTIkBFOoS");
        setField(term14742, term14742.getClass(), "rating", term14797);
        setField(term14742, term14742.getClass(), "comments", "xmzSoVgiED");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pdSvedKgPq";
        callMethod(klass, "setFrUName", argTypes, term14742, args);
    }

};


