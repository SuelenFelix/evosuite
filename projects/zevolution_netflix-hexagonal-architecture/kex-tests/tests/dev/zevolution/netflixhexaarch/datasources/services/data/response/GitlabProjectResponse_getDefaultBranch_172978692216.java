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

public class GitlabProjectResponse_getDefaultBranch_172978692216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27199;

    public GitlabProjectResponse_getDefaultBranch_172978692216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27200 = new Integer(991356662);
        Integer term27344 = new Integer(-506958186);
        Integer term27346 = new Integer(-507387516);
        Integer term27359 = new Integer(-1970452551);
        Integer term27409 = new Integer(-1896376975);
        term27199 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term27262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27348 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27349 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27353 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27358 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term27199, term27199.getClass(), "id", term27200);
        setField(term27199, term27199.getClass(), "description", "iGTpXnnTqB");
        setField(term27199, term27199.getClass(), "name", "XgJzBOYfQB");
        setField(term27199, term27199.getClass(), "nameWithNamespace", "GAPGgDekVG");
        setField(term27199, term27199.getClass(), "path", "WmTogHwGLE");
        setField(term27199, term27199.getClass(), "pathWithNamespace", "qYOIXsGycY");
        setIntField(term27263, term27263.getClass(), "year", 2010);
        setShortField(term27263, term27263.getClass(), "month", (short) 9);
        setShortField(term27263, term27263.getClass(), "day", (short) 28);
        setField(term27262, term27262.getClass(), "date", term27263);
        setByteField(term27267, term27267.getClass(), "hour", (byte) 6);
        setByteField(term27267, term27267.getClass(), "minute", (byte) 4);
        setByteField(term27267, term27267.getClass(), "second", (byte) 54);
        setIntField(term27267, term27267.getClass(), "nano", 604713782);
        setField(term27262, term27262.getClass(), "time", term27267);
        setField(term27199, term27199.getClass(), "createdAt", term27262);
        setField(term27199, term27199.getClass(), "defaultBranch", "sJNXNshRLe");
        setField(term27199, term27199.getClass(), "sshUrlToRepo", "AYnbmgRCKr");
        setField(term27199, term27199.getClass(), "httpUrlToRepo", "iQRfDlaoYD");
        setField(term27199, term27199.getClass(), "webUrl", "kpcyrjDQzN");
        setField(term27199, term27199.getClass(), "readmeUrl", "IyukykAHLQ");
        setField(term27199, term27199.getClass(), "avatarUrl", "CwZcgFJqMh");
        setField(term27199, term27199.getClass(), "forksCount", term27344);
        setField(term27199, term27199.getClass(), "starCount", term27346);
        setIntField(term27349, term27349.getClass(), "year", 2023);
        setShortField(term27349, term27349.getClass(), "month", (short) 7);
        setShortField(term27349, term27349.getClass(), "day", (short) 16);
        setField(term27348, term27348.getClass(), "date", term27349);
        setByteField(term27353, term27353.getClass(), "hour", (byte) 3);
        setByteField(term27353, term27353.getClass(), "minute", (byte) 1);
        setByteField(term27353, term27353.getClass(), "second", (byte) 19);
        setIntField(term27353, term27353.getClass(), "nano", 488629554);
        setField(term27348, term27348.getClass(), "time", term27353);
        setField(term27199, term27199.getClass(), "lastActivityAt", term27348);
        setField(term27358, term27358.getClass(), "id", term27359);
        setField(term27358, term27358.getClass(), "name", "RldCZqgRbO");
        setField(term27358, term27358.getClass(), "path", "LOVugCAgJs");
        setField(term27358, term27358.getClass(), "kind", "SNmHXwCiFY");
        setField(term27358, term27358.getClass(), "fullPath", "HZfkWoqyUW");
        setField(term27358, term27358.getClass(), "parentId", term27409);
        setField(term27358, term27358.getClass(), "avatarUrl", "QRwANPSyfT");
        setField(term27358, term27358.getClass(), "webUrl", "DbZKLwYBgy");
        setField(term27199, term27199.getClass(), "namespace", term27358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultBranch", argTypes, term27199, args);
    }

};


