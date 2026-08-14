package dev.zevolution.netflixhexaarch.datasources.services.data.response;

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
import static dev.zevolution.netflixhexaarch.datasources.services.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class GitlabProjectResponse_getNameWithNamespace_11390381478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23875;

    public GitlabProjectResponse_getNameWithNamespace_11390381478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23876 = new Integer(344323424);
        Integer term24020 = new Integer(9726679);
        Integer term24022 = new Integer(-25637976);
        Integer term24035 = new Integer(1555897383);
        Integer term24085 = new Integer(202001407);
        term23875 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term23938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24034 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term23875, term23875.getClass(), "id", term23876);
        setField(term23875, term23875.getClass(), "description", "soJHvZwbtF");
        setField(term23875, term23875.getClass(), "name", "dTGwgkfDVj");
        setField(term23875, term23875.getClass(), "nameWithNamespace", "zHiuLPzYQM");
        setField(term23875, term23875.getClass(), "path", "ioYxUYJBrh");
        setField(term23875, term23875.getClass(), "pathWithNamespace", "GXoLEdKEIe");
        setIntField(term23939, term23939.getClass(), "year", 2014);
        setShortField(term23939, term23939.getClass(), "month", (short) 7);
        setShortField(term23939, term23939.getClass(), "day", (short) 13);
        setField(term23938, term23938.getClass(), "date", term23939);
        setByteField(term23943, term23943.getClass(), "hour", (byte) 21);
        setByteField(term23943, term23943.getClass(), "minute", (byte) 46);
        setByteField(term23943, term23943.getClass(), "second", (byte) 0);
        setIntField(term23943, term23943.getClass(), "nano", 887884128);
        setField(term23938, term23938.getClass(), "time", term23943);
        setField(term23875, term23875.getClass(), "createdAt", term23938);
        setField(term23875, term23875.getClass(), "defaultBranch", "EugWXkztim");
        setField(term23875, term23875.getClass(), "sshUrlToRepo", "DvRdOzzihn");
        setField(term23875, term23875.getClass(), "httpUrlToRepo", "wIygCdQAKO");
        setField(term23875, term23875.getClass(), "webUrl", "JsXroBYqwr");
        setField(term23875, term23875.getClass(), "readmeUrl", "YciMAObLwl");
        setField(term23875, term23875.getClass(), "avatarUrl", "qAmVqwwdyf");
        setField(term23875, term23875.getClass(), "forksCount", term24020);
        setField(term23875, term23875.getClass(), "starCount", term24022);
        setIntField(term24025, term24025.getClass(), "year", 2023);
        setShortField(term24025, term24025.getClass(), "month", (short) 3);
        setShortField(term24025, term24025.getClass(), "day", (short) 7);
        setField(term24024, term24024.getClass(), "date", term24025);
        setByteField(term24029, term24029.getClass(), "hour", (byte) 21);
        setByteField(term24029, term24029.getClass(), "minute", (byte) 15);
        setByteField(term24029, term24029.getClass(), "second", (byte) 43);
        setIntField(term24029, term24029.getClass(), "nano", 639721472);
        setField(term24024, term24024.getClass(), "time", term24029);
        setField(term23875, term23875.getClass(), "lastActivityAt", term24024);
        setField(term24034, term24034.getClass(), "id", term24035);
        setField(term24034, term24034.getClass(), "name", "IXPaHQnEUy");
        setField(term24034, term24034.getClass(), "path", "zhcWVVrrjs");
        setField(term24034, term24034.getClass(), "kind", "EAMaFLdmaG");
        setField(term24034, term24034.getClass(), "fullPath", "DYZSJMwbhX");
        setField(term24034, term24034.getClass(), "parentId", term24085);
        setField(term24034, term24034.getClass(), "avatarUrl", "QGcshsIIWo");
        setField(term24034, term24034.getClass(), "webUrl", "dPHtrzKWgf");
        setField(term23875, term23875.getClass(), "namespace", term24034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameWithNamespace", argTypes, term23875, args);
    }

};


