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

public class GitlabProjectResponse_setDescription_6781162344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18039;

    public GitlabProjectResponse_setDescription_6781162344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18040 = new Integer(1442160736);
        Integer term18184 = new Integer(1114000454);
        Integer term18186 = new Integer(-556405712);
        Integer term18199 = new Integer(-1772434990);
        Integer term18249 = new Integer(-1845499264);
        term18039 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term18102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18198 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term18039, term18039.getClass(), "id", term18040);
        setField(term18039, term18039.getClass(), "description", "mrSAYJlddZ");
        setField(term18039, term18039.getClass(), "name", "KbwxawvYsw");
        setField(term18039, term18039.getClass(), "nameWithNamespace", "gvjdfHNzOa");
        setField(term18039, term18039.getClass(), "path", "HqitWglYWX");
        setField(term18039, term18039.getClass(), "pathWithNamespace", "pOuFRlHmbK");
        setIntField(term18103, term18103.getClass(), "year", 2025);
        setShortField(term18103, term18103.getClass(), "month", (short) 4);
        setShortField(term18103, term18103.getClass(), "day", (short) 24);
        setField(term18102, term18102.getClass(), "date", term18103);
        setByteField(term18107, term18107.getClass(), "hour", (byte) 18);
        setByteField(term18107, term18107.getClass(), "minute", (byte) 11);
        setByteField(term18107, term18107.getClass(), "second", (byte) 40);
        setIntField(term18107, term18107.getClass(), "nano", 137454929);
        setField(term18102, term18102.getClass(), "time", term18107);
        setField(term18039, term18039.getClass(), "createdAt", term18102);
        setField(term18039, term18039.getClass(), "defaultBranch", "WrzdBkinqV");
        setField(term18039, term18039.getClass(), "sshUrlToRepo", "vydWXHfFTw");
        setField(term18039, term18039.getClass(), "httpUrlToRepo", "DRhkpDneCC");
        setField(term18039, term18039.getClass(), "webUrl", "vuIJRrypuA");
        setField(term18039, term18039.getClass(), "readmeUrl", "AxfSZmaiyA");
        setField(term18039, term18039.getClass(), "avatarUrl", "lBpveIKbea");
        setField(term18039, term18039.getClass(), "forksCount", term18184);
        setField(term18039, term18039.getClass(), "starCount", term18186);
        setIntField(term18189, term18189.getClass(), "year", 2024);
        setShortField(term18189, term18189.getClass(), "month", (short) 1);
        setShortField(term18189, term18189.getClass(), "day", (short) 24);
        setField(term18188, term18188.getClass(), "date", term18189);
        setByteField(term18193, term18193.getClass(), "hour", (byte) 20);
        setByteField(term18193, term18193.getClass(), "minute", (byte) 28);
        setByteField(term18193, term18193.getClass(), "second", (byte) 39);
        setIntField(term18193, term18193.getClass(), "nano", 952728177);
        setField(term18188, term18188.getClass(), "time", term18193);
        setField(term18039, term18039.getClass(), "lastActivityAt", term18188);
        setField(term18198, term18198.getClass(), "id", term18199);
        setField(term18198, term18198.getClass(), "name", "uyLBVQYcOV");
        setField(term18198, term18198.getClass(), "path", "PoTZjDuBHa");
        setField(term18198, term18198.getClass(), "kind", "MIwvgVrhzP");
        setField(term18198, term18198.getClass(), "fullPath", "HcUUieXdep");
        setField(term18198, term18198.getClass(), "parentId", term18249);
        setField(term18198, term18198.getClass(), "avatarUrl", "AbonCTtbef");
        setField(term18198, term18198.getClass(), "webUrl", "maXrGOGoKA");
        setField(term18039, term18039.getClass(), "namespace", term18198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zAkgWQVCpM";
        callMethod(klass, "setDescription", argTypes, term18039, args);
    }

};


