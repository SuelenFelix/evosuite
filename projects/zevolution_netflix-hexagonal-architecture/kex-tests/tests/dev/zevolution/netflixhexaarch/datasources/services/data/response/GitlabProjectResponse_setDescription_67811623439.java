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

public class GitlabProjectResponse_setDescription_67811623439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31031;

    public GitlabProjectResponse_setDescription_67811623439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31031 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term31031, term31031.getClass(), "id", null);
        setField(term31031, term31031.getClass(), "description", null);
        setField(term31031, term31031.getClass(), "name", null);
        setField(term31031, term31031.getClass(), "nameWithNamespace", null);
        setField(term31031, term31031.getClass(), "path", null);
        setField(term31031, term31031.getClass(), "pathWithNamespace", null);
        setField(term31031, term31031.getClass(), "createdAt", null);
        setField(term31031, term31031.getClass(), "defaultBranch", null);
        setField(term31031, term31031.getClass(), "sshUrlToRepo", null);
        setField(term31031, term31031.getClass(), "httpUrlToRepo", null);
        setField(term31031, term31031.getClass(), "webUrl", null);
        setField(term31031, term31031.getClass(), "readmeUrl", null);
        setField(term31031, term31031.getClass(), "avatarUrl", null);
        setField(term31031, term31031.getClass(), "forksCount", null);
        setField(term31031, term31031.getClass(), "starCount", null);
        setField(term31031, term31031.getClass(), "lastActivityAt", null);
        setField(term31031, term31031.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term31031, args);
    }

};


