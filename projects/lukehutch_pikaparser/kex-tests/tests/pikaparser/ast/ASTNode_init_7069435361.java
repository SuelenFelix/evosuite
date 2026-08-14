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

public class ASTNode_init_7069435361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;

    public ASTNode_init_7069435361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term223 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term227 = (Object[]) newArray("pikaparser.memotable.Match", 5);
        Object term228 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term229 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term233 = (Object[]) newArray("pikaparser.memotable.Match", 5);
        Object term234 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term237 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term240 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term243 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term246 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term249 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term250 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term254 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        setField(term223, term223.getClass(), "clause", null);
        setIntField(term223, term223.getClass(), "startPos", -73683645);
        setField(term222, term222.getClass(), "memoKey", term223);
        setIntField(term222, term222.getClass(), "len", -226514366);
        setIntField(term222, term222.getClass(), "firstMatchingSubClauseIdx", 1193880199);
        setField(term229, term229.getClass(), "clause", null);
        setIntField(term229, term229.getClass(), "startPos", -1087774327);
        setField(term228, term228.getClass(), "memoKey", term229);
        setIntField(term228, term228.getClass(), "len", -1530420153);
        setIntField(term228, term228.getClass(), "firstMatchingSubClauseIdx", -469968304);
        setField(term234, term234.getClass(), "memoKey", null);
        setIntField(term234, term234.getClass(), "len", 679763016);
        setIntField(term234, term234.getClass(), "firstMatchingSubClauseIdx", 1962444399);
        setField(term234, term234.getClass(), "subClauseMatches", null);
        setElement(term233, 0, term234);
        setField(term237, term237.getClass(), "memoKey", null);
        setIntField(term237, term237.getClass(), "len", 0);
        setIntField(term237, term237.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term237, term237.getClass(), "subClauseMatches", null);
        setElement(term233, 1, term237);
        setElement(term233, 2, term222);
        setField(term240, term240.getClass(), "memoKey", null);
        setIntField(term240, term240.getClass(), "len", 0);
        setIntField(term240, term240.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term240, term240.getClass(), "subClauseMatches", null);
        setElement(term233, 3, term240);
        setField(term243, term243.getClass(), "memoKey", null);
        setIntField(term243, term243.getClass(), "len", -602026508);
        setIntField(term243, term243.getClass(), "firstMatchingSubClauseIdx", -157887805);
        setField(term243, term243.getClass(), "subClauseMatches", null);
        setElement(term233, 4, term243);
        setField(term228, term228.getClass(), "subClauseMatches", term233);
        setElement(term227, 0, term228);
        setElement(term227, 1, term228);
        setElement(term227, 2, term228);
        setField(term246, term246.getClass(), "memoKey", null);
        setIntField(term246, term246.getClass(), "len", 0);
        setIntField(term246, term246.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term246, term246.getClass(), "subClauseMatches", null);
        setElement(term227, 3, term246);
        setField(term250, term250.getClass(), "clause", null);
        setIntField(term250, term250.getClass(), "startPos", 0);
        setField(term249, term249.getClass(), "memoKey", term250);
        setIntField(term249, term249.getClass(), "len", 579005622);
        setIntField(term249, term249.getClass(), "firstMatchingSubClauseIdx", -14890619);
        setElement(term254, 0, term237);
        setElement(term254, 1, term246);
        setField(term249, term249.getClass(), "subClauseMatches", term254);
        setElement(term227, 4, term249);
        setField(term222, term222.getClass(), "subClauseMatches", term227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("pikaparser.memotable.Match");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "MjGYSRKTNF";
        args[1] = term222;
        args[2] = "hRNSzYYIrc";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


