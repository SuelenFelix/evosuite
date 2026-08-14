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

public class SocialInfo_canEqual_202888068610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1706;
     Object term1808;

    public SocialInfo_canEqual_202888068610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1708 = new Long(6855071767938501807L);
        Object term1760 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1760, term1760.getClass(), "email", null);
        Object term1761 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1761, term1761.getClass(), "email", null);
        Object term1762 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1762, term1762.getClass(), "email", null);
        Object term1763 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1763, term1763.getClass(), "email", null);
        Object term1764 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1764, term1764.getClass(), "email", null);
        Object term1765 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1765, term1765.getClass(), "email", null);
        ArrayList term1758 = new ArrayList();
        ((ArrayList) term1758).add(term1760);
        ((ArrayList) term1758).add(term1761);
        ((ArrayList) term1758).add(term1762);
        ((ArrayList) term1758).add(term1763);
        ((ArrayList) term1758).add(term1764);
        ((ArrayList) term1758).add(term1765);
        Long term1768 = new Long(-5892135042702373494L);
        Long term1770 = new Long(5262507301787091109L);
        term1706 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term1707 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term1707, term1707.getClass(), "id", term1708);
        setField(term1707, term1707.getClass(), "userName", "fztQhjqwdP");
        setField(term1707, term1707.getClass(), "firstName", "eVpkWxjuki");
        setField(term1707, term1707.getClass(), "lastName", "SJiQaLvSKv");
        setField(term1707, term1707.getClass(), "primaryEmail", "OEXDRUKcFl");
        setField(term1707, term1707.getClass(), "secondaryEmails", term1758);
        setField(term1707, term1707.getClass(), "createdAt", term1768);
        setField(term1707, term1707.getClass(), "updatedAt", term1770);
        setField(term1706, term1706.getClass(), "user", term1707);
        setField(term1706, term1706.getClass(), "githubProfile", "mXGCWJDOqA");
        setField(term1706, term1706.getClass(), "twitterProfile", "dpNsDgfPso");
        setField(term1706, term1706.getClass(), "linkedInProfile", "hCWPJQKpdc");
        term1808 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1808;
        callMethod(klass, "canEqual", argTypes, term1706, args);
    }

};


