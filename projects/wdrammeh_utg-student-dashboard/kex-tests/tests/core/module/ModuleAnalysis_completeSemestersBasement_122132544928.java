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

public class ModuleAnalysis_completeSemestersBasement_122132544928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27700;

    public ModuleAnalysis_completeSemestersBasement_122132544928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27700 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27700, term27700.getClass(), "APlusLabel", null);
        setField(term27700, term27700.getClass(), "ANeutralLabel", null);
        setField(term27700, term27700.getClass(), "AMinusLabel", null);
        setField(term27700, term27700.getClass(), "BPlusLabel", null);
        setField(term27700, term27700.getClass(), "BNeutralLabel", null);
        setField(term27700, term27700.getClass(), "BMinusLabel", null);
        setField(term27700, term27700.getClass(), "CPlusLabel", null);
        setField(term27700, term27700.getClass(), "CNeutralLabel", null);
        setField(term27700, term27700.getClass(), "CMinusLabel", null);
        setField(term27700, term27700.getClass(), "DLabel", null);
        setField(term27700, term27700.getClass(), "FLabel", null);
        setField(term27700, term27700.getClass(), "highestScoreLabel", null);
        setField(term27700, term27700.getClass(), "lowestScoreLabel", null);
        setField(term27700, term27700.getClass(), "highestMajorScoreLabel", null);
        setField(term27700, term27700.getClass(), "lowestMajorScoreLabel", null);
        setField(term27700, term27700.getClass(), "highestMinorScoreLabel", null);
        setField(term27700, term27700.getClass(), "lowestMinorScoreLabel", null);
        setField(term27700, term27700.getClass(), "highestDERScoreLabel", null);
        setField(term27700, term27700.getClass(), "lowestDERScoreLabel", null);
        setField(term27700, term27700.getClass(), "highestGERScoreLabel", null);
        setField(term27700, term27700.getClass(), "lowestGERScoreLabel", null);
        setField(term27700, term27700.getClass(), "majorsLabel", null);
        setField(term27700, term27700.getClass(), "minorsLabel", null);
        setField(term27700, term27700.getClass(), "DERsLabel", null);
        setField(term27700, term27700.getClass(), "GERsLabel", null);
        setField(term27700, term27700.getClass(), "unclassifiedListLabel", null);
        setField(term27700, term27700.getClass(), "allModulesLabel", null);
        setField(term27700, term27700.getClass(), "APlusList", null);
        setField(term27700, term27700.getClass(), "ANeutralList", null);
        setField(term27700, term27700.getClass(), "AMinusList", null);
        setField(term27700, term27700.getClass(), "BPlusList", null);
        setField(term27700, term27700.getClass(), "BNeutralList", null);
        setField(term27700, term27700.getClass(), "BMinusList", null);
        setField(term27700, term27700.getClass(), "CPlusList", null);
        setField(term27700, term27700.getClass(), "CNeutralList", null);
        setField(term27700, term27700.getClass(), "CMinusList", null);
        setField(term27700, term27700.getClass(), "DList", null);
        setField(term27700, term27700.getClass(), "FList", null);
        setField(term27700, term27700.getClass(), "majorsList", null);
        setField(term27700, term27700.getClass(), "minorsList", null);
        setField(term27700, term27700.getClass(), "DERList", null);
        setField(term27700, term27700.getClass(), "GERList", null);
        setField(term27700, term27700.getClass(), "unclassifiedList", null);
        setField(term27700, term27700.getClass(), "highestScoreCourse", null);
        setField(term27700, term27700.getClass(), "lowestScoreCourse", null);
        setField(term27700, term27700.getClass(), "highestMajorScoreCourse", null);
        setField(term27700, term27700.getClass(), "lowestMajorScoreCourse", null);
        setField(term27700, term27700.getClass(), "highestMinorScoreCourse", null);
        setField(term27700, term27700.getClass(), "lowestMinorScoreCourse", null);
        setField(term27700, term27700.getClass(), "highestDERScoreCourse", null);
        setField(term27700, term27700.getClass(), "lowestDERScoreCourse", null);
        setField(term27700, term27700.getClass(), "highestGERScoreCourse", null);
        setField(term27700, term27700.getClass(), "lowestGERScoreCourse", null);
        setField(term27700, term27700.getClass(), "cardLayout", null);
        setField(term27700, term27700.getClass(), "modulesBasement", null);
        setField(term27700, term27700.getClass(), "semestersBasement", null);
        setField(term27700, term27700.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeSemestersBasement", argTypes, term27700, args);
    }

};


