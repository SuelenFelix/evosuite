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

public class GitlabProjectResponse_getNameWithNamespace_11390381477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19301;

    public GitlabProjectResponse_getNameWithNamespace_11390381477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19302 = new Integer(683666002);
        Integer term19446 = new Integer(1596213415);
        Integer term19448 = new Integer(-268815336);
        Integer term19461 = new Integer(-1210583429);
        Integer term19511 = new Integer(-663691365);
        term19301 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term19364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19455 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19460 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term19301, term19301.getClass(), "id", term19302);
        setField(term19301, term19301.getClass(), "description", "vYYOYhWMWZ");
        setField(term19301, term19301.getClass(), "name", "FLQJOzEXff");
        setField(term19301, term19301.getClass(), "nameWithNamespace", "qlaIVJBSfQ");
        setField(term19301, term19301.getClass(), "path", "lYvIWBFFsq");
        setField(term19301, term19301.getClass(), "pathWithNamespace", "tThwsqWKcE");
        setIntField(term19365, term19365.getClass(), "year", 2012);
        setShortField(term19365, term19365.getClass(), "month", (short) 9);
        setShortField(term19365, term19365.getClass(), "day", (short) 11);
        setField(term19364, term19364.getClass(), "date", term19365);
        setByteField(term19369, term19369.getClass(), "hour", (byte) 22);
        setByteField(term19369, term19369.getClass(), "minute", (byte) 10);
        setByteField(term19369, term19369.getClass(), "second", (byte) 8);
        setIntField(term19369, term19369.getClass(), "nano", 380008862);
        setField(term19364, term19364.getClass(), "time", term19369);
        setField(term19301, term19301.getClass(), "createdAt", term19364);
        setField(term19301, term19301.getClass(), "defaultBranch", "bkSgsDrkCN");
        setField(term19301, term19301.getClass(), "sshUrlToRepo", "hwjlcimgJH");
        setField(term19301, term19301.getClass(), "httpUrlToRepo", "TLxQzxvizR");
        setField(term19301, term19301.getClass(), "webUrl", "uUgJfKAzDM");
        setField(term19301, term19301.getClass(), "readmeUrl", "gZPZNkweEp");
        setField(term19301, term19301.getClass(), "avatarUrl", "vfennwtmqe");
        setField(term19301, term19301.getClass(), "forksCount", term19446);
        setField(term19301, term19301.getClass(), "starCount", term19448);
        setIntField(term19451, term19451.getClass(), "year", 2021);
        setShortField(term19451, term19451.getClass(), "month", (short) 9);
        setShortField(term19451, term19451.getClass(), "day", (short) 7);
        setField(term19450, term19450.getClass(), "date", term19451);
        setByteField(term19455, term19455.getClass(), "hour", (byte) 5);
        setByteField(term19455, term19455.getClass(), "minute", (byte) 25);
        setByteField(term19455, term19455.getClass(), "second", (byte) 7);
        setIntField(term19455, term19455.getClass(), "nano", 755924076);
        setField(term19450, term19450.getClass(), "time", term19455);
        setField(term19301, term19301.getClass(), "lastActivityAt", term19450);
        setField(term19460, term19460.getClass(), "id", term19461);
        setField(term19460, term19460.getClass(), "name", "zZxoNkohbw");
        setField(term19460, term19460.getClass(), "path", "DQrjPcLysX");
        setField(term19460, term19460.getClass(), "kind", "VWPFyrpmmb");
        setField(term19460, term19460.getClass(), "fullPath", "gYYKrIeThw");
        setField(term19460, term19460.getClass(), "parentId", term19511);
        setField(term19460, term19460.getClass(), "avatarUrl", "UsxeLMVkAK");
        setField(term19460, term19460.getClass(), "webUrl", "ITrhiKKzcb");
        setField(term19301, term19301.getClass(), "namespace", term19460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameWithNamespace", argTypes, term19301, args);
    }

};


