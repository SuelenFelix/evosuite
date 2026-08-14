package pikaparser.clause.nonterminal;

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
import static pikaparser.clause.nonterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class NotFollowedBy_toString_9854150353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3798;

    public NotFollowedBy_toString_9854150353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3907 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3907, term3907.getClass(), "ruleName", null);
        setIntField(term3907, term3907.getClass(), "precedence", 0);
        setField(term3907, term3907.getClass(), "associativity", null);
        setField(term3907, term3907.getClass(), "labeledClause", null);
        Object term3909 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3909, term3909.getClass(), "ruleName", null);
        setIntField(term3909, term3909.getClass(), "precedence", 0);
        setField(term3909, term3909.getClass(), "associativity", null);
        setField(term3909, term3909.getClass(), "labeledClause", null);
        Object term3911 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3911, term3911.getClass(), "ruleName", null);
        setIntField(term3911, term3911.getClass(), "precedence", 0);
        setField(term3911, term3911.getClass(), "associativity", null);
        setField(term3911, term3911.getClass(), "labeledClause", null);
        Object term3913 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3913, term3913.getClass(), "ruleName", null);
        setIntField(term3913, term3913.getClass(), "precedence", 0);
        setField(term3913, term3913.getClass(), "associativity", null);
        setField(term3913, term3913.getClass(), "labeledClause", null);
        Object term3915 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3915, term3915.getClass(), "ruleName", null);
        setIntField(term3915, term3915.getClass(), "precedence", 0);
        setField(term3915, term3915.getClass(), "associativity", null);
        setField(term3915, term3915.getClass(), "labeledClause", null);
        Object term3917 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3917, term3917.getClass(), "ruleName", null);
        setIntField(term3917, term3917.getClass(), "precedence", 0);
        setField(term3917, term3917.getClass(), "associativity", null);
        setField(term3917, term3917.getClass(), "labeledClause", null);
        Object term3919 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3919, term3919.getClass(), "ruleName", null);
        setIntField(term3919, term3919.getClass(), "precedence", 0);
        setField(term3919, term3919.getClass(), "associativity", null);
        setField(term3919, term3919.getClass(), "labeledClause", null);
        ArrayList term3905 = new ArrayList();
        ((ArrayList) term3905).add(term3907);
        ((ArrayList) term3905).add(term3909);
        ((ArrayList) term3905).add(term3911);
        ((ArrayList) term3905).add(term3913);
        ((ArrayList) term3905).add(term3915);
        ((ArrayList) term3905).add(term3917);
        ((ArrayList) term3905).add(term3919);
        ArrayList term3923 = new ArrayList();
        ((ArrayList) term3923).add((Object)null);
        ((ArrayList) term3923).add((Object)null);
        ((ArrayList) term3923).add((Object)null);
        term3798 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        Object[] term3799 = (Object[]) newArray("pikaparser.ast.LabeledClause", 9);
        Object term3800 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3813 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3826 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3839 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3852 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3865 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3878 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3891 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3904 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3800, term3800.getClass(), "clause", null);
        setField(term3800, term3800.getClass(), "astNodeLabel", "wfaXBpWAUH");
        setElement(term3799, 0, term3800);
        setField(term3813, term3813.getClass(), "clause", null);
        setField(term3813, term3813.getClass(), "astNodeLabel", "VMeAzAHwZj");
        setElement(term3799, 1, term3813);
        setField(term3826, term3826.getClass(), "clause", null);
        setField(term3826, term3826.getClass(), "astNodeLabel", "PznxWXsZME");
        setElement(term3799, 2, term3826);
        setField(term3839, term3839.getClass(), "clause", null);
        setField(term3839, term3839.getClass(), "astNodeLabel", "ZzIujlwVsw");
        setElement(term3799, 3, term3839);
        setField(term3852, term3852.getClass(), "clause", null);
        setField(term3852, term3852.getClass(), "astNodeLabel", "LWyEaeIyAo");
        setElement(term3799, 4, term3852);
        setField(term3865, term3865.getClass(), "clause", null);
        setField(term3865, term3865.getClass(), "astNodeLabel", "yVMkkQhvmN");
        setElement(term3799, 5, term3865);
        setField(term3878, term3878.getClass(), "clause", null);
        setField(term3878, term3878.getClass(), "astNodeLabel", "mvrkADEgpp");
        setElement(term3799, 6, term3878);
        setField(term3891, term3891.getClass(), "clause", null);
        setField(term3891, term3891.getClass(), "astNodeLabel", "pXOkjyeIRb");
        setElement(term3799, 7, term3891);
        setField(term3904, term3904.getClass(), "clause", null);
        setField(term3904, term3904.getClass(), "astNodeLabel", null);
        setElement(term3799, 8, term3904);
        setField(term3798, term3798.getClass(), "labeledSubClauses", term3799);
        setField(term3798, term3798.getClass(), "rules", term3905);
        setField(term3798, term3798.getClass(), "seedParentClauses", term3923);
        setBooleanField(term3798, term3798.getClass(), "canMatchZeroChars", true);
        setIntField(term3798, term3798.getClass(), "clauseIdx", 1090617576);
        setField(term3798, term3798.getClass(), "toStringCached", "GgZWSjxjyE");
        setField(term3798, term3798.getClass(), "toStringWithRuleNameCached", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3798, args);
    }

};


