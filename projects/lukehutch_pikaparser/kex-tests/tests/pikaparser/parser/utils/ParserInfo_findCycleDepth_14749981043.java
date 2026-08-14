package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class ParserInfo_findCycleDepth_14749981043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object term3356;

    public ParserInfo_findCycleDepth_14749981043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3326 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term3327 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term3331 = (Object[]) newArray("pikaparser.memotable.Match", 4);
        Object term3332 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term3333 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term3337 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term3338 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term3341 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term3344 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term3347 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term3348 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term3352 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term3353 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term3327, term3327.getClass(), "clause", null);
        setIntField(term3327, term3327.getClass(), "startPos", 691577392);
        setField(term3326, term3326.getClass(), "memoKey", term3327);
        setIntField(term3326, term3326.getClass(), "len", -893623680);
        setIntField(term3326, term3326.getClass(), "firstMatchingSubClauseIdx", -1963434938);
        setField(term3333, term3333.getClass(), "clause", null);
        setIntField(term3333, term3333.getClass(), "startPos", 906181092);
        setField(term3332, term3332.getClass(), "memoKey", term3333);
        setIntField(term3332, term3332.getClass(), "len", 1045657203);
        setIntField(term3332, term3332.getClass(), "firstMatchingSubClauseIdx", 1386130016);
        setField(term3338, term3338.getClass(), "memoKey", null);
        setIntField(term3338, term3338.getClass(), "len", 1861318859);
        setIntField(term3338, term3338.getClass(), "firstMatchingSubClauseIdx", 1474524152);
        setField(term3338, term3338.getClass(), "subClauseMatches", null);
        setElement(term3337, 0, term3338);
        setField(term3341, term3341.getClass(), "memoKey", null);
        setIntField(term3341, term3341.getClass(), "len", 0);
        setIntField(term3341, term3341.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term3341, term3341.getClass(), "subClauseMatches", null);
        setElement(term3337, 1, term3341);
        setField(term3332, term3332.getClass(), "subClauseMatches", term3337);
        setElement(term3331, 0, term3332);
        setField(term3344, term3344.getClass(), "memoKey", null);
        setIntField(term3344, term3344.getClass(), "len", 0);
        setIntField(term3344, term3344.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term3344, term3344.getClass(), "subClauseMatches", null);
        setElement(term3331, 1, term3344);
        setElement(term3331, 2, term3344);
        setField(term3348, term3348.getClass(), "clause", null);
        setIntField(term3348, term3348.getClass(), "startPos", 1107176718);
        setField(term3347, term3347.getClass(), "memoKey", term3348);
        setIntField(term3347, term3347.getClass(), "len", 480137250);
        setIntField(term3347, term3347.getClass(), "firstMatchingSubClauseIdx", -341152642);
        setField(term3353, term3353.getClass(), "memoKey", null);
        setIntField(term3353, term3353.getClass(), "len", -2015854073);
        setIntField(term3353, term3353.getClass(), "firstMatchingSubClauseIdx", 538259104);
        setField(term3353, term3353.getClass(), "subClauseMatches", null);
        setElement(term3352, 0, term3353);
        setElement(term3352, 1, term3353);
        setField(term3347, term3347.getClass(), "subClauseMatches", term3352);
        setElement(term3331, 3, term3347);
        setField(term3326, term3326.getClass(), "subClauseMatches", term3331);
        term3356 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.memotable.Match");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term3326;
        args[1] = term3356;
        callMethod(klass, "findCycleDepth", argTypes, null, args);
    }

};


