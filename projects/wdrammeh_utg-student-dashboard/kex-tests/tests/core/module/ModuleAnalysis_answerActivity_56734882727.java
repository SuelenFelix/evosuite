package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ModuleAnalysis_answerActivity_56734882727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27701;

    public ModuleAnalysis_answerActivity_56734882727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27701 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27701, term27701.getClass(), "APlusLabel", null);
        setField(term27701, term27701.getClass(), "ANeutralLabel", null);
        setField(term27701, term27701.getClass(), "AMinusLabel", null);
        setField(term27701, term27701.getClass(), "BPlusLabel", null);
        setField(term27701, term27701.getClass(), "BNeutralLabel", null);
        setField(term27701, term27701.getClass(), "BMinusLabel", null);
        setField(term27701, term27701.getClass(), "CPlusLabel", null);
        setField(term27701, term27701.getClass(), "CNeutralLabel", null);
        setField(term27701, term27701.getClass(), "CMinusLabel", null);
        setField(term27701, term27701.getClass(), "DLabel", null);
        setField(term27701, term27701.getClass(), "FLabel", null);
        setField(term27701, term27701.getClass(), "highestScoreLabel", null);
        setField(term27701, term27701.getClass(), "lowestScoreLabel", null);
        setField(term27701, term27701.getClass(), "highestMajorScoreLabel", null);
        setField(term27701, term27701.getClass(), "lowestMajorScoreLabel", null);
        setField(term27701, term27701.getClass(), "highestMinorScoreLabel", null);
        setField(term27701, term27701.getClass(), "lowestMinorScoreLabel", null);
        setField(term27701, term27701.getClass(), "highestDERScoreLabel", null);
        setField(term27701, term27701.getClass(), "lowestDERScoreLabel", null);
        setField(term27701, term27701.getClass(), "highestGERScoreLabel", null);
        setField(term27701, term27701.getClass(), "lowestGERScoreLabel", null);
        setField(term27701, term27701.getClass(), "majorsLabel", null);
        setField(term27701, term27701.getClass(), "minorsLabel", null);
        setField(term27701, term27701.getClass(), "DERsLabel", null);
        setField(term27701, term27701.getClass(), "GERsLabel", null);
        setField(term27701, term27701.getClass(), "unclassifiedListLabel", null);
        setField(term27701, term27701.getClass(), "allModulesLabel", null);
        setField(term27701, term27701.getClass(), "APlusList", null);
        setField(term27701, term27701.getClass(), "ANeutralList", null);
        setField(term27701, term27701.getClass(), "AMinusList", null);
        setField(term27701, term27701.getClass(), "BPlusList", null);
        setField(term27701, term27701.getClass(), "BNeutralList", null);
        setField(term27701, term27701.getClass(), "BMinusList", null);
        setField(term27701, term27701.getClass(), "CPlusList", null);
        setField(term27701, term27701.getClass(), "CNeutralList", null);
        setField(term27701, term27701.getClass(), "CMinusList", null);
        setField(term27701, term27701.getClass(), "DList", null);
        setField(term27701, term27701.getClass(), "FList", null);
        setField(term27701, term27701.getClass(), "majorsList", null);
        setField(term27701, term27701.getClass(), "minorsList", null);
        setField(term27701, term27701.getClass(), "DERList", null);
        setField(term27701, term27701.getClass(), "GERList", null);
        setField(term27701, term27701.getClass(), "unclassifiedList", null);
        setField(term27701, term27701.getClass(), "highestScoreCourse", null);
        setField(term27701, term27701.getClass(), "lowestScoreCourse", null);
        setField(term27701, term27701.getClass(), "highestMajorScoreCourse", null);
        setField(term27701, term27701.getClass(), "lowestMajorScoreCourse", null);
        setField(term27701, term27701.getClass(), "highestMinorScoreCourse", null);
        setField(term27701, term27701.getClass(), "lowestMinorScoreCourse", null);
        setField(term27701, term27701.getClass(), "highestDERScoreCourse", null);
        setField(term27701, term27701.getClass(), "lowestDERScoreCourse", null);
        setField(term27701, term27701.getClass(), "highestGERScoreCourse", null);
        setField(term27701, term27701.getClass(), "lowestGERScoreCourse", null);
        setField(term27701, term27701.getClass(), "cardLayout", null);
        setField(term27701, term27701.getClass(), "modulesBasement", null);
        setField(term27701, term27701.getClass(), "semestersBasement", null);
        setField(term27701, term27701.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "answerActivity", argTypes, term27701, args);
    }

};


