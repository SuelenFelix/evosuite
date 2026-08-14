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

public class GitlabProjectResponse_getLastActivityAt_15567407731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29257;

    public GitlabProjectResponse_getLastActivityAt_15567407731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29258 = new Integer(-1618206977);
        Integer term29402 = new Integer(-1747406163);
        Integer term29404 = new Integer(388157121);
        Integer term29417 = new Integer(1684998508);
        Integer term29467 = new Integer(-1476644457);
        term29257 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term29320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29416 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term29257, term29257.getClass(), "id", term29258);
        setField(term29257, term29257.getClass(), "description", "sofyLEfomV");
        setField(term29257, term29257.getClass(), "name", "zHcDSJHKAb");
        setField(term29257, term29257.getClass(), "nameWithNamespace", "WRIQkTdeMl");
        setField(term29257, term29257.getClass(), "path", "rLSEheWsHd");
        setField(term29257, term29257.getClass(), "pathWithNamespace", "DoUKDhlGCY");
        setIntField(term29321, term29321.getClass(), "year", 2029);
        setShortField(term29321, term29321.getClass(), "month", (short) 1);
        setShortField(term29321, term29321.getClass(), "day", (short) 10);
        setField(term29320, term29320.getClass(), "date", term29321);
        setByteField(term29325, term29325.getClass(), "hour", (byte) 8);
        setByteField(term29325, term29325.getClass(), "minute", (byte) 46);
        setByteField(term29325, term29325.getClass(), "second", (byte) 35);
        setIntField(term29325, term29325.getClass(), "nano", 58807194);
        setField(term29320, term29320.getClass(), "time", term29325);
        setField(term29257, term29257.getClass(), "createdAt", term29320);
        setField(term29257, term29257.getClass(), "defaultBranch", "IeoToWsQWU");
        setField(term29257, term29257.getClass(), "sshUrlToRepo", "QxiiHtQAzN");
        setField(term29257, term29257.getClass(), "httpUrlToRepo", "gQgTBlRIvX");
        setField(term29257, term29257.getClass(), "webUrl", "ulKaKnANzj");
        setField(term29257, term29257.getClass(), "readmeUrl", "ABwhdjjeJi");
        setField(term29257, term29257.getClass(), "avatarUrl", "KKEcpYXNZV");
        setField(term29257, term29257.getClass(), "forksCount", term29402);
        setField(term29257, term29257.getClass(), "starCount", term29404);
        setIntField(term29407, term29407.getClass(), "year", 2016);
        setShortField(term29407, term29407.getClass(), "month", (short) 10);
        setShortField(term29407, term29407.getClass(), "day", (short) 20);
        setField(term29406, term29406.getClass(), "date", term29407);
        setByteField(term29411, term29411.getClass(), "hour", (byte) 18);
        setByteField(term29411, term29411.getClass(), "minute", (byte) 39);
        setByteField(term29411, term29411.getClass(), "second", (byte) 1);
        setIntField(term29411, term29411.getClass(), "nano", 196253988);
        setField(term29406, term29406.getClass(), "time", term29411);
        setField(term29257, term29257.getClass(), "lastActivityAt", term29406);
        setField(term29416, term29416.getClass(), "id", term29417);
        setField(term29416, term29416.getClass(), "name", "shLHFznysy");
        setField(term29416, term29416.getClass(), "path", "YCKIloBHLj");
        setField(term29416, term29416.getClass(), "kind", "qUWDhAeFJY");
        setField(term29416, term29416.getClass(), "fullPath", "wboNBMhRjP");
        setField(term29416, term29416.getClass(), "parentId", term29467);
        setField(term29416, term29416.getClass(), "avatarUrl", "HZODpafOGe");
        setField(term29416, term29416.getClass(), "webUrl", "dUTYEKtTfQ");
        setField(term29257, term29257.getClass(), "namespace", term29416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastActivityAt", argTypes, term29257, args);
    }

};


