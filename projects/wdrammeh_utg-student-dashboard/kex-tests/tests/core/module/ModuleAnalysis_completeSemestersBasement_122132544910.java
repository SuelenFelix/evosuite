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

public class ModuleAnalysis_completeSemestersBasement_122132544910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9834;

    public ModuleAnalysis_completeSemestersBasement_122132544910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9834 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term9834, term9834.getClass(), "APlusLabel", null);
        setField(term9834, term9834.getClass(), "ANeutralLabel", null);
        setField(term9834, term9834.getClass(), "AMinusLabel", null);
        setField(term9834, term9834.getClass(), "BPlusLabel", null);
        setField(term9834, term9834.getClass(), "BNeutralLabel", null);
        setField(term9834, term9834.getClass(), "BMinusLabel", null);
        setField(term9834, term9834.getClass(), "CPlusLabel", null);
        setField(term9834, term9834.getClass(), "CNeutralLabel", null);
        setField(term9834, term9834.getClass(), "CMinusLabel", null);
        setField(term9834, term9834.getClass(), "DLabel", null);
        setField(term9834, term9834.getClass(), "FLabel", null);
        setField(term9834, term9834.getClass(), "highestScoreLabel", null);
        setField(term9834, term9834.getClass(), "lowestScoreLabel", null);
        setField(term9834, term9834.getClass(), "highestMajorScoreLabel", null);
        setField(term9834, term9834.getClass(), "lowestMajorScoreLabel", null);
        setField(term9834, term9834.getClass(), "highestMinorScoreLabel", null);
        setField(term9834, term9834.getClass(), "lowestMinorScoreLabel", null);
        setField(term9834, term9834.getClass(), "highestDERScoreLabel", null);
        setField(term9834, term9834.getClass(), "lowestDERScoreLabel", null);
        setField(term9834, term9834.getClass(), "highestGERScoreLabel", null);
        setField(term9834, term9834.getClass(), "lowestGERScoreLabel", null);
        setField(term9834, term9834.getClass(), "majorsLabel", null);
        setField(term9834, term9834.getClass(), "minorsLabel", null);
        setField(term9834, term9834.getClass(), "DERsLabel", null);
        setField(term9834, term9834.getClass(), "GERsLabel", null);
        setField(term9834, term9834.getClass(), "unclassifiedListLabel", null);
        setField(term9834, term9834.getClass(), "allModulesLabel", null);
        setField(term9834, term9834.getClass(), "APlusList", null);
        setField(term9834, term9834.getClass(), "ANeutralList", null);
        setField(term9834, term9834.getClass(), "AMinusList", null);
        setField(term9834, term9834.getClass(), "BPlusList", null);
        setField(term9834, term9834.getClass(), "BNeutralList", null);
        setField(term9834, term9834.getClass(), "BMinusList", null);
        setField(term9834, term9834.getClass(), "CPlusList", null);
        setField(term9834, term9834.getClass(), "CNeutralList", null);
        setField(term9834, term9834.getClass(), "CMinusList", null);
        setField(term9834, term9834.getClass(), "DList", null);
        setField(term9834, term9834.getClass(), "FList", null);
        setField(term9834, term9834.getClass(), "majorsList", null);
        setField(term9834, term9834.getClass(), "minorsList", null);
        setField(term9834, term9834.getClass(), "DERList", null);
        setField(term9834, term9834.getClass(), "GERList", null);
        setField(term9834, term9834.getClass(), "unclassifiedList", null);
        setField(term9834, term9834.getClass(), "highestScoreCourse", null);
        setField(term9834, term9834.getClass(), "lowestScoreCourse", null);
        setField(term9834, term9834.getClass(), "highestMajorScoreCourse", null);
        setField(term9834, term9834.getClass(), "lowestMajorScoreCourse", null);
        setField(term9834, term9834.getClass(), "highestMinorScoreCourse", null);
        setField(term9834, term9834.getClass(), "lowestMinorScoreCourse", null);
        setField(term9834, term9834.getClass(), "highestDERScoreCourse", null);
        setField(term9834, term9834.getClass(), "lowestDERScoreCourse", null);
        setField(term9834, term9834.getClass(), "highestGERScoreCourse", null);
        setField(term9834, term9834.getClass(), "lowestGERScoreCourse", null);
        setField(term9834, term9834.getClass(), "cardLayout", null);
        setField(term9834, term9834.getClass(), "modulesBasement", null);
        setField(term9834, term9834.getClass(), "semestersBasement", null);
        setField(term9834, term9834.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeSemestersBasement", argTypes, term9834, args);
    }

};


