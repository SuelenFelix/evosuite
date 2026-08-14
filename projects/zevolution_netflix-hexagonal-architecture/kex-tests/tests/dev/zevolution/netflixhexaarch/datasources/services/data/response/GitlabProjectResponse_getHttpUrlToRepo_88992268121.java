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

public class GitlabProjectResponse_getHttpUrlToRepo_88992268121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28868;

    public GitlabProjectResponse_getHttpUrlToRepo_88992268121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28869 = new Integer(-1222614956);
        Integer term29013 = new Integer(-1870495012);
        Integer term29015 = new Integer(-1310015129);
        Integer term29028 = new Integer(-2104981311);
        Integer term29078 = new Integer(-571169753);
        term28868 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term28931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29027 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term28868, term28868.getClass(), "id", term28869);
        setField(term28868, term28868.getClass(), "description", "jlyFvaZlmv");
        setField(term28868, term28868.getClass(), "name", "sofyLEfomV");
        setField(term28868, term28868.getClass(), "nameWithNamespace", "zHcDSJHKAb");
        setField(term28868, term28868.getClass(), "path", "WRIQkTdeMl");
        setField(term28868, term28868.getClass(), "pathWithNamespace", "rLSEheWsHd");
        setIntField(term28932, term28932.getClass(), "year", 2017);
        setShortField(term28932, term28932.getClass(), "month", (short) 4);
        setShortField(term28932, term28932.getClass(), "day", (short) 3);
        setField(term28931, term28931.getClass(), "date", term28932);
        setByteField(term28936, term28936.getClass(), "hour", (byte) 6);
        setByteField(term28936, term28936.getClass(), "minute", (byte) 51);
        setByteField(term28936, term28936.getClass(), "second", (byte) 10);
        setIntField(term28936, term28936.getClass(), "nano", 316377166);
        setField(term28931, term28931.getClass(), "time", term28936);
        setField(term28868, term28868.getClass(), "createdAt", term28931);
        setField(term28868, term28868.getClass(), "defaultBranch", "DoUKDhlGCY");
        setField(term28868, term28868.getClass(), "sshUrlToRepo", "IeoToWsQWU");
        setField(term28868, term28868.getClass(), "httpUrlToRepo", "QxiiHtQAzN");
        setField(term28868, term28868.getClass(), "webUrl", "gQgTBlRIvX");
        setField(term28868, term28868.getClass(), "readmeUrl", "ulKaKnANzj");
        setField(term28868, term28868.getClass(), "avatarUrl", "ABwhdjjeJi");
        setField(term28868, term28868.getClass(), "forksCount", term29013);
        setField(term28868, term28868.getClass(), "starCount", term29015);
        setIntField(term29018, term29018.getClass(), "year", 2027);
        setShortField(term29018, term29018.getClass(), "month", (short) 8);
        setShortField(term29018, term29018.getClass(), "day", (short) 23);
        setField(term29017, term29017.getClass(), "date", term29018);
        setByteField(term29022, term29022.getClass(), "hour", (byte) 15);
        setByteField(term29022, term29022.getClass(), "minute", (byte) 12);
        setByteField(term29022, term29022.getClass(), "second", (byte) 6);
        setIntField(term29022, term29022.getClass(), "nano", 541218258);
        setField(term29017, term29017.getClass(), "time", term29022);
        setField(term28868, term28868.getClass(), "lastActivityAt", term29017);
        setField(term29027, term29027.getClass(), "id", term29028);
        setField(term29027, term29027.getClass(), "name", "KKEcpYXNZV");
        setField(term29027, term29027.getClass(), "path", "shLHFznysy");
        setField(term29027, term29027.getClass(), "kind", "YCKIloBHLj");
        setField(term29027, term29027.getClass(), "fullPath", "qUWDhAeFJY");
        setField(term29027, term29027.getClass(), "parentId", term29078);
        setField(term29027, term29027.getClass(), "avatarUrl", "wboNBMhRjP");
        setField(term29027, term29027.getClass(), "webUrl", "HZODpafOGe");
        setField(term28868, term28868.getClass(), "namespace", term29027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpUrlToRepo", argTypes, term28868, args);
    }

};


