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

public class GitlabProjectResponse_getNamespace_62483333833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30079;

    public GitlabProjectResponse_getNamespace_62483333833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30080 = new Integer(-1122880881);
        Integer term30224 = new Integer(-542712742);
        Integer term30226 = new Integer(-1254072822);
        Integer term30239 = new Integer(-1111249833);
        Integer term30289 = new Integer(-1692331299);
        term30079 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term30142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30147 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30238 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term30079, term30079.getClass(), "id", term30080);
        setField(term30079, term30079.getClass(), "description", "UMMXkhuqzw");
        setField(term30079, term30079.getClass(), "name", "KyGXZcXJwq");
        setField(term30079, term30079.getClass(), "nameWithNamespace", "TqiCjeuoWE");
        setField(term30079, term30079.getClass(), "path", "GWWfkXOYLP");
        setField(term30079, term30079.getClass(), "pathWithNamespace", "qvykDllgpT");
        setIntField(term30143, term30143.getClass(), "year", 2018);
        setShortField(term30143, term30143.getClass(), "month", (short) 2);
        setShortField(term30143, term30143.getClass(), "day", (short) 14);
        setField(term30142, term30142.getClass(), "date", term30143);
        setByteField(term30147, term30147.getClass(), "hour", (byte) 2);
        setByteField(term30147, term30147.getClass(), "minute", (byte) 40);
        setByteField(term30147, term30147.getClass(), "second", (byte) 48);
        setIntField(term30147, term30147.getClass(), "nano", 371006728);
        setField(term30142, term30142.getClass(), "time", term30147);
        setField(term30079, term30079.getClass(), "createdAt", term30142);
        setField(term30079, term30079.getClass(), "defaultBranch", "hzdUbcLZhZ");
        setField(term30079, term30079.getClass(), "sshUrlToRepo", "GlxnEJvYeC");
        setField(term30079, term30079.getClass(), "httpUrlToRepo", "SLdOGaqmNv");
        setField(term30079, term30079.getClass(), "webUrl", "QZfhwDBzyR");
        setField(term30079, term30079.getClass(), "readmeUrl", "HvnMmAOZev");
        setField(term30079, term30079.getClass(), "avatarUrl", "JTPAQsfRtT");
        setField(term30079, term30079.getClass(), "forksCount", term30224);
        setField(term30079, term30079.getClass(), "starCount", term30226);
        setIntField(term30229, term30229.getClass(), "year", 2025);
        setShortField(term30229, term30229.getClass(), "month", (short) 8);
        setShortField(term30229, term30229.getClass(), "day", (short) 22);
        setField(term30228, term30228.getClass(), "date", term30229);
        setByteField(term30233, term30233.getClass(), "hour", (byte) 6);
        setByteField(term30233, term30233.getClass(), "minute", (byte) 48);
        setByteField(term30233, term30233.getClass(), "second", (byte) 49);
        setIntField(term30233, term30233.getClass(), "nano", 46400229);
        setField(term30228, term30228.getClass(), "time", term30233);
        setField(term30079, term30079.getClass(), "lastActivityAt", term30228);
        setField(term30238, term30238.getClass(), "id", term30239);
        setField(term30238, term30238.getClass(), "name", "otxkkKfDfl");
        setField(term30238, term30238.getClass(), "path", "bqIuFFFwnP");
        setField(term30238, term30238.getClass(), "kind", "hDxvvVgGlk");
        setField(term30238, term30238.getClass(), "fullPath", "XdjSvjaTqk");
        setField(term30238, term30238.getClass(), "parentId", term30289);
        setField(term30238, term30238.getClass(), "avatarUrl", "ukrlYVcvsg");
        setField(term30238, term30238.getClass(), "webUrl", "cpjqTCNflQ");
        setField(term30079, term30079.getClass(), "namespace", term30238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNamespace", argTypes, term30079, args);
    }

};


