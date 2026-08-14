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

public class GitlabProjectResponse_getSshUrlToRepo_117608888317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23459;

    public GitlabProjectResponse_getSshUrlToRepo_117608888317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23460 = new Integer(-1388471422);
        Integer term23604 = new Integer(-1498296052);
        Integer term23606 = new Integer(2098647989);
        Integer term23619 = new Integer(1598895173);
        Integer term23669 = new Integer(1830648570);
        term23459 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term23522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23527 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23618 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term23459, term23459.getClass(), "id", term23460);
        setField(term23459, term23459.getClass(), "description", "TbYrjEyFPc");
        setField(term23459, term23459.getClass(), "name", "muefchpJiZ");
        setField(term23459, term23459.getClass(), "nameWithNamespace", "tuYaAqvYrh");
        setField(term23459, term23459.getClass(), "path", "CIbhheukbR");
        setField(term23459, term23459.getClass(), "pathWithNamespace", "VOHPpErtan");
        setIntField(term23523, term23523.getClass(), "year", 2010);
        setShortField(term23523, term23523.getClass(), "month", (short) 6);
        setShortField(term23523, term23523.getClass(), "day", (short) 14);
        setField(term23522, term23522.getClass(), "date", term23523);
        setByteField(term23527, term23527.getClass(), "hour", (byte) 6);
        setByteField(term23527, term23527.getClass(), "minute", (byte) 22);
        setByteField(term23527, term23527.getClass(), "second", (byte) 20);
        setIntField(term23527, term23527.getClass(), "nano", 25133051);
        setField(term23522, term23522.getClass(), "time", term23527);
        setField(term23459, term23459.getClass(), "createdAt", term23522);
        setField(term23459, term23459.getClass(), "defaultBranch", "GDMUlolTNs");
        setField(term23459, term23459.getClass(), "sshUrlToRepo", "xpLvWisjzN");
        setField(term23459, term23459.getClass(), "httpUrlToRepo", "IKfozyyKEj");
        setField(term23459, term23459.getClass(), "webUrl", "thCjwQjRBL");
        setField(term23459, term23459.getClass(), "readmeUrl", "ojLrjltndD");
        setField(term23459, term23459.getClass(), "avatarUrl", "VJtFSexKat");
        setField(term23459, term23459.getClass(), "forksCount", term23604);
        setField(term23459, term23459.getClass(), "starCount", term23606);
        setIntField(term23609, term23609.getClass(), "year", 2010);
        setShortField(term23609, term23609.getClass(), "month", (short) 5);
        setShortField(term23609, term23609.getClass(), "day", (short) 2);
        setField(term23608, term23608.getClass(), "date", term23609);
        setByteField(term23613, term23613.getClass(), "hour", (byte) 2);
        setByteField(term23613, term23613.getClass(), "minute", (byte) 22);
        setByteField(term23613, term23613.getClass(), "second", (byte) 33);
        setIntField(term23613, term23613.getClass(), "nano", 530835039);
        setField(term23608, term23608.getClass(), "time", term23613);
        setField(term23459, term23459.getClass(), "lastActivityAt", term23608);
        setField(term23618, term23618.getClass(), "id", term23619);
        setField(term23618, term23618.getClass(), "name", "xPVddlPSQR");
        setField(term23618, term23618.getClass(), "path", "MxrhCLTMTH");
        setField(term23618, term23618.getClass(), "kind", "kEehLMZcOU");
        setField(term23618, term23618.getClass(), "fullPath", "RhLliqMiOF");
        setField(term23618, term23618.getClass(), "parentId", term23669);
        setField(term23618, term23618.getClass(), "avatarUrl", "jlhonEGrJH");
        setField(term23618, term23618.getClass(), "webUrl", "RKcKwlEYZb");
        setField(term23459, term23459.getClass(), "namespace", term23618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSshUrlToRepo", argTypes, term23459, args);
    }

};


