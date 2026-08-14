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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class SocialInfo_equals_12247180579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;
     Object term1635;

    public SocialInfo_equals_12247180579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1540 = new Long(-4502405999831680926L);
        Object term1592 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1592, term1592.getClass(), "email", null);
        ArrayList term1590 = new ArrayList();
        ((ArrayList) term1590).add(term1592);
        Long term1595 = new Long(1967728129628047933L);
        Long term1597 = new Long(2120084523938730454L);
        term1538 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term1539 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term1539, term1539.getClass(), "id", term1540);
        setField(term1539, term1539.getClass(), "userName", "sEccwbJKYE");
        setField(term1539, term1539.getClass(), "firstName", "AWRooQKkdW");
        setField(term1539, term1539.getClass(), "lastName", "vjxIhXHxGR");
        setField(term1539, term1539.getClass(), "primaryEmail", "QXzGXbEXMu");
        setField(term1539, term1539.getClass(), "secondaryEmails", term1590);
        setField(term1539, term1539.getClass(), "createdAt", term1595);
        setField(term1539, term1539.getClass(), "updatedAt", term1597);
        setField(term1538, term1538.getClass(), "user", term1539);
        setField(term1538, term1538.getClass(), "githubProfile", "xBsXSDjXYK");
        setField(term1538, term1538.getClass(), "twitterProfile", "sEnIVFtZuQ");
        setField(term1538, term1538.getClass(), "linkedInProfile", "ZVecLZMLHF");
        term1635 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1635;
        callMethod(klass, "equals", argTypes, term1538, args);
    }

};


