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

public class GitlabProjectResponse_setPath_210642876510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20541;

    public GitlabProjectResponse_setPath_210642876510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20542 = new Integer(-1963434938);
        Integer term20686 = new Integer(906181092);
        Integer term20688 = new Integer(1045657203);
        Integer term20701 = new Integer(1386130016);
        Integer term20751 = new Integer(1072005683);
        term20541 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term20604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20609 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20700 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term20541, term20541.getClass(), "id", term20542);
        setField(term20541, term20541.getClass(), "description", "eKcEJRxNSu");
        setField(term20541, term20541.getClass(), "name", "NTXQPWFYSA");
        setField(term20541, term20541.getClass(), "nameWithNamespace", "fOuOhBpldm");
        setField(term20541, term20541.getClass(), "path", "qQQRKGPyIM");
        setField(term20541, term20541.getClass(), "pathWithNamespace", "lzcwhvjdFg");
        setIntField(term20605, term20605.getClass(), "year", 2017);
        setShortField(term20605, term20605.getClass(), "month", (short) 3);
        setShortField(term20605, term20605.getClass(), "day", (short) 5);
        setField(term20604, term20604.getClass(), "date", term20605);
        setByteField(term20609, term20609.getClass(), "hour", (byte) 20);
        setByteField(term20609, term20609.getClass(), "minute", (byte) 34);
        setByteField(term20609, term20609.getClass(), "second", (byte) 55);
        setIntField(term20609, term20609.getClass(), "nano", 78024496);
        setField(term20604, term20604.getClass(), "time", term20609);
        setField(term20541, term20541.getClass(), "createdAt", term20604);
        setField(term20541, term20541.getClass(), "defaultBranch", "dfzWTjcjnI");
        setField(term20541, term20541.getClass(), "sshUrlToRepo", "bsnZXGEvFv");
        setField(term20541, term20541.getClass(), "httpUrlToRepo", "osFrHWYeRy");
        setField(term20541, term20541.getClass(), "webUrl", "scpIQUfPKw");
        setField(term20541, term20541.getClass(), "readmeUrl", "QKYBpCjuYt");
        setField(term20541, term20541.getClass(), "avatarUrl", "vjiRfoGdkl");
        setField(term20541, term20541.getClass(), "forksCount", term20686);
        setField(term20541, term20541.getClass(), "starCount", term20688);
        setIntField(term20691, term20691.getClass(), "year", 2020);
        setShortField(term20691, term20691.getClass(), "month", (short) 7);
        setShortField(term20691, term20691.getClass(), "day", (short) 24);
        setField(term20690, term20690.getClass(), "date", term20691);
        setByteField(term20695, term20695.getClass(), "hour", (byte) 0);
        setByteField(term20695, term20695.getClass(), "minute", (byte) 59);
        setByteField(term20695, term20695.getClass(), "second", (byte) 56);
        setIntField(term20695, term20695.getClass(), "nano", 320219201);
        setField(term20690, term20690.getClass(), "time", term20695);
        setField(term20541, term20541.getClass(), "lastActivityAt", term20690);
        setField(term20700, term20700.getClass(), "id", term20701);
        setField(term20700, term20700.getClass(), "name", "TwaxeSHvnR");
        setField(term20700, term20700.getClass(), "path", "paPzDETzIq");
        setField(term20700, term20700.getClass(), "kind", "fufeuGfwpN");
        setField(term20700, term20700.getClass(), "fullPath", "XJbkXbljvz");
        setField(term20700, term20700.getClass(), "parentId", term20751);
        setField(term20700, term20700.getClass(), "avatarUrl", "fuvdkDwBeH");
        setField(term20700, term20700.getClass(), "webUrl", "NTefzwLPhx");
        setField(term20541, term20541.getClass(), "namespace", term20700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dirFuhqyNu";
        callMethod(klass, "setPath", argTypes, term20541, args);
    }

};


