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

public class GitlabUserResponse_setWebUrl_197074432712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32395;

    public GitlabUserResponse_setWebUrl_197074432712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32396 = new Integer(-1497710478);
        term32395 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term32395, term32395.getClass(), "id", term32396);
        setField(term32395, term32395.getClass(), "username", "yXLTfzOgfX");
        setField(term32395, term32395.getClass(), "name", "MANlfBKTPY");
        setField(term32395, term32395.getClass(), "state", "mRoEmuCJhW");
        setField(term32395, term32395.getClass(), "avatarUrl", "JJUWbMXpyM");
        setField(term32395, term32395.getClass(), "webUrl", "KDrRQWVXok");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oOOwvWgxtf";
        callMethod(klass, "setWebUrl", argTypes, term32395, args);
    }

};


