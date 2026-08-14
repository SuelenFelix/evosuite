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
import java.util.ArrayList;
import java.lang.Object;

public class ASTNode_addNodesWithASTNodeLabelsRecursive_4642897462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;
     Object term351;

    public ASTNode_addNodesWithASTNodeLabelsRecursive_4642897462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term321 = new ArrayList();
        ((ArrayList) term321).add((Object)null);
        ((ArrayList) term321).add((Object)null);
        ((ArrayList) term321).add((Object)null);
        ((ArrayList) term321).add((Object)null);
        ((ArrayList) term321).add((Object)null);
        ((ArrayList) term321).add((Object)null);
        Object term316 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term316, term316.getClass(), "label", "");
        setField(term316, term316.getClass(), "nodeType", null);
        setIntField(term316, term316.getClass(), "startPos", -1786399638);
        setIntField(term316, term316.getClass(), "len", 2055867847);
        setField(term316, term316.getClass(), "input", "");
        setField(term316, term316.getClass(), "children", term321);
        ArrayList term329 = new ArrayList();
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        Object term324 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term324, term324.getClass(), "label", "");
        setField(term324, term324.getClass(), "nodeType", null);
        setIntField(term324, term324.getClass(), "startPos", 493620644);
        setIntField(term324, term324.getClass(), "len", 1328271830);
        setField(term324, term324.getClass(), "input", "");
        setField(term324, term324.getClass(), "children", term329);
        Object term332 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term332, term332.getClass(), "label", null);
        setField(term332, term332.getClass(), "nodeType", null);
        setIntField(term332, term332.getClass(), "startPos", 0);
        setIntField(term332, term332.getClass(), "len", 0);
        setField(term332, term332.getClass(), "input", null);
        setField(term332, term332.getClass(), "children", null);
        Object term335 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term335, term335.getClass(), "label", null);
        setField(term335, term335.getClass(), "nodeType", null);
        setIntField(term335, term335.getClass(), "startPos", 0);
        setIntField(term335, term335.getClass(), "len", 0);
        setField(term335, term335.getClass(), "input", null);
        setField(term335, term335.getClass(), "children", null);
        Object term338 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term338, term338.getClass(), "label", null);
        setField(term338, term338.getClass(), "nodeType", null);
        setIntField(term338, term338.getClass(), "startPos", 0);
        setIntField(term338, term338.getClass(), "len", 0);
        setField(term338, term338.getClass(), "input", null);
        setField(term338, term338.getClass(), "children", null);
        ArrayList term346 = new ArrayList();
        ((ArrayList) term346).add((Object)null);
        ((ArrayList) term346).add((Object)null);
        Object term341 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term341, term341.getClass(), "label", "");
        setField(term341, term341.getClass(), "nodeType", null);
        setIntField(term341, term341.getClass(), "startPos", -1048298087);
        setIntField(term341, term341.getClass(), "len", 292681826);
        setField(term341, term341.getClass(), "input", "");
        setField(term341, term341.getClass(), "children", term346);
        ArrayList term314 = new ArrayList();
        ((ArrayList) term314).add(term316);
        ((ArrayList) term314).add(term324);
        ((ArrayList) term314).add(term332);
        ((ArrayList) term314).add(term335);
        ((ArrayList) term314).add(term338);
        ((ArrayList) term314).add(term341);
        ((ArrayList) term314).add(term324);
        ((ArrayList) term314).add(term335);
        term287 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term287, term287.getClass(), "label", "RMFIsYGgne");
        setField(term287, term287.getClass(), "nodeType", null);
        setIntField(term287, term287.getClass(), "startPos", 1632125673);
        setIntField(term287, term287.getClass(), "len", 454281060);
        setField(term287, term287.getClass(), "input", "NRdvgJlhkX");
        setField(term287, term287.getClass(), "children", term314);
        term351 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term352 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term356 = (Object[]) newArray("pikaparser.memotable.Match", 3);
        Object term357 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term358 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term362 = (Object[]) newArray("pikaparser.memotable.Match", 5);
        Object term363 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term366 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term369 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term372 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term375 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term376 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term380 = (Object[]) newArray("pikaparser.memotable.Match", 5);
        Object term381 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term352, term352.getClass(), "clause", null);
        setIntField(term352, term352.getClass(), "startPos", 1596070772);
        setField(term351, term351.getClass(), "memoKey", term352);
        setIntField(term351, term351.getClass(), "len", 97029295);
        setIntField(term351, term351.getClass(), "firstMatchingSubClauseIdx", -1371869594);
        setField(term358, term358.getClass(), "clause", null);
        setIntField(term358, term358.getClass(), "startPos", -2095575670);
        setField(term357, term357.getClass(), "memoKey", term358);
        setIntField(term357, term357.getClass(), "len", 1225272962);
        setIntField(term357, term357.getClass(), "firstMatchingSubClauseIdx", 1324040357);
        setField(term363, term363.getClass(), "memoKey", null);
        setIntField(term363, term363.getClass(), "len", -93135961);
        setIntField(term363, term363.getClass(), "firstMatchingSubClauseIdx", -112921587);
        setField(term363, term363.getClass(), "subClauseMatches", null);
        setElement(term362, 0, term363);
        setElement(term362, 1, term363);
        setField(term366, term366.getClass(), "memoKey", null);
        setIntField(term366, term366.getClass(), "len", 1540719661);
        setIntField(term366, term366.getClass(), "firstMatchingSubClauseIdx", 1265463001);
        setField(term366, term366.getClass(), "subClauseMatches", null);
        setElement(term362, 2, term366);
        setField(term369, term369.getClass(), "memoKey", null);
        setIntField(term369, term369.getClass(), "len", 0);
        setIntField(term369, term369.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term369, term369.getClass(), "subClauseMatches", null);
        setElement(term362, 3, term369);
        setField(term372, term372.getClass(), "memoKey", null);
        setIntField(term372, term372.getClass(), "len", 0);
        setIntField(term372, term372.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term372, term372.getClass(), "subClauseMatches", null);
        setElement(term362, 4, term372);
        setField(term357, term357.getClass(), "subClauseMatches", term362);
        setElement(term356, 0, term357);
        setElement(term356, 1, term372);
        setField(term376, term376.getClass(), "clause", null);
        setIntField(term376, term376.getClass(), "startPos", 933028652);
        setField(term375, term375.getClass(), "memoKey", term376);
        setIntField(term375, term375.getClass(), "len", 287287233);
        setIntField(term375, term375.getClass(), "firstMatchingSubClauseIdx", 962840079);
        setElement(term380, 0, term366);
        setField(term381, term381.getClass(), "memoKey", null);
        setIntField(term381, term381.getClass(), "len", 335112684);
        setIntField(term381, term381.getClass(), "firstMatchingSubClauseIdx", 1551099402);
        setField(term381, term381.getClass(), "subClauseMatches", null);
        setElement(term380, 1, term381);
        setElement(term380, 2, term357);
        setElement(term380, 3, term372);
        setElement(term380, 4, term369);
        setField(term375, term375.getClass(), "subClauseMatches", term380);
        setElement(term356, 2, term375);
        setField(term351, term351.getClass(), "subClauseMatches", term356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.ast.ASTNode");
        argTypes[1] = Class.forName("pikaparser.memotable.Match");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term287;
        args[1] = term351;
        args[2] = "pCTimMblYc";
        callMethod(klass, "addNodesWithASTNodeLabelsRecursive", argTypes, null, args);
    }

};


