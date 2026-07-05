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
import java.util.ArrayList;

public class Organization_setName_106956324212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3397;

    public Organization_setName_106956324212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3398 = new Long(6682528376118987775L);
        ArrayList term3521 = new ArrayList();
        term3397 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term3460 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term3397, term3397.getClass(), "id", term3398);
        setField(term3397, term3397.getClass(), "name", "AWYyZiNfsm");
        setField(term3397, term3397.getClass(), "image", "ITRRYiuDwH");
        setField(term3397, term3397.getClass(), "phone", "llRfwANcVF");
        setField(term3397, term3397.getClass(), "address", "sUEeHQTWkA");
        setField(term3397, term3397.getClass(), "email", "BDIRCxAWLA");
        setField(term3460, term3460.getClass(), "facebookUrl", "eOJfbiZLnb");
        setField(term3460, term3460.getClass(), "linkedInUrl", "nKZKnxWYCK");
        setField(term3460, term3460.getClass(), "instagramUrl", "JOqQxuzRuZ");
        setField(term3397, term3397.getClass(), "socialMedia", term3460);
        setField(term3397, term3397.getClass(), "aboutUsText", "RSaoipUlsg");
        setField(term3397, term3397.getClass(), "welcomeText", "cSHGbqKqlN");
        setField(term3397, term3397.getClass(), "slides", term3521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pFAfANnxup";
        callMethod(klass, "setName", argTypes, term3397, args);
    }

};


