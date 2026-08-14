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

public class GitlabProjectResponse_getForksCount_161805827027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27629;

    public GitlabProjectResponse_getForksCount_161805827027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27630 = new Integer(-426764678);
        Integer term27774 = new Integer(-1222614956);
        Integer term27776 = new Integer(-1870495012);
        Integer term27789 = new Integer(-1310015129);
        Integer term27839 = new Integer(-2104981311);
        term27629 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term27692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27783 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27788 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term27629, term27629.getClass(), "id", term27630);
        setField(term27629, term27629.getClass(), "description", "WmTogHwGLE");
        setField(term27629, term27629.getClass(), "name", "qYOIXsGycY");
        setField(term27629, term27629.getClass(), "nameWithNamespace", "sJNXNshRLe");
        setField(term27629, term27629.getClass(), "path", "AYnbmgRCKr");
        setField(term27629, term27629.getClass(), "pathWithNamespace", "iQRfDlaoYD");
        setIntField(term27693, term27693.getClass(), "year", 2012);
        setShortField(term27693, term27693.getClass(), "month", (short) 7);
        setShortField(term27693, term27693.getClass(), "day", (short) 21);
        setField(term27692, term27692.getClass(), "date", term27693);
        setByteField(term27697, term27697.getClass(), "hour", (byte) 13);
        setByteField(term27697, term27697.getClass(), "minute", (byte) 41);
        setByteField(term27697, term27697.getClass(), "second", (byte) 44);
        setIntField(term27697, term27697.getClass(), "nano", 394467282);
        setField(term27692, term27692.getClass(), "time", term27697);
        setField(term27629, term27629.getClass(), "createdAt", term27692);
        setField(term27629, term27629.getClass(), "defaultBranch", "kpcyrjDQzN");
        setField(term27629, term27629.getClass(), "sshUrlToRepo", "IyukykAHLQ");
        setField(term27629, term27629.getClass(), "httpUrlToRepo", "CwZcgFJqMh");
        setField(term27629, term27629.getClass(), "webUrl", "RldCZqgRbO");
        setField(term27629, term27629.getClass(), "readmeUrl", "LOVugCAgJs");
        setField(term27629, term27629.getClass(), "avatarUrl", "SNmHXwCiFY");
        setField(term27629, term27629.getClass(), "forksCount", term27774);
        setField(term27629, term27629.getClass(), "starCount", term27776);
        setIntField(term27779, term27779.getClass(), "year", 2025);
        setShortField(term27779, term27779.getClass(), "month", (short) 9);
        setShortField(term27779, term27779.getClass(), "day", (short) 25);
        setField(term27778, term27778.getClass(), "date", term27779);
        setByteField(term27783, term27783.getClass(), "hour", (byte) 20);
        setByteField(term27783, term27783.getClass(), "minute", (byte) 0);
        setByteField(term27783, term27783.getClass(), "second", (byte) 25);
        setIntField(term27783, term27783.getClass(), "nano", 65871584);
        setField(term27778, term27778.getClass(), "time", term27783);
        setField(term27629, term27629.getClass(), "lastActivityAt", term27778);
        setField(term27788, term27788.getClass(), "id", term27789);
        setField(term27788, term27788.getClass(), "name", "HZfkWoqyUW");
        setField(term27788, term27788.getClass(), "path", "QRwANPSyfT");
        setField(term27788, term27788.getClass(), "kind", "DbZKLwYBgy");
        setField(term27788, term27788.getClass(), "fullPath", "LnNRVsjmxw");
        setField(term27788, term27788.getClass(), "parentId", term27839);
        setField(term27788, term27788.getClass(), "avatarUrl", "PlOnDkNrvX");
        setField(term27788, term27788.getClass(), "webUrl", "MltgFGldop");
        setField(term27629, term27629.getClass(), "namespace", term27788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getForksCount", argTypes, term27629, args);
    }

};


