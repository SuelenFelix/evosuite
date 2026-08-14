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

public class GitlabUserResponse_setState_21391780598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31899;

    public GitlabUserResponse_setState_21391780598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31900 = new Integer(-282881827);
        term31899 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term31899, term31899.getClass(), "id", term31900);
        setField(term31899, term31899.getClass(), "username", "DDZHUPglvb");
        setField(term31899, term31899.getClass(), "name", "rWoaXvNyVg");
        setField(term31899, term31899.getClass(), "state", "FLzaBCFjGv");
        setField(term31899, term31899.getClass(), "avatarUrl", "OLYhTSqTqJ");
        setField(term31899, term31899.getClass(), "webUrl", "AIHoadcpQz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWMsLtuOEV";
        callMethod(klass, "setState", argTypes, term31899, args);
    }

};


