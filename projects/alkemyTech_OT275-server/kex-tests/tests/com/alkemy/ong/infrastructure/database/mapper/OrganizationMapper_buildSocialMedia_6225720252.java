package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class OrganizationMapper_buildSocialMedia_6225720252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258;
     Object term1259;

    public OrganizationMapper_buildSocialMedia_6225720252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.OrganizationMapper"));
        Long term1260 = new Long(-4365849114644724155L);
        term1259 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term1382 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1259, term1259.getClass(), "organizationId", term1260);
        setField(term1259, term1259.getClass(), "name", "PkWMRdJcBb");
        setField(term1259, term1259.getClass(), "imageUrl", "jSpAteRute");
        setField(term1259, term1259.getClass(), "address", "swZVeJAxjt");
        setField(term1259, term1259.getClass(), "phone", "xOcJIiQQDu");
        setField(term1259, term1259.getClass(), "email", "GVizqqzXpy");
        setField(term1259, term1259.getClass(), "facebookUrl", "JqXGgAhZPl");
        setField(term1259, term1259.getClass(), "linkedInUrl", "jiKYgYHqIS");
        setField(term1259, term1259.getClass(), "instagramUrl", "DfISiziTgG");
        setField(term1259, term1259.getClass(), "welcomeText", "XqgfKFvPSD");
        setField(term1259, term1259.getClass(), "aboutUsText", "JiVRgTZvKc");
        setIntField(term1382, term1382.getClass(), "nanos", 830000000);
        setLongField(term1382, term1382.getClass(), "fastTime", 1610929382000L);
        setField(term1382, term1382.getClass(), "cdate", null);
        setField(term1259, term1259.getClass(), "createTimestamp", term1382);
        setBooleanField(term1259, term1259.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.OrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Object[] args = new Object[1];
        args[0] = term1259;
        callMethod(klass, "buildSocialMedia", argTypes, term1258, args);
    }

};


