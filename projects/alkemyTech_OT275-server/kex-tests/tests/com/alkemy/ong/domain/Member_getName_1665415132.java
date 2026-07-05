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

public class Member_getName_1665415132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13758;

    public Member_getName_1665415132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13759 = new Long(-1528017371096319990L);
        term13758 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term13773 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term13758, term13758.getClass(), "memberId", term13759);
        setField(term13758, term13758.getClass(), "name", "uMzGGnJFYF");
        setField(term13773, term13773.getClass(), "facebookUrl", "iAIRLRjFkP");
        setField(term13773, term13773.getClass(), "linkedInUrl", "cdXvvxXVTz");
        setField(term13773, term13773.getClass(), "instagramUrl", "tXsfWIqIPn");
        setField(term13758, term13758.getClass(), "socialMedia", term13773);
        setField(term13758, term13758.getClass(), "imageUrl", "tDmfqEyHaN");
        setField(term13758, term13758.getClass(), "description", "mTSMXFkWRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term13758, args);
    }

};


