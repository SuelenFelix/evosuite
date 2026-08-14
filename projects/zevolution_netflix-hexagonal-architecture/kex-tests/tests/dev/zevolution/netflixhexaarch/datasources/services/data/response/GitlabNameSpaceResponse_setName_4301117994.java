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

public class GitlabNameSpaceResponse_setName_4301117994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414;

    public GitlabNameSpaceResponse_setName_4301117994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term415 = new Integer(-2038273078);
        Integer term465 = new Integer(1227103734);
        term414 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term414, term414.getClass(), "id", term415);
        setField(term414, term414.getClass(), "name", "HyxfbSQYBe");
        setField(term414, term414.getClass(), "path", "pCTimMblYc");
        setField(term414, term414.getClass(), "kind", "hNxWaHcfhY");
        setField(term414, term414.getClass(), "fullPath", "RkybSrpybU");
        setField(term414, term414.getClass(), "parentId", term465);
        setField(term414, term414.getClass(), "avatarUrl", "xOEqzGAmDU");
        setField(term414, term414.getClass(), "webUrl", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setName", argTypes, term414, args);
    }

};


