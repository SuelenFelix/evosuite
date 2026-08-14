package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class UserDTO_canEqual_153094383318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4322;
     Object term4395;

    public UserDTO_canEqual_153094383318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4323 = new Long(-8463029266761149071L);
        Object term4375 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4375, term4375.getClass(), "email", "");
        Object term4377 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4377, term4377.getClass(), "email", "");
        Object term4379 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4379, term4379.getClass(), "email", "");
        Object term4381 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4381, term4381.getClass(), "email", "");
        Object term4383 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4383, term4383.getClass(), "email", "");
        Object term4385 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4385, term4385.getClass(), "email", "");
        Object term4387 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4387, term4387.getClass(), "email", "");
        ArrayList term4373 = new ArrayList();
        ((ArrayList) term4373).add(term4375);
        ((ArrayList) term4373).add(term4377);
        ((ArrayList) term4373).add(term4379);
        ((ArrayList) term4373).add(term4381);
        ((ArrayList) term4373).add(term4383);
        ((ArrayList) term4373).add(term4385);
        ((ArrayList) term4373).add(term4387);
        Long term4391 = new Long(3133860696238261492L);
        Long term4393 = new Long(7247160664318067468L);
        term4322 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4322, term4322.getClass(), "id", term4323);
        setField(term4322, term4322.getClass(), "userName", "dJGPlmSRnz");
        setField(term4322, term4322.getClass(), "firstName", "DPskuFUobI");
        setField(term4322, term4322.getClass(), "lastName", "wBGfLpNNiZ");
        setField(term4322, term4322.getClass(), "primaryEmail", "yUGCjlqgJE");
        setField(term4322, term4322.getClass(), "secondaryEmails", term4373);
        setField(term4322, term4322.getClass(), "createdAt", term4391);
        setField(term4322, term4322.getClass(), "updatedAt", term4393);
        term4395 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4395;
        callMethod(klass, "canEqual", argTypes, term4322, args);
    }

};


