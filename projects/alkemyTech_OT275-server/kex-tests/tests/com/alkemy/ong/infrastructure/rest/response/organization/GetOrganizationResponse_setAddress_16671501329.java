package com.alkemy.ong.infrastructure.rest.response.organization;

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
import static com.alkemy.ong.infrastructure.rest.response.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class GetOrganizationResponse_setAddress_16671501329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1697;

    public GetOrganizationResponse_setAddress_16671501329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1751 = new Integer(-1145578966);
        Object term1748 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1748, term1748.getClass(), "text", "");
        setField(term1748, term1748.getClass(), "imageUrl", "");
        setField(term1748, term1748.getClass(), "order", term1751);
        ArrayList term1746 = new ArrayList();
        ((ArrayList) term1746).add(term1748);
        term1697 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term1755 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1697, term1697.getClass(), "name", "mvrkADEgpp");
        setField(term1697, term1697.getClass(), "image", "pXOkjyeIRb");
        setField(term1697, term1697.getClass(), "phone", "GgZWSjxjyE");
        setField(term1697, term1697.getClass(), "address", "EeBVbzjcCI");
        setField(term1697, term1697.getClass(), "slides", term1746);
        setField(term1755, term1755.getClass(), "facebookUrl", "WHcwFgsGFC");
        setField(term1755, term1755.getClass(), "linkedInUrl", "HzqpegHiRq");
        setField(term1755, term1755.getClass(), "instagramUrl", "jwsfVjMoJT");
        setField(term1697, term1697.getClass(), "socialMedia", term1755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        callMethod(klass, "setAddress", argTypes, term1697, args);
    }

};


