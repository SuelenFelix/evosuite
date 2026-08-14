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

public class SocialInfo_hashCode_77603138211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879;

    public SocialInfo_hashCode_77603138211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1881 = new Long(-6823727938421990489L);
        Object term1933 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1933, term1933.getClass(), "email", null);
        Object term1934 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1934, term1934.getClass(), "email", null);
        Object term1935 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1935, term1935.getClass(), "email", null);
        Object term1936 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1936, term1936.getClass(), "email", null);
        Object term1937 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1937, term1937.getClass(), "email", null);
        ArrayList term1931 = new ArrayList();
        ((ArrayList) term1931).add(term1933);
        ((ArrayList) term1931).add(term1934);
        ((ArrayList) term1931).add(term1935);
        ((ArrayList) term1931).add(term1936);
        ((ArrayList) term1931).add(term1937);
        Long term1940 = new Long(-484994522244390100L);
        Long term1942 = new Long(1233889271256172047L);
        term1879 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term1880 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term1880, term1880.getClass(), "id", term1881);
        setField(term1880, term1880.getClass(), "userName", "WzMEhMXkKx");
        setField(term1880, term1880.getClass(), "firstName", "XOiDvlDhdc");
        setField(term1880, term1880.getClass(), "lastName", "AdxvLJhNLe");
        setField(term1880, term1880.getClass(), "primaryEmail", "lHfTrWKMPk");
        setField(term1880, term1880.getClass(), "secondaryEmails", term1931);
        setField(term1880, term1880.getClass(), "createdAt", term1940);
        setField(term1880, term1880.getClass(), "updatedAt", term1942);
        setField(term1879, term1879.getClass(), "user", term1880);
        setField(term1879, term1879.getClass(), "githubProfile", "AKNapTAfmD");
        setField(term1879, term1879.getClass(), "twitterProfile", "xJgPlLxpgC");
        setField(term1879, term1879.getClass(), "linkedInProfile", "EYtfuJaxiM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1879, args);
    }

};


