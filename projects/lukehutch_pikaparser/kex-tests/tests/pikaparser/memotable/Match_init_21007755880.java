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
import java.lang.Integer;
import java.lang.Object;

public class Match_init_21007755880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term952;
     Object term954;
     Object term956;
     Object term958;

    public Match_init_21007755880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term952 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term952, term952.getClass(), "clause", null);
        setIntField(term952, term952.getClass(), "startPos", 1953277050);
        term954 = new Integer(1283079251);
        term956 = new Integer(-523949691);
        term958 = (Object[]) newArray("pikaparser.memotable.Match", 7);
        Object term959 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term960 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term964 = (Object[]) newArray("pikaparser.memotable.Match", 4);
        Object term965 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term966 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term970 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term971 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term972 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term976 = (Object[]) newArray("pikaparser.memotable.Match", 4);
        Object term977 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term980 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term983 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term986 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term987 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term991 = (Object[]) newArray("pikaparser.memotable.Match", 0);
        Object term992 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term993 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term997 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term998 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term960, term960.getClass(), "clause", null);
        setIntField(term960, term960.getClass(), "startPos", 1398204340);
        setField(term959, term959.getClass(), "memoKey", term960);
        setIntField(term959, term959.getClass(), "len", 229204365);
        setIntField(term959, term959.getClass(), "firstMatchingSubClauseIdx", -461771056);
        setField(term966, term966.getClass(), "clause", null);
        setIntField(term966, term966.getClass(), "startPos", -243422082);
        setField(term965, term965.getClass(), "memoKey", term966);
        setIntField(term965, term965.getClass(), "len", 1384592638);
        setIntField(term965, term965.getClass(), "firstMatchingSubClauseIdx", -1002370457);
        setField(term965, term965.getClass(), "subClauseMatches", term970);
        setElement(term964, 0, term965);
        setField(term972, term972.getClass(), "clause", null);
        setIntField(term972, term972.getClass(), "startPos", 663292551);
        setField(term971, term971.getClass(), "memoKey", term972);
        setIntField(term971, term971.getClass(), "len", -1885090354);
        setIntField(term971, term971.getClass(), "firstMatchingSubClauseIdx", -2066804303);
        setElement(term976, 2, term965);
        setElement(term976, 3, term965);
        setField(term971, term971.getClass(), "subClauseMatches", term976);
        setElement(term964, 1, term971);
        setElement(term964, 2, term965);
        setField(term977, term977.getClass(), "memoKey", null);
        setIntField(term977, term977.getClass(), "len", 0);
        setIntField(term977, term977.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term977, term977.getClass(), "subClauseMatches", null);
        setElement(term964, 3, term977);
        setField(term959, term959.getClass(), "subClauseMatches", term964);
        setElement(term958, 0, term959);
        setElement(term958, 1, term977);
        setField(term980, term980.getClass(), "memoKey", null);
        setIntField(term980, term980.getClass(), "len", 0);
        setIntField(term980, term980.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term980, term980.getClass(), "subClauseMatches", null);
        setElement(term958, 2, term980);
        setField(term983, term983.getClass(), "memoKey", null);
        setIntField(term983, term983.getClass(), "len", 0);
        setIntField(term983, term983.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term983, term983.getClass(), "subClauseMatches", null);
        setElement(term958, 3, term983);
        setField(term987, term987.getClass(), "clause", null);
        setIntField(term987, term987.getClass(), "startPos", -2014576105);
        setField(term986, term986.getClass(), "memoKey", term987);
        setIntField(term986, term986.getClass(), "len", 1296895584);
        setIntField(term986, term986.getClass(), "firstMatchingSubClauseIdx", 628918458);
        setField(term986, term986.getClass(), "subClauseMatches", term991);
        setElement(term958, 4, term986);
        setElement(term958, 5, term977);
        setField(term993, term993.getClass(), "clause", null);
        setIntField(term993, term993.getClass(), "startPos", 0);
        setField(term992, term992.getClass(), "memoKey", term993);
        setIntField(term992, term992.getClass(), "len", -1731761810);
        setIntField(term992, term992.getClass(), "firstMatchingSubClauseIdx", 197109649);
        setElement(term997, 0, term977);
        setField(term998, term998.getClass(), "memoKey", null);
        setIntField(term998, term998.getClass(), "len", 0);
        setIntField(term998, term998.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term998, term998.getClass(), "subClauseMatches", null);
        setElement(term997, 1, term998);
        setElement(term997, 2, term980);
        setElement(term997, 3, term983);
        setElement(term997, 4, term998);
        setElement(term997, 5, term980);
        setElement(term997, 6, term959);
        setElement(term997, 7, term992);
        setField(term992, term992.getClass(), "subClauseMatches", term997);
        setElement(term958, 6, term992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Class.forName("pikaparser.memotable.Match"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term952;
        args[1] = term954;
        args[2] = term956;
        args[3] = term958;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


