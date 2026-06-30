package com.alkemy.ong.infrastructure.rest.resource;

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
import static com.alkemy.ong.infrastructure.rest.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MemberResource_init_15838207150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term20;
     Object term21;
     Object term23;

    public MemberResource_init_15838207150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.ListMemberMapper"));
        Object term18 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper"));
        Object term19 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term18, term18.getClass(), "socialMediaMapper", term19);
        setField(term17, term17.getClass(), "getMemberMapper", term18);
        term20 = newInstance(Class.forName("com.alkemy.ong.infrastructure.common.PaginatedResultsRetrieved"));
        term21 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.CreateMemberMapper"));
        Object term22 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term21, term21.getClass(), "socialMediaMapper", term22);
        term23 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.UpdateMemberMapper"));
        Object term24 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term23, term23.getClass(), "socialMediaMapper", term24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.MemberResource");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.member.usecase.IDeleteMemberUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.member.usecase.IListMemberUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.ListMemberMapper");
        argTypes[3] = Class.forName("com.alkemy.ong.infrastructure.common.PaginatedResultsRetrieved");
        argTypes[4] = Class.forName("com.alkemy.ong.application.service.member.usecase.ICreateMemberUseCase");
        argTypes[5] = Class.forName("com.alkemy.ong.application.service.member.usecase.IUpdateMemberUseCase");
        argTypes[6] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.CreateMemberMapper");
        argTypes[7] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.UpdateMemberMapper");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = term17;
        args[3] = term20;
        args[4] = null;
        args[5] = null;
        args[6] = term21;
        args[7] = term23;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


