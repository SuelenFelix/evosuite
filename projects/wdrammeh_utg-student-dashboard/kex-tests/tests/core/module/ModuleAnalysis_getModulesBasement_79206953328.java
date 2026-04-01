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

public class ModuleAnalysis_getModulesBasement_79206953328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27702;

    public ModuleAnalysis_getModulesBasement_79206953328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27702 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27702, term27702.getClass(), "APlusLabel", null);
        setField(term27702, term27702.getClass(), "ANeutralLabel", null);
        setField(term27702, term27702.getClass(), "AMinusLabel", null);
        setField(term27702, term27702.getClass(), "BPlusLabel", null);
        setField(term27702, term27702.getClass(), "BNeutralLabel", null);
        setField(term27702, term27702.getClass(), "BMinusLabel", null);
        setField(term27702, term27702.getClass(), "CPlusLabel", null);
        setField(term27702, term27702.getClass(), "CNeutralLabel", null);
        setField(term27702, term27702.getClass(), "CMinusLabel", null);
        setField(term27702, term27702.getClass(), "DLabel", null);
        setField(term27702, term27702.getClass(), "FLabel", null);
        setField(term27702, term27702.getClass(), "highestScoreLabel", null);
        setField(term27702, term27702.getClass(), "lowestScoreLabel", null);
        setField(term27702, term27702.getClass(), "highestMajorScoreLabel", null);
        setField(term27702, term27702.getClass(), "lowestMajorScoreLabel", null);
        setField(term27702, term27702.getClass(), "highestMinorScoreLabel", null);
        setField(term27702, term27702.getClass(), "lowestMinorScoreLabel", null);
        setField(term27702, term27702.getClass(), "highestDERScoreLabel", null);
        setField(term27702, term27702.getClass(), "lowestDERScoreLabel", null);
        setField(term27702, term27702.getClass(), "highestGERScoreLabel", null);
        setField(term27702, term27702.getClass(), "lowestGERScoreLabel", null);
        setField(term27702, term27702.getClass(), "majorsLabel", null);
        setField(term27702, term27702.getClass(), "minorsLabel", null);
        setField(term27702, term27702.getClass(), "DERsLabel", null);
        setField(term27702, term27702.getClass(), "GERsLabel", null);
        setField(term27702, term27702.getClass(), "unclassifiedListLabel", null);
        setField(term27702, term27702.getClass(), "allModulesLabel", null);
        setField(term27702, term27702.getClass(), "APlusList", null);
        setField(term27702, term27702.getClass(), "ANeutralList", null);
        setField(term27702, term27702.getClass(), "AMinusList", null);
        setField(term27702, term27702.getClass(), "BPlusList", null);
        setField(term27702, term27702.getClass(), "BNeutralList", null);
        setField(term27702, term27702.getClass(), "BMinusList", null);
        setField(term27702, term27702.getClass(), "CPlusList", null);
        setField(term27702, term27702.getClass(), "CNeutralList", null);
        setField(term27702, term27702.getClass(), "CMinusList", null);
        setField(term27702, term27702.getClass(), "DList", null);
        setField(term27702, term27702.getClass(), "FList", null);
        setField(term27702, term27702.getClass(), "majorsList", null);
        setField(term27702, term27702.getClass(), "minorsList", null);
        setField(term27702, term27702.getClass(), "DERList", null);
        setField(term27702, term27702.getClass(), "GERList", null);
        setField(term27702, term27702.getClass(), "unclassifiedList", null);
        setField(term27702, term27702.getClass(), "highestScoreCourse", null);
        setField(term27702, term27702.getClass(), "lowestScoreCourse", null);
        setField(term27702, term27702.getClass(), "highestMajorScoreCourse", null);
        setField(term27702, term27702.getClass(), "lowestMajorScoreCourse", null);
        setField(term27702, term27702.getClass(), "highestMinorScoreCourse", null);
        setField(term27702, term27702.getClass(), "lowestMinorScoreCourse", null);
        setField(term27702, term27702.getClass(), "highestDERScoreCourse", null);
        setField(term27702, term27702.getClass(), "lowestDERScoreCourse", null);
        setField(term27702, term27702.getClass(), "highestGERScoreCourse", null);
        setField(term27702, term27702.getClass(), "lowestGERScoreCourse", null);
        setField(term27702, term27702.getClass(), "cardLayout", null);
        setField(term27702, term27702.getClass(), "modulesBasement", null);
        setField(term27702, term27702.getClass(), "semestersBasement", null);
        setField(term27702, term27702.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModulesBasement", argTypes, term27702, args);
    }

};


