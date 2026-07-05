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

public class UpdateMemberRequest_getDescription_21140132993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public UpdateMemberRequest_getDescription_21140132993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest"));
        Object term306 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term269, term269.getClass(), "name", "MxlszYVzRf");
        setField(term269, term269.getClass(), "image", "LQFpaHEwXR");
        setField(term269, term269.getClass(), "description", "oVcInYnLWB");
        setField(term306, term306.getClass(), "facebookUrl", "aJlieCFVtF");
        setField(term306, term306.getClass(), "linkedInUrl", "ZiaGIbnzTs");
        setField(term306, term306.getClass(), "instagramUrl", "tbcdzjIfER");
        setField(term269, term269.getClass(), "socialMedia", term306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term269, args);
    }

};


