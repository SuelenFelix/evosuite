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

public class ModuleAnalysis_getSemestersBasement_9327364078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8471;

    public ModuleAnalysis_getSemestersBasement_9327364078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8471 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term8471, term8471.getClass(), "APlusLabel", null);
        setField(term8471, term8471.getClass(), "ANeutralLabel", null);
        setField(term8471, term8471.getClass(), "AMinusLabel", null);
        setField(term8471, term8471.getClass(), "BPlusLabel", null);
        setField(term8471, term8471.getClass(), "BNeutralLabel", null);
        setField(term8471, term8471.getClass(), "BMinusLabel", null);
        setField(term8471, term8471.getClass(), "CPlusLabel", null);
        setField(term8471, term8471.getClass(), "CNeutralLabel", null);
        setField(term8471, term8471.getClass(), "CMinusLabel", null);
        setField(term8471, term8471.getClass(), "DLabel", null);
        setField(term8471, term8471.getClass(), "FLabel", null);
        setField(term8471, term8471.getClass(), "highestScoreLabel", null);
        setField(term8471, term8471.getClass(), "lowestScoreLabel", null);
        setField(term8471, term8471.getClass(), "highestMajorScoreLabel", null);
        setField(term8471, term8471.getClass(), "lowestMajorScoreLabel", null);
        setField(term8471, term8471.getClass(), "highestMinorScoreLabel", null);
        setField(term8471, term8471.getClass(), "lowestMinorScoreLabel", null);
        setField(term8471, term8471.getClass(), "highestDERScoreLabel", null);
        setField(term8471, term8471.getClass(), "lowestDERScoreLabel", null);
        setField(term8471, term8471.getClass(), "highestGERScoreLabel", null);
        setField(term8471, term8471.getClass(), "lowestGERScoreLabel", null);
        setField(term8471, term8471.getClass(), "majorsLabel", null);
        setField(term8471, term8471.getClass(), "minorsLabel", null);
        setField(term8471, term8471.getClass(), "DERsLabel", null);
        setField(term8471, term8471.getClass(), "GERsLabel", null);
        setField(term8471, term8471.getClass(), "unclassifiedListLabel", null);
        setField(term8471, term8471.getClass(), "allModulesLabel", null);
        setField(term8471, term8471.getClass(), "APlusList", null);
        setField(term8471, term8471.getClass(), "ANeutralList", null);
        setField(term8471, term8471.getClass(), "AMinusList", null);
        setField(term8471, term8471.getClass(), "BPlusList", null);
        setField(term8471, term8471.getClass(), "BNeutralList", null);
        setField(term8471, term8471.getClass(), "BMinusList", null);
        setField(term8471, term8471.getClass(), "CPlusList", null);
        setField(term8471, term8471.getClass(), "CNeutralList", null);
        setField(term8471, term8471.getClass(), "CMinusList", null);
        setField(term8471, term8471.getClass(), "DList", null);
        setField(term8471, term8471.getClass(), "FList", null);
        setField(term8471, term8471.getClass(), "majorsList", null);
        setField(term8471, term8471.getClass(), "minorsList", null);
        setField(term8471, term8471.getClass(), "DERList", null);
        setField(term8471, term8471.getClass(), "GERList", null);
        setField(term8471, term8471.getClass(), "unclassifiedList", null);
        setField(term8471, term8471.getClass(), "highestScoreCourse", null);
        setField(term8471, term8471.getClass(), "lowestScoreCourse", null);
        setField(term8471, term8471.getClass(), "highestMajorScoreCourse", null);
        setField(term8471, term8471.getClass(), "lowestMajorScoreCourse", null);
        setField(term8471, term8471.getClass(), "highestMinorScoreCourse", null);
        setField(term8471, term8471.getClass(), "lowestMinorScoreCourse", null);
        setField(term8471, term8471.getClass(), "highestDERScoreCourse", null);
        setField(term8471, term8471.getClass(), "lowestDERScoreCourse", null);
        setField(term8471, term8471.getClass(), "highestGERScoreCourse", null);
        setField(term8471, term8471.getClass(), "lowestGERScoreCourse", null);
        setField(term8471, term8471.getClass(), "cardLayout", null);
        setField(term8471, term8471.getClass(), "modulesBasement", null);
        setField(term8471, term8471.getClass(), "semestersBasement", null);
        setField(term8471, term8471.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSemestersBasement", argTypes, term8471, args);
    }

};


