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

public class FollowedBy_toString_17167222683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6942;

    public FollowedBy_toString_17167222683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7049 = new ArrayList();
        ArrayList term7053 = new ArrayList();
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        term6942 = newInstance(Class.forName("pikaparser.clause.nonterminal.FollowedBy"));
        Object[] term6943 = (Object[]) newArray("pikaparser.ast.LabeledClause", 9);
        Object term6944 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6957 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6970 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6983 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6996 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term7009 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term7022 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term7035 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term7048 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6944, term6944.getClass(), "clause", null);
        setField(term6944, term6944.getClass(), "astNodeLabel", "XfRABIFVEp");
        setElement(term6943, 0, term6944);
        setField(term6957, term6957.getClass(), "clause", null);
        setField(term6957, term6957.getClass(), "astNodeLabel", "MHGKyEnwKc");
        setElement(term6943, 1, term6957);
        setField(term6970, term6970.getClass(), "clause", null);
        setField(term6970, term6970.getClass(), "astNodeLabel", "ShIELyuULw");
        setElement(term6943, 2, term6970);
        setField(term6983, term6983.getClass(), "clause", null);
        setField(term6983, term6983.getClass(), "astNodeLabel", "IpQuOGMgmj");
        setElement(term6943, 3, term6983);
        setField(term6996, term6996.getClass(), "clause", null);
        setField(term6996, term6996.getClass(), "astNodeLabel", "pJbnHTYrxn");
        setElement(term6943, 4, term6996);
        setField(term7009, term7009.getClass(), "clause", null);
        setField(term7009, term7009.getClass(), "astNodeLabel", "iIRsCSYqXH");
        setElement(term6943, 5, term7009);
        setField(term7022, term7022.getClass(), "clause", null);
        setField(term7022, term7022.getClass(), "astNodeLabel", "nghfqDXyCG");
        setElement(term6943, 6, term7022);
        setField(term7035, term7035.getClass(), "clause", null);
        setField(term7035, term7035.getClass(), "astNodeLabel", "WBAOTqErtm");
        setElement(term6943, 7, term7035);
        setField(term7048, term7048.getClass(), "clause", null);
        setField(term7048, term7048.getClass(), "astNodeLabel", null);
        setElement(term6943, 8, term7048);
        setField(term6942, term6942.getClass(), "labeledSubClauses", term6943);
        setField(term6942, term6942.getClass(), "rules", term7049);
        setField(term6942, term6942.getClass(), "seedParentClauses", term7053);
        setBooleanField(term6942, term6942.getClass(), "canMatchZeroChars", true);
        setIntField(term6942, term6942.getClass(), "clauseIdx", 1598895173);
        setField(term6942, term6942.getClass(), "toStringCached", "PqtVXXZMqK");
        setField(term6942, term6942.getClass(), "toStringWithRuleNameCached", "rYbtIDVdnd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.FollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6942, args);
    }

};


