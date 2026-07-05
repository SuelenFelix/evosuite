package com.alkemy.ong.infrastructure.rest.request.member;

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
import static com.alkemy.ong.infrastructure.rest.request.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreateMemberRequest_setSocialMedia_204489708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218;
     Object term2292;

    public CreateMemberRequest_setSocialMedia_204489708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2218 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term2255 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2218, term2218.getClass(), "name", "BKLfkLiZTH");
        setField(term2218, term2218.getClass(), "image", "SPpkrGcPRr");
        setField(term2218, term2218.getClass(), "description", "sEccwbJKYE");
        setField(term2255, term2255.getClass(), "facebookUrl", "AWRooQKkdW");
        setField(term2255, term2255.getClass(), "linkedInUrl", "vjxIhXHxGR");
        setField(term2255, term2255.getClass(), "instagramUrl", "QXzGXbEXMu");
        setField(term2218, term2218.getClass(), "socialMedia", term2255);
        term2292 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2292, term2292.getClass(), "facebookUrl", "qxSDVejjiY");
        setField(term2292, term2292.getClass(), "linkedInUrl", "xBsXSDjXYK");
        setField(term2292, term2292.getClass(), "instagramUrl", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest");
        Object[] args = new Object[1];
        args[0] = term2292;
        callMethod(klass, "setSocialMedia", argTypes, term2218, args);
    }

};


