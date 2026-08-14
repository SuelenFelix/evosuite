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

public class Software_setAuthor_3431482018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;

    public Software_setAuthor_3431482018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term555 = new Integer(1227103734);
        term530 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.entities.Software"));
        setField(term530, term530.getClass(), "name", "eZFUvlxvGV");
        setField(term530, term530.getClass(), "description", "BYqFIqCKAV");
        setField(term530, term530.getClass(), "score", term555);
        setField(term530, term530.getClass(), "author", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.entities.Software");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setAuthor", argTypes, term530, args);
    }

};


