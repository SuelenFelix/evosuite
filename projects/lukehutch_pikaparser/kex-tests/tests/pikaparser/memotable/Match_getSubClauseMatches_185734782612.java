package pikaparser.memotable;

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
import static pikaparser.memotable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Match_getSubClauseMatches_185734782612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;

    public Match_getSubClauseMatches_185734782612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1179 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1179, term1179.getClass(), "memoKey", null);
        setIntField(term1179, term1179.getClass(), "len", 0);
        setIntField(term1179, term1179.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1179, term1179.getClass(), "subClauseMatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubClauseMatches", argTypes, term1179, args);
    }

};


