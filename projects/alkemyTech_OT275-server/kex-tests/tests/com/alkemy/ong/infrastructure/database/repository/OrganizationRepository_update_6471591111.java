package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class OrganizationRepository_update_6471591111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1157;

    public OrganizationRepository_update_6471591111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1158 = new Long(-2644215923136513282L);
        ArrayList term1281 = new ArrayList();
        term1157 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1220 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term1157, term1157.getClass(), "id", term1158);
        setField(term1157, term1157.getClass(), "name", "OYbzXylRWW");
        setField(term1157, term1157.getClass(), "image", "DSNsTGYXDF");
        setField(term1157, term1157.getClass(), "phone", "sQvGcVjdEx");
        setField(term1157, term1157.getClass(), "address", "rLHAoqXgPh");
        setField(term1157, term1157.getClass(), "email", "zUlRdimJtU");
        setField(term1220, term1220.getClass(), "facebookUrl", "vwbEQQNQrx");
        setField(term1220, term1220.getClass(), "linkedInUrl", "xtftXXMbem");
        setField(term1220, term1220.getClass(), "instagramUrl", "cudZvLMQon");
        setField(term1157, term1157.getClass(), "socialMedia", term1220);
        setField(term1157, term1157.getClass(), "aboutUsText", "lihXWlGDxk");
        setField(term1157, term1157.getClass(), "welcomeText", "JmcmxoGhIK");
        setField(term1157, term1157.getClass(), "slides", term1281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.OrganizationRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[1];
        args[0] = term1157;
        callMethod(klass, "update", argTypes, null, args);
    }

};


