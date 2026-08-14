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

public class Start_determineWhetherCanMatchZeroChars_16932008815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367;

    public Start_determineWhetherCanMatchZeroChars_16932008815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1367 = newInstance(Class.forName("pikaparser.clause.terminal.Start"));
        setField(term1367, term1367.getClass(), "labeledSubClauses", null);
        setField(term1367, term1367.getClass(), "rules", null);
        setField(term1367, term1367.getClass(), "seedParentClauses", null);
        setBooleanField(term1367, term1367.getClass(), "canMatchZeroChars", false);
        setIntField(term1367, term1367.getClass(), "clauseIdx", 0);
        setField(term1367, term1367.getClass(), "toStringCached", null);
        setField(term1367, term1367.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Start");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1367, args);
    }

};


