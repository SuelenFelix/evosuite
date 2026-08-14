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

public class GitlabProjectResponse_getWebUrl_188896672621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25127;

    public GitlabProjectResponse_getWebUrl_188896672621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25128 = new Integer(1041916673);
        Integer term25272 = new Integer(-601863069);
        Integer term25274 = new Integer(663292551);
        Integer term25287 = new Integer(-1885090354);
        Integer term25337 = new Integer(-2066804303);
        term25127 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term25190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25195 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25286 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term25127, term25127.getClass(), "id", term25128);
        setField(term25127, term25127.getClass(), "description", "GNIVsSTglt");
        setField(term25127, term25127.getClass(), "name", "mzPebFiUSP");
        setField(term25127, term25127.getClass(), "nameWithNamespace", "HvbkjsQyDy");
        setField(term25127, term25127.getClass(), "path", "wzSukELQFL");
        setField(term25127, term25127.getClass(), "pathWithNamespace", "VZyeaOWYEj");
        setIntField(term25191, term25191.getClass(), "year", 2027);
        setShortField(term25191, term25191.getClass(), "month", (short) 11);
        setShortField(term25191, term25191.getClass(), "day", (short) 8);
        setField(term25190, term25190.getClass(), "date", term25191);
        setByteField(term25195, term25195.getClass(), "hour", (byte) 11);
        setByteField(term25195, term25195.getClass(), "minute", (byte) 59);
        setByteField(term25195, term25195.getClass(), "second", (byte) 14);
        setIntField(term25195, term25195.getClass(), "nano", 322375591);
        setField(term25190, term25190.getClass(), "time", term25195);
        setField(term25127, term25127.getClass(), "createdAt", term25190);
        setField(term25127, term25127.getClass(), "defaultBranch", "PErxMBQSUv");
        setField(term25127, term25127.getClass(), "sshUrlToRepo", "KZQwbvujui");
        setField(term25127, term25127.getClass(), "httpUrlToRepo", "JPUZuGxKlI");
        setField(term25127, term25127.getClass(), "webUrl", "xqIbVsUspl");
        setField(term25127, term25127.getClass(), "readmeUrl", "GnjLRtJywq");
        setField(term25127, term25127.getClass(), "avatarUrl", "TDaodpHTRK");
        setField(term25127, term25127.getClass(), "forksCount", term25272);
        setField(term25127, term25127.getClass(), "starCount", term25274);
        setIntField(term25277, term25277.getClass(), "year", 2020);
        setShortField(term25277, term25277.getClass(), "month", (short) 8);
        setShortField(term25277, term25277.getClass(), "day", (short) 15);
        setField(term25276, term25276.getClass(), "date", term25277);
        setByteField(term25281, term25281.getClass(), "hour", (byte) 2);
        setByteField(term25281, term25281.getClass(), "minute", (byte) 0);
        setByteField(term25281, term25281.getClass(), "second", (byte) 38);
        setIntField(term25281, term25281.getClass(), "nano", 146431486);
        setField(term25276, term25276.getClass(), "time", term25281);
        setField(term25127, term25127.getClass(), "lastActivityAt", term25276);
        setField(term25286, term25286.getClass(), "id", term25287);
        setField(term25286, term25286.getClass(), "name", "JayazbYDLK");
        setField(term25286, term25286.getClass(), "path", "ORDuSTrpNA");
        setField(term25286, term25286.getClass(), "kind", "hysThIPoEJ");
        setField(term25286, term25286.getClass(), "fullPath", "dfZepHfGwh");
        setField(term25286, term25286.getClass(), "parentId", term25337);
        setField(term25286, term25286.getClass(), "avatarUrl", "zjfMxUERFZ");
        setField(term25286, term25286.getClass(), "webUrl", "ooVlhmiOff");
        setField(term25127, term25127.getClass(), "namespace", term25286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebUrl", argTypes, term25127, args);
    }

};


