package refactoring.app.chapter01;

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
import static refactoring.app.chapter01.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class Statement_renderPlainText_1592186832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2683;
     Object term2684;

    public Statement_renderPlainText_1592186832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2683 = newInstance(Class.forName("refactoring.app.chapter01.Statement"));
        Object term2700 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2700, term2700.getClass(), "playId", null);
        setIntField(term2700, term2700.getClass(), "audience", 1324040357);
        Object term2702 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2702, term2702.getClass(), "playId", null);
        setIntField(term2702, term2702.getClass(), "audience", -1588772968);
        Object term2704 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2704, term2704.getClass(), "playId", null);
        setIntField(term2704, term2704.getClass(), "audience", -93135961);
        Object term2706 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2706, term2706.getClass(), "playId", null);
        setIntField(term2706, term2706.getClass(), "audience", -112921587);
        Object term2708 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2708, term2708.getClass(), "playId", null);
        setIntField(term2708, term2708.getClass(), "audience", 933028652);
        ArrayList term2698 = new ArrayList();
        ((ArrayList) term2698).add(term2700);
        ((ArrayList) term2698).add(term2702);
        ((ArrayList) term2698).add(term2704);
        ((ArrayList) term2698).add(term2706);
        ((ArrayList) term2698).add(term2708);
        HashMap term2713 = new HashMap();
        term2684 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term2685 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term2712 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term2721 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term2685, term2685.getClass(), "customer", "yGtHPyvYiQ");
        setField(term2685, term2685.getClass(), "performances", term2698);
        setField(term2684, term2684.getClass(), "invoice", term2685);
        setField(term2712, term2712.getClass(), "playMap", term2713);
        setField(term2684, term2684.getClass(), "plays", term2712);
        setField(term2684, term2684.getClass(), "performanceCalculatorFactory", term2721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Statement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter01.StatementData");
        Object[] args = new Object[1];
        args[0] = term2684;
        callMethod(klass, "renderPlainText", argTypes, term2683, args);
    }

};


