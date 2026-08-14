package dev.zevolution.netflixhexaarch.datasources;

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
import static dev.zevolution.netflixhexaarch.datasources.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class GitlabSoftwaresDataSource_getGitlabUserByUsername_289214882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;

    public GitlabSoftwaresDataSource_getGitlabUserByUsername_289214882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term59 = new HashMap();
        term58 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.GitlabSoftwaresDataSource"));
        setField(term58, term58.getClass(), "gitlabUsersClient", null);
        setField(term58, term58.getClass(), "gitlabUserCache", term59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.GitlabSoftwaresDataSource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "getGitlabUserByUsername", argTypes, term58, args);
    }

};


