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

public class UserDTO_getPrimaryEmail_1067895775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2809;

    public UserDTO_getPrimaryEmail_1067895775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2810 = new Long(2936323121573284007L);
        Object term2862 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2862, term2862.getClass(), "email", "");
        Object term2864 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2864, term2864.getClass(), "email", "");
        ArrayList term2860 = new ArrayList();
        ((ArrayList) term2860).add(term2862);
        ((ArrayList) term2860).add(term2864);
        Long term2868 = new Long(-1154553077993834885L);
        Long term2870 = new Long(-2850532706972744550L);
        term2809 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2809, term2809.getClass(), "id", term2810);
        setField(term2809, term2809.getClass(), "userName", "cudZvLMQon");
        setField(term2809, term2809.getClass(), "firstName", "lihXWlGDxk");
        setField(term2809, term2809.getClass(), "lastName", "JmcmxoGhIK");
        setField(term2809, term2809.getClass(), "primaryEmail", "jXzmYyrnnT");
        setField(term2809, term2809.getClass(), "secondaryEmails", term2860);
        setField(term2809, term2809.getClass(), "createdAt", term2868);
        setField(term2809, term2809.getClass(), "updatedAt", term2870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrimaryEmail", argTypes, term2809, args);
    }

};


