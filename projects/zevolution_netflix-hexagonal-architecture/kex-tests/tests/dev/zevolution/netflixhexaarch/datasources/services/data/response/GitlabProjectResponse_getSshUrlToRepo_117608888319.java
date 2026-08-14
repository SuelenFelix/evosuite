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

public class GitlabProjectResponse_getSshUrlToRepo_117608888319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28034;

    public GitlabProjectResponse_getSshUrlToRepo_117608888319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28035 = new Integer(-1899301124);
        Integer term28179 = new Integer(-1882480155);
        Integer term28181 = new Integer(-1410220680);
        Integer term28194 = new Integer(389427431);
        Integer term28244 = new Integer(-1945706126);
        term28034 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term28097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28193 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term28034, term28034.getClass(), "id", term28035);
        setField(term28034, term28034.getClass(), "description", "ARnOWpgtAg");
        setField(term28034, term28034.getClass(), "name", "MRrYxZoJBW");
        setField(term28034, term28034.getClass(), "nameWithNamespace", "fheZXFNQZh");
        setField(term28034, term28034.getClass(), "path", "YxHVWlebna");
        setField(term28034, term28034.getClass(), "pathWithNamespace", "IEmAQCkrPE");
        setIntField(term28098, term28098.getClass(), "year", 2027);
        setShortField(term28098, term28098.getClass(), "month", (short) 11);
        setShortField(term28098, term28098.getClass(), "day", (short) 8);
        setField(term28097, term28097.getClass(), "date", term28098);
        setByteField(term28102, term28102.getClass(), "hour", (byte) 11);
        setByteField(term28102, term28102.getClass(), "minute", (byte) 59);
        setByteField(term28102, term28102.getClass(), "second", (byte) 14);
        setIntField(term28102, term28102.getClass(), "nano", 322375591);
        setField(term28097, term28097.getClass(), "time", term28102);
        setField(term28034, term28034.getClass(), "createdAt", term28097);
        setField(term28034, term28034.getClass(), "defaultBranch", "lqFGhtlNRM");
        setField(term28034, term28034.getClass(), "sshUrlToRepo", "GLxLHUsuLw");
        setField(term28034, term28034.getClass(), "httpUrlToRepo", "HuKdqrrxIm");
        setField(term28034, term28034.getClass(), "webUrl", "yJKKddLqMb");
        setField(term28034, term28034.getClass(), "readmeUrl", "LWEYaXeKBe");
        setField(term28034, term28034.getClass(), "avatarUrl", "cNoFvpHBHw");
        setField(term28034, term28034.getClass(), "forksCount", term28179);
        setField(term28034, term28034.getClass(), "starCount", term28181);
        setIntField(term28184, term28184.getClass(), "year", 2020);
        setShortField(term28184, term28184.getClass(), "month", (short) 8);
        setShortField(term28184, term28184.getClass(), "day", (short) 15);
        setField(term28183, term28183.getClass(), "date", term28184);
        setByteField(term28188, term28188.getClass(), "hour", (byte) 2);
        setByteField(term28188, term28188.getClass(), "minute", (byte) 0);
        setByteField(term28188, term28188.getClass(), "second", (byte) 38);
        setIntField(term28188, term28188.getClass(), "nano", 146431486);
        setField(term28183, term28183.getClass(), "time", term28188);
        setField(term28034, term28034.getClass(), "lastActivityAt", term28183);
        setField(term28193, term28193.getClass(), "id", term28194);
        setField(term28193, term28193.getClass(), "name", "DoSWbCtsBg");
        setField(term28193, term28193.getClass(), "path", "NrXtkbXwDc");
        setField(term28193, term28193.getClass(), "kind", "EUapSrAmOe");
        setField(term28193, term28193.getClass(), "fullPath", "dUHylIprea");
        setField(term28193, term28193.getClass(), "parentId", term28244);
        setField(term28193, term28193.getClass(), "avatarUrl", "FKDqHRpMcc");
        setField(term28193, term28193.getClass(), "webUrl", "mIRMQIxHUD");
        setField(term28034, term28034.getClass(), "namespace", term28193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSshUrlToRepo", argTypes, term28034, args);
    }

};


