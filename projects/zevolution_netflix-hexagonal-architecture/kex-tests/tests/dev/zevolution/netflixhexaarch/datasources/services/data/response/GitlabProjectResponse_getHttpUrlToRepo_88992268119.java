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

public class GitlabProjectResponse_getHttpUrlToRepo_88992268119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24293;

    public GitlabProjectResponse_getHttpUrlToRepo_88992268119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24294 = new Integer(1398204340);
        Integer term24438 = new Integer(229204365);
        Integer term24440 = new Integer(-461771056);
        Integer term24453 = new Integer(-243422082);
        Integer term24503 = new Integer(1384592638);
        term24293 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term24356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24452 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term24293, term24293.getClass(), "id", term24294);
        setField(term24293, term24293.getClass(), "description", "zHiuLPzYQM");
        setField(term24293, term24293.getClass(), "name", "ioYxUYJBrh");
        setField(term24293, term24293.getClass(), "nameWithNamespace", "GXoLEdKEIe");
        setField(term24293, term24293.getClass(), "path", "EugWXkztim");
        setField(term24293, term24293.getClass(), "pathWithNamespace", "DvRdOzzihn");
        setIntField(term24357, term24357.getClass(), "year", 2010);
        setShortField(term24357, term24357.getClass(), "month", (short) 9);
        setShortField(term24357, term24357.getClass(), "day", (short) 28);
        setField(term24356, term24356.getClass(), "date", term24357);
        setByteField(term24361, term24361.getClass(), "hour", (byte) 6);
        setByteField(term24361, term24361.getClass(), "minute", (byte) 4);
        setByteField(term24361, term24361.getClass(), "second", (byte) 54);
        setIntField(term24361, term24361.getClass(), "nano", 604713782);
        setField(term24356, term24356.getClass(), "time", term24361);
        setField(term24293, term24293.getClass(), "createdAt", term24356);
        setField(term24293, term24293.getClass(), "defaultBranch", "wIygCdQAKO");
        setField(term24293, term24293.getClass(), "sshUrlToRepo", "JsXroBYqwr");
        setField(term24293, term24293.getClass(), "httpUrlToRepo", "YciMAObLwl");
        setField(term24293, term24293.getClass(), "webUrl", "qAmVqwwdyf");
        setField(term24293, term24293.getClass(), "readmeUrl", "IXPaHQnEUy");
        setField(term24293, term24293.getClass(), "avatarUrl", "zhcWVVrrjs");
        setField(term24293, term24293.getClass(), "forksCount", term24438);
        setField(term24293, term24293.getClass(), "starCount", term24440);
        setIntField(term24443, term24443.getClass(), "year", 2023);
        setShortField(term24443, term24443.getClass(), "month", (short) 7);
        setShortField(term24443, term24443.getClass(), "day", (short) 16);
        setField(term24442, term24442.getClass(), "date", term24443);
        setByteField(term24447, term24447.getClass(), "hour", (byte) 3);
        setByteField(term24447, term24447.getClass(), "minute", (byte) 1);
        setByteField(term24447, term24447.getClass(), "second", (byte) 19);
        setIntField(term24447, term24447.getClass(), "nano", 488629554);
        setField(term24442, term24442.getClass(), "time", term24447);
        setField(term24293, term24293.getClass(), "lastActivityAt", term24442);
        setField(term24452, term24452.getClass(), "id", term24453);
        setField(term24452, term24452.getClass(), "name", "EAMaFLdmaG");
        setField(term24452, term24452.getClass(), "path", "DYZSJMwbhX");
        setField(term24452, term24452.getClass(), "kind", "QGcshsIIWo");
        setField(term24452, term24452.getClass(), "fullPath", "dPHtrzKWgf");
        setField(term24452, term24452.getClass(), "parentId", term24503);
        setField(term24452, term24452.getClass(), "avatarUrl", "olmFxfIVeh");
        setField(term24452, term24452.getClass(), "webUrl", "iSPirUEhXs");
        setField(term24293, term24293.getClass(), "namespace", term24452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpUrlToRepo", argTypes, term24293, args);
    }

};


