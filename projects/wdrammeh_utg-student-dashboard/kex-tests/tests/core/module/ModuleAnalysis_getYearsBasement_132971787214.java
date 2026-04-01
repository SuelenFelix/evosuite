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

public class ModuleAnalysis_getYearsBasement_132971787214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11229;

    public ModuleAnalysis_getYearsBasement_132971787214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11229 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term11229, term11229.getClass(), "APlusLabel", null);
        setField(term11229, term11229.getClass(), "ANeutralLabel", null);
        setField(term11229, term11229.getClass(), "AMinusLabel", null);
        setField(term11229, term11229.getClass(), "BPlusLabel", null);
        setField(term11229, term11229.getClass(), "BNeutralLabel", null);
        setField(term11229, term11229.getClass(), "BMinusLabel", null);
        setField(term11229, term11229.getClass(), "CPlusLabel", null);
        setField(term11229, term11229.getClass(), "CNeutralLabel", null);
        setField(term11229, term11229.getClass(), "CMinusLabel", null);
        setField(term11229, term11229.getClass(), "DLabel", null);
        setField(term11229, term11229.getClass(), "FLabel", null);
        setField(term11229, term11229.getClass(), "highestScoreLabel", null);
        setField(term11229, term11229.getClass(), "lowestScoreLabel", null);
        setField(term11229, term11229.getClass(), "highestMajorScoreLabel", null);
        setField(term11229, term11229.getClass(), "lowestMajorScoreLabel", null);
        setField(term11229, term11229.getClass(), "highestMinorScoreLabel", null);
        setField(term11229, term11229.getClass(), "lowestMinorScoreLabel", null);
        setField(term11229, term11229.getClass(), "highestDERScoreLabel", null);
        setField(term11229, term11229.getClass(), "lowestDERScoreLabel", null);
        setField(term11229, term11229.getClass(), "highestGERScoreLabel", null);
        setField(term11229, term11229.getClass(), "lowestGERScoreLabel", null);
        setField(term11229, term11229.getClass(), "majorsLabel", null);
        setField(term11229, term11229.getClass(), "minorsLabel", null);
        setField(term11229, term11229.getClass(), "DERsLabel", null);
        setField(term11229, term11229.getClass(), "GERsLabel", null);
        setField(term11229, term11229.getClass(), "unclassifiedListLabel", null);
        setField(term11229, term11229.getClass(), "allModulesLabel", null);
        setField(term11229, term11229.getClass(), "APlusList", null);
        setField(term11229, term11229.getClass(), "ANeutralList", null);
        setField(term11229, term11229.getClass(), "AMinusList", null);
        setField(term11229, term11229.getClass(), "BPlusList", null);
        setField(term11229, term11229.getClass(), "BNeutralList", null);
        setField(term11229, term11229.getClass(), "BMinusList", null);
        setField(term11229, term11229.getClass(), "CPlusList", null);
        setField(term11229, term11229.getClass(), "CNeutralList", null);
        setField(term11229, term11229.getClass(), "CMinusList", null);
        setField(term11229, term11229.getClass(), "DList", null);
        setField(term11229, term11229.getClass(), "FList", null);
        setField(term11229, term11229.getClass(), "majorsList", null);
        setField(term11229, term11229.getClass(), "minorsList", null);
        setField(term11229, term11229.getClass(), "DERList", null);
        setField(term11229, term11229.getClass(), "GERList", null);
        setField(term11229, term11229.getClass(), "unclassifiedList", null);
        setField(term11229, term11229.getClass(), "highestScoreCourse", null);
        setField(term11229, term11229.getClass(), "lowestScoreCourse", null);
        setField(term11229, term11229.getClass(), "highestMajorScoreCourse", null);
        setField(term11229, term11229.getClass(), "lowestMajorScoreCourse", null);
        setField(term11229, term11229.getClass(), "highestMinorScoreCourse", null);
        setField(term11229, term11229.getClass(), "lowestMinorScoreCourse", null);
        setField(term11229, term11229.getClass(), "highestDERScoreCourse", null);
        setField(term11229, term11229.getClass(), "lowestDERScoreCourse", null);
        setField(term11229, term11229.getClass(), "highestGERScoreCourse", null);
        setField(term11229, term11229.getClass(), "lowestGERScoreCourse", null);
        setField(term11229, term11229.getClass(), "cardLayout", null);
        setField(term11229, term11229.getClass(), "modulesBasement", null);
        setField(term11229, term11229.getClass(), "semestersBasement", null);
        setField(term11229, term11229.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYearsBasement", argTypes, term11229, args);
    }

};


