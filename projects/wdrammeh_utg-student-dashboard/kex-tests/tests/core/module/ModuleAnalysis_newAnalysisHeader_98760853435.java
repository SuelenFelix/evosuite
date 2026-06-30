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

public class ModuleAnalysis_newAnalysisHeader_98760853435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27709;

    public ModuleAnalysis_newAnalysisHeader_98760853435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27709 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27709, term27709.getClass(), "APlusLabel", null);
        setField(term27709, term27709.getClass(), "ANeutralLabel", null);
        setField(term27709, term27709.getClass(), "AMinusLabel", null);
        setField(term27709, term27709.getClass(), "BPlusLabel", null);
        setField(term27709, term27709.getClass(), "BNeutralLabel", null);
        setField(term27709, term27709.getClass(), "BMinusLabel", null);
        setField(term27709, term27709.getClass(), "CPlusLabel", null);
        setField(term27709, term27709.getClass(), "CNeutralLabel", null);
        setField(term27709, term27709.getClass(), "CMinusLabel", null);
        setField(term27709, term27709.getClass(), "DLabel", null);
        setField(term27709, term27709.getClass(), "FLabel", null);
        setField(term27709, term27709.getClass(), "highestScoreLabel", null);
        setField(term27709, term27709.getClass(), "lowestScoreLabel", null);
        setField(term27709, term27709.getClass(), "highestMajorScoreLabel", null);
        setField(term27709, term27709.getClass(), "lowestMajorScoreLabel", null);
        setField(term27709, term27709.getClass(), "highestMinorScoreLabel", null);
        setField(term27709, term27709.getClass(), "lowestMinorScoreLabel", null);
        setField(term27709, term27709.getClass(), "highestDERScoreLabel", null);
        setField(term27709, term27709.getClass(), "lowestDERScoreLabel", null);
        setField(term27709, term27709.getClass(), "highestGERScoreLabel", null);
        setField(term27709, term27709.getClass(), "lowestGERScoreLabel", null);
        setField(term27709, term27709.getClass(), "majorsLabel", null);
        setField(term27709, term27709.getClass(), "minorsLabel", null);
        setField(term27709, term27709.getClass(), "DERsLabel", null);
        setField(term27709, term27709.getClass(), "GERsLabel", null);
        setField(term27709, term27709.getClass(), "unclassifiedListLabel", null);
        setField(term27709, term27709.getClass(), "allModulesLabel", null);
        setField(term27709, term27709.getClass(), "APlusList", null);
        setField(term27709, term27709.getClass(), "ANeutralList", null);
        setField(term27709, term27709.getClass(), "AMinusList", null);
        setField(term27709, term27709.getClass(), "BPlusList", null);
        setField(term27709, term27709.getClass(), "BNeutralList", null);
        setField(term27709, term27709.getClass(), "BMinusList", null);
        setField(term27709, term27709.getClass(), "CPlusList", null);
        setField(term27709, term27709.getClass(), "CNeutralList", null);
        setField(term27709, term27709.getClass(), "CMinusList", null);
        setField(term27709, term27709.getClass(), "DList", null);
        setField(term27709, term27709.getClass(), "FList", null);
        setField(term27709, term27709.getClass(), "majorsList", null);
        setField(term27709, term27709.getClass(), "minorsList", null);
        setField(term27709, term27709.getClass(), "DERList", null);
        setField(term27709, term27709.getClass(), "GERList", null);
        setField(term27709, term27709.getClass(), "unclassifiedList", null);
        setField(term27709, term27709.getClass(), "highestScoreCourse", null);
        setField(term27709, term27709.getClass(), "lowestScoreCourse", null);
        setField(term27709, term27709.getClass(), "highestMajorScoreCourse", null);
        setField(term27709, term27709.getClass(), "lowestMajorScoreCourse", null);
        setField(term27709, term27709.getClass(), "highestMinorScoreCourse", null);
        setField(term27709, term27709.getClass(), "lowestMinorScoreCourse", null);
        setField(term27709, term27709.getClass(), "highestDERScoreCourse", null);
        setField(term27709, term27709.getClass(), "lowestDERScoreCourse", null);
        setField(term27709, term27709.getClass(), "highestGERScoreCourse", null);
        setField(term27709, term27709.getClass(), "lowestGERScoreCourse", null);
        setField(term27709, term27709.getClass(), "cardLayout", null);
        setField(term27709, term27709.getClass(), "modulesBasement", null);
        setField(term27709, term27709.getClass(), "semestersBasement", null);
        setField(term27709, term27709.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newAnalysisHeader", argTypes, term27709, args);
    }

};


