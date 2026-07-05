package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class MemberEntity_getLinkedInUrl_10757818034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4481;

    public MemberEntity_getLinkedInUrl_10757818034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4482 = new Long(5953383087795962419L);
        term4481 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4556 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4481, term4481.getClass(), "memberId", term4482);
        setField(term4481, term4481.getClass(), "name", "kVEZMHmRtR");
        setField(term4481, term4481.getClass(), "facebookUrl", "ekxGuOYIwi");
        setField(term4481, term4481.getClass(), "instagramUrl", "RbVQXSpxXy");
        setField(term4481, term4481.getClass(), "linkedInUrl", "YpJbIgJWWv");
        setField(term4481, term4481.getClass(), "imageUrl", "JppkknKVOw");
        setField(term4481, term4481.getClass(), "description", "iljANwuEjk");
        setIntField(term4556, term4556.getClass(), "nanos", 289000000);
        setLongField(term4556, term4556.getClass(), "fastTime", 1465997919000L);
        setField(term4556, term4556.getClass(), "cdate", null);
        setField(term4481, term4481.getClass(), "createTimestamp", term4556);
        setBooleanField(term4481, term4481.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinkedInUrl", argTypes, term4481, args);
    }

};


