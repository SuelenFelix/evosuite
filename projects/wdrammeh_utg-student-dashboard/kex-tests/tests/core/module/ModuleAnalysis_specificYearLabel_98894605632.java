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

public class ModuleAnalysis_specificYearLabel_98894605632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27706;

    public ModuleAnalysis_specificYearLabel_98894605632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27706 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27706, term27706.getClass(), "APlusLabel", null);
        setField(term27706, term27706.getClass(), "ANeutralLabel", null);
        setField(term27706, term27706.getClass(), "AMinusLabel", null);
        setField(term27706, term27706.getClass(), "BPlusLabel", null);
        setField(term27706, term27706.getClass(), "BNeutralLabel", null);
        setField(term27706, term27706.getClass(), "BMinusLabel", null);
        setField(term27706, term27706.getClass(), "CPlusLabel", null);
        setField(term27706, term27706.getClass(), "CNeutralLabel", null);
        setField(term27706, term27706.getClass(), "CMinusLabel", null);
        setField(term27706, term27706.getClass(), "DLabel", null);
        setField(term27706, term27706.getClass(), "FLabel", null);
        setField(term27706, term27706.getClass(), "highestScoreLabel", null);
        setField(term27706, term27706.getClass(), "lowestScoreLabel", null);
        setField(term27706, term27706.getClass(), "highestMajorScoreLabel", null);
        setField(term27706, term27706.getClass(), "lowestMajorScoreLabel", null);
        setField(term27706, term27706.getClass(), "highestMinorScoreLabel", null);
        setField(term27706, term27706.getClass(), "lowestMinorScoreLabel", null);
        setField(term27706, term27706.getClass(), "highestDERScoreLabel", null);
        setField(term27706, term27706.getClass(), "lowestDERScoreLabel", null);
        setField(term27706, term27706.getClass(), "highestGERScoreLabel", null);
        setField(term27706, term27706.getClass(), "lowestGERScoreLabel", null);
        setField(term27706, term27706.getClass(), "majorsLabel", null);
        setField(term27706, term27706.getClass(), "minorsLabel", null);
        setField(term27706, term27706.getClass(), "DERsLabel", null);
        setField(term27706, term27706.getClass(), "GERsLabel", null);
        setField(term27706, term27706.getClass(), "unclassifiedListLabel", null);
        setField(term27706, term27706.getClass(), "allModulesLabel", null);
        setField(term27706, term27706.getClass(), "APlusList", null);
        setField(term27706, term27706.getClass(), "ANeutralList", null);
        setField(term27706, term27706.getClass(), "AMinusList", null);
        setField(term27706, term27706.getClass(), "BPlusList", null);
        setField(term27706, term27706.getClass(), "BNeutralList", null);
        setField(term27706, term27706.getClass(), "BMinusList", null);
        setField(term27706, term27706.getClass(), "CPlusList", null);
        setField(term27706, term27706.getClass(), "CNeutralList", null);
        setField(term27706, term27706.getClass(), "CMinusList", null);
        setField(term27706, term27706.getClass(), "DList", null);
        setField(term27706, term27706.getClass(), "FList", null);
        setField(term27706, term27706.getClass(), "majorsList", null);
        setField(term27706, term27706.getClass(), "minorsList", null);
        setField(term27706, term27706.getClass(), "DERList", null);
        setField(term27706, term27706.getClass(), "GERList", null);
        setField(term27706, term27706.getClass(), "unclassifiedList", null);
        setField(term27706, term27706.getClass(), "highestScoreCourse", null);
        setField(term27706, term27706.getClass(), "lowestScoreCourse", null);
        setField(term27706, term27706.getClass(), "highestMajorScoreCourse", null);
        setField(term27706, term27706.getClass(), "lowestMajorScoreCourse", null);
        setField(term27706, term27706.getClass(), "highestMinorScoreCourse", null);
        setField(term27706, term27706.getClass(), "lowestMinorScoreCourse", null);
        setField(term27706, term27706.getClass(), "highestDERScoreCourse", null);
        setField(term27706, term27706.getClass(), "lowestDERScoreCourse", null);
        setField(term27706, term27706.getClass(), "highestGERScoreCourse", null);
        setField(term27706, term27706.getClass(), "lowestGERScoreCourse", null);
        setField(term27706, term27706.getClass(), "cardLayout", null);
        setField(term27706, term27706.getClass(), "modulesBasement", null);
        setField(term27706, term27706.getClass(), "semestersBasement", null);
        setField(term27706, term27706.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "specificYearLabel", argTypes, term27706, args);
    }

};


