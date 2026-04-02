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

public class GetMemberResponse_getDescription_16509260223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public GetMemberResponse_getDescription_16509260223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410 = new Long(-8400487765614892086L);
        term409 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term448 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term409, term409.getClass(), "memberId", term410);
        setField(term409, term409.getClass(), "name", "HyxfbSQYBe");
        setField(term409, term409.getClass(), "imageUrl", "pCTimMblYc");
        setField(term409, term409.getClass(), "description", "hNxWaHcfhY");
        setField(term448, term448.getClass(), "facebookUrl", "RkybSrpybU");
        setField(term448, term448.getClass(), "linkedInUrl", "xOEqzGAmDU");
        setField(term448, term448.getClass(), "instagramUrl", "eZFUvlxvGV");
        setField(term409, term409.getClass(), "socialMedia", term448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term409, args);
    }

};


