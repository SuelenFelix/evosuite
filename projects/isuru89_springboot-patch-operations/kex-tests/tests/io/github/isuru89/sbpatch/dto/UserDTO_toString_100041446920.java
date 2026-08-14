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

public class UserDTO_toString_100041446920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4537;

    public UserDTO_toString_100041446920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4538 = new Long(4949335493504695457L);
        Object term4590 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4590, term4590.getClass(), "email", "");
        Object term4592 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4592, term4592.getClass(), "email", "");
        Object term4594 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4594, term4594.getClass(), "email", "");
        Object term4596 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4596, term4596.getClass(), "email", "");
        Object term4598 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4598, term4598.getClass(), "email", "");
        Object term4600 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4600, term4600.getClass(), "email", "");
        Object term4602 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4602, term4602.getClass(), "email", "");
        Object term4604 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4604, term4604.getClass(), "email", "");
        ArrayList term4588 = new ArrayList();
        ((ArrayList) term4588).add(term4590);
        ((ArrayList) term4588).add(term4592);
        ((ArrayList) term4588).add(term4594);
        ((ArrayList) term4588).add(term4596);
        ((ArrayList) term4588).add(term4598);
        ((ArrayList) term4588).add(term4600);
        ((ArrayList) term4588).add(term4602);
        ((ArrayList) term4588).add(term4604);
        Long term4608 = new Long(-5216789073301458893L);
        Long term4610 = new Long(-1832940336320585644L);
        term4537 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4537, term4537.getClass(), "id", term4538);
        setField(term4537, term4537.getClass(), "userName", "OeQLvhVERT");
        setField(term4537, term4537.getClass(), "firstName", "IlvgFINwIa");
        setField(term4537, term4537.getClass(), "lastName", "GEJABPlHSI");
        setField(term4537, term4537.getClass(), "primaryEmail", "aQFUvuaYxd");
        setField(term4537, term4537.getClass(), "secondaryEmails", term4588);
        setField(term4537, term4537.getClass(), "createdAt", term4608);
        setField(term4537, term4537.getClass(), "updatedAt", term4610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4537, args);
    }

};


