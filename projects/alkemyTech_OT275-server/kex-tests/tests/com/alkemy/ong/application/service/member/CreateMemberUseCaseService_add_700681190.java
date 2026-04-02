package com.alkemy.ong.application.service.member;

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
import static com.alkemy.ong.application.service.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class CreateMemberUseCaseService_add_700681190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term140;

    public CreateMemberUseCaseService_add_700681190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("com.alkemy.ong.application.service.member.CreateMemberUseCaseService"));
        setField(term139, term139.getClass(), "memberRepository", null);
        Long term141 = new Long(6375119433582206027L);
        term140 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term155 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term140, term140.getClass(), "memberId", term141);
        setField(term140, term140.getClass(), "name", "SzjVpOQTyS");
        setField(term155, term155.getClass(), "facebookUrl", "MjGYSRKTNF");
        setField(term155, term155.getClass(), "linkedInUrl", "hRNSzYYIrc");
        setField(term155, term155.getClass(), "instagramUrl", "RMFIsYGgne");
        setField(term140, term140.getClass(), "socialMedia", term155);
        setField(term140, term140.getClass(), "imageUrl", "NRdvgJlhkX");
        setField(term140, term140.getClass(), "description", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.member.CreateMemberUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Member");
        Object[] args = new Object[1];
        args[0] = term140;
        callMethod(klass, "add", argTypes, term139, args);
    }

};


