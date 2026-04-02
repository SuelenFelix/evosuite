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
import java.lang.Integer;

public class SlideEntityMapper_toDomain_7394963682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618;
     Object term619;

    public SlideEntityMapper_toDomain_7394963682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper"));
        Long term620 = new Long(-872011222785455006L);
        Integer term646 = new Integer(-1955890973);
        term619 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term619, term619.getClass(), "slideId", term620);
        setField(term619, term619.getClass(), "imageUrl", "tShwQLRGNe");
        setField(term619, term619.getClass(), "text", "LvtrsXUliU");
        setField(term619, term619.getClass(), "position", term646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity");
        Object[] args = new Object[1];
        args[0] = term619;
        callMethod(klass, "toDomain", argTypes, term618, args);
    }

};


