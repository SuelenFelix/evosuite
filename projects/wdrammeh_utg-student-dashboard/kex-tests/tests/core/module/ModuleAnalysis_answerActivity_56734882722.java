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

public class ModuleAnalysis_answerActivity_56734882722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27694;

    public ModuleAnalysis_answerActivity_56734882722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27694 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27694, term27694.getClass(), "APlusLabel", null);
        setField(term27694, term27694.getClass(), "ANeutralLabel", null);
        setField(term27694, term27694.getClass(), "AMinusLabel", null);
        setField(term27694, term27694.getClass(), "BPlusLabel", null);
        setField(term27694, term27694.getClass(), "BNeutralLabel", null);
        setField(term27694, term27694.getClass(), "BMinusLabel", null);
        setField(term27694, term27694.getClass(), "CPlusLabel", null);
        setField(term27694, term27694.getClass(), "CNeutralLabel", null);
        setField(term27694, term27694.getClass(), "CMinusLabel", null);
        setField(term27694, term27694.getClass(), "DLabel", null);
        setField(term27694, term27694.getClass(), "FLabel", null);
        setField(term27694, term27694.getClass(), "highestScoreLabel", null);
        setField(term27694, term27694.getClass(), "lowestScoreLabel", null);
        setField(term27694, term27694.getClass(), "highestMajorScoreLabel", null);
        setField(term27694, term27694.getClass(), "lowestMajorScoreLabel", null);
        setField(term27694, term27694.getClass(), "highestMinorScoreLabel", null);
        setField(term27694, term27694.getClass(), "lowestMinorScoreLabel", null);
        setField(term27694, term27694.getClass(), "highestDERScoreLabel", null);
        setField(term27694, term27694.getClass(), "lowestDERScoreLabel", null);
        setField(term27694, term27694.getClass(), "highestGERScoreLabel", null);
        setField(term27694, term27694.getClass(), "lowestGERScoreLabel", null);
        setField(term27694, term27694.getClass(), "majorsLabel", null);
        setField(term27694, term27694.getClass(), "minorsLabel", null);
        setField(term27694, term27694.getClass(), "DERsLabel", null);
        setField(term27694, term27694.getClass(), "GERsLabel", null);
        setField(term27694, term27694.getClass(), "unclassifiedListLabel", null);
        setField(term27694, term27694.getClass(), "allModulesLabel", null);
        setField(term27694, term27694.getClass(), "APlusList", null);
        setField(term27694, term27694.getClass(), "ANeutralList", null);
        setField(term27694, term27694.getClass(), "AMinusList", null);
        setField(term27694, term27694.getClass(), "BPlusList", null);
        setField(term27694, term27694.getClass(), "BNeutralList", null);
        setField(term27694, term27694.getClass(), "BMinusList", null);
        setField(term27694, term27694.getClass(), "CPlusList", null);
        setField(term27694, term27694.getClass(), "CNeutralList", null);
        setField(term27694, term27694.getClass(), "CMinusList", null);
        setField(term27694, term27694.getClass(), "DList", null);
        setField(term27694, term27694.getClass(), "FList", null);
        setField(term27694, term27694.getClass(), "majorsList", null);
        setField(term27694, term27694.getClass(), "minorsList", null);
        setField(term27694, term27694.getClass(), "DERList", null);
        setField(term27694, term27694.getClass(), "GERList", null);
        setField(term27694, term27694.getClass(), "unclassifiedList", null);
        setField(term27694, term27694.getClass(), "highestScoreCourse", null);
        setField(term27694, term27694.getClass(), "lowestScoreCourse", null);
        setField(term27694, term27694.getClass(), "highestMajorScoreCourse", null);
        setField(term27694, term27694.getClass(), "lowestMajorScoreCourse", null);
        setField(term27694, term27694.getClass(), "highestMinorScoreCourse", null);
        setField(term27694, term27694.getClass(), "lowestMinorScoreCourse", null);
        setField(term27694, term27694.getClass(), "highestDERScoreCourse", null);
        setField(term27694, term27694.getClass(), "lowestDERScoreCourse", null);
        setField(term27694, term27694.getClass(), "highestGERScoreCourse", null);
        setField(term27694, term27694.getClass(), "lowestGERScoreCourse", null);
        setField(term27694, term27694.getClass(), "cardLayout", null);
        setField(term27694, term27694.getClass(), "modulesBasement", null);
        setField(term27694, term27694.getClass(), "semestersBasement", null);
        setField(term27694, term27694.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "answerActivity", argTypes, term27694, args);
    }

};


