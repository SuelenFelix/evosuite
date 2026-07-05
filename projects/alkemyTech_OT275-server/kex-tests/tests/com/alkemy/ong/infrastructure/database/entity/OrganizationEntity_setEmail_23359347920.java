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

public class OrganizationEntity_setEmail_23359347920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13604;

    public OrganizationEntity_setEmail_23359347920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13605 = new Long(6273754186658578034L);
        term13604 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term13727 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term13604, term13604.getClass(), "organizationId", term13605);
        setField(term13604, term13604.getClass(), "name", "bucTnYicnp");
        setField(term13604, term13604.getClass(), "imageUrl", "EkgprvqZlM");
        setField(term13604, term13604.getClass(), "address", "fbnKvthhOz");
        setField(term13604, term13604.getClass(), "phone", "PGfCDJTBek");
        setField(term13604, term13604.getClass(), "email", "ZwjARhAtHC");
        setField(term13604, term13604.getClass(), "facebookUrl", "XXvscsYBWv");
        setField(term13604, term13604.getClass(), "linkedInUrl", "uePedtiAfL");
        setField(term13604, term13604.getClass(), "instagramUrl", "AdSHvysxQB");
        setField(term13604, term13604.getClass(), "welcomeText", "jlraKkBWFA");
        setField(term13604, term13604.getClass(), "aboutUsText", "mRBtFTxVdE");
        setIntField(term13727, term13727.getClass(), "nanos", 295000000);
        setLongField(term13727, term13727.getClass(), "fastTime", 1303878982000L);
        setField(term13727, term13727.getClass(), "cdate", null);
        setField(term13604, term13604.getClass(), "createTimestamp", term13727);
        setBooleanField(term13604, term13604.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IVacFDAZcj";
        callMethod(klass, "setEmail", argTypes, term13604, args);
    }

};


