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

public class Match_isBetterThan_16247374505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;
     Object term1069;

    public Match_isBetterThan_16247374505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1033 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1034 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1038 = (Object[]) newArray("pikaparser.memotable.Match", 5);
        Object term1039 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1040 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1044 = (Object[]) newArray("pikaparser.memotable.Match", 4);
        Object term1045 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1048 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1051 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1054 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1055 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1059 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term1060 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1063 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1066 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1034, term1034.getClass(), "clause", null);
        setIntField(term1034, term1034.getClass(), "startPos", 1152356969);
        setField(term1033, term1033.getClass(), "memoKey", term1034);
        setIntField(term1033, term1033.getClass(), "len", -1667990367);
        setIntField(term1033, term1033.getClass(), "firstMatchingSubClauseIdx", -1214628358);
        setField(term1040, term1040.getClass(), "clause", null);
        setIntField(term1040, term1040.getClass(), "startPos", 1102721075);
        setField(term1039, term1039.getClass(), "memoKey", term1040);
        setIntField(term1039, term1039.getClass(), "len", -426764678);
        setIntField(term1039, term1039.getClass(), "firstMatchingSubClauseIdx", -1222614956);
        setField(term1045, term1045.getClass(), "memoKey", null);
        setIntField(term1045, term1045.getClass(), "len", -1310015129);
        setIntField(term1045, term1045.getClass(), "firstMatchingSubClauseIdx", -2104981311);
        setField(term1045, term1045.getClass(), "subClauseMatches", null);
        setElement(term1044, 0, term1045);
        setField(term1048, term1048.getClass(), "memoKey", null);
        setIntField(term1048, term1048.getClass(), "len", 0);
        setIntField(term1048, term1048.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1048, term1048.getClass(), "subClauseMatches", null);
        setElement(term1044, 1, term1048);
        setField(term1051, term1051.getClass(), "memoKey", null);
        setIntField(term1051, term1051.getClass(), "len", 0);
        setIntField(term1051, term1051.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1051, term1051.getClass(), "subClauseMatches", null);
        setElement(term1044, 2, term1051);
        setElement(term1044, 3, term1045);
        setField(term1039, term1039.getClass(), "subClauseMatches", term1044);
        setElement(term1038, 0, term1039);
        setField(term1055, term1055.getClass(), "clause", null);
        setIntField(term1055, term1055.getClass(), "startPos", 0);
        setField(term1054, term1054.getClass(), "memoKey", term1055);
        setIntField(term1054, term1054.getClass(), "len", -1347358701);
        setIntField(term1054, term1054.getClass(), "firstMatchingSubClauseIdx", 806595993);
        setElement(term1059, 0, term1051);
        setField(term1060, term1060.getClass(), "memoKey", null);
        setIntField(term1060, term1060.getClass(), "len", 0);
        setIntField(term1060, term1060.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1060, term1060.getClass(), "subClauseMatches", null);
        setElement(term1059, 1, term1060);
        setElement(term1059, 2, term1048);
        setField(term1063, term1063.getClass(), "memoKey", null);
        setIntField(term1063, term1063.getClass(), "len", 0);
        setIntField(term1063, term1063.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1063, term1063.getClass(), "subClauseMatches", null);
        setElement(term1059, 3, term1063);
        setField(term1066, term1066.getClass(), "memoKey", null);
        setIntField(term1066, term1066.getClass(), "len", 0);
        setIntField(term1066, term1066.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1066, term1066.getClass(), "subClauseMatches", null);
        setElement(term1059, 4, term1066);
        setElement(term1059, 5, term1048);
        setElement(term1059, 6, term1063);
        setElement(term1059, 7, term1033);
        setField(term1054, term1054.getClass(), "subClauseMatches", term1059);
        setElement(term1038, 1, term1054);
        setElement(term1038, 2, term1048);
        setElement(term1038, 3, term1066);
        setElement(term1038, 4, term1066);
        setField(term1033, term1033.getClass(), "subClauseMatches", term1038);
        term1069 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1070 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1074 = (Object[]) newArray("pikaparser.memotable.Match", 1);
        Object term1075 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1076 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1080 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term1081 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1084 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1087 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1090 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1093 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term1070, term1070.getClass(), "clause", null);
        setIntField(term1070, term1070.getClass(), "startPos", 548228925);
        setField(term1069, term1069.getClass(), "memoKey", term1070);
        setIntField(term1069, term1069.getClass(), "len", -749861210);
        setIntField(term1069, term1069.getClass(), "firstMatchingSubClauseIdx", 1694224101);
        setField(term1076, term1076.getClass(), "clause", null);
        setIntField(term1076, term1076.getClass(), "startPos", 937859191);
        setField(term1075, term1075.getClass(), "memoKey", term1076);
        setIntField(term1075, term1075.getClass(), "len", -916584829);
        setIntField(term1075, term1075.getClass(), "firstMatchingSubClauseIdx", -2131181468);
        setField(term1081, term1081.getClass(), "memoKey", null);
        setIntField(term1081, term1081.getClass(), "len", 880977281);
        setIntField(term1081, term1081.getClass(), "firstMatchingSubClauseIdx", 371943306);
        setField(term1081, term1081.getClass(), "subClauseMatches", null);
        setElement(term1080, 0, term1081);
        setField(term1084, term1084.getClass(), "memoKey", null);
        setIntField(term1084, term1084.getClass(), "len", 0);
        setIntField(term1084, term1084.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1084, term1084.getClass(), "subClauseMatches", null);
        setElement(term1080, 1, term1084);
        setElement(term1080, 2, term1069);
        setField(term1087, term1087.getClass(), "memoKey", null);
        setIntField(term1087, term1087.getClass(), "len", 0);
        setIntField(term1087, term1087.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1087, term1087.getClass(), "subClauseMatches", null);
        setElement(term1080, 3, term1087);
        setField(term1090, term1090.getClass(), "memoKey", null);
        setIntField(term1090, term1090.getClass(), "len", -159494544);
        setIntField(term1090, term1090.getClass(), "firstMatchingSubClauseIdx", -75206835);
        setField(term1090, term1090.getClass(), "subClauseMatches", null);
        setElement(term1080, 4, term1090);
        setElement(term1080, 5, term1075);
        setElement(term1080, 6, term1075);
        setField(term1093, term1093.getClass(), "memoKey", null);
        setIntField(term1093, term1093.getClass(), "len", 0);
        setIntField(term1093, term1093.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1093, term1093.getClass(), "subClauseMatches", null);
        setElement(term1080, 7, term1093);
        setField(term1075, term1075.getClass(), "subClauseMatches", term1080);
        setElement(term1074, 0, term1075);
        setField(term1069, term1069.getClass(), "subClauseMatches", term1074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.memotable.Match");
        Object[] args = new Object[1];
        args[0] = term1069;
        callMethod(klass, "isBetterThan", argTypes, term1033, args);
    }

};


