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

public class Match_isBetterThan_162473745013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1182;

    public Match_isBetterThan_162473745013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1182 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1182, term1182.getClass(), "memoKey", null);
        setIntField(term1182, term1182.getClass(), "len", 0);
        setIntField(term1182, term1182.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1182, term1182.getClass(), "subClauseMatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.memotable.Match");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isBetterThan", argTypes, term1182, args);
    }

};


