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

public class UpdateMemberUseCaseService_update_9907463960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public UpdateMemberUseCaseService_update_9907463960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.application.service.member.UpdateMemberUseCaseService"));
        setField(term1, term1.getClass(), "memberRepository", null);
        Long term3 = new Long(2442117782898005296L);
        term2 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term17 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term2, term2.getClass(), "memberId", term3);
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term17, term17.getClass(), "facebookUrl", "sjlJAEtRrb");
        setField(term17, term17.getClass(), "linkedInUrl", "MuLcgQHgqz");
        setField(term17, term17.getClass(), "instagramUrl", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "socialMedia", term17);
        setField(term2, term2.getClass(), "imageUrl", "jJCZpVmanW");
        setField(term2, term2.getClass(), "description", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.member.UpdateMemberUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Member");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "update", argTypes, term1, args);
    }

};


