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

public class OrganizationEntity_setImageUrl_207774111717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12857;

    public OrganizationEntity_setImageUrl_207774111717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12858 = new Long(2297097306706899827L);
        term12857 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term12980 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term12857, term12857.getClass(), "organizationId", term12858);
        setField(term12857, term12857.getClass(), "name", "zMsSLTfGhl");
        setField(term12857, term12857.getClass(), "imageUrl", "bEmHScVZaQ");
        setField(term12857, term12857.getClass(), "address", "TcuXODkzBV");
        setField(term12857, term12857.getClass(), "phone", "coJPjrBZNe");
        setField(term12857, term12857.getClass(), "email", "vMsWjuPTnO");
        setField(term12857, term12857.getClass(), "facebookUrl", "zHvfKaOstO");
        setField(term12857, term12857.getClass(), "linkedInUrl", "tOszriqETr");
        setField(term12857, term12857.getClass(), "instagramUrl", "ncSPTkhKjO");
        setField(term12857, term12857.getClass(), "welcomeText", "jcWKHRWhyj");
        setField(term12857, term12857.getClass(), "aboutUsText", "nrQjODRMLD");
        setIntField(term12980, term12980.getClass(), "nanos", 146000000);
        setLongField(term12980, term12980.getClass(), "fastTime", 1342867076000L);
        setField(term12980, term12980.getClass(), "cdate", null);
        setField(term12857, term12857.getClass(), "createTimestamp", term12980);
        setBooleanField(term12857, term12857.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PNoWXrsFic";
        callMethod(klass, "setImageUrl", argTypes, term12857, args);
    }

};


