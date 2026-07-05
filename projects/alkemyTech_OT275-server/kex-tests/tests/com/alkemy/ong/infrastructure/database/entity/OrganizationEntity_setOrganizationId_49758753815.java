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

public class OrganizationEntity_setOrganizationId_49758753815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12379;
     Object term12506;

    public OrganizationEntity_setOrganizationId_49758753815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12380 = new Long(-5386201758403679145L);
        term12379 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term12502 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term12379, term12379.getClass(), "organizationId", term12380);
        setField(term12379, term12379.getClass(), "name", "BtvAvsJSei");
        setField(term12379, term12379.getClass(), "imageUrl", "vqnBkkxoIa");
        setField(term12379, term12379.getClass(), "address", "bycpZjxXFn");
        setField(term12379, term12379.getClass(), "phone", "jQWttOAiwL");
        setField(term12379, term12379.getClass(), "email", "DzKFxEuEEC");
        setField(term12379, term12379.getClass(), "facebookUrl", "CAMnvfDLJL");
        setField(term12379, term12379.getClass(), "linkedInUrl", "mfHtgSbdjD");
        setField(term12379, term12379.getClass(), "instagramUrl", "cmuaUiHMVL");
        setField(term12379, term12379.getClass(), "welcomeText", "xjoSGPWUgu");
        setField(term12379, term12379.getClass(), "aboutUsText", "uzmqjnOUXu");
        setIntField(term12502, term12502.getClass(), "nanos", 717000000);
        setLongField(term12502, term12502.getClass(), "fastTime", 1309121542000L);
        setField(term12502, term12502.getClass(), "cdate", null);
        setField(term12379, term12379.getClass(), "createTimestamp", term12502);
        setBooleanField(term12379, term12379.getClass(), "softDeleted", false);
        term12506 = new Long(-7268507582722666254L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12506;
        callMethod(klass, "setOrganizationId", argTypes, term12379, args);
    }

};


