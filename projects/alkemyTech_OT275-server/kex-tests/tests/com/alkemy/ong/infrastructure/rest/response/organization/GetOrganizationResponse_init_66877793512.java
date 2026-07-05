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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class GetOrganizationResponse_init_66877793512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2352;
     Object term2432;

    public GetOrganizationResponse_init_66877793512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2380 = new Integer(-817164822);
        Object term2355 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term2355, term2355.getClass(), "text", "YpJbIgJWWv");
        setField(term2355, term2355.getClass(), "imageUrl", "JppkknKVOw");
        setField(term2355, term2355.getClass(), "order", term2380);
        Integer term2386 = new Integer(-1016503459);
        Object term2383 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term2383, term2383.getClass(), "text", "");
        setField(term2383, term2383.getClass(), "imageUrl", "");
        setField(term2383, term2383.getClass(), "order", term2386);
        Integer term2390 = new Integer(-1968847291);
        Object term2389 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term2389, term2389.getClass(), "text", null);
        setField(term2389, term2389.getClass(), "imageUrl", null);
        setField(term2389, term2389.getClass(), "order", term2390);
        term2352 = new LinkedList();
        ((LinkedList) term2352).add(term2355);
        ((LinkedList) term2352).add(term2383);
        ((LinkedList) term2352).add(term2389);
        ((LinkedList) term2352).add((Object)null);
        ((LinkedList) term2352).add((Object)null);
        ((LinkedList) term2352).add((Object)null);
        ((LinkedList) term2352).add((Object)null);
        term2432 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2432, term2432.getClass(), "facebookUrl", "HDaezxQfQR");
        setField(term2432, term2432.getClass(), "linkedInUrl", "iikZEapDlu");
        setField(term2432, term2432.getClass(), "instagramUrl", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Object[] args = new Object[6];
        args[0] = "VGizxZnyHX";
        args[1] = "kVEZMHmRtR";
        args[2] = "ekxGuOYIwi";
        args[3] = "RbVQXSpxXy";
        args[4] = term2352;
        args[5] = term2432;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


