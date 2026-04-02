package com.alkemy.ong.infrastructure.rest.mapper.user;

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
import static com.alkemy.ong.infrastructure.rest.mapper.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Long;

public class ListUserMapper_toResponse_14270107210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public ListUserMapper_toResponse_14270107210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.ListUserMapper"));
        Object term2 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserMapper"));
        setField(term1, term1.getClass(), "getUserMapper", term2);
        Long term7 = new Long(2442117782898005296L);
        Long term70 = new Long(6375119433582206027L);
        Object term6 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term69 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term6, term6.getClass(), "id", term7);
        setField(term6, term6.getClass(), "firstName", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "lastName", "sjlJAEtRrb");
        setField(term6, term6.getClass(), "email", "MuLcgQHgqz");
        setField(term6, term6.getClass(), "password", "xxtlPwDYFs");
        setField(term6, term6.getClass(), "imageUrl", "jJCZpVmanW");
        setField(term69, term69.getClass(), "id", term70);
        setField(term69, term69.getClass(), "name", "");
        setField(term69, term69.getClass(), "description", "");
        setField(term6, term6.getClass(), "role", term69);
        setField(term6, term6.getClass(), "token", "MjGYSRKTNF");
        Long term88 = new Long(-8257434502486459194L);
        Long term96 = new Long(-8400487765614892086L);
        Object term87 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term95 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term87, term87.getClass(), "id", term88);
        setField(term87, term87.getClass(), "firstName", "");
        setField(term87, term87.getClass(), "lastName", "");
        setField(term87, term87.getClass(), "email", "");
        setField(term87, term87.getClass(), "password", "");
        setField(term87, term87.getClass(), "imageUrl", "");
        setField(term95, term95.getClass(), "id", term96);
        setField(term95, term95.getClass(), "name", null);
        setField(term95, term95.getClass(), "description", null);
        setField(term87, term87.getClass(), "role", term95);
        setField(term87, term87.getClass(), "token", "");
        Long term101 = new Long(5270370404989704783L);
        Object term100 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        setField(term100, term100.getClass(), "id", term101);
        setField(term100, term100.getClass(), "firstName", null);
        setField(term100, term100.getClass(), "lastName", null);
        setField(term100, term100.getClass(), "email", null);
        setField(term100, term100.getClass(), "password", null);
        setField(term100, term100.getClass(), "imageUrl", null);
        setField(term100, term100.getClass(), "role", null);
        setField(term100, term100.getClass(), "token", null);
        term3 = new LinkedList();
        ((LinkedList) term3).add(term6);
        ((LinkedList) term3).add(term87);
        ((LinkedList) term3).add(term100);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.ListUserMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "toResponse", argTypes, term1, args);
    }

};


