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

public class GitlabUserResponse_setUsername_4085165884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31403;

    public GitlabUserResponse_setUsername_4085165884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31404 = new Integer(842904495);
        term31403 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term31403, term31403.getClass(), "id", term31404);
        setField(term31403, term31403.getClass(), "username", "HOgkhttJZS");
        setField(term31403, term31403.getClass(), "name", "goqNSmXSSS");
        setField(term31403, term31403.getClass(), "state", "AkViBLdqXM");
        setField(term31403, term31403.getClass(), "avatarUrl", "UlxGFzEifL");
        setField(term31403, term31403.getClass(), "webUrl", "HilHTbDKDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IaEqlVwmNS";
        callMethod(klass, "setUsername", argTypes, term31403, args);
    }

};


