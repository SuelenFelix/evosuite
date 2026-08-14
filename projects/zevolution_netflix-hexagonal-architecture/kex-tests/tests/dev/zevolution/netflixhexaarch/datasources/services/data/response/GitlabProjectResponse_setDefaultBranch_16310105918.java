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
import java.lang.Object;

public class GitlabProjectResponse_setDefaultBranch_16310105918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27606;

    public GitlabProjectResponse_setDefaultBranch_16310105918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27607 = new Integer(729658803);
        Integer term27751 = new Integer(114754804);
        Integer term27753 = new Integer(1687361082);
        Integer term27766 = new Integer(584893196);
        Integer term27816 = new Integer(497269071);
        term27606 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term27669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27760 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27765 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term27606, term27606.getClass(), "id", term27607);
        setField(term27606, term27606.getClass(), "description", "LnNRVsjmxw");
        setField(term27606, term27606.getClass(), "name", "PlOnDkNrvX");
        setField(term27606, term27606.getClass(), "nameWithNamespace", "MltgFGldop");
        setField(term27606, term27606.getClass(), "path", "JCWSoxnBJs");
        setField(term27606, term27606.getClass(), "pathWithNamespace", "vAxcpvjEEa");
        setIntField(term27670, term27670.getClass(), "year", 2018);
        setShortField(term27670, term27670.getClass(), "month", (short) 7);
        setShortField(term27670, term27670.getClass(), "day", (short) 12);
        setField(term27669, term27669.getClass(), "date", term27670);
        setByteField(term27674, term27674.getClass(), "hour", (byte) 1);
        setByteField(term27674, term27674.getClass(), "minute", (byte) 3);
        setByteField(term27674, term27674.getClass(), "second", (byte) 47);
        setIntField(term27674, term27674.getClass(), "nano", 2729929);
        setField(term27669, term27669.getClass(), "time", term27674);
        setField(term27606, term27606.getClass(), "createdAt", term27669);
        setField(term27606, term27606.getClass(), "defaultBranch", "FCkOgIBqXE");
        setField(term27606, term27606.getClass(), "sshUrlToRepo", "kadRHthQRD");
        setField(term27606, term27606.getClass(), "httpUrlToRepo", "cGbJSRSpNn");
        setField(term27606, term27606.getClass(), "webUrl", "MzXzaqaiHW");
        setField(term27606, term27606.getClass(), "readmeUrl", "jWOWtrhVkA");
        setField(term27606, term27606.getClass(), "avatarUrl", "IyOhWYyaDV");
        setField(term27606, term27606.getClass(), "forksCount", term27751);
        setField(term27606, term27606.getClass(), "starCount", term27753);
        setIntField(term27756, term27756.getClass(), "year", 2015);
        setShortField(term27756, term27756.getClass(), "month", (short) 12);
        setShortField(term27756, term27756.getClass(), "day", (short) 23);
        setField(term27755, term27755.getClass(), "date", term27756);
        setByteField(term27760, term27760.getClass(), "hour", (byte) 14);
        setByteField(term27760, term27760.getClass(), "minute", (byte) 17);
        setByteField(term27760, term27760.getClass(), "second", (byte) 50);
        setIntField(term27760, term27760.getClass(), "nano", 325544804);
        setField(term27755, term27755.getClass(), "time", term27760);
        setField(term27606, term27606.getClass(), "lastActivityAt", term27755);
        setField(term27765, term27765.getClass(), "id", term27766);
        setField(term27765, term27765.getClass(), "name", "omWrkCSFzy");
        setField(term27765, term27765.getClass(), "path", "VFYvUTgYFB");
        setField(term27765, term27765.getClass(), "kind", "BrWqhEIUUj");
        setField(term27765, term27765.getClass(), "fullPath", "WfUmxdiHcU");
        setField(term27765, term27765.getClass(), "parentId", term27816);
        setField(term27765, term27765.getClass(), "avatarUrl", "BRrftvRvmF");
        setField(term27765, term27765.getClass(), "webUrl", "fvoyRbZTsm");
        setField(term27606, term27606.getClass(), "namespace", term27765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iOCnOQXWTl";
        callMethod(klass, "setDefaultBranch", argTypes, term27606, args);
    }

};


