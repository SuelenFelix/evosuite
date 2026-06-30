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

public class MemberEntity_setImageUrl_198549164414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5961;

    public MemberEntity_setImageUrl_198549164414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5962 = new Long(-6723783499250797216L);
        term5961 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term6036 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5961, term5961.getClass(), "memberId", term5962);
        setField(term5961, term5961.getClass(), "name", "WVRMUmrljA");
        setField(term5961, term5961.getClass(), "facebookUrl", "NTlKJDDWlk");
        setField(term5961, term5961.getClass(), "instagramUrl", "vOuMEpOQAg");
        setField(term5961, term5961.getClass(), "linkedInUrl", "SIODFGaQhr");
        setField(term5961, term5961.getClass(), "imageUrl", "qYzsiuXOgS");
        setField(term5961, term5961.getClass(), "description", "bxrCBbrrct");
        setIntField(term6036, term6036.getClass(), "nanos", 263000000);
        setLongField(term6036, term6036.getClass(), "fastTime", 1713880355000L);
        setField(term6036, term6036.getClass(), "cdate", null);
        setField(term5961, term5961.getClass(), "createTimestamp", term6036);
        setBooleanField(term5961, term5961.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CKWpJaaaxX";
        callMethod(klass, "setImageUrl", argTypes, term5961, args);
    }

};


