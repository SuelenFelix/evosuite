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

public class GitlabProjectResponse_getName_16990336746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23041;

    public GitlabProjectResponse_getName_16990336746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23042 = new Integer(-343325701);
        Integer term23186 = new Integer(107945604);
        Integer term23188 = new Integer(-1963464809);
        Integer term23201 = new Integer(71190297);
        Integer term23251 = new Integer(1202361360);
        term23041 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term23104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23109 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23195 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23200 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term23041, term23041.getClass(), "id", term23042);
        setField(term23041, term23041.getClass(), "description", "rLTDtNqLyW");
        setField(term23041, term23041.getClass(), "name", "CLsbWobdgS");
        setField(term23041, term23041.getClass(), "nameWithNamespace", "TbYrjEyFPc");
        setField(term23041, term23041.getClass(), "path", "muefchpJiZ");
        setField(term23041, term23041.getClass(), "pathWithNamespace", "tuYaAqvYrh");
        setIntField(term23105, term23105.getClass(), "year", 2015);
        setShortField(term23105, term23105.getClass(), "month", (short) 9);
        setShortField(term23105, term23105.getClass(), "day", (short) 16);
        setField(term23104, term23104.getClass(), "date", term23105);
        setByteField(term23109, term23109.getClass(), "hour", (byte) 6);
        setByteField(term23109, term23109.getClass(), "minute", (byte) 19);
        setByteField(term23109, term23109.getClass(), "second", (byte) 42);
        setIntField(term23109, term23109.getClass(), "nano", 630084975);
        setField(term23104, term23104.getClass(), "time", term23109);
        setField(term23041, term23041.getClass(), "createdAt", term23104);
        setField(term23041, term23041.getClass(), "defaultBranch", "CIbhheukbR");
        setField(term23041, term23041.getClass(), "sshUrlToRepo", "VOHPpErtan");
        setField(term23041, term23041.getClass(), "httpUrlToRepo", "GDMUlolTNs");
        setField(term23041, term23041.getClass(), "webUrl", "xpLvWisjzN");
        setField(term23041, term23041.getClass(), "readmeUrl", "IKfozyyKEj");
        setField(term23041, term23041.getClass(), "avatarUrl", "thCjwQjRBL");
        setField(term23041, term23041.getClass(), "forksCount", term23186);
        setField(term23041, term23041.getClass(), "starCount", term23188);
        setIntField(term23191, term23191.getClass(), "year", 2029);
        setShortField(term23191, term23191.getClass(), "month", (short) 6);
        setShortField(term23191, term23191.getClass(), "day", (short) 23);
        setField(term23190, term23190.getClass(), "date", term23191);
        setByteField(term23195, term23195.getClass(), "hour", (byte) 21);
        setByteField(term23195, term23195.getClass(), "minute", (byte) 55);
        setByteField(term23195, term23195.getClass(), "second", (byte) 27);
        setIntField(term23195, term23195.getClass(), "nano", 66889274);
        setField(term23190, term23190.getClass(), "time", term23195);
        setField(term23041, term23041.getClass(), "lastActivityAt", term23190);
        setField(term23200, term23200.getClass(), "id", term23201);
        setField(term23200, term23200.getClass(), "name", "ojLrjltndD");
        setField(term23200, term23200.getClass(), "path", "VJtFSexKat");
        setField(term23200, term23200.getClass(), "kind", "xPVddlPSQR");
        setField(term23200, term23200.getClass(), "fullPath", "MxrhCLTMTH");
        setField(term23200, term23200.getClass(), "parentId", term23251);
        setField(term23200, term23200.getClass(), "avatarUrl", "kEehLMZcOU");
        setField(term23200, term23200.getClass(), "webUrl", "RhLliqMiOF");
        setField(term23041, term23041.getClass(), "namespace", term23200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term23041, args);
    }

};


