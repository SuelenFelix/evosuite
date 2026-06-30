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

public class FeedbackListDTO_getRating_115134840015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15643;

    public FeedbackListDTO_getRating_115134840015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15644 = new Long(-2828343143039517941L);
        Long term15646 = new Long(2809748481176687920L);
        Long term15672 = new Long(4012955251407483889L);
        Integer term15698 = new Integer(1632125673);
        term15643 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15643, term15643.getClass(), "id", term15644);
        setField(term15643, term15643.getClass(), "frId", term15646);
        setField(term15643, term15643.getClass(), "freelancerName", "fLRqcTSfzF");
        setField(term15643, term15643.getClass(), "frUName", "EBYHwsuWAU");
        setField(term15643, term15643.getClass(), "recId", term15672);
        setField(term15643, term15643.getClass(), "recruiterName", "PtIjKpiSix");
        setField(term15643, term15643.getClass(), "recUName", "NZdTuwSCIM");
        setField(term15643, term15643.getClass(), "rating", term15698);
        setField(term15643, term15643.getClass(), "comments", "dDHcmzPAmP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRating", argTypes, term15643, args);
    }

};


