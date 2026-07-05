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

public class OrganizationEntity_getInstagramUrl_197873281210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11244;

    public OrganizationEntity_getInstagramUrl_197873281210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11245 = new Long(1667122142089513324L);
        term11244 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term11367 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term11244, term11244.getClass(), "organizationId", term11245);
        setField(term11244, term11244.getClass(), "name", "QNjNTLlUaV");
        setField(term11244, term11244.getClass(), "imageUrl", "hIYsRyOZxk");
        setField(term11244, term11244.getClass(), "address", "RjNoEywJbC");
        setField(term11244, term11244.getClass(), "phone", "RTTvrwwhou");
        setField(term11244, term11244.getClass(), "email", "lRORwXipuk");
        setField(term11244, term11244.getClass(), "facebookUrl", "fVdTcjgHdw");
        setField(term11244, term11244.getClass(), "linkedInUrl", "wwAwLLcLPp");
        setField(term11244, term11244.getClass(), "instagramUrl", "nHpMKOmlpQ");
        setField(term11244, term11244.getClass(), "welcomeText", "fKhrQsJToZ");
        setField(term11244, term11244.getClass(), "aboutUsText", "wsysQLGFnl");
        setIntField(term11367, term11367.getClass(), "nanos", 283000000);
        setLongField(term11367, term11367.getClass(), "fastTime", 1431644615000L);
        setField(term11367, term11367.getClass(), "cdate", null);
        setField(term11244, term11244.getClass(), "createTimestamp", term11367);
        setBooleanField(term11244, term11244.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstagramUrl", argTypes, term11244, args);
    }

};


