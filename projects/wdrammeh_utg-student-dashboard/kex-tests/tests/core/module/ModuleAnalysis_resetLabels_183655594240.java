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

public class ModuleAnalysis_resetLabels_183655594240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27714;

    public ModuleAnalysis_resetLabels_183655594240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27714 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27714, term27714.getClass(), "APlusLabel", null);
        setField(term27714, term27714.getClass(), "ANeutralLabel", null);
        setField(term27714, term27714.getClass(), "AMinusLabel", null);
        setField(term27714, term27714.getClass(), "BPlusLabel", null);
        setField(term27714, term27714.getClass(), "BNeutralLabel", null);
        setField(term27714, term27714.getClass(), "BMinusLabel", null);
        setField(term27714, term27714.getClass(), "CPlusLabel", null);
        setField(term27714, term27714.getClass(), "CNeutralLabel", null);
        setField(term27714, term27714.getClass(), "CMinusLabel", null);
        setField(term27714, term27714.getClass(), "DLabel", null);
        setField(term27714, term27714.getClass(), "FLabel", null);
        setField(term27714, term27714.getClass(), "highestScoreLabel", null);
        setField(term27714, term27714.getClass(), "lowestScoreLabel", null);
        setField(term27714, term27714.getClass(), "highestMajorScoreLabel", null);
        setField(term27714, term27714.getClass(), "lowestMajorScoreLabel", null);
        setField(term27714, term27714.getClass(), "highestMinorScoreLabel", null);
        setField(term27714, term27714.getClass(), "lowestMinorScoreLabel", null);
        setField(term27714, term27714.getClass(), "highestDERScoreLabel", null);
        setField(term27714, term27714.getClass(), "lowestDERScoreLabel", null);
        setField(term27714, term27714.getClass(), "highestGERScoreLabel", null);
        setField(term27714, term27714.getClass(), "lowestGERScoreLabel", null);
        setField(term27714, term27714.getClass(), "majorsLabel", null);
        setField(term27714, term27714.getClass(), "minorsLabel", null);
        setField(term27714, term27714.getClass(), "DERsLabel", null);
        setField(term27714, term27714.getClass(), "GERsLabel", null);
        setField(term27714, term27714.getClass(), "unclassifiedListLabel", null);
        setField(term27714, term27714.getClass(), "allModulesLabel", null);
        setField(term27714, term27714.getClass(), "APlusList", null);
        setField(term27714, term27714.getClass(), "ANeutralList", null);
        setField(term27714, term27714.getClass(), "AMinusList", null);
        setField(term27714, term27714.getClass(), "BPlusList", null);
        setField(term27714, term27714.getClass(), "BNeutralList", null);
        setField(term27714, term27714.getClass(), "BMinusList", null);
        setField(term27714, term27714.getClass(), "CPlusList", null);
        setField(term27714, term27714.getClass(), "CNeutralList", null);
        setField(term27714, term27714.getClass(), "CMinusList", null);
        setField(term27714, term27714.getClass(), "DList", null);
        setField(term27714, term27714.getClass(), "FList", null);
        setField(term27714, term27714.getClass(), "majorsList", null);
        setField(term27714, term27714.getClass(), "minorsList", null);
        setField(term27714, term27714.getClass(), "DERList", null);
        setField(term27714, term27714.getClass(), "GERList", null);
        setField(term27714, term27714.getClass(), "unclassifiedList", null);
        setField(term27714, term27714.getClass(), "highestScoreCourse", null);
        setField(term27714, term27714.getClass(), "lowestScoreCourse", null);
        setField(term27714, term27714.getClass(), "highestMajorScoreCourse", null);
        setField(term27714, term27714.getClass(), "lowestMajorScoreCourse", null);
        setField(term27714, term27714.getClass(), "highestMinorScoreCourse", null);
        setField(term27714, term27714.getClass(), "lowestMinorScoreCourse", null);
        setField(term27714, term27714.getClass(), "highestDERScoreCourse", null);
        setField(term27714, term27714.getClass(), "lowestDERScoreCourse", null);
        setField(term27714, term27714.getClass(), "highestGERScoreCourse", null);
        setField(term27714, term27714.getClass(), "lowestGERScoreCourse", null);
        setField(term27714, term27714.getClass(), "cardLayout", null);
        setField(term27714, term27714.getClass(), "modulesBasement", null);
        setField(term27714, term27714.getClass(), "semestersBasement", null);
        setField(term27714, term27714.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetLabels", argTypes, term27714, args);
    }

};


