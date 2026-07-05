package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ContactEntityMapper_toEntity_4582012363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;
     Object term271;

    public ContactEntityMapper_toEntity_4582012363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.ContactEntityMapper"));
        Long term272 = new Long(4872422362414183754L);
        term271 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term271, term271.getClass(), "id", term272);
        setField(term271, term271.getClass(), "name", "BYqFIqCKAV");
        setField(term271, term271.getClass(), "phone", "vrQLuWIDJX");
        setField(term271, term271.getClass(), "email", "flxyYxBRtu");
        setField(term271, term271.getClass(), "message", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.ContactEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Contact");
        Object[] args = new Object[1];
        args[0] = term271;
        callMethod(klass, "toEntity", argTypes, term270, args);
    }

};


