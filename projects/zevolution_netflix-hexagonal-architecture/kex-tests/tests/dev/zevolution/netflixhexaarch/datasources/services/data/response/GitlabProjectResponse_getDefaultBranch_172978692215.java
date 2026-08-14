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

public class GitlabProjectResponse_getDefaultBranch_172978692215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22625;

    public GitlabProjectResponse_getDefaultBranch_172978692215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22626 = new Integer(-1565502840);
        Integer term22770 = new Integer(344323424);
        Integer term22772 = new Integer(9726679);
        Integer term22785 = new Integer(-25637976);
        Integer term22835 = new Integer(1555897383);
        term22625 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term22688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22693 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22784 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term22625, term22625.getClass(), "id", term22626);
        setField(term22625, term22625.getClass(), "description", "IDClvDZuqE");
        setField(term22625, term22625.getClass(), "name", "cMvKxpZOvg");
        setField(term22625, term22625.getClass(), "nameWithNamespace", "WWBYemIuiK");
        setField(term22625, term22625.getClass(), "path", "nHYQYkycCR");
        setField(term22625, term22625.getClass(), "pathWithNamespace", "yBiVacDcZX");
        setIntField(term22689, term22689.getClass(), "year", 2025);
        setShortField(term22689, term22689.getClass(), "month", (short) 11);
        setShortField(term22689, term22689.getClass(), "day", (short) 3);
        setField(term22688, term22688.getClass(), "date", term22689);
        setByteField(term22693, term22693.getClass(), "hour", (byte) 21);
        setByteField(term22693, term22693.getClass(), "minute", (byte) 24);
        setByteField(term22693, term22693.getClass(), "second", (byte) 23);
        setIntField(term22693, term22693.getClass(), "nano", 210986721);
        setField(term22688, term22688.getClass(), "time", term22693);
        setField(term22625, term22625.getClass(), "createdAt", term22688);
        setField(term22625, term22625.getClass(), "defaultBranch", "QrKfEgQeoy");
        setField(term22625, term22625.getClass(), "sshUrlToRepo", "oApgdbwnti");
        setField(term22625, term22625.getClass(), "httpUrlToRepo", "YcgHACNgyo");
        setField(term22625, term22625.getClass(), "webUrl", "MrUPJzBTEn");
        setField(term22625, term22625.getClass(), "readmeUrl", "IaSymdfFGa");
        setField(term22625, term22625.getClass(), "avatarUrl", "FxSvJCIpul");
        setField(term22625, term22625.getClass(), "forksCount", term22770);
        setField(term22625, term22625.getClass(), "starCount", term22772);
        setIntField(term22775, term22775.getClass(), "year", 2016);
        setShortField(term22775, term22775.getClass(), "month", (short) 6);
        setShortField(term22775, term22775.getClass(), "day", (short) 15);
        setField(term22774, term22774.getClass(), "date", term22775);
        setByteField(term22779, term22779.getClass(), "hour", (byte) 21);
        setByteField(term22779, term22779.getClass(), "minute", (byte) 23);
        setByteField(term22779, term22779.getClass(), "second", (byte) 23);
        setIntField(term22779, term22779.getClass(), "nano", 433372070);
        setField(term22774, term22774.getClass(), "time", term22779);
        setField(term22625, term22625.getClass(), "lastActivityAt", term22774);
        setField(term22784, term22784.getClass(), "id", term22785);
        setField(term22784, term22784.getClass(), "name", "HCjKwpexJj");
        setField(term22784, term22784.getClass(), "path", "sCpIHVPdfl");
        setField(term22784, term22784.getClass(), "kind", "lMUBBGRjfY");
        setField(term22784, term22784.getClass(), "fullPath", "olYpqbolWL");
        setField(term22784, term22784.getClass(), "parentId", term22835);
        setField(term22784, term22784.getClass(), "avatarUrl", "MCMCjxXzjw");
        setField(term22784, term22784.getClass(), "webUrl", "pZbbwCURge");
        setField(term22625, term22625.getClass(), "namespace", term22784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultBranch", argTypes, term22625, args);
    }

};


