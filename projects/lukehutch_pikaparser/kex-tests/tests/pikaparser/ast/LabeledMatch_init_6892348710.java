package pikaparser.ast;

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
import static pikaparser.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LabeledMatch_init_6892348710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public LabeledMatch_init_6892348710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term72 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term76 = (Object[]) newArray("pikaparser.memotable.Match", 5);
        Object term77 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term78 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term82 = (Object[]) newArray("pikaparser.memotable.Match", 4);
        Object term83 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term86 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term89 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term92 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term93 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term97 = (Object[]) newArray("pikaparser.memotable.Match", 1);
        Object term98 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term72, term72.getClass(), "clause", null);
        setIntField(term72, term72.getClass(), "startPos", 568599855);
        setField(term71, term71.getClass(), "memoKey", term72);
        setIntField(term71, term71.getClass(), "len", 1162663216);
        setIntField(term71, term71.getClass(), "firstMatchingSubClauseIdx", 1484323161);
        setField(term78, term78.getClass(), "clause", null);
        setIntField(term78, term78.getClass(), "startPos", 391863371);
        setField(term77, term77.getClass(), "memoKey", term78);
        setIntField(term77, term77.getClass(), "len", -1922583790);
        setIntField(term77, term77.getClass(), "firstMatchingSubClauseIdx", -616727354);
        setField(term83, term83.getClass(), "memoKey", null);
        setIntField(term83, term83.getClass(), "len", -2038273078);
        setIntField(term83, term83.getClass(), "firstMatchingSubClauseIdx", 1227103734);
        setField(term83, term83.getClass(), "subClauseMatches", null);
        setElement(term82, 0, term83);
        setField(term86, term86.getClass(), "memoKey", null);
        setIntField(term86, term86.getClass(), "len", 0);
        setIntField(term86, term86.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term86, term86.getClass(), "subClauseMatches", null);
        setElement(term82, 1, term86);
        setField(term89, term89.getClass(), "memoKey", null);
        setIntField(term89, term89.getClass(), "len", 0);
        setIntField(term89, term89.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term89, term89.getClass(), "subClauseMatches", null);
        setElement(term82, 2, term89);
        setElement(term82, 3, term89);
        setField(term77, term77.getClass(), "subClauseMatches", term82);
        setElement(term76, 0, term77);
        setField(term93, term93.getClass(), "clause", null);
        setIntField(term93, term93.getClass(), "startPos", 0);
        setField(term92, term92.getClass(), "memoKey", term93);
        setIntField(term92, term92.getClass(), "len", 1134449235);
        setIntField(term92, term92.getClass(), "firstMatchingSubClauseIdx", -883034806);
        setField(term98, term98.getClass(), "memoKey", null);
        setIntField(term98, term98.getClass(), "len", 0);
        setIntField(term98, term98.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term98, term98.getClass(), "subClauseMatches", null);
        setElement(term97, 0, term98);
        setField(term92, term92.getClass(), "subClauseMatches", term97);
        setElement(term76, 1, term92);
        setElement(term76, 2, term86);
        setElement(term76, 3, term89);
        setElement(term76, 4, term98);
        setField(term71, term71.getClass(), "subClauseMatches", term76);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.LabeledMatch");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.memotable.Match");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term71;
        args[1] = "xxtlPwDYFs";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


