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

public class GitlabUserResponse_getAvatarUrl_5863820419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32034;

    public GitlabUserResponse_getAvatarUrl_5863820419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32035 = new Integer(-1183353915);
        term32034 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term32034, term32034.getClass(), "id", term32035);
        setField(term32034, term32034.getClass(), "username", "fvgZQBalnd");
        setField(term32034, term32034.getClass(), "name", "tViQSKUCLE");
        setField(term32034, term32034.getClass(), "state", "QbaeHheqiP");
        setField(term32034, term32034.getClass(), "avatarUrl", "gASHxChKwn");
        setField(term32034, term32034.getClass(), "webUrl", "iasolXlEEn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term32034, args);
    }

};


