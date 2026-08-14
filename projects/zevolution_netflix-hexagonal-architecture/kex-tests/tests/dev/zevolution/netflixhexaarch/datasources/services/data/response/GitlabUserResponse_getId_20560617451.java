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

public class GitlabUserResponse_getId_20560617451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31062;

    public GitlabUserResponse_getId_20560617451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31063 = new Integer(252575029);
        term31062 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term31062, term31062.getClass(), "id", term31063);
        setField(term31062, term31062.getClass(), "username", "kSGsHNQQoW");
        setField(term31062, term31062.getClass(), "name", "MWezlyjdaG");
        setField(term31062, term31062.getClass(), "state", "drpBJuEKQG");
        setField(term31062, term31062.getClass(), "avatarUrl", "GGpORnLrOW");
        setField(term31062, term31062.getClass(), "webUrl", "gDGZwlpOZx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31062, args);
    }

};


