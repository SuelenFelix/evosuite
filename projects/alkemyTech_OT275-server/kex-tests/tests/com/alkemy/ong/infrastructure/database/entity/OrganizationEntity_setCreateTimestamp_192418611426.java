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

public class OrganizationEntity_setCreateTimestamp_192418611426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15098;
     Object term15225;

    public OrganizationEntity_setCreateTimestamp_192418611426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15099 = new Long(-2255965562447970862L);
        term15098 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term15221 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term15098, term15098.getClass(), "organizationId", term15099);
        setField(term15098, term15098.getClass(), "name", "fcCAsvfBbe");
        setField(term15098, term15098.getClass(), "imageUrl", "mUNcKUxghj");
        setField(term15098, term15098.getClass(), "address", "lnvLKbtveE");
        setField(term15098, term15098.getClass(), "phone", "FfrrEhTHzQ");
        setField(term15098, term15098.getClass(), "email", "LXnDNrMsqT");
        setField(term15098, term15098.getClass(), "facebookUrl", "ZLQamJFBmu");
        setField(term15098, term15098.getClass(), "linkedInUrl", "ZWcOCwKNvd");
        setField(term15098, term15098.getClass(), "instagramUrl", "GTmoNrziyc");
        setField(term15098, term15098.getClass(), "welcomeText", "LvztehSlhM");
        setField(term15098, term15098.getClass(), "aboutUsText", "njvnWFTMxN");
        setIntField(term15221, term15221.getClass(), "nanos", 464000000);
        setLongField(term15221, term15221.getClass(), "fastTime", 1724949706000L);
        setField(term15221, term15221.getClass(), "cdate", null);
        setField(term15098, term15098.getClass(), "createTimestamp", term15221);
        setBooleanField(term15098, term15098.getClass(), "softDeleted", true);
        term15225 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term15225, term15225.getClass(), "nanos", 108000000);
        setLongField(term15225, term15225.getClass(), "fastTime", 1743125992000L);
        setField(term15225, term15225.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term15225;
        callMethod(klass, "setCreateTimestamp", argTypes, term15098, args);
    }

};


