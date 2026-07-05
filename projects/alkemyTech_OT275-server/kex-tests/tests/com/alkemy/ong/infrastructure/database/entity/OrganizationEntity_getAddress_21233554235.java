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

public class OrganizationEntity_getAddress_21233554235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10109;

    public OrganizationEntity_getAddress_21233554235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10110 = new Long(-3936701866695933852L);
        term10109 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term10232 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term10109, term10109.getClass(), "organizationId", term10110);
        setField(term10109, term10109.getClass(), "name", "nQhIgWXdRc");
        setField(term10109, term10109.getClass(), "imageUrl", "EusenEbIoF");
        setField(term10109, term10109.getClass(), "address", "SScVQYSvWH");
        setField(term10109, term10109.getClass(), "phone", "MnovcqFhCl");
        setField(term10109, term10109.getClass(), "email", "qYtAeLzOhW");
        setField(term10109, term10109.getClass(), "facebookUrl", "tJzmOfcUnY");
        setField(term10109, term10109.getClass(), "linkedInUrl", "TKlccZUpjz");
        setField(term10109, term10109.getClass(), "instagramUrl", "GGzwMoHZXC");
        setField(term10109, term10109.getClass(), "welcomeText", "IpmgwHTgnG");
        setField(term10109, term10109.getClass(), "aboutUsText", "tIpkeYIezR");
        setIntField(term10232, term10232.getClass(), "nanos", 611000000);
        setLongField(term10232, term10232.getClass(), "fastTime", 1369528467000L);
        setField(term10232, term10232.getClass(), "cdate", null);
        setField(term10109, term10109.getClass(), "createTimestamp", term10232);
        setBooleanField(term10109, term10109.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term10109, args);
    }

};


