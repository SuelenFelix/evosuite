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

public class UserDTO_setPrimaryEmail_110113040113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3741;

    public UserDTO_setPrimaryEmail_110113040113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3742 = new Long(-5963439350418910964L);
        Object term3794 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3794, term3794.getClass(), "email", "");
        Object term3796 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3796, term3796.getClass(), "email", "");
        Object term3798 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3798, term3798.getClass(), "email", "");
        Object term3800 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3800, term3800.getClass(), "email", "");
        Object term3802 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3802, term3802.getClass(), "email", "");
        Object term3804 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3804, term3804.getClass(), "email", "");
        ArrayList term3792 = new ArrayList();
        ((ArrayList) term3792).add(term3794);
        ((ArrayList) term3792).add(term3796);
        ((ArrayList) term3792).add(term3798);
        ((ArrayList) term3792).add(term3800);
        ((ArrayList) term3792).add(term3802);
        ((ArrayList) term3792).add(term3804);
        Long term3808 = new Long(9013624480170062917L);
        Long term3810 = new Long(7862575738391801707L);
        term3741 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3741, term3741.getClass(), "id", term3742);
        setField(term3741, term3741.getClass(), "userName", "WVRMUmrljA");
        setField(term3741, term3741.getClass(), "firstName", "NTlKJDDWlk");
        setField(term3741, term3741.getClass(), "lastName", "vOuMEpOQAg");
        setField(term3741, term3741.getClass(), "primaryEmail", "SIODFGaQhr");
        setField(term3741, term3741.getClass(), "secondaryEmails", term3792);
        setField(term3741, term3741.getClass(), "createdAt", term3808);
        setField(term3741, term3741.getClass(), "updatedAt", term3810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lCyLIcSuom";
        callMethod(klass, "setPrimaryEmail", argTypes, term3741, args);
    }

};


