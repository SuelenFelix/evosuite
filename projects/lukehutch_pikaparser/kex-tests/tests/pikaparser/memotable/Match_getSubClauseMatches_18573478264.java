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
import java.lang.Object;

public class Match_getSubClauseMatches_18573478264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012;

    public Match_getSubClauseMatches_18573478264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1012 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1013 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1017 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term1018 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1019 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1023 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term1024 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1027 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1030 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1013, term1013.getClass(), "clause", null);
        setIntField(term1013, term1013.getClass(), "startPos", -506958186);
        setField(term1012, term1012.getClass(), "memoKey", term1013);
        setIntField(term1012, term1012.getClass(), "len", -507387516);
        setIntField(term1012, term1012.getClass(), "firstMatchingSubClauseIdx", -1970452551);
        setField(term1019, term1019.getClass(), "clause", null);
        setIntField(term1019, term1019.getClass(), "startPos", -1896376975);
        setField(term1018, term1018.getClass(), "memoKey", term1019);
        setIntField(term1018, term1018.getClass(), "len", 729658803);
        setIntField(term1018, term1018.getClass(), "firstMatchingSubClauseIdx", 114754804);
        setField(term1024, term1024.getClass(), "memoKey", null);
        setIntField(term1024, term1024.getClass(), "len", 584893196);
        setIntField(term1024, term1024.getClass(), "firstMatchingSubClauseIdx", 497269071);
        setField(term1024, term1024.getClass(), "subClauseMatches", null);
        setElement(term1023, 0, term1024);
        setField(term1027, term1027.getClass(), "memoKey", null);
        setIntField(term1027, term1027.getClass(), "len", 0);
        setIntField(term1027, term1027.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1027, term1027.getClass(), "subClauseMatches", null);
        setElement(term1023, 1, term1027);
        setField(term1018, term1018.getClass(), "subClauseMatches", term1023);
        setElement(term1017, 0, term1018);
        setField(term1030, term1030.getClass(), "memoKey", null);
        setIntField(term1030, term1030.getClass(), "len", 0);
        setIntField(term1030, term1030.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1030, term1030.getClass(), "subClauseMatches", null);
        setElement(term1017, 1, term1030);
        setField(term1012, term1012.getClass(), "subClauseMatches", term1017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubClauseMatches", argTypes, term1012, args);
    }

};


