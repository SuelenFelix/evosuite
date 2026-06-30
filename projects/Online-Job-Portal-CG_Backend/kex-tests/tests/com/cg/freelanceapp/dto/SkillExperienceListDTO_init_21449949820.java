package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SkillExperienceListDTO_init_21449949820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8677;
     Object term8679;
     Object term8693;
     Object term8695;

    public SkillExperienceListDTO_init_21449949820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8677 = new Long(-78240609295693193L);
        term8679 = new Long(3090901538358721367L);
        term8693 = new Integer(-522618178);
        term8695 = new Long(-1677189124507026637L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.lang.Long");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term8677;
        args[1] = term8679;
        args[2] = "BDIRCxAWLA";
        args[3] = term8693;
        args[4] = term8695;
        args[5] = "eOJfbiZLnb";
        args[6] = "nKZKnxWYCK";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


