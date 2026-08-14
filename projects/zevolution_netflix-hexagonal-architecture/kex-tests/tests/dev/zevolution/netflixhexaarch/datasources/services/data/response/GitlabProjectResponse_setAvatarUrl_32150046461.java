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

public class GitlabProjectResponse_setAvatarUrl_32150046461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31053;

    public GitlabProjectResponse_setAvatarUrl_32150046461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31053 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term31053, term31053.getClass(), "id", null);
        setField(term31053, term31053.getClass(), "description", null);
        setField(term31053, term31053.getClass(), "name", null);
        setField(term31053, term31053.getClass(), "nameWithNamespace", null);
        setField(term31053, term31053.getClass(), "path", null);
        setField(term31053, term31053.getClass(), "pathWithNamespace", null);
        setField(term31053, term31053.getClass(), "createdAt", null);
        setField(term31053, term31053.getClass(), "defaultBranch", null);
        setField(term31053, term31053.getClass(), "sshUrlToRepo", null);
        setField(term31053, term31053.getClass(), "httpUrlToRepo", null);
        setField(term31053, term31053.getClass(), "webUrl", null);
        setField(term31053, term31053.getClass(), "readmeUrl", null);
        setField(term31053, term31053.getClass(), "avatarUrl", null);
        setField(term31053, term31053.getClass(), "forksCount", null);
        setField(term31053, term31053.getClass(), "starCount", null);
        setField(term31053, term31053.getClass(), "lastActivityAt", null);
        setField(term31053, term31053.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAvatarUrl", argTypes, term31053, args);
    }

};


