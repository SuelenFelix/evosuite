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

public class ModuleAnalysis_newValueLabel_20187045629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27703;

    public ModuleAnalysis_newValueLabel_20187045629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27703 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27703, term27703.getClass(), "APlusLabel", null);
        setField(term27703, term27703.getClass(), "ANeutralLabel", null);
        setField(term27703, term27703.getClass(), "AMinusLabel", null);
        setField(term27703, term27703.getClass(), "BPlusLabel", null);
        setField(term27703, term27703.getClass(), "BNeutralLabel", null);
        setField(term27703, term27703.getClass(), "BMinusLabel", null);
        setField(term27703, term27703.getClass(), "CPlusLabel", null);
        setField(term27703, term27703.getClass(), "CNeutralLabel", null);
        setField(term27703, term27703.getClass(), "CMinusLabel", null);
        setField(term27703, term27703.getClass(), "DLabel", null);
        setField(term27703, term27703.getClass(), "FLabel", null);
        setField(term27703, term27703.getClass(), "highestScoreLabel", null);
        setField(term27703, term27703.getClass(), "lowestScoreLabel", null);
        setField(term27703, term27703.getClass(), "highestMajorScoreLabel", null);
        setField(term27703, term27703.getClass(), "lowestMajorScoreLabel", null);
        setField(term27703, term27703.getClass(), "highestMinorScoreLabel", null);
        setField(term27703, term27703.getClass(), "lowestMinorScoreLabel", null);
        setField(term27703, term27703.getClass(), "highestDERScoreLabel", null);
        setField(term27703, term27703.getClass(), "lowestDERScoreLabel", null);
        setField(term27703, term27703.getClass(), "highestGERScoreLabel", null);
        setField(term27703, term27703.getClass(), "lowestGERScoreLabel", null);
        setField(term27703, term27703.getClass(), "majorsLabel", null);
        setField(term27703, term27703.getClass(), "minorsLabel", null);
        setField(term27703, term27703.getClass(), "DERsLabel", null);
        setField(term27703, term27703.getClass(), "GERsLabel", null);
        setField(term27703, term27703.getClass(), "unclassifiedListLabel", null);
        setField(term27703, term27703.getClass(), "allModulesLabel", null);
        setField(term27703, term27703.getClass(), "APlusList", null);
        setField(term27703, term27703.getClass(), "ANeutralList", null);
        setField(term27703, term27703.getClass(), "AMinusList", null);
        setField(term27703, term27703.getClass(), "BPlusList", null);
        setField(term27703, term27703.getClass(), "BNeutralList", null);
        setField(term27703, term27703.getClass(), "BMinusList", null);
        setField(term27703, term27703.getClass(), "CPlusList", null);
        setField(term27703, term27703.getClass(), "CNeutralList", null);
        setField(term27703, term27703.getClass(), "CMinusList", null);
        setField(term27703, term27703.getClass(), "DList", null);
        setField(term27703, term27703.getClass(), "FList", null);
        setField(term27703, term27703.getClass(), "majorsList", null);
        setField(term27703, term27703.getClass(), "minorsList", null);
        setField(term27703, term27703.getClass(), "DERList", null);
        setField(term27703, term27703.getClass(), "GERList", null);
        setField(term27703, term27703.getClass(), "unclassifiedList", null);
        setField(term27703, term27703.getClass(), "highestScoreCourse", null);
        setField(term27703, term27703.getClass(), "lowestScoreCourse", null);
        setField(term27703, term27703.getClass(), "highestMajorScoreCourse", null);
        setField(term27703, term27703.getClass(), "lowestMajorScoreCourse", null);
        setField(term27703, term27703.getClass(), "highestMinorScoreCourse", null);
        setField(term27703, term27703.getClass(), "lowestMinorScoreCourse", null);
        setField(term27703, term27703.getClass(), "highestDERScoreCourse", null);
        setField(term27703, term27703.getClass(), "lowestDERScoreCourse", null);
        setField(term27703, term27703.getClass(), "highestGERScoreCourse", null);
        setField(term27703, term27703.getClass(), "lowestGERScoreCourse", null);
        setField(term27703, term27703.getClass(), "cardLayout", null);
        setField(term27703, term27703.getClass(), "modulesBasement", null);
        setField(term27703, term27703.getClass(), "semestersBasement", null);
        setField(term27703, term27703.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term27703, args);
    }

};


