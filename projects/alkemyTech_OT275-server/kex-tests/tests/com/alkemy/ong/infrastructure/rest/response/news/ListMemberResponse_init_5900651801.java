package com.alkemy.ong.infrastructure.rest.response.news;

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
import static com.alkemy.ong.infrastructure.rest.response.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class ListMemberResponse_init_5900651801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975;

    public ListMemberResponse_init_5900651801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1979 = new Long(-5788180182343976541L);
        Object term1978 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term2017 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1978, term1978.getClass(), "memberId", term1979);
        setField(term1978, term1978.getClass(), "name", "cudZvLMQon");
        setField(term1978, term1978.getClass(), "imageUrl", "lihXWlGDxk");
        setField(term1978, term1978.getClass(), "description", "JmcmxoGhIK");
        setField(term2017, term2017.getClass(), "facebookUrl", "");
        setField(term2017, term2017.getClass(), "linkedInUrl", "");
        setField(term2017, term2017.getClass(), "instagramUrl", "");
        setField(term1978, term1978.getClass(), "socialMedia", term2017);
        Long term2023 = new Long(2936323121573284007L);
        Object term2022 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term2028 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2022, term2022.getClass(), "memberId", term2023);
        setField(term2022, term2022.getClass(), "name", "");
        setField(term2022, term2022.getClass(), "imageUrl", "");
        setField(term2022, term2022.getClass(), "description", "");
        setField(term2028, term2028.getClass(), "facebookUrl", null);
        setField(term2028, term2028.getClass(), "linkedInUrl", null);
        setField(term2028, term2028.getClass(), "instagramUrl", null);
        setField(term2022, term2022.getClass(), "socialMedia", term2028);
        Long term2031 = new Long(-1154553077993834885L);
        Object term2030 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        setField(term2030, term2030.getClass(), "memberId", term2031);
        setField(term2030, term2030.getClass(), "name", null);
        setField(term2030, term2030.getClass(), "imageUrl", null);
        setField(term2030, term2030.getClass(), "description", null);
        setField(term2030, term2030.getClass(), "socialMedia", null);
        term1975 = new LinkedList();
        ((LinkedList) term1975).add(term1978);
        ((LinkedList) term1975).add(term2022);
        ((LinkedList) term1975).add(term2030);
        ((LinkedList) term1975).add((Object)null);
        ((LinkedList) term1975).add((Object)null);
        ((LinkedList) term1975).add((Object)null);
        ((LinkedList) term1975).add((Object)null);
        ((LinkedList) term1975).add((Object)null);
        ((LinkedList) term1975).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1975;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


