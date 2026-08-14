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

public class GitlabUserResponse_setAvatarUrl_96135044810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32147;

    public GitlabUserResponse_setAvatarUrl_96135044810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32148 = new Integer(-420030135);
        term32147 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term32147, term32147.getClass(), "id", term32148);
        setField(term32147, term32147.getClass(), "username", "cAObIvLmLo");
        setField(term32147, term32147.getClass(), "name", "xwiCqRSWSe");
        setField(term32147, term32147.getClass(), "state", "IbUFkzIgzq");
        setField(term32147, term32147.getClass(), "avatarUrl", "dTOUSTDdbw");
        setField(term32147, term32147.getClass(), "webUrl", "PECfBejlfo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SDbDgydVpg";
        callMethod(klass, "setAvatarUrl", argTypes, term32147, args);
    }

};


