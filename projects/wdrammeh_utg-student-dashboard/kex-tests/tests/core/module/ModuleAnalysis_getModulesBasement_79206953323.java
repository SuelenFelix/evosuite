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

public class ModuleAnalysis_getModulesBasement_79206953323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27695;

    public ModuleAnalysis_getModulesBasement_79206953323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27695 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27695, term27695.getClass(), "APlusLabel", null);
        setField(term27695, term27695.getClass(), "ANeutralLabel", null);
        setField(term27695, term27695.getClass(), "AMinusLabel", null);
        setField(term27695, term27695.getClass(), "BPlusLabel", null);
        setField(term27695, term27695.getClass(), "BNeutralLabel", null);
        setField(term27695, term27695.getClass(), "BMinusLabel", null);
        setField(term27695, term27695.getClass(), "CPlusLabel", null);
        setField(term27695, term27695.getClass(), "CNeutralLabel", null);
        setField(term27695, term27695.getClass(), "CMinusLabel", null);
        setField(term27695, term27695.getClass(), "DLabel", null);
        setField(term27695, term27695.getClass(), "FLabel", null);
        setField(term27695, term27695.getClass(), "highestScoreLabel", null);
        setField(term27695, term27695.getClass(), "lowestScoreLabel", null);
        setField(term27695, term27695.getClass(), "highestMajorScoreLabel", null);
        setField(term27695, term27695.getClass(), "lowestMajorScoreLabel", null);
        setField(term27695, term27695.getClass(), "highestMinorScoreLabel", null);
        setField(term27695, term27695.getClass(), "lowestMinorScoreLabel", null);
        setField(term27695, term27695.getClass(), "highestDERScoreLabel", null);
        setField(term27695, term27695.getClass(), "lowestDERScoreLabel", null);
        setField(term27695, term27695.getClass(), "highestGERScoreLabel", null);
        setField(term27695, term27695.getClass(), "lowestGERScoreLabel", null);
        setField(term27695, term27695.getClass(), "majorsLabel", null);
        setField(term27695, term27695.getClass(), "minorsLabel", null);
        setField(term27695, term27695.getClass(), "DERsLabel", null);
        setField(term27695, term27695.getClass(), "GERsLabel", null);
        setField(term27695, term27695.getClass(), "unclassifiedListLabel", null);
        setField(term27695, term27695.getClass(), "allModulesLabel", null);
        setField(term27695, term27695.getClass(), "APlusList", null);
        setField(term27695, term27695.getClass(), "ANeutralList", null);
        setField(term27695, term27695.getClass(), "AMinusList", null);
        setField(term27695, term27695.getClass(), "BPlusList", null);
        setField(term27695, term27695.getClass(), "BNeutralList", null);
        setField(term27695, term27695.getClass(), "BMinusList", null);
        setField(term27695, term27695.getClass(), "CPlusList", null);
        setField(term27695, term27695.getClass(), "CNeutralList", null);
        setField(term27695, term27695.getClass(), "CMinusList", null);
        setField(term27695, term27695.getClass(), "DList", null);
        setField(term27695, term27695.getClass(), "FList", null);
        setField(term27695, term27695.getClass(), "majorsList", null);
        setField(term27695, term27695.getClass(), "minorsList", null);
        setField(term27695, term27695.getClass(), "DERList", null);
        setField(term27695, term27695.getClass(), "GERList", null);
        setField(term27695, term27695.getClass(), "unclassifiedList", null);
        setField(term27695, term27695.getClass(), "highestScoreCourse", null);
        setField(term27695, term27695.getClass(), "lowestScoreCourse", null);
        setField(term27695, term27695.getClass(), "highestMajorScoreCourse", null);
        setField(term27695, term27695.getClass(), "lowestMajorScoreCourse", null);
        setField(term27695, term27695.getClass(), "highestMinorScoreCourse", null);
        setField(term27695, term27695.getClass(), "lowestMinorScoreCourse", null);
        setField(term27695, term27695.getClass(), "highestDERScoreCourse", null);
        setField(term27695, term27695.getClass(), "lowestDERScoreCourse", null);
        setField(term27695, term27695.getClass(), "highestGERScoreCourse", null);
        setField(term27695, term27695.getClass(), "lowestGERScoreCourse", null);
        setField(term27695, term27695.getClass(), "cardLayout", null);
        setField(term27695, term27695.getClass(), "modulesBasement", null);
        setField(term27695, term27695.getClass(), "semestersBasement", null);
        setField(term27695, term27695.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModulesBasement", argTypes, term27695, args);
    }

};


