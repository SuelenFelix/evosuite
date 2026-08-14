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

public class GitlabUserResponse_getUsername_140665151516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32532;

    public GitlabUserResponse_getUsername_140665151516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32532 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term32532, term32532.getClass(), "id", null);
        setField(term32532, term32532.getClass(), "username", null);
        setField(term32532, term32532.getClass(), "name", null);
        setField(term32532, term32532.getClass(), "state", null);
        setField(term32532, term32532.getClass(), "avatarUrl", null);
        setField(term32532, term32532.getClass(), "webUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term32532, args);
    }

};


