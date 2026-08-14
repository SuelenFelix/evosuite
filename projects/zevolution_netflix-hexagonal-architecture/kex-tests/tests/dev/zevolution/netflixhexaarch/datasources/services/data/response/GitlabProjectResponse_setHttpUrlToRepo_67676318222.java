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

public class GitlabProjectResponse_setHttpUrlToRepo_67676318222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29274;

    public GitlabProjectResponse_setHttpUrlToRepo_67676318222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29275 = new Integer(318591690);
        Integer term29419 = new Integer(-165587447);
        Integer term29421 = new Integer(-1347358701);
        Integer term29434 = new Integer(806595993);
        Integer term29484 = new Integer(548228925);
        term29274 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term29337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29342 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29428 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29433 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term29274, term29274.getClass(), "id", term29275);
        setField(term29274, term29274.getClass(), "description", "dUTYEKtTfQ");
        setField(term29274, term29274.getClass(), "name", "HUtbHklGel");
        setField(term29274, term29274.getClass(), "nameWithNamespace", "QbfKDAwhSB");
        setField(term29274, term29274.getClass(), "path", "ckTRHEIcCK");
        setField(term29274, term29274.getClass(), "pathWithNamespace", "NYSBqIpNlD");
        setIntField(term29338, term29338.getClass(), "year", 2013);
        setShortField(term29338, term29338.getClass(), "month", (short) 5);
        setShortField(term29338, term29338.getClass(), "day", (short) 26);
        setField(term29337, term29337.getClass(), "date", term29338);
        setByteField(term29342, term29342.getClass(), "hour", (byte) 4);
        setByteField(term29342, term29342.getClass(), "minute", (byte) 39);
        setByteField(term29342, term29342.getClass(), "second", (byte) 5);
        setIntField(term29342, term29342.getClass(), "nano", 392869354);
        setField(term29337, term29337.getClass(), "time", term29342);
        setField(term29274, term29274.getClass(), "createdAt", term29337);
        setField(term29274, term29274.getClass(), "defaultBranch", "OWglDUWQYb");
        setField(term29274, term29274.getClass(), "sshUrlToRepo", "FiqETbKjpv");
        setField(term29274, term29274.getClass(), "httpUrlToRepo", "FxXtdhhXyS");
        setField(term29274, term29274.getClass(), "webUrl", "HxCEzaCcgj");
        setField(term29274, term29274.getClass(), "readmeUrl", "PDYPOQncAB");
        setField(term29274, term29274.getClass(), "avatarUrl", "cHqLMqZSmc");
        setField(term29274, term29274.getClass(), "forksCount", term29419);
        setField(term29274, term29274.getClass(), "starCount", term29421);
        setIntField(term29424, term29424.getClass(), "year", 2012);
        setShortField(term29424, term29424.getClass(), "month", (short) 4);
        setShortField(term29424, term29424.getClass(), "day", (short) 25);
        setField(term29423, term29423.getClass(), "date", term29424);
        setByteField(term29428, term29428.getClass(), "hour", (byte) 21);
        setByteField(term29428, term29428.getClass(), "minute", (byte) 14);
        setByteField(term29428, term29428.getClass(), "second", (byte) 15);
        setIntField(term29428, term29428.getClass(), "nano", 561700934);
        setField(term29423, term29423.getClass(), "time", term29428);
        setField(term29274, term29274.getClass(), "lastActivityAt", term29423);
        setField(term29433, term29433.getClass(), "id", term29434);
        setField(term29433, term29433.getClass(), "name", "hkWmAkXSOW");
        setField(term29433, term29433.getClass(), "path", "DwQmZEKeOp");
        setField(term29433, term29433.getClass(), "kind", "DbxrFiyttv");
        setField(term29433, term29433.getClass(), "fullPath", "iVIrSxTsaM");
        setField(term29433, term29433.getClass(), "parentId", term29484);
        setField(term29433, term29433.getClass(), "avatarUrl", "FmJNEfmYgq");
        setField(term29433, term29433.getClass(), "webUrl", "NqQofgWsJd");
        setField(term29274, term29274.getClass(), "namespace", term29433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZlVRdHsBMO";
        callMethod(klass, "setHttpUrlToRepo", argTypes, term29274, args);
    }

};


