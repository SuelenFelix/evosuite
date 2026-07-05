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

public class OrganizationEntity_getOrganizationId_2364994402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9428;

    public OrganizationEntity_getOrganizationId_2364994402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9429 = new Long(-5786861555969446503L);
        term9428 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term9551 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term9428, term9428.getClass(), "organizationId", term9429);
        setField(term9428, term9428.getClass(), "name", "OzXRsFGTIp");
        setField(term9428, term9428.getClass(), "imageUrl", "TjWpyghUWN");
        setField(term9428, term9428.getClass(), "address", "dkZFDZxcde");
        setField(term9428, term9428.getClass(), "phone", "WXcZEtUKlI");
        setField(term9428, term9428.getClass(), "email", "IkpjUOuWQU");
        setField(term9428, term9428.getClass(), "facebookUrl", "boSSpezHeU");
        setField(term9428, term9428.getClass(), "linkedInUrl", "OUeBWNTQDh");
        setField(term9428, term9428.getClass(), "instagramUrl", "gltJarNuUk");
        setField(term9428, term9428.getClass(), "welcomeText", "ZwZIDwYcSW");
        setField(term9428, term9428.getClass(), "aboutUsText", "sOdkipUKRu");
        setIntField(term9551, term9551.getClass(), "nanos", 310000000);
        setLongField(term9551, term9551.getClass(), "fastTime", 1461986081000L);
        setField(term9551, term9551.getClass(), "cdate", null);
        setField(term9428, term9428.getClass(), "createTimestamp", term9551);
        setBooleanField(term9428, term9428.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrganizationId", argTypes, term9428, args);
    }

};


