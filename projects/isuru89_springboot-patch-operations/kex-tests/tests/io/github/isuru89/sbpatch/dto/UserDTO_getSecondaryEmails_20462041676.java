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

public class UserDTO_getSecondaryEmails_20462041676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2912;

    public UserDTO_getSecondaryEmails_20462041676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2913 = new Long(-2644215923136513282L);
        Object term2965 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2965, term2965.getClass(), "email", "");
        Object term2967 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2967, term2967.getClass(), "email", "");
        Object term2969 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2969, term2969.getClass(), "email", "");
        Object term2971 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2971, term2971.getClass(), "email", "");
        Object term2973 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2973, term2973.getClass(), "email", "");
        Object term2975 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2975, term2975.getClass(), "email", "");
        Object term2977 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2977, term2977.getClass(), "email", "");
        Object term2979 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2979, term2979.getClass(), "email", "");
        ArrayList term2963 = new ArrayList();
        ((ArrayList) term2963).add(term2965);
        ((ArrayList) term2963).add(term2967);
        ((ArrayList) term2963).add(term2969);
        ((ArrayList) term2963).add(term2971);
        ((ArrayList) term2963).add(term2973);
        ((ArrayList) term2963).add(term2975);
        ((ArrayList) term2963).add(term2977);
        ((ArrayList) term2963).add(term2979);
        Long term2983 = new Long(-1468719814009985452L);
        Long term2985 = new Long(-7738503207562305297L);
        term2912 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2912, term2912.getClass(), "id", term2913);
        setField(term2912, term2912.getClass(), "userName", "VGizxZnyHX");
        setField(term2912, term2912.getClass(), "firstName", "kVEZMHmRtR");
        setField(term2912, term2912.getClass(), "lastName", "ekxGuOYIwi");
        setField(term2912, term2912.getClass(), "primaryEmail", "RbVQXSpxXy");
        setField(term2912, term2912.getClass(), "secondaryEmails", term2963);
        setField(term2912, term2912.getClass(), "createdAt", term2983);
        setField(term2912, term2912.getClass(), "updatedAt", term2985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondaryEmails", argTypes, term2912, args);
    }

};


