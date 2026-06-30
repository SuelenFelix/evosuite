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

public class ModuleAnalysis_newValueLabel_20187045624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27696;

    public ModuleAnalysis_newValueLabel_20187045624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27696 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27696, term27696.getClass(), "APlusLabel", null);
        setField(term27696, term27696.getClass(), "ANeutralLabel", null);
        setField(term27696, term27696.getClass(), "AMinusLabel", null);
        setField(term27696, term27696.getClass(), "BPlusLabel", null);
        setField(term27696, term27696.getClass(), "BNeutralLabel", null);
        setField(term27696, term27696.getClass(), "BMinusLabel", null);
        setField(term27696, term27696.getClass(), "CPlusLabel", null);
        setField(term27696, term27696.getClass(), "CNeutralLabel", null);
        setField(term27696, term27696.getClass(), "CMinusLabel", null);
        setField(term27696, term27696.getClass(), "DLabel", null);
        setField(term27696, term27696.getClass(), "FLabel", null);
        setField(term27696, term27696.getClass(), "highestScoreLabel", null);
        setField(term27696, term27696.getClass(), "lowestScoreLabel", null);
        setField(term27696, term27696.getClass(), "highestMajorScoreLabel", null);
        setField(term27696, term27696.getClass(), "lowestMajorScoreLabel", null);
        setField(term27696, term27696.getClass(), "highestMinorScoreLabel", null);
        setField(term27696, term27696.getClass(), "lowestMinorScoreLabel", null);
        setField(term27696, term27696.getClass(), "highestDERScoreLabel", null);
        setField(term27696, term27696.getClass(), "lowestDERScoreLabel", null);
        setField(term27696, term27696.getClass(), "highestGERScoreLabel", null);
        setField(term27696, term27696.getClass(), "lowestGERScoreLabel", null);
        setField(term27696, term27696.getClass(), "majorsLabel", null);
        setField(term27696, term27696.getClass(), "minorsLabel", null);
        setField(term27696, term27696.getClass(), "DERsLabel", null);
        setField(term27696, term27696.getClass(), "GERsLabel", null);
        setField(term27696, term27696.getClass(), "unclassifiedListLabel", null);
        setField(term27696, term27696.getClass(), "allModulesLabel", null);
        setField(term27696, term27696.getClass(), "APlusList", null);
        setField(term27696, term27696.getClass(), "ANeutralList", null);
        setField(term27696, term27696.getClass(), "AMinusList", null);
        setField(term27696, term27696.getClass(), "BPlusList", null);
        setField(term27696, term27696.getClass(), "BNeutralList", null);
        setField(term27696, term27696.getClass(), "BMinusList", null);
        setField(term27696, term27696.getClass(), "CPlusList", null);
        setField(term27696, term27696.getClass(), "CNeutralList", null);
        setField(term27696, term27696.getClass(), "CMinusList", null);
        setField(term27696, term27696.getClass(), "DList", null);
        setField(term27696, term27696.getClass(), "FList", null);
        setField(term27696, term27696.getClass(), "majorsList", null);
        setField(term27696, term27696.getClass(), "minorsList", null);
        setField(term27696, term27696.getClass(), "DERList", null);
        setField(term27696, term27696.getClass(), "GERList", null);
        setField(term27696, term27696.getClass(), "unclassifiedList", null);
        setField(term27696, term27696.getClass(), "highestScoreCourse", null);
        setField(term27696, term27696.getClass(), "lowestScoreCourse", null);
        setField(term27696, term27696.getClass(), "highestMajorScoreCourse", null);
        setField(term27696, term27696.getClass(), "lowestMajorScoreCourse", null);
        setField(term27696, term27696.getClass(), "highestMinorScoreCourse", null);
        setField(term27696, term27696.getClass(), "lowestMinorScoreCourse", null);
        setField(term27696, term27696.getClass(), "highestDERScoreCourse", null);
        setField(term27696, term27696.getClass(), "lowestDERScoreCourse", null);
        setField(term27696, term27696.getClass(), "highestGERScoreCourse", null);
        setField(term27696, term27696.getClass(), "lowestGERScoreCourse", null);
        setField(term27696, term27696.getClass(), "cardLayout", null);
        setField(term27696, term27696.getClass(), "modulesBasement", null);
        setField(term27696, term27696.getClass(), "semestersBasement", null);
        setField(term27696, term27696.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term27696, args);
    }

};


