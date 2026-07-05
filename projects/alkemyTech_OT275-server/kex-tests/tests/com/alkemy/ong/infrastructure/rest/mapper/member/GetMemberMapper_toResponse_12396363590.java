package com.alkemy.ong.infrastructure.rest.mapper.member;

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
import static com.alkemy.ong.infrastructure.rest.mapper.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Long;

public class GetMemberMapper_toResponse_12396363590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term141;

    public GetMemberMapper_toResponse_12396363590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper"));
        Object term140 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term139, term139.getClass(), "socialMediaMapper", term140);
        Long term145 = new Long(2442117782898005296L);
        Object term144 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term159 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term144, term144.getClass(), "memberId", term145);
        setField(term144, term144.getClass(), "name", "SzjVpOQTyS");
        setField(term159, term159.getClass(), "facebookUrl", "");
        setField(term159, term159.getClass(), "linkedInUrl", "");
        setField(term159, term159.getClass(), "instagramUrl", "");
        setField(term144, term144.getClass(), "socialMedia", term159);
        setField(term144, term144.getClass(), "imageUrl", "NRdvgJlhkX");
        setField(term144, term144.getClass(), "description", "uuaPigETmJ");
        Long term189 = new Long(6375119433582206027L);
        Object term188 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term192 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term188, term188.getClass(), "memberId", term189);
        setField(term188, term188.getClass(), "name", "");
        setField(term192, term192.getClass(), "facebookUrl", null);
        setField(term192, term192.getClass(), "linkedInUrl", null);
        setField(term192, term192.getClass(), "instagramUrl", null);
        setField(term188, term188.getClass(), "socialMedia", term192);
        setField(term188, term188.getClass(), "imageUrl", "");
        setField(term188, term188.getClass(), "description", "");
        Long term197 = new Long(-8257434502486459194L);
        Object term196 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        setField(term196, term196.getClass(), "memberId", term197);
        setField(term196, term196.getClass(), "name", null);
        setField(term196, term196.getClass(), "socialMedia", null);
        setField(term196, term196.getClass(), "imageUrl", null);
        setField(term196, term196.getClass(), "description", null);
        term141 = new LinkedList();
        ((LinkedList) term141).add(term144);
        ((LinkedList) term141).add(term188);
        ((LinkedList) term141).add(term196);
        ((LinkedList) term141).add((Object)null);
        ((LinkedList) term141).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term141;
        callMethod(klass, "toResponse", argTypes, term139, args);
    }

};


