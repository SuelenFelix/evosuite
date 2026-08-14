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

public class SocialInfo_setGithubProfile_86354086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public SocialInfo_setGithubProfile_86354086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term961 = new Long(-6573104506744284592L);
        Object term1013 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1013, term1013.getClass(), "email", null);
        Object term1014 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1014, term1014.getClass(), "email", null);
        ArrayList term1011 = new ArrayList();
        ((ArrayList) term1011).add(term1013);
        ((ArrayList) term1011).add(term1014);
        Long term1017 = new Long(-4920224193275732920L);
        Long term1019 = new Long(8428634514691209827L);
        term959 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term960 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term960, term960.getClass(), "id", term961);
        setField(term960, term960.getClass(), "userName", "hoicvmsovO");
        setField(term960, term960.getClass(), "firstName", "eqJfYWRaEL");
        setField(term960, term960.getClass(), "lastName", "fhkbdRViHi");
        setField(term960, term960.getClass(), "primaryEmail", "uWHnvSvaPl");
        setField(term960, term960.getClass(), "secondaryEmails", term1011);
        setField(term960, term960.getClass(), "createdAt", term1017);
        setField(term960, term960.getClass(), "updatedAt", term1019);
        setField(term959, term959.getClass(), "user", term960);
        setField(term959, term959.getClass(), "githubProfile", "tPlsykYBqO");
        setField(term959, term959.getClass(), "twitterProfile", "bLPjGVBhlX");
        setField(term959, term959.getClass(), "linkedInProfile", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IgRJUzaCwW";
        callMethod(klass, "setGithubProfile", argTypes, term959, args);
    }

};


