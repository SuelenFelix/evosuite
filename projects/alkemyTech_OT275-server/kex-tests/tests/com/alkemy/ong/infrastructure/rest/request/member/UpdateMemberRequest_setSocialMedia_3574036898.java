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

public class UpdateMemberRequest_setSocialMedia_3574036898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005;
     Object term1079;

    public UpdateMemberRequest_setSocialMedia_3574036898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1005 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest"));
        Object term1042 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1005, term1005.getClass(), "name", "GzFkzHGYFt");
        setField(term1005, term1005.getClass(), "image", "tShwQLRGNe");
        setField(term1005, term1005.getClass(), "description", "LvtrsXUliU");
        setField(term1042, term1042.getClass(), "facebookUrl", "xLbjWUgOIL");
        setField(term1042, term1042.getClass(), "linkedInUrl", "jDtqGUpnZN");
        setField(term1042, term1042.getClass(), "instagramUrl", "nGKItKLYNC");
        setField(term1005, term1005.getClass(), "socialMedia", term1042);
        term1079 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1079, term1079.getClass(), "facebookUrl", "UiUYnPrcCi");
        setField(term1079, term1079.getClass(), "linkedInUrl", "UoYtihxVaS");
        setField(term1079, term1079.getClass(), "instagramUrl", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest");
        Object[] args = new Object[1];
        args[0] = term1079;
        callMethod(klass, "setSocialMedia", argTypes, term1005, args);
    }

};


