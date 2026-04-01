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

public class ModuleAnalysis_getSemestersBasement_9327364077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8470;

    public ModuleAnalysis_getSemestersBasement_9327364077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8470 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term8470, term8470.getClass(), "APlusLabel", null);
        setField(term8470, term8470.getClass(), "ANeutralLabel", null);
        setField(term8470, term8470.getClass(), "AMinusLabel", null);
        setField(term8470, term8470.getClass(), "BPlusLabel", null);
        setField(term8470, term8470.getClass(), "BNeutralLabel", null);
        setField(term8470, term8470.getClass(), "BMinusLabel", null);
        setField(term8470, term8470.getClass(), "CPlusLabel", null);
        setField(term8470, term8470.getClass(), "CNeutralLabel", null);
        setField(term8470, term8470.getClass(), "CMinusLabel", null);
        setField(term8470, term8470.getClass(), "DLabel", null);
        setField(term8470, term8470.getClass(), "FLabel", null);
        setField(term8470, term8470.getClass(), "highestScoreLabel", null);
        setField(term8470, term8470.getClass(), "lowestScoreLabel", null);
        setField(term8470, term8470.getClass(), "highestMajorScoreLabel", null);
        setField(term8470, term8470.getClass(), "lowestMajorScoreLabel", null);
        setField(term8470, term8470.getClass(), "highestMinorScoreLabel", null);
        setField(term8470, term8470.getClass(), "lowestMinorScoreLabel", null);
        setField(term8470, term8470.getClass(), "highestDERScoreLabel", null);
        setField(term8470, term8470.getClass(), "lowestDERScoreLabel", null);
        setField(term8470, term8470.getClass(), "highestGERScoreLabel", null);
        setField(term8470, term8470.getClass(), "lowestGERScoreLabel", null);
        setField(term8470, term8470.getClass(), "majorsLabel", null);
        setField(term8470, term8470.getClass(), "minorsLabel", null);
        setField(term8470, term8470.getClass(), "DERsLabel", null);
        setField(term8470, term8470.getClass(), "GERsLabel", null);
        setField(term8470, term8470.getClass(), "unclassifiedListLabel", null);
        setField(term8470, term8470.getClass(), "allModulesLabel", null);
        setField(term8470, term8470.getClass(), "APlusList", null);
        setField(term8470, term8470.getClass(), "ANeutralList", null);
        setField(term8470, term8470.getClass(), "AMinusList", null);
        setField(term8470, term8470.getClass(), "BPlusList", null);
        setField(term8470, term8470.getClass(), "BNeutralList", null);
        setField(term8470, term8470.getClass(), "BMinusList", null);
        setField(term8470, term8470.getClass(), "CPlusList", null);
        setField(term8470, term8470.getClass(), "CNeutralList", null);
        setField(term8470, term8470.getClass(), "CMinusList", null);
        setField(term8470, term8470.getClass(), "DList", null);
        setField(term8470, term8470.getClass(), "FList", null);
        setField(term8470, term8470.getClass(), "majorsList", null);
        setField(term8470, term8470.getClass(), "minorsList", null);
        setField(term8470, term8470.getClass(), "DERList", null);
        setField(term8470, term8470.getClass(), "GERList", null);
        setField(term8470, term8470.getClass(), "unclassifiedList", null);
        setField(term8470, term8470.getClass(), "highestScoreCourse", null);
        setField(term8470, term8470.getClass(), "lowestScoreCourse", null);
        setField(term8470, term8470.getClass(), "highestMajorScoreCourse", null);
        setField(term8470, term8470.getClass(), "lowestMajorScoreCourse", null);
        setField(term8470, term8470.getClass(), "highestMinorScoreCourse", null);
        setField(term8470, term8470.getClass(), "lowestMinorScoreCourse", null);
        setField(term8470, term8470.getClass(), "highestDERScoreCourse", null);
        setField(term8470, term8470.getClass(), "lowestDERScoreCourse", null);
        setField(term8470, term8470.getClass(), "highestGERScoreCourse", null);
        setField(term8470, term8470.getClass(), "lowestGERScoreCourse", null);
        setField(term8470, term8470.getClass(), "cardLayout", null);
        setField(term8470, term8470.getClass(), "modulesBasement", null);
        setField(term8470, term8470.getClass(), "semestersBasement", null);
        setField(term8470, term8470.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSemestersBasement", argTypes, term8470, args);
    }

};


