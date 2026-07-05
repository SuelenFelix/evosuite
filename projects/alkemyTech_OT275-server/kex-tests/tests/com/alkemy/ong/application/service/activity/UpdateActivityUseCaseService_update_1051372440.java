package com.alkemy.ong.application.service.activity;

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
import static com.alkemy.ong.application.service.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UpdateActivityUseCaseService_update_1051372440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public UpdateActivityUseCaseService_update_1051372440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.application.service.activity.UpdateActivityUseCaseService"));
        setField(term1, term1.getClass(), "activityRepository", null);
        Long term3 = new Long(2442117782898005296L);
        term2 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "content", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "imageUrl", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "name", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.activity.UpdateActivityUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Activity");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "update", argTypes, term1, args);
    }

};


