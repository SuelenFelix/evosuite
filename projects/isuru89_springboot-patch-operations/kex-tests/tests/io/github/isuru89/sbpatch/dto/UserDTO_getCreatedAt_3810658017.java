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

public class UserDTO_getCreatedAt_3810658017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3027;

    public UserDTO_getCreatedAt_3810658017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3028 = new Long(3825396310311739952L);
        Object term3080 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3080, term3080.getClass(), "email", "");
        Object term3082 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3082, term3082.getClass(), "email", "");
        Object term3084 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3084, term3084.getClass(), "email", "");
        Object term3086 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3086, term3086.getClass(), "email", "");
        Object term3088 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3088, term3088.getClass(), "email", "");
        Object term3090 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3090, term3090.getClass(), "email", "");
        ArrayList term3078 = new ArrayList();
        ((ArrayList) term3078).add(term3080);
        ((ArrayList) term3078).add(term3082);
        ((ArrayList) term3078).add(term3084);
        ((ArrayList) term3078).add(term3086);
        ((ArrayList) term3078).add(term3088);
        ((ArrayList) term3078).add(term3090);
        Long term3094 = new Long(-3838084482494604218L);
        Long term3096 = new Long(3892018155439224435L);
        term3027 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3027, term3027.getClass(), "id", term3028);
        setField(term3027, term3027.getClass(), "userName", "tRxZafjqIx");
        setField(term3027, term3027.getClass(), "firstName", "DhjNLmRMCu");
        setField(term3027, term3027.getClass(), "lastName", "PgPzMSEjjX");
        setField(term3027, term3027.getClass(), "primaryEmail", "wzsPSPcRdj");
        setField(term3027, term3027.getClass(), "secondaryEmails", term3078);
        setField(term3027, term3027.getClass(), "createdAt", term3094);
        setField(term3027, term3027.getClass(), "updatedAt", term3096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term3027, args);
    }

};


