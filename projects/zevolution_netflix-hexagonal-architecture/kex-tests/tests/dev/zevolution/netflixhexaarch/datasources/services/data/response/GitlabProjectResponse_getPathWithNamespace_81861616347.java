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

public class GitlabProjectResponse_getPathWithNamespace_81861616347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35612;

    public GitlabProjectResponse_getPathWithNamespace_81861616347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35612 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term35612, term35612.getClass(), "id", null);
        setField(term35612, term35612.getClass(), "description", null);
        setField(term35612, term35612.getClass(), "name", null);
        setField(term35612, term35612.getClass(), "nameWithNamespace", null);
        setField(term35612, term35612.getClass(), "path", null);
        setField(term35612, term35612.getClass(), "pathWithNamespace", null);
        setField(term35612, term35612.getClass(), "createdAt", null);
        setField(term35612, term35612.getClass(), "defaultBranch", null);
        setField(term35612, term35612.getClass(), "sshUrlToRepo", null);
        setField(term35612, term35612.getClass(), "httpUrlToRepo", null);
        setField(term35612, term35612.getClass(), "webUrl", null);
        setField(term35612, term35612.getClass(), "readmeUrl", null);
        setField(term35612, term35612.getClass(), "avatarUrl", null);
        setField(term35612, term35612.getClass(), "forksCount", null);
        setField(term35612, term35612.getClass(), "starCount", null);
        setField(term35612, term35612.getClass(), "lastActivityAt", null);
        setField(term35612, term35612.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWithNamespace", argTypes, term35612, args);
    }

};


