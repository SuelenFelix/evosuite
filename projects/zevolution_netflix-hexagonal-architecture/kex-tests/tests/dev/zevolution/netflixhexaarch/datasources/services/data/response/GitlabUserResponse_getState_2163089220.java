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

public class GitlabUserResponse_getState_2163089220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32536;

    public GitlabUserResponse_getState_2163089220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32536 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term32536, term32536.getClass(), "id", null);
        setField(term32536, term32536.getClass(), "username", null);
        setField(term32536, term32536.getClass(), "name", null);
        setField(term32536, term32536.getClass(), "state", null);
        setField(term32536, term32536.getClass(), "avatarUrl", null);
        setField(term32536, term32536.getClass(), "webUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term32536, args);
    }

};


