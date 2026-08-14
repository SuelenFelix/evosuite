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

public class GitlabProjectResponse_setName_21310688096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18873;

    public GitlabProjectResponse_setName_21310688096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18874 = new Integer(-1263114719);
        Integer term19018 = new Integer(-894662986);
        Integer term19020 = new Integer(304775596);
        Integer term19033 = new Integer(-1347665717);
        Integer term19083 = new Integer(-1888585309);
        term18873 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term18936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19027 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19032 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term18873, term18873.getClass(), "id", term18874);
        setField(term18873, term18873.getClass(), "description", "jlcBpLoWfd");
        setField(term18873, term18873.getClass(), "name", "oYymmLqbfJ");
        setField(term18873, term18873.getClass(), "nameWithNamespace", "YaDWphDOSz");
        setField(term18873, term18873.getClass(), "path", "nnnmCgFBLw");
        setField(term18873, term18873.getClass(), "pathWithNamespace", "hSSCyNEhyH");
        setIntField(term18937, term18937.getClass(), "year", 2019);
        setShortField(term18937, term18937.getClass(), "month", (short) 2);
        setShortField(term18937, term18937.getClass(), "day", (short) 21);
        setField(term18936, term18936.getClass(), "date", term18937);
        setByteField(term18941, term18941.getClass(), "hour", (byte) 5);
        setByteField(term18941, term18941.getClass(), "minute", (byte) 41);
        setByteField(term18941, term18941.getClass(), "second", (byte) 11);
        setIntField(term18941, term18941.getClass(), "nano", 859829782);
        setField(term18936, term18936.getClass(), "time", term18941);
        setField(term18873, term18873.getClass(), "createdAt", term18936);
        setField(term18873, term18873.getClass(), "defaultBranch", "jDFNSuvZqm");
        setField(term18873, term18873.getClass(), "sshUrlToRepo", "pLvkKHqNYX");
        setField(term18873, term18873.getClass(), "httpUrlToRepo", "PwqnuJJwjR");
        setField(term18873, term18873.getClass(), "webUrl", "NFkbBiPeiw");
        setField(term18873, term18873.getClass(), "readmeUrl", "tlRvilQyjJ");
        setField(term18873, term18873.getClass(), "avatarUrl", "gwTUlYNpjM");
        setField(term18873, term18873.getClass(), "forksCount", term19018);
        setField(term18873, term18873.getClass(), "starCount", term19020);
        setIntField(term19023, term19023.getClass(), "year", 2018);
        setShortField(term19023, term19023.getClass(), "month", (short) 9);
        setShortField(term19023, term19023.getClass(), "day", (short) 28);
        setField(term19022, term19022.getClass(), "date", term19023);
        setByteField(term19027, term19027.getClass(), "hour", (byte) 3);
        setByteField(term19027, term19027.getClass(), "minute", (byte) 37);
        setByteField(term19027, term19027.getClass(), "second", (byte) 46);
        setIntField(term19027, term19027.getClass(), "nano", 763326845);
        setField(term19022, term19022.getClass(), "time", term19027);
        setField(term18873, term18873.getClass(), "lastActivityAt", term19022);
        setField(term19032, term19032.getClass(), "id", term19033);
        setField(term19032, term19032.getClass(), "name", "uXYojRmxrM");
        setField(term19032, term19032.getClass(), "path", "cxRwRcodud");
        setField(term19032, term19032.getClass(), "kind", "GDGBPlYeLn");
        setField(term19032, term19032.getClass(), "fullPath", "jdQANIXSTq");
        setField(term19032, term19032.getClass(), "parentId", term19083);
        setField(term19032, term19032.getClass(), "avatarUrl", "stVcZLTNpu");
        setField(term19032, term19032.getClass(), "webUrl", "LgXdqWrsLL");
        setField(term18873, term18873.getClass(), "namespace", term19032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bbHWyibNmy";
        callMethod(klass, "setName", argTypes, term18873, args);
    }

};


