package dev.zevolution.netflixhexaarch.entities;

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
import static dev.zevolution.netflixhexaarch.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Software_getAuthor_16761072918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19995;

    public Software_getAuthor_16761072918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20020 = new Integer(-341962980);
        term19995 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.entities.Software"));
        setField(term19995, term19995.getClass(), "name", "RxrsjXRVcT");
        setField(term19995, term19995.getClass(), "description", "cfRimmJxqA");
        setField(term19995, term19995.getClass(), "score", term20020);
        setField(term19995, term19995.getClass(), "author", "oOnRVGqFmy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.entities.Software");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term19995, args);
    }

};


