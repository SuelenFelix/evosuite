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

public class GetOrganizationResponse_getPhone_12792309702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public GetOrganizationResponse_getPhone_12792309702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term420 = new Integer(-1339778481);
        Object term417 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term417, term417.getClass(), "text", "");
        setField(term417, term417.getClass(), "imageUrl", "");
        setField(term417, term417.getClass(), "order", term420);
        Integer term425 = new Integer(1725571209);
        Object term422 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term422, term422.getClass(), "text", "");
        setField(term422, term422.getClass(), "imageUrl", "");
        setField(term422, term422.getClass(), "order", term425);
        Integer term430 = new Integer(-522618178);
        Object term427 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term427, term427.getClass(), "text", "");
        setField(term427, term427.getClass(), "imageUrl", "");
        setField(term427, term427.getClass(), "order", term430);
        ArrayList term415 = new ArrayList();
        ((ArrayList) term415).add(term417);
        ((ArrayList) term415).add(term422);
        ((ArrayList) term415).add(term427);
        term366 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term434 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term366, term366.getClass(), "name", "AijpHYOFuy");
        setField(term366, term366.getClass(), "image", "SbAoxhfrkn");
        setField(term366, term366.getClass(), "phone", "kuTXqwMtDB");
        setField(term366, term366.getClass(), "address", "Ghbwtircqb");
        setField(term366, term366.getClass(), "slides", term415);
        setField(term434, term434.getClass(), "facebookUrl", "gGSMzuGICf");
        setField(term434, term434.getClass(), "linkedInUrl", "hxCBltsObl");
        setField(term434, term434.getClass(), "instagramUrl", "BndsHwAFMv");
        setField(term366, term366.getClass(), "socialMedia", term434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term366, args);
    }

};


