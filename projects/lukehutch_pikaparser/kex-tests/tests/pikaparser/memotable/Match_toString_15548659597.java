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

public class Match_toString_15548659597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138;

    public Match_toString_15548659597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1138 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1139 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1143 = (Object[]) newArray("pikaparser.memotable.Match", 6);
        Object term1144 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1145 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1149 = (Object[]) newArray("pikaparser.memotable.Match", 7);
        Object term1150 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1153 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1156 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1159 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1162 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1165 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term1166 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term1170 = (Object[]) newArray("pikaparser.memotable.Match", 3);
        setField(term1139, term1139.getClass(), "clause", null);
        setIntField(term1139, term1139.getClass(), "startPos", 1959097203);
        setField(term1138, term1138.getClass(), "memoKey", term1139);
        setIntField(term1138, term1138.getClass(), "len", -209654048);
        setIntField(term1138, term1138.getClass(), "firstMatchingSubClauseIdx", 477625804);
        setField(term1145, term1145.getClass(), "clause", null);
        setIntField(term1145, term1145.getClass(), "startPos", 252575029);
        setField(term1144, term1144.getClass(), "memoKey", term1145);
        setIntField(term1144, term1144.getClass(), "len", 57189932);
        setIntField(term1144, term1144.getClass(), "firstMatchingSubClauseIdx", 1460722225);
        setField(term1150, term1150.getClass(), "memoKey", null);
        setIntField(term1150, term1150.getClass(), "len", 842904495);
        setIntField(term1150, term1150.getClass(), "firstMatchingSubClauseIdx", 1008080511);
        setField(term1150, term1150.getClass(), "subClauseMatches", null);
        setElement(term1149, 0, term1150);
        setField(term1153, term1153.getClass(), "memoKey", null);
        setIntField(term1153, term1153.getClass(), "len", -1183353915);
        setIntField(term1153, term1153.getClass(), "firstMatchingSubClauseIdx", -420030135);
        setField(term1153, term1153.getClass(), "subClauseMatches", null);
        setElement(term1149, 1, term1153);
        setField(term1156, term1156.getClass(), "memoKey", null);
        setIntField(term1156, term1156.getClass(), "len", 0);
        setIntField(term1156, term1156.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1156, term1156.getClass(), "subClauseMatches", null);
        setElement(term1149, 2, term1156);
        setField(term1159, term1159.getClass(), "memoKey", null);
        setIntField(term1159, term1159.getClass(), "len", 0);
        setIntField(term1159, term1159.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1159, term1159.getClass(), "subClauseMatches", null);
        setElement(term1149, 3, term1159);
        setField(term1162, term1162.getClass(), "memoKey", null);
        setIntField(term1162, term1162.getClass(), "len", 0);
        setIntField(term1162, term1162.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term1162, term1162.getClass(), "subClauseMatches", null);
        setElement(term1149, 4, term1162);
        setElement(term1149, 5, term1150);
        setElement(term1149, 6, term1153);
        setField(term1144, term1144.getClass(), "subClauseMatches", term1149);
        setElement(term1143, 0, term1144);
        setElement(term1143, 1, term1159);
        setElement(term1143, 2, term1156);
        setElement(term1143, 3, term1156);
        setField(term1166, term1166.getClass(), "clause", null);
        setIntField(term1166, term1166.getClass(), "startPos", 1935707624);
        setField(term1165, term1165.getClass(), "memoKey", term1166);
        setIntField(term1165, term1165.getClass(), "len", 1507074215);
        setIntField(term1165, term1165.getClass(), "firstMatchingSubClauseIdx", -282881827);
        setElement(term1170, 0, term1153);
        setElement(term1170, 1, term1138);
        setElement(term1170, 2, term1162);
        setField(term1165, term1165.getClass(), "subClauseMatches", term1170);
        setElement(term1143, 4, term1165);
        setElement(term1143, 5, term1153);
        setField(term1138, term1138.getClass(), "subClauseMatches", term1143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1138, args);
    }

};


