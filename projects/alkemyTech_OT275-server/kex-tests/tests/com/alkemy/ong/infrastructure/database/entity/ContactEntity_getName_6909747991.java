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

public class ContactEntity_getName_6909747991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7956;

    public ContactEntity_getName_6909747991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7957 = new Long(5836128569274066678L);
        term7956 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8007 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7956, term7956.getClass(), "contactId", term7957);
        setField(term7956, term7956.getClass(), "name", "IBpaxltauX");
        setField(term7956, term7956.getClass(), "phone", "hePqROaplw");
        setField(term7956, term7956.getClass(), "email", "PJcSNDruWd");
        setField(term7956, term7956.getClass(), "message", "VVNNlAePXF");
        setIntField(term8007, term8007.getClass(), "year", 2016);
        setShortField(term8007, term8007.getClass(), "month", (short) 11);
        setShortField(term8007, term8007.getClass(), "day", (short) 29);
        setField(term7956, term7956.getClass(), "deletedAt", term8007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term7956, args);
    }

};


