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

public class GitlabProjectResponse_getPath_17565033969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20135;

    public GitlabProjectResponse_getPath_17565033969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20136 = new Integer(-1801760683);
        Integer term20280 = new Integer(1141317871);
        Integer term20282 = new Integer(890669485);
        Integer term20295 = new Integer(691577392);
        Integer term20345 = new Integer(-893623680);
        term20135 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term20198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20294 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term20135, term20135.getClass(), "id", term20136);
        setField(term20135, term20135.getClass(), "description", "dIWAnvmLiC");
        setField(term20135, term20135.getClass(), "name", "CuWebzZQjZ");
        setField(term20135, term20135.getClass(), "nameWithNamespace", "wRVaaJxKYI");
        setField(term20135, term20135.getClass(), "path", "yOQuJXRvOo");
        setField(term20135, term20135.getClass(), "pathWithNamespace", "XmLHcnVsch");
        setIntField(term20199, term20199.getClass(), "year", 2015);
        setShortField(term20199, term20199.getClass(), "month", (short) 9);
        setShortField(term20199, term20199.getClass(), "day", (short) 16);
        setField(term20198, term20198.getClass(), "date", term20199);
        setByteField(term20203, term20203.getClass(), "hour", (byte) 6);
        setByteField(term20203, term20203.getClass(), "minute", (byte) 19);
        setByteField(term20203, term20203.getClass(), "second", (byte) 42);
        setIntField(term20203, term20203.getClass(), "nano", 630084975);
        setField(term20198, term20198.getClass(), "time", term20203);
        setField(term20135, term20135.getClass(), "createdAt", term20198);
        setField(term20135, term20135.getClass(), "defaultBranch", "Yrvtdcltri");
        setField(term20135, term20135.getClass(), "sshUrlToRepo", "RxrsjXRVcT");
        setField(term20135, term20135.getClass(), "httpUrlToRepo", "cfRimmJxqA");
        setField(term20135, term20135.getClass(), "webUrl", "oOnRVGqFmy");
        setField(term20135, term20135.getClass(), "readmeUrl", "LaXzFIlWMk");
        setField(term20135, term20135.getClass(), "avatarUrl", "GuVQjhBxma");
        setField(term20135, term20135.getClass(), "forksCount", term20280);
        setField(term20135, term20135.getClass(), "starCount", term20282);
        setIntField(term20285, term20285.getClass(), "year", 2029);
        setShortField(term20285, term20285.getClass(), "month", (short) 6);
        setShortField(term20285, term20285.getClass(), "day", (short) 23);
        setField(term20284, term20284.getClass(), "date", term20285);
        setByteField(term20289, term20289.getClass(), "hour", (byte) 21);
        setByteField(term20289, term20289.getClass(), "minute", (byte) 55);
        setByteField(term20289, term20289.getClass(), "second", (byte) 27);
        setIntField(term20289, term20289.getClass(), "nano", 66889274);
        setField(term20284, term20284.getClass(), "time", term20289);
        setField(term20135, term20135.getClass(), "lastActivityAt", term20284);
        setField(term20294, term20294.getClass(), "id", term20295);
        setField(term20294, term20294.getClass(), "name", "WAVMPPbIfL");
        setField(term20294, term20294.getClass(), "path", "GISHLsgALf");
        setField(term20294, term20294.getClass(), "kind", "PVykkUSgBq");
        setField(term20294, term20294.getClass(), "fullPath", "tnKbZaCsuj");
        setField(term20294, term20294.getClass(), "parentId", term20345);
        setField(term20294, term20294.getClass(), "avatarUrl", "ZFpcYBgLNC");
        setField(term20294, term20294.getClass(), "webUrl", "VAGkRppBem");
        setField(term20135, term20135.getClass(), "namespace", term20294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term20135, args);
    }

};


