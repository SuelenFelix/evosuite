package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Member_getMemberId_1626439881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13622;

    public Member_getMemberId_1626439881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13623 = new Long(5845993504299821981L);
        term13622 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term13637 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term13622, term13622.getClass(), "memberId", term13623);
        setField(term13622, term13622.getClass(), "name", "pjEERkBbYo");
        setField(term13637, term13637.getClass(), "facebookUrl", "FQPqmjhWog");
        setField(term13637, term13637.getClass(), "linkedInUrl", "sYtJsiIiSX");
        setField(term13637, term13637.getClass(), "instagramUrl", "KgfsAwTFFn");
        setField(term13622, term13622.getClass(), "socialMedia", term13637);
        setField(term13622, term13622.getClass(), "imageUrl", "hFnFlgThhp");
        setField(term13622, term13622.getClass(), "description", "aEZAnHuGSR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberId", argTypes, term13622, args);
    }

};


