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

public class OrganizationEntity_setName_67349107816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12608;

    public OrganizationEntity_setName_67349107816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12609 = new Long(5671808784468963649L);
        term12608 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term12731 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term12608, term12608.getClass(), "organizationId", term12609);
        setField(term12608, term12608.getClass(), "name", "xeyjTOCOJb");
        setField(term12608, term12608.getClass(), "imageUrl", "DGRqjjdhzy");
        setField(term12608, term12608.getClass(), "address", "lQFkjJUPAR");
        setField(term12608, term12608.getClass(), "phone", "BsuVlGUUjV");
        setField(term12608, term12608.getClass(), "email", "bHHjfDCntT");
        setField(term12608, term12608.getClass(), "facebookUrl", "sEphiduvkv");
        setField(term12608, term12608.getClass(), "linkedInUrl", "PbLgCSAHce");
        setField(term12608, term12608.getClass(), "instagramUrl", "NWldOLAbqk");
        setField(term12608, term12608.getClass(), "welcomeText", "qnYaYSpDwO");
        setField(term12608, term12608.getClass(), "aboutUsText", "dgbFDCdHtj");
        setIntField(term12731, term12731.getClass(), "nanos", 249000000);
        setLongField(term12731, term12731.getClass(), "fastTime", 1695459581000L);
        setField(term12731, term12731.getClass(), "cdate", null);
        setField(term12608, term12608.getClass(), "createTimestamp", term12731);
        setBooleanField(term12608, term12608.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EKpdCBubDE";
        callMethod(klass, "setName", argTypes, term12608, args);
    }

};


