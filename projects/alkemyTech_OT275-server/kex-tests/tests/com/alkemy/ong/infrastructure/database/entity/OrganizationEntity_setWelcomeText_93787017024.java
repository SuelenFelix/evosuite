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

public class OrganizationEntity_setWelcomeText_93787017024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14600;

    public OrganizationEntity_setWelcomeText_93787017024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14601 = new Long(-1804015692891701666L);
        term14600 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term14723 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term14600, term14600.getClass(), "organizationId", term14601);
        setField(term14600, term14600.getClass(), "name", "epPTwvcoyb");
        setField(term14600, term14600.getClass(), "imageUrl", "UBPHmOICBs");
        setField(term14600, term14600.getClass(), "address", "IDJUVPgUJf");
        setField(term14600, term14600.getClass(), "phone", "JmnWRJUxGr");
        setField(term14600, term14600.getClass(), "email", "wgRGBNrTGP");
        setField(term14600, term14600.getClass(), "facebookUrl", "FIdNVptZpW");
        setField(term14600, term14600.getClass(), "linkedInUrl", "rQjxAhisjm");
        setField(term14600, term14600.getClass(), "instagramUrl", "ZDhASPHjDG");
        setField(term14600, term14600.getClass(), "welcomeText", "HNVOAXYNEZ");
        setField(term14600, term14600.getClass(), "aboutUsText", "gbbYBYyfvr");
        setIntField(term14723, term14723.getClass(), "nanos", 958000000);
        setLongField(term14723, term14723.getClass(), "fastTime", 1319344284000L);
        setField(term14723, term14723.getClass(), "cdate", null);
        setField(term14600, term14600.getClass(), "createTimestamp", term14723);
        setBooleanField(term14600, term14600.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SrWMUlbtWV";
        callMethod(klass, "setWelcomeText", argTypes, term14600, args);
    }

};


