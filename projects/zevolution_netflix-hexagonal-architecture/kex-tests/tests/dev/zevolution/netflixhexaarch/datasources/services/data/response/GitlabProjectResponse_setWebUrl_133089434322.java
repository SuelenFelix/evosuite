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

public class GitlabProjectResponse_setWebUrl_133089434322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25533;

    public GitlabProjectResponse_setWebUrl_133089434322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25534 = new Integer(-1731761810);
        Integer term25678 = new Integer(197109649);
        Integer term25680 = new Integer(-1239406390);
        Integer term25693 = new Integer(1557431527);
        Integer term25743 = new Integer(-1504890659);
        term25533 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term25596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25687 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25692 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term25533, term25533.getClass(), "id", term25534);
        setField(term25533, term25533.getClass(), "description", "dUNzDLXJcj");
        setField(term25533, term25533.getClass(), "name", "OrVSjRJVwa");
        setField(term25533, term25533.getClass(), "nameWithNamespace", "cdZEcINJAM");
        setField(term25533, term25533.getClass(), "path", "qumYSwcWHz");
        setField(term25533, term25533.getClass(), "pathWithNamespace", "raNzcEorkV");
        setIntField(term25597, term25597.getClass(), "year", 2014);
        setShortField(term25597, term25597.getClass(), "month", (short) 11);
        setShortField(term25597, term25597.getClass(), "day", (short) 8);
        setField(term25596, term25596.getClass(), "date", term25597);
        setByteField(term25601, term25601.getClass(), "hour", (byte) 8);
        setByteField(term25601, term25601.getClass(), "minute", (byte) 43);
        setByteField(term25601, term25601.getClass(), "second", (byte) 32);
        setIntField(term25601, term25601.getClass(), "nano", 154434838);
        setField(term25596, term25596.getClass(), "time", term25601);
        setField(term25533, term25533.getClass(), "createdAt", term25596);
        setField(term25533, term25533.getClass(), "defaultBranch", "nEgozCeoUr");
        setField(term25533, term25533.getClass(), "sshUrlToRepo", "EWGMzlcOnW");
        setField(term25533, term25533.getClass(), "httpUrlToRepo", "XeSDJYKMBf");
        setField(term25533, term25533.getClass(), "webUrl", "tIsFcOGTUX");
        setField(term25533, term25533.getClass(), "readmeUrl", "XUVRcnELFP");
        setField(term25533, term25533.getClass(), "avatarUrl", "xIeSbezmkD");
        setField(term25533, term25533.getClass(), "forksCount", term25678);
        setField(term25533, term25533.getClass(), "starCount", term25680);
        setIntField(term25683, term25683.getClass(), "year", 2020);
        setShortField(term25683, term25683.getClass(), "month", (short) 5);
        setShortField(term25683, term25683.getClass(), "day", (short) 18);
        setField(term25682, term25682.getClass(), "date", term25683);
        setByteField(term25687, term25687.getClass(), "hour", (byte) 5);
        setByteField(term25687, term25687.getClass(), "minute", (byte) 46);
        setByteField(term25687, term25687.getClass(), "second", (byte) 13);
        setIntField(term25687, term25687.getClass(), "nano", 45893173);
        setField(term25682, term25682.getClass(), "time", term25687);
        setField(term25533, term25533.getClass(), "lastActivityAt", term25682);
        setField(term25692, term25692.getClass(), "id", term25693);
        setField(term25692, term25692.getClass(), "name", "txUWLZRkSv");
        setField(term25692, term25692.getClass(), "path", "gHRMJRsBGm");
        setField(term25692, term25692.getClass(), "kind", "rZyrfnMvHa");
        setField(term25692, term25692.getClass(), "fullPath", "GMyMhTZeDC");
        setField(term25692, term25692.getClass(), "parentId", term25743);
        setField(term25692, term25692.getClass(), "avatarUrl", "KqQOTshBOL");
        setField(term25692, term25692.getClass(), "webUrl", "cuWgFcYkPC");
        setField(term25533, term25533.getClass(), "namespace", term25692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HfbcOKkXBm";
        callMethod(klass, "setWebUrl", argTypes, term25533, args);
    }

};


