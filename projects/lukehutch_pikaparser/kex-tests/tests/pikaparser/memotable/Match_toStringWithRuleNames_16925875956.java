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

public class Match_toStringWithRuleNames_16925875956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1096;

    public Match_toStringWithRuleNames_16925875956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1096 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1097 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1101 = (Object[]) newArray("pikaparser.memotable.Match", 9);
        Object term1102 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1103 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1107 = (Object[]) newArray("pikaparser.memotable.Match", 0);
        Object term1108 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1109 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1113 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term1114 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1117 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1120 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1123 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1126 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1129 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1130 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1134 = (Object[]) newArray("pikaparser.memotable.Match", 9);
        Object term1135 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1097, term1097.getClass(), "clause", null);
        setIntField(term1097, term1097.getClass(), "startPos", 388157121);
        setField(term1096, term1096.getClass(), "memoKey", term1097);
        setIntField(term1096, term1096.getClass(), "len", 1684998508);
        setIntField(term1096, term1096.getClass(), "firstMatchingSubClauseIdx", -1476644457);
        setField(term1103, term1103.getClass(), "clause", null);
        setIntField(term1103, term1103.getClass(), "startPos", 1270666529);
        setField(term1102, term1102.getClass(), "memoKey", term1103);
        setIntField(term1102, term1102.getClass(), "len", -1146679443);
        setIntField(term1102, term1102.getClass(), "firstMatchingSubClauseIdx", -860131894);
        setField(term1102, term1102.getClass(), "subClauseMatches", term1107);
        setElement(term1101, 0, term1102);
        setField(term1109, term1109.getClass(), "clause", null);
        setIntField(term1109, term1109.getClass(), "startPos", -1022990421);
        setField(term1108, term1108.getClass(), "memoKey", term1109);
        setIntField(term1108, term1108.getClass(), "len", 1045547089);
        setIntField(term1108, term1108.getClass(), "firstMatchingSubClauseIdx", -1122880881);
        setField(term1114, term1114.getClass(), "memoKey", null);
        setIntField(term1114, term1114.getClass(), "len", -1254072822);
        setIntField(term1114, term1114.getClass(), "firstMatchingSubClauseIdx", -1111249833);
        setField(term1114, term1114.getClass(), "subClauseMatches", null);
        setElement(term1113, 0, term1114);
        setElement(term1113, 1, term1114);
        setField(term1117, term1117.getClass(), "memoKey", null);
        setIntField(term1117, term1117.getClass(), "len", 479531250);
        setIntField(term1117, term1117.getClass(), "firstMatchingSubClauseIdx", 1320570890);
        setField(term1117, term1117.getClass(), "subClauseMatches", null);
        setElement(term1113, 2, term1117);
        setElement(term1113, 3, term1117);
        setElement(term1113, 4, term1102);
        setField(term1120, term1120.getClass(), "memoKey", null);
        setIntField(term1120, term1120.getClass(), "len", 0);
        setIntField(term1120, term1120.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1120, term1120.getClass(), "subClauseMatches", null);
        setElement(term1113, 5, term1120);
        setElement(term1113, 6, term1120);
        setField(term1123, term1123.getClass(), "memoKey", null);
        setIntField(term1123, term1123.getClass(), "len", 0);
        setIntField(term1123, term1123.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1123, term1123.getClass(), "subClauseMatches", null);
        setElement(term1113, 7, term1123);
        setField(term1108, term1108.getClass(), "subClauseMatches", term1113);
        setElement(term1101, 1, term1108);
        setField(term1126, term1126.getClass(), "memoKey", null);
        setIntField(term1126, term1126.getClass(), "len", 0);
        setIntField(term1126, term1126.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1126, term1126.getClass(), "subClauseMatches", null);
        setElement(term1101, 2, term1126);
        setElement(term1101, 3, term1108);
        setElement(term1101, 4, term1120);
        setField(term1130, term1130.getClass(), "clause", null);
        setIntField(term1130, term1130.getClass(), "startPos", 0);
        setField(term1129, term1129.getClass(), "memoKey", term1130);
        setIntField(term1129, term1129.getClass(), "len", -130649791);
        setIntField(term1129, term1129.getClass(), "firstMatchingSubClauseIdx", 534834644);
        setElement(term1134, 0, term1120);
        setField(term1135, term1135.getClass(), "memoKey", null);
        setIntField(term1135, term1135.getClass(), "len", 0);
        setIntField(term1135, term1135.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1135, term1135.getClass(), "subClauseMatches", null);
        setElement(term1134, 1, term1135);
        setElement(term1134, 2, term1123);
        setElement(term1134, 3, term1126);
        setElement(term1134, 4, term1135);
        setElement(term1134, 5, term1123);
        setElement(term1134, 6, term1096);
        setElement(term1134, 7, term1129);
        setElement(term1134, 8, term1114);
        setField(term1129, term1129.getClass(), "subClauseMatches", term1134);
        setElement(term1101, 5, term1129);
        setElement(term1101, 6, term1102);
        setElement(term1101, 7, term1135);
        setElement(term1101, 8, term1129);
        setField(term1096, term1096.getClass(), "subClauseMatches", term1101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toStringWithRuleNames", argTypes, term1096, args);
    }

};


