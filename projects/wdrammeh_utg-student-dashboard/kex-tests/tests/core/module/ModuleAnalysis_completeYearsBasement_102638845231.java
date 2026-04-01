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

public class ModuleAnalysis_completeYearsBasement_102638845231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27705;

    public ModuleAnalysis_completeYearsBasement_102638845231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27705 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27705, term27705.getClass(), "APlusLabel", null);
        setField(term27705, term27705.getClass(), "ANeutralLabel", null);
        setField(term27705, term27705.getClass(), "AMinusLabel", null);
        setField(term27705, term27705.getClass(), "BPlusLabel", null);
        setField(term27705, term27705.getClass(), "BNeutralLabel", null);
        setField(term27705, term27705.getClass(), "BMinusLabel", null);
        setField(term27705, term27705.getClass(), "CPlusLabel", null);
        setField(term27705, term27705.getClass(), "CNeutralLabel", null);
        setField(term27705, term27705.getClass(), "CMinusLabel", null);
        setField(term27705, term27705.getClass(), "DLabel", null);
        setField(term27705, term27705.getClass(), "FLabel", null);
        setField(term27705, term27705.getClass(), "highestScoreLabel", null);
        setField(term27705, term27705.getClass(), "lowestScoreLabel", null);
        setField(term27705, term27705.getClass(), "highestMajorScoreLabel", null);
        setField(term27705, term27705.getClass(), "lowestMajorScoreLabel", null);
        setField(term27705, term27705.getClass(), "highestMinorScoreLabel", null);
        setField(term27705, term27705.getClass(), "lowestMinorScoreLabel", null);
        setField(term27705, term27705.getClass(), "highestDERScoreLabel", null);
        setField(term27705, term27705.getClass(), "lowestDERScoreLabel", null);
        setField(term27705, term27705.getClass(), "highestGERScoreLabel", null);
        setField(term27705, term27705.getClass(), "lowestGERScoreLabel", null);
        setField(term27705, term27705.getClass(), "majorsLabel", null);
        setField(term27705, term27705.getClass(), "minorsLabel", null);
        setField(term27705, term27705.getClass(), "DERsLabel", null);
        setField(term27705, term27705.getClass(), "GERsLabel", null);
        setField(term27705, term27705.getClass(), "unclassifiedListLabel", null);
        setField(term27705, term27705.getClass(), "allModulesLabel", null);
        setField(term27705, term27705.getClass(), "APlusList", null);
        setField(term27705, term27705.getClass(), "ANeutralList", null);
        setField(term27705, term27705.getClass(), "AMinusList", null);
        setField(term27705, term27705.getClass(), "BPlusList", null);
        setField(term27705, term27705.getClass(), "BNeutralList", null);
        setField(term27705, term27705.getClass(), "BMinusList", null);
        setField(term27705, term27705.getClass(), "CPlusList", null);
        setField(term27705, term27705.getClass(), "CNeutralList", null);
        setField(term27705, term27705.getClass(), "CMinusList", null);
        setField(term27705, term27705.getClass(), "DList", null);
        setField(term27705, term27705.getClass(), "FList", null);
        setField(term27705, term27705.getClass(), "majorsList", null);
        setField(term27705, term27705.getClass(), "minorsList", null);
        setField(term27705, term27705.getClass(), "DERList", null);
        setField(term27705, term27705.getClass(), "GERList", null);
        setField(term27705, term27705.getClass(), "unclassifiedList", null);
        setField(term27705, term27705.getClass(), "highestScoreCourse", null);
        setField(term27705, term27705.getClass(), "lowestScoreCourse", null);
        setField(term27705, term27705.getClass(), "highestMajorScoreCourse", null);
        setField(term27705, term27705.getClass(), "lowestMajorScoreCourse", null);
        setField(term27705, term27705.getClass(), "highestMinorScoreCourse", null);
        setField(term27705, term27705.getClass(), "lowestMinorScoreCourse", null);
        setField(term27705, term27705.getClass(), "highestDERScoreCourse", null);
        setField(term27705, term27705.getClass(), "lowestDERScoreCourse", null);
        setField(term27705, term27705.getClass(), "highestGERScoreCourse", null);
        setField(term27705, term27705.getClass(), "lowestGERScoreCourse", null);
        setField(term27705, term27705.getClass(), "cardLayout", null);
        setField(term27705, term27705.getClass(), "modulesBasement", null);
        setField(term27705, term27705.getClass(), "semestersBasement", null);
        setField(term27705, term27705.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeYearsBasement", argTypes, term27705, args);
    }

};


