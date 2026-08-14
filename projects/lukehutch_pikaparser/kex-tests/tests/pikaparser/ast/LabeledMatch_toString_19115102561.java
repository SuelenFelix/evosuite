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

public class LabeledMatch_toString_19115102561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;

    public LabeledMatch_toString_19115102561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("pikaparser.ast.LabeledMatch"));
        Object term124 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term125 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term129 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term130 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term131 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term135 = (Object[]) newArray("pikaparser.memotable.Match", 6);
        Object term136 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term125, term125.getClass(), "clause", null);
        setIntField(term125, term125.getClass(), "startPos", -1685132342);
        setField(term124, term124.getClass(), "memoKey", term125);
        setIntField(term124, term124.getClass(), "len", -1456670397);
        setIntField(term124, term124.getClass(), "firstMatchingSubClauseIdx", 1622346318);
        setField(term131, term131.getClass(), "clause", null);
        setIntField(term131, term131.getClass(), "startPos", 1048535127);
        setField(term130, term130.getClass(), "memoKey", term131);
        setIntField(term130, term130.getClass(), "len", -655067527);
        setIntField(term130, term130.getClass(), "firstMatchingSubClauseIdx", -6029667);
        setField(term130, term130.getClass(), "subClauseMatches", term135);
        setElement(term129, 0, term130);
        setField(term136, term136.getClass(), "memoKey", null);
        setIntField(term136, term136.getClass(), "len", 0);
        setIntField(term136, term136.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term136, term136.getClass(), "subClauseMatches", null);
        setElement(term129, 1, term136);
        setField(term124, term124.getClass(), "subClauseMatches", term129);
        setField(term123, term123.getClass(), "match", term124);
        setField(term123, term123.getClass(), "astNodeLabel", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.LabeledMatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term123, args);
    }

};


