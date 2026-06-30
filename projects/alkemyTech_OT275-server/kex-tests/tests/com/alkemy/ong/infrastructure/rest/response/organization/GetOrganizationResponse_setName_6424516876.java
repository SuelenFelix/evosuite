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

public class GetOrganizationResponse_setName_6424516876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;

    public GetOrganizationResponse_setName_6424516876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1130 = new Integer(-117576464);
        Object term1127 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1127, term1127.getClass(), "text", "");
        setField(term1127, term1127.getClass(), "imageUrl", "");
        setField(term1127, term1127.getClass(), "order", term1130);
        Integer term1135 = new Integer(-1007160944);
        Object term1132 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1132, term1132.getClass(), "text", "");
        setField(term1132, term1132.getClass(), "imageUrl", "");
        setField(term1132, term1132.getClass(), "order", term1135);
        ArrayList term1125 = new ArrayList();
        ((ArrayList) term1125).add(term1127);
        ((ArrayList) term1125).add(term1132);
        term1076 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term1139 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1076, term1076.getClass(), "name", "PkWMRdJcBb");
        setField(term1076, term1076.getClass(), "image", "jSpAteRute");
        setField(term1076, term1076.getClass(), "phone", "swZVeJAxjt");
        setField(term1076, term1076.getClass(), "address", "xOcJIiQQDu");
        setField(term1076, term1076.getClass(), "slides", term1125);
        setField(term1139, term1139.getClass(), "facebookUrl", "XqgfKFvPSD");
        setField(term1139, term1139.getClass(), "linkedInUrl", "JiVRgTZvKc");
        setField(term1139, term1139.getClass(), "instagramUrl", "XPKmummaqg");
        setField(term1076, term1076.getClass(), "socialMedia", term1139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BKLfkLiZTH";
        callMethod(klass, "setName", argTypes, term1076, args);
    }

};


