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

public class TreeUtils_printTreeView_16751132793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1959;

    public TreeUtils_printTreeView_16751132793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1959 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1960 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1964 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term1965 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1966 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1970 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term1971 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1974 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1977 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1980 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1983 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1960, term1960.getClass(), "clause", null);
        setIntField(term1960, term1960.getClass(), "startPos", -1016503459);
        setField(term1959, term1959.getClass(), "memoKey", term1960);
        setIntField(term1959, term1959.getClass(), "len", -1968847291);
        setIntField(term1959, term1959.getClass(), "firstMatchingSubClauseIdx", 579005622);
        setField(term1966, term1966.getClass(), "clause", null);
        setIntField(term1966, term1966.getClass(), "startPos", -14890619);
        setField(term1965, term1965.getClass(), "memoKey", term1966);
        setIntField(term1965, term1965.getClass(), "len", 1632125673);
        setIntField(term1965, term1965.getClass(), "firstMatchingSubClauseIdx", 454281060);
        setField(term1971, term1971.getClass(), "memoKey", null);
        setIntField(term1971, term1971.getClass(), "len", 2055867847);
        setIntField(term1971, term1971.getClass(), "firstMatchingSubClauseIdx", -1048298087);
        setField(term1971, term1971.getClass(), "subClauseMatches", null);
        setElement(term1970, 0, term1971);
        setField(term1974, term1974.getClass(), "memoKey", null);
        setIntField(term1974, term1974.getClass(), "len", 0);
        setIntField(term1974, term1974.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1974, term1974.getClass(), "subClauseMatches", null);
        setElement(term1970, 1, term1974);
        setField(term1977, term1977.getClass(), "memoKey", null);
        setIntField(term1977, term1977.getClass(), "len", 0);
        setIntField(term1977, term1977.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1977, term1977.getClass(), "subClauseMatches", null);
        setElement(term1970, 2, term1977);
        setField(term1980, term1980.getClass(), "memoKey", null);
        setIntField(term1980, term1980.getClass(), "len", 0);
        setIntField(term1980, term1980.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1980, term1980.getClass(), "subClauseMatches", null);
        setElement(term1970, 3, term1980);
        setElement(term1970, 4, term1971);
        setField(term1983, term1983.getClass(), "memoKey", null);
        setIntField(term1983, term1983.getClass(), "len", 493620644);
        setIntField(term1983, term1983.getClass(), "firstMatchingSubClauseIdx", 1328271830);
        setField(term1983, term1983.getClass(), "subClauseMatches", null);
        setElement(term1970, 5, term1983);
        setElement(term1970, 6, term1977);
        setElement(term1970, 7, term1974);
        setField(term1965, term1965.getClass(), "subClauseMatches", term1970);
        setElement(term1964, 0, term1965);
        setElement(term1964, 1, term1974);
        setField(term1959, term1959.getClass(), "subClauseMatches", term1964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.TreeUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.memotable.Match");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1959;
        args[1] = "ZVecLZMLHF";
        callMethod(klass, "printTreeView", argTypes, null, args);
    }

};


