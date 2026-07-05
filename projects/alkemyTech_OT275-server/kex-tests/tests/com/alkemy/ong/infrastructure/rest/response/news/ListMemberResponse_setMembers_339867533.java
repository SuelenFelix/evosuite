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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.util.LinkedList;

public class ListMemberResponse_setMembers_339867533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2179;
     Object term2194;

    public ListMemberResponse_setMembers_339867533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2183 = new Long(414749984815662075L);
        Object term2182 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term2188 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2182, term2182.getClass(), "memberId", term2183);
        setField(term2182, term2182.getClass(), "name", "");
        setField(term2182, term2182.getClass(), "imageUrl", "");
        setField(term2182, term2182.getClass(), "description", "");
        setField(term2188, term2188.getClass(), "facebookUrl", null);
        setField(term2188, term2188.getClass(), "linkedInUrl", null);
        setField(term2188, term2188.getClass(), "instagramUrl", null);
        setField(term2182, term2182.getClass(), "socialMedia", term2188);
        ArrayList term2180 = new ArrayList();
        ((ArrayList) term2180).add(term2182);
        term2179 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListMemberResponse"));
        setField(term2179, term2179.getClass(), "members", term2180);
        setIntField(term2179, term2179.getClass(), "page", -1339778481);
        setIntField(term2179, term2179.getClass(), "size", 1725571209);
        setIntField(term2179, term2179.getClass(), "totalPages", -522618178);
        term2194 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2194;
        callMethod(klass, "setMembers", argTypes, term2179, args);
    }

};


