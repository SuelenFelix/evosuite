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

public class GetMemberResponse_setMemberId_11311627125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;
     Object term757;

    public GetMemberResponse_setMemberId_11311627125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term682 = new Long(7411271909051562686L);
        term681 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term720 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term681, term681.getClass(), "memberId", term682);
        setField(term681, term681.getClass(), "name", "OWDIEULEFu");
        setField(term681, term681.getClass(), "imageUrl", "dWRymuLBtr");
        setField(term681, term681.getClass(), "description", "AijpHYOFuy");
        setField(term720, term720.getClass(), "facebookUrl", "SbAoxhfrkn");
        setField(term720, term720.getClass(), "linkedInUrl", "kuTXqwMtDB");
        setField(term720, term720.getClass(), "instagramUrl", "Ghbwtircqb");
        setField(term681, term681.getClass(), "socialMedia", term720);
        term757 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term757;
        callMethod(klass, "setMemberId", argTypes, term681, args);
    }

};


