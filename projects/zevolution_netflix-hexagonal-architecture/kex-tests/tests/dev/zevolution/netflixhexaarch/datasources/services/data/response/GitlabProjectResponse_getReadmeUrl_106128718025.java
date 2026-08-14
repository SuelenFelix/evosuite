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

public class GitlabProjectResponse_getReadmeUrl_106128718025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30536;

    public GitlabProjectResponse_getReadmeUrl_106128718025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30537 = new Integer(-75206835);
        Integer term30681 = new Integer(-1618206977);
        Integer term30683 = new Integer(-1747406163);
        Integer term30696 = new Integer(388157121);
        Integer term30746 = new Integer(1684998508);
        term30536 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term30599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30695 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term30536, term30536.getClass(), "id", term30537);
        setField(term30536, term30536.getClass(), "description", "UqSNWSoTRy");
        setField(term30536, term30536.getClass(), "name", "VesRqDfjMa");
        setField(term30536, term30536.getClass(), "nameWithNamespace", "AQTTebOiZR");
        setField(term30536, term30536.getClass(), "path", "mgeIhswNtk");
        setField(term30536, term30536.getClass(), "pathWithNamespace", "QwKYpiVQlL");
        setIntField(term30600, term30600.getClass(), "year", 2012);
        setShortField(term30600, term30600.getClass(), "month", (short) 7);
        setShortField(term30600, term30600.getClass(), "day", (short) 21);
        setField(term30599, term30599.getClass(), "date", term30600);
        setByteField(term30604, term30604.getClass(), "hour", (byte) 13);
        setByteField(term30604, term30604.getClass(), "minute", (byte) 41);
        setByteField(term30604, term30604.getClass(), "second", (byte) 44);
        setIntField(term30604, term30604.getClass(), "nano", 394467282);
        setField(term30599, term30599.getClass(), "time", term30604);
        setField(term30536, term30536.getClass(), "createdAt", term30599);
        setField(term30536, term30536.getClass(), "defaultBranch", "kSGsHNQQoW");
        setField(term30536, term30536.getClass(), "sshUrlToRepo", "MWezlyjdaG");
        setField(term30536, term30536.getClass(), "httpUrlToRepo", "drpBJuEKQG");
        setField(term30536, term30536.getClass(), "webUrl", "GGpORnLrOW");
        setField(term30536, term30536.getClass(), "readmeUrl", "gDGZwlpOZx");
        setField(term30536, term30536.getClass(), "avatarUrl", "gkDpxkHPDg");
        setField(term30536, term30536.getClass(), "forksCount", term30681);
        setField(term30536, term30536.getClass(), "starCount", term30683);
        setIntField(term30686, term30686.getClass(), "year", 2025);
        setShortField(term30686, term30686.getClass(), "month", (short) 9);
        setShortField(term30686, term30686.getClass(), "day", (short) 25);
        setField(term30685, term30685.getClass(), "date", term30686);
        setByteField(term30690, term30690.getClass(), "hour", (byte) 20);
        setByteField(term30690, term30690.getClass(), "minute", (byte) 0);
        setByteField(term30690, term30690.getClass(), "second", (byte) 25);
        setIntField(term30690, term30690.getClass(), "nano", 65871584);
        setField(term30685, term30685.getClass(), "time", term30690);
        setField(term30536, term30536.getClass(), "lastActivityAt", term30685);
        setField(term30695, term30695.getClass(), "id", term30696);
        setField(term30695, term30695.getClass(), "name", "pADwkrWiMW");
        setField(term30695, term30695.getClass(), "path", "FDORDJuAXQ");
        setField(term30695, term30695.getClass(), "kind", "yjqoDeLBLg");
        setField(term30695, term30695.getClass(), "fullPath", "DCepDqVwas");
        setField(term30695, term30695.getClass(), "parentId", term30746);
        setField(term30695, term30695.getClass(), "avatarUrl", "wKIBUlfNCx");
        setField(term30695, term30695.getClass(), "webUrl", "iGfMUWRvod");
        setField(term30536, term30536.getClass(), "namespace", term30695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReadmeUrl", argTypes, term30536, args);
    }

};


