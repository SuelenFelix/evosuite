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

public class ModuleAnalysis_createNoAnalysisPanel_17293572941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27715;

    public ModuleAnalysis_createNoAnalysisPanel_17293572941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27715 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27715, term27715.getClass(), "APlusLabel", null);
        setField(term27715, term27715.getClass(), "ANeutralLabel", null);
        setField(term27715, term27715.getClass(), "AMinusLabel", null);
        setField(term27715, term27715.getClass(), "BPlusLabel", null);
        setField(term27715, term27715.getClass(), "BNeutralLabel", null);
        setField(term27715, term27715.getClass(), "BMinusLabel", null);
        setField(term27715, term27715.getClass(), "CPlusLabel", null);
        setField(term27715, term27715.getClass(), "CNeutralLabel", null);
        setField(term27715, term27715.getClass(), "CMinusLabel", null);
        setField(term27715, term27715.getClass(), "DLabel", null);
        setField(term27715, term27715.getClass(), "FLabel", null);
        setField(term27715, term27715.getClass(), "highestScoreLabel", null);
        setField(term27715, term27715.getClass(), "lowestScoreLabel", null);
        setField(term27715, term27715.getClass(), "highestMajorScoreLabel", null);
        setField(term27715, term27715.getClass(), "lowestMajorScoreLabel", null);
        setField(term27715, term27715.getClass(), "highestMinorScoreLabel", null);
        setField(term27715, term27715.getClass(), "lowestMinorScoreLabel", null);
        setField(term27715, term27715.getClass(), "highestDERScoreLabel", null);
        setField(term27715, term27715.getClass(), "lowestDERScoreLabel", null);
        setField(term27715, term27715.getClass(), "highestGERScoreLabel", null);
        setField(term27715, term27715.getClass(), "lowestGERScoreLabel", null);
        setField(term27715, term27715.getClass(), "majorsLabel", null);
        setField(term27715, term27715.getClass(), "minorsLabel", null);
        setField(term27715, term27715.getClass(), "DERsLabel", null);
        setField(term27715, term27715.getClass(), "GERsLabel", null);
        setField(term27715, term27715.getClass(), "unclassifiedListLabel", null);
        setField(term27715, term27715.getClass(), "allModulesLabel", null);
        setField(term27715, term27715.getClass(), "APlusList", null);
        setField(term27715, term27715.getClass(), "ANeutralList", null);
        setField(term27715, term27715.getClass(), "AMinusList", null);
        setField(term27715, term27715.getClass(), "BPlusList", null);
        setField(term27715, term27715.getClass(), "BNeutralList", null);
        setField(term27715, term27715.getClass(), "BMinusList", null);
        setField(term27715, term27715.getClass(), "CPlusList", null);
        setField(term27715, term27715.getClass(), "CNeutralList", null);
        setField(term27715, term27715.getClass(), "CMinusList", null);
        setField(term27715, term27715.getClass(), "DList", null);
        setField(term27715, term27715.getClass(), "FList", null);
        setField(term27715, term27715.getClass(), "majorsList", null);
        setField(term27715, term27715.getClass(), "minorsList", null);
        setField(term27715, term27715.getClass(), "DERList", null);
        setField(term27715, term27715.getClass(), "GERList", null);
        setField(term27715, term27715.getClass(), "unclassifiedList", null);
        setField(term27715, term27715.getClass(), "highestScoreCourse", null);
        setField(term27715, term27715.getClass(), "lowestScoreCourse", null);
        setField(term27715, term27715.getClass(), "highestMajorScoreCourse", null);
        setField(term27715, term27715.getClass(), "lowestMajorScoreCourse", null);
        setField(term27715, term27715.getClass(), "highestMinorScoreCourse", null);
        setField(term27715, term27715.getClass(), "lowestMinorScoreCourse", null);
        setField(term27715, term27715.getClass(), "highestDERScoreCourse", null);
        setField(term27715, term27715.getClass(), "lowestDERScoreCourse", null);
        setField(term27715, term27715.getClass(), "highestGERScoreCourse", null);
        setField(term27715, term27715.getClass(), "lowestGERScoreCourse", null);
        setField(term27715, term27715.getClass(), "cardLayout", null);
        setField(term27715, term27715.getClass(), "modulesBasement", null);
        setField(term27715, term27715.getClass(), "semestersBasement", null);
        setField(term27715, term27715.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createNoAnalysisPanel", argTypes, term27715, args);
    }

};


