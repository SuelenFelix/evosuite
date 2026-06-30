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

public class UpdateMemberRequest_setDescription_20109624837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849;

    public UpdateMemberRequest_setDescription_20109624837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest"));
        Object term886 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term849, term849.getClass(), "name", "nyiiPDVjAc");
        setField(term849, term849.getClass(), "image", "aKnKipADSo");
        setField(term849, term849.getClass(), "description", "wSQxaModmm");
        setField(term886, term886.getClass(), "facebookUrl", "UlajhuVLaP");
        setField(term886, term886.getClass(), "linkedInUrl", "gGSMzuGICf");
        setField(term886, term886.getClass(), "instagramUrl", "hxCBltsObl");
        setField(term849, term849.getClass(), "socialMedia", term886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setDescription", argTypes, term849, args);
    }

};


