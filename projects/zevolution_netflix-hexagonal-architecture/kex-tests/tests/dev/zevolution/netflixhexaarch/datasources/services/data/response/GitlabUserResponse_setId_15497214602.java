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

public class GitlabUserResponse_setId_15497214602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31175;
     Object term31238;

    public GitlabUserResponse_setId_15497214602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31176 = new Integer(57189932);
        term31175 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term31175, term31175.getClass(), "id", term31176);
        setField(term31175, term31175.getClass(), "username", "gkDpxkHPDg");
        setField(term31175, term31175.getClass(), "name", "pADwkrWiMW");
        setField(term31175, term31175.getClass(), "state", "FDORDJuAXQ");
        setField(term31175, term31175.getClass(), "avatarUrl", "yjqoDeLBLg");
        setField(term31175, term31175.getClass(), "webUrl", "DCepDqVwas");
        term31238 = new Integer(1460722225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term31238;
        callMethod(klass, "setId", argTypes, term31175, args);
    }

};


