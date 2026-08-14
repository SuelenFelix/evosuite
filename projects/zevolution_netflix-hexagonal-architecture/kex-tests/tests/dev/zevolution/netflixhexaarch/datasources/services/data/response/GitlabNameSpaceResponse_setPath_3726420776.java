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

public class GitlabNameSpaceResponse_setPath_3726420776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public GitlabNameSpaceResponse_setPath_3726420776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term711 = new Integer(-522618178);
        Integer term761 = new Integer(1134449235);
        term710 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term710, term710.getClass(), "id", term711);
        setField(term710, term710.getClass(), "name", "dWRymuLBtr");
        setField(term710, term710.getClass(), "path", "AijpHYOFuy");
        setField(term710, term710.getClass(), "kind", "SbAoxhfrkn");
        setField(term710, term710.getClass(), "fullPath", "kuTXqwMtDB");
        setField(term710, term710.getClass(), "parentId", term761);
        setField(term710, term710.getClass(), "avatarUrl", "Ghbwtircqb");
        setField(term710, term710.getClass(), "webUrl", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setPath", argTypes, term710, args);
    }

};


