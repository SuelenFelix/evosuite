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

public class GitlabUserResponse_setName_14912188256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31651;

    public GitlabUserResponse_setName_14912188256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31652 = new Integer(1935707624);
        term31651 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term31651, term31651.getClass(), "id", term31652);
        setField(term31651, term31651.getClass(), "username", "WAljagiCzu");
        setField(term31651, term31651.getClass(), "name", "XKMXfDZajw");
        setField(term31651, term31651.getClass(), "state", "avZoBQSrBy");
        setField(term31651, term31651.getClass(), "avatarUrl", "KIXGeHXdwi");
        setField(term31651, term31651.getClass(), "webUrl", "tTfdvLMwEE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DiSkERzqOE";
        callMethod(klass, "setName", argTypes, term31651, args);
    }

};


