package pikaparser.clause.terminal;

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
import static pikaparser.clause.terminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharSeq_determineWhetherCanMatchZeroChars_15747085205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6865;

    public CharSeq_determineWhetherCanMatchZeroChars_15747085205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6865 = newInstance(Class.forName("pikaparser.clause.terminal.CharSeq"));
        setField(term6865, term6865.getClass(), "str", null);
        setBooleanField(term6865, term6865.getClass(), "ignoreCase", false);
        setField(term6865, term6865.getClass(), "labeledSubClauses", null);
        setField(term6865, term6865.getClass(), "rules", null);
        setField(term6865, term6865.getClass(), "seedParentClauses", null);
        setBooleanField(term6865, term6865.getClass(), "canMatchZeroChars", false);
        setIntField(term6865, term6865.getClass(), "clauseIdx", 0);
        setField(term6865, term6865.getClass(), "toStringCached", null);
        setField(term6865, term6865.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSeq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term6865, args);
    }

};


