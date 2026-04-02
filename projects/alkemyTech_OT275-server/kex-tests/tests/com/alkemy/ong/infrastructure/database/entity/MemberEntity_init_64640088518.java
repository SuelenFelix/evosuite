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
import java.lang.Boolean;

public class MemberEntity_init_64640088518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6566;
     Object term6640;
     Object term6643;

    public MemberEntity_init_64640088518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6566 = new Long(-7291743527973326814L);
        term6640 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6640, term6640.getClass(), "nanos", 575000000);
        setLongField(term6640, term6640.getClass(), "fastTime", 1643970313000L);
        setField(term6640, term6640.getClass(), "cdate", null);
        term6643 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.sql.Timestamp");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term6566;
        args[1] = "GBOEuByOfr";
        args[2] = "NHbOFFjyVK";
        args[3] = "zaloBqlrSo";
        args[4] = "vvoLrMGCoN";
        args[5] = "pXdglvyrQe";
        args[6] = "OcfNzHYdki";
        args[7] = term6640;
        args[8] = term6643;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


