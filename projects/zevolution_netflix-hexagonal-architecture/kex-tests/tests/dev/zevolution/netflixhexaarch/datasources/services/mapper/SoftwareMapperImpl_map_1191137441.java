package dev.zevolution.netflixhexaarch.datasources.services.mapper;

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
import static dev.zevolution.netflixhexaarch.datasources.services.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class SoftwareMapperImpl_map_1191137441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2471;
     Object term2472;
     Object term2708;

    public SoftwareMapperImpl_map_1191137441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2471 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapperImpl"));
        Integer term2473 = new Integer(-1530420153);
        Integer term2617 = new Integer(-469968304);
        Integer term2619 = new Integer(-1145578966);
        Integer term2632 = new Integer(679763016);
        Integer term2682 = new Integer(1962444399);
        term2472 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term2535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2631 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term2472, term2472.getClass(), "id", term2473);
        setField(term2472, term2472.getClass(), "description", "pORebkoRdD");
        setField(term2472, term2472.getClass(), "name", "mXGCWJDOqA");
        setField(term2472, term2472.getClass(), "nameWithNamespace", "dpNsDgfPso");
        setField(term2472, term2472.getClass(), "path", "hCWPJQKpdc");
        setField(term2472, term2472.getClass(), "pathWithNamespace", "WzMEhMXkKx");
        setIntField(term2536, term2536.getClass(), "year", 2012);
        setShortField(term2536, term2536.getClass(), "month", (short) 8);
        setShortField(term2536, term2536.getClass(), "day", (short) 25);
        setField(term2535, term2535.getClass(), "date", term2536);
        setByteField(term2540, term2540.getClass(), "hour", (byte) 5);
        setByteField(term2540, term2540.getClass(), "minute", (byte) 20);
        setByteField(term2540, term2540.getClass(), "second", (byte) 50);
        setIntField(term2540, term2540.getClass(), "nano", 345595912);
        setField(term2535, term2535.getClass(), "time", term2540);
        setField(term2472, term2472.getClass(), "createdAt", term2535);
        setField(term2472, term2472.getClass(), "defaultBranch", "XOiDvlDhdc");
        setField(term2472, term2472.getClass(), "sshUrlToRepo", "AdxvLJhNLe");
        setField(term2472, term2472.getClass(), "httpUrlToRepo", "lHfTrWKMPk");
        setField(term2472, term2472.getClass(), "webUrl", "JDaAnsVTGV");
        setField(term2472, term2472.getClass(), "readmeUrl", "mLUZFTfjle");
        setField(term2472, term2472.getClass(), "avatarUrl", "xIeFjkHkOe");
        setField(term2472, term2472.getClass(), "forksCount", term2617);
        setField(term2472, term2472.getClass(), "starCount", term2619);
        setIntField(term2622, term2622.getClass(), "year", 2021);
        setShortField(term2622, term2622.getClass(), "month", (short) 1);
        setShortField(term2622, term2622.getClass(), "day", (short) 18);
        setField(term2621, term2621.getClass(), "date", term2622);
        setByteField(term2626, term2626.getClass(), "hour", (byte) 13);
        setByteField(term2626, term2626.getClass(), "minute", (byte) 38);
        setByteField(term2626, term2626.getClass(), "second", (byte) 26);
        setIntField(term2626, term2626.getClass(), "nano", 544608644);
        setField(term2621, term2621.getClass(), "time", term2626);
        setField(term2472, term2472.getClass(), "lastActivityAt", term2621);
        setField(term2631, term2631.getClass(), "id", term2632);
        setField(term2631, term2631.getClass(), "name", "SdCKLMIYnX");
        setField(term2631, term2631.getClass(), "path", "OJJtVNPyKZ");
        setField(term2631, term2631.getClass(), "kind", "AKNapTAfmD");
        setField(term2631, term2631.getClass(), "fullPath", "xJgPlLxpgC");
        setField(term2631, term2631.getClass(), "parentId", term2682);
        setField(term2631, term2631.getClass(), "avatarUrl", "EYtfuJaxiM");
        setField(term2631, term2631.getClass(), "webUrl", "gCWtLVKVVe");
        setField(term2472, term2472.getClass(), "namespace", term2631);
        Integer term2709 = new Integer(767834723);
        term2708 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse"));
        setField(term2708, term2708.getClass(), "id", term2709);
        setField(term2708, term2708.getClass(), "username", "fWKJoSoCwE");
        setField(term2708, term2708.getClass(), "name", "wfaXBpWAUH");
        setField(term2708, term2708.getClass(), "state", "VMeAzAHwZj");
        setField(term2708, term2708.getClass(), "avatarUrl", "PznxWXsZME");
        setField(term2708, term2708.getClass(), "webUrl", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapperImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        argTypes[1] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse");
        Object[] args = new Object[2];
        args[0] = term2472;
        args[1] = term2708;
        callMethod(klass, "map", argTypes, term2471, args);
    }

};


