package com.alkemy.ong.application.service.user;

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
import static com.alkemy.ong.application.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UpdateUserUseCaseService_update_6720296600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public UpdateUserUseCaseService_update_6720296600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.application.service.user.UpdateUserUseCaseService"));
        setField(term1, term1.getClass(), "userRepository", null);
        Long term3 = new Long(2442117782898005296L);
        Long term66 = new Long(6375119433582206027L);
        term2 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term65 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "firstName", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "lastName", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "email", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "password", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "imageUrl", "jJCZpVmanW");
        setField(term65, term65.getClass(), "id", term66);
        setField(term65, term65.getClass(), "name", "EGtDIRbSSb");
        setField(term65, term65.getClass(), "description", "SzjVpOQTyS");
        setField(term2, term2.getClass(), "role", term65);
        setField(term2, term2.getClass(), "token", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.UpdateUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "update", argTypes, term1, args);
    }

};


