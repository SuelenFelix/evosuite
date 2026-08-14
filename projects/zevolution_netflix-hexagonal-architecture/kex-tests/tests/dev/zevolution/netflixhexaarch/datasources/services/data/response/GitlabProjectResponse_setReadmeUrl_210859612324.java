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

public class GitlabProjectResponse_setReadmeUrl_210859612324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26367;

    public GitlabProjectResponse_setReadmeUrl_210859612324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26368 = new Integer(-1896376975);
        Integer term26512 = new Integer(729658803);
        Integer term26514 = new Integer(114754804);
        Integer term26527 = new Integer(1687361082);
        Integer term26577 = new Integer(584893196);
        term26367 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term26430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26517 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26521 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26526 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term26367, term26367.getClass(), "id", term26368);
        setField(term26367, term26367.getClass(), "description", "JKdZuLFRwC");
        setField(term26367, term26367.getClass(), "name", "hfhLLoWnRU");
        setField(term26367, term26367.getClass(), "nameWithNamespace", "RpofnOPYha");
        setField(term26367, term26367.getClass(), "path", "CQYmAsjvPU");
        setField(term26367, term26367.getClass(), "pathWithNamespace", "NNkIIFpxiB");
        setIntField(term26431, term26431.getClass(), "year", 2013);
        setShortField(term26431, term26431.getClass(), "month", (short) 5);
        setShortField(term26431, term26431.getClass(), "day", (short) 26);
        setField(term26430, term26430.getClass(), "date", term26431);
        setByteField(term26435, term26435.getClass(), "hour", (byte) 4);
        setByteField(term26435, term26435.getClass(), "minute", (byte) 39);
        setByteField(term26435, term26435.getClass(), "second", (byte) 5);
        setIntField(term26435, term26435.getClass(), "nano", 392869354);
        setField(term26430, term26430.getClass(), "time", term26435);
        setField(term26367, term26367.getClass(), "createdAt", term26430);
        setField(term26367, term26367.getClass(), "defaultBranch", "sBmtvFPDso");
        setField(term26367, term26367.getClass(), "sshUrlToRepo", "qsUIxrLolr");
        setField(term26367, term26367.getClass(), "httpUrlToRepo", "IlQxArYcgB");
        setField(term26367, term26367.getClass(), "webUrl", "lIgKCvCuoH");
        setField(term26367, term26367.getClass(), "readmeUrl", "dHuWgRwLOm");
        setField(term26367, term26367.getClass(), "avatarUrl", "PsTQDxNIld");
        setField(term26367, term26367.getClass(), "forksCount", term26512);
        setField(term26367, term26367.getClass(), "starCount", term26514);
        setIntField(term26517, term26517.getClass(), "year", 2012);
        setShortField(term26517, term26517.getClass(), "month", (short) 4);
        setShortField(term26517, term26517.getClass(), "day", (short) 25);
        setField(term26516, term26516.getClass(), "date", term26517);
        setByteField(term26521, term26521.getClass(), "hour", (byte) 21);
        setByteField(term26521, term26521.getClass(), "minute", (byte) 14);
        setByteField(term26521, term26521.getClass(), "second", (byte) 15);
        setIntField(term26521, term26521.getClass(), "nano", 561700934);
        setField(term26516, term26516.getClass(), "time", term26521);
        setField(term26367, term26367.getClass(), "lastActivityAt", term26516);
        setField(term26526, term26526.getClass(), "id", term26527);
        setField(term26526, term26526.getClass(), "name", "uoBijJjvaj");
        setField(term26526, term26526.getClass(), "path", "BdsLFSRWda");
        setField(term26526, term26526.getClass(), "kind", "tMhhBYonAI");
        setField(term26526, term26526.getClass(), "fullPath", "AaQRshwIQC");
        setField(term26526, term26526.getClass(), "parentId", term26577);
        setField(term26526, term26526.getClass(), "avatarUrl", "rHgKCfgCsg");
        setField(term26526, term26526.getClass(), "webUrl", "AWtIUOuutt");
        setField(term26367, term26367.getClass(), "namespace", term26526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jBgJZpHifl";
        callMethod(klass, "setReadmeUrl", argTypes, term26367, args);
    }

};


