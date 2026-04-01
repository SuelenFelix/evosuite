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

public class ModuleAnalysis_resetLists_32997529438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27712;

    public ModuleAnalysis_resetLists_32997529438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27712 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27712, term27712.getClass(), "APlusLabel", null);
        setField(term27712, term27712.getClass(), "ANeutralLabel", null);
        setField(term27712, term27712.getClass(), "AMinusLabel", null);
        setField(term27712, term27712.getClass(), "BPlusLabel", null);
        setField(term27712, term27712.getClass(), "BNeutralLabel", null);
        setField(term27712, term27712.getClass(), "BMinusLabel", null);
        setField(term27712, term27712.getClass(), "CPlusLabel", null);
        setField(term27712, term27712.getClass(), "CNeutralLabel", null);
        setField(term27712, term27712.getClass(), "CMinusLabel", null);
        setField(term27712, term27712.getClass(), "DLabel", null);
        setField(term27712, term27712.getClass(), "FLabel", null);
        setField(term27712, term27712.getClass(), "highestScoreLabel", null);
        setField(term27712, term27712.getClass(), "lowestScoreLabel", null);
        setField(term27712, term27712.getClass(), "highestMajorScoreLabel", null);
        setField(term27712, term27712.getClass(), "lowestMajorScoreLabel", null);
        setField(term27712, term27712.getClass(), "highestMinorScoreLabel", null);
        setField(term27712, term27712.getClass(), "lowestMinorScoreLabel", null);
        setField(term27712, term27712.getClass(), "highestDERScoreLabel", null);
        setField(term27712, term27712.getClass(), "lowestDERScoreLabel", null);
        setField(term27712, term27712.getClass(), "highestGERScoreLabel", null);
        setField(term27712, term27712.getClass(), "lowestGERScoreLabel", null);
        setField(term27712, term27712.getClass(), "majorsLabel", null);
        setField(term27712, term27712.getClass(), "minorsLabel", null);
        setField(term27712, term27712.getClass(), "DERsLabel", null);
        setField(term27712, term27712.getClass(), "GERsLabel", null);
        setField(term27712, term27712.getClass(), "unclassifiedListLabel", null);
        setField(term27712, term27712.getClass(), "allModulesLabel", null);
        setField(term27712, term27712.getClass(), "APlusList", null);
        setField(term27712, term27712.getClass(), "ANeutralList", null);
        setField(term27712, term27712.getClass(), "AMinusList", null);
        setField(term27712, term27712.getClass(), "BPlusList", null);
        setField(term27712, term27712.getClass(), "BNeutralList", null);
        setField(term27712, term27712.getClass(), "BMinusList", null);
        setField(term27712, term27712.getClass(), "CPlusList", null);
        setField(term27712, term27712.getClass(), "CNeutralList", null);
        setField(term27712, term27712.getClass(), "CMinusList", null);
        setField(term27712, term27712.getClass(), "DList", null);
        setField(term27712, term27712.getClass(), "FList", null);
        setField(term27712, term27712.getClass(), "majorsList", null);
        setField(term27712, term27712.getClass(), "minorsList", null);
        setField(term27712, term27712.getClass(), "DERList", null);
        setField(term27712, term27712.getClass(), "GERList", null);
        setField(term27712, term27712.getClass(), "unclassifiedList", null);
        setField(term27712, term27712.getClass(), "highestScoreCourse", null);
        setField(term27712, term27712.getClass(), "lowestScoreCourse", null);
        setField(term27712, term27712.getClass(), "highestMajorScoreCourse", null);
        setField(term27712, term27712.getClass(), "lowestMajorScoreCourse", null);
        setField(term27712, term27712.getClass(), "highestMinorScoreCourse", null);
        setField(term27712, term27712.getClass(), "lowestMinorScoreCourse", null);
        setField(term27712, term27712.getClass(), "highestDERScoreCourse", null);
        setField(term27712, term27712.getClass(), "lowestDERScoreCourse", null);
        setField(term27712, term27712.getClass(), "highestGERScoreCourse", null);
        setField(term27712, term27712.getClass(), "lowestGERScoreCourse", null);
        setField(term27712, term27712.getClass(), "cardLayout", null);
        setField(term27712, term27712.getClass(), "modulesBasement", null);
        setField(term27712, term27712.getClass(), "semestersBasement", null);
        setField(term27712, term27712.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetLists", argTypes, term27712, args);
    }

};


