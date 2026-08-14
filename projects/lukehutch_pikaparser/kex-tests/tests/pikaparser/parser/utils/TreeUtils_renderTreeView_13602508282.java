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
import java.lang.Boolean;

public class TreeUtils_renderTreeView_13602508282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843;
     Object term1891;
     Object term1893;

    public TreeUtils_renderTreeView_13602508282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1843 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1844 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1848 = (Object[]) newArray("pikaparser.memotable.Match", 1);
        Object term1849 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1850 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1854 = (Object[]) newArray("pikaparser.memotable.Match", 0);
        setField(term1844, term1844.getClass(), "clause", null);
        setIntField(term1844, term1844.getClass(), "startPos", 679763016);
        setField(term1843, term1843.getClass(), "memoKey", term1844);
        setIntField(term1843, term1843.getClass(), "len", 1962444399);
        setIntField(term1843, term1843.getClass(), "firstMatchingSubClauseIdx", 767834723);
        setField(term1850, term1850.getClass(), "clause", null);
        setIntField(term1850, term1850.getClass(), "startPos", -602026508);
        setField(term1849, term1849.getClass(), "memoKey", term1850);
        setIntField(term1849, term1849.getClass(), "len", -157887805);
        setIntField(term1849, term1849.getClass(), "firstMatchingSubClauseIdx", 1876565163);
        setField(term1849, term1849.getClass(), "subClauseMatches", term1854);
        setElement(term1848, 0, term1849);
        setField(term1843, term1843.getClass(), "subClauseMatches", term1848);
        term1891 = new Boolean(false);
        term1893 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1894 = (byte[]) newByteArray(16);
        setField(term1893, term1893.getClass(), "value", term1894);
        setByteField(term1893, term1893.getClass(), "coder", (byte) 89);
        setIntField(term1893, term1893.getClass(), "count", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.TreeUtils");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("pikaparser.memotable.Match");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[6];
        args[0] = term1843;
        args[1] = "qxSDVejjiY";
        args[2] = "xBsXSDjXYK";
        args[3] = "sEnIVFtZuQ";
        args[4] = term1891;
        args[5] = term1893;
        callMethod(klass, "renderTreeView", argTypes, null, args);
    }

};


