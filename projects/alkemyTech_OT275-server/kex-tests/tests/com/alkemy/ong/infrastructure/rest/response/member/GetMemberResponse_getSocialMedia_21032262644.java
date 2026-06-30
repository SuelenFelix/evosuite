package com.alkemy.ong.infrastructure.rest.response.member;

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
import static com.alkemy.ong.infrastructure.rest.response.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class GetMemberResponse_getSocialMedia_21032262644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;

    public GetMemberResponse_getSocialMedia_21032262644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term546 = new Long(5270370404989704783L);
        term545 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term584 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term545, term545.getClass(), "memberId", term546);
        setField(term545, term545.getClass(), "name", "BYqFIqCKAV");
        setField(term545, term545.getClass(), "imageUrl", "vrQLuWIDJX");
        setField(term545, term545.getClass(), "description", "flxyYxBRtu");
        setField(term584, term584.getClass(), "facebookUrl", "OclPbYPkcH");
        setField(term584, term584.getClass(), "linkedInUrl", "IoAlmYsBwc");
        setField(term584, term584.getClass(), "instagramUrl", "TEParAifyi");
        setField(term545, term545.getClass(), "socialMedia", term584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term545, args);
    }

};


