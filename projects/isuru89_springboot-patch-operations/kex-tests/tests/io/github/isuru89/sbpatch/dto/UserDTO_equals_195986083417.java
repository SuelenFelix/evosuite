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

public class UserDTO_equals_195986083417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4214;
     Object term4281;

    public UserDTO_equals_195986083417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4215 = new Long(6689117472719450333L);
        Object term4267 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4267, term4267.getClass(), "email", "");
        Object term4269 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4269, term4269.getClass(), "email", "");
        Object term4271 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4271, term4271.getClass(), "email", "");
        Object term4273 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4273, term4273.getClass(), "email", "");
        ArrayList term4265 = new ArrayList();
        ((ArrayList) term4265).add(term4267);
        ((ArrayList) term4265).add(term4269);
        ((ArrayList) term4265).add(term4271);
        ((ArrayList) term4265).add(term4273);
        Long term4277 = new Long(5836128569274066678L);
        Long term4279 = new Long(-2177368829816872572L);
        term4214 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4214, term4214.getClass(), "id", term4215);
        setField(term4214, term4214.getClass(), "userName", "GJVkUrCVdD");
        setField(term4214, term4214.getClass(), "firstName", "zNdorvdUgu");
        setField(term4214, term4214.getClass(), "lastName", "oPxuZbkYio");
        setField(term4214, term4214.getClass(), "primaryEmail", "vKitydDVnM");
        setField(term4214, term4214.getClass(), "secondaryEmails", term4265);
        setField(term4214, term4214.getClass(), "createdAt", term4277);
        setField(term4214, term4214.getClass(), "updatedAt", term4279);
        term4281 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4281;
        callMethod(klass, "equals", argTypes, term4214, args);
    }

};


