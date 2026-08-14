package skaro.pokeapi.resource.stat;

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
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Stat_setMoveDamageClass_151143384318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2727;
     Object term2842;

    public Stat_setMoveDamageClass_151143384318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2728 = new Integer(-1870495012);
        Integer term2742 = new Integer(-1310015129);
        Boolean term2744 = new Boolean(true);
        Integer term2750 = new Integer(-2104981311);
        Object term2749 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2749, term2749.getClass(), "change", term2750);
        setField(term2749, term2749.getClass(), "move", null);
        Integer term2753 = new Integer(-571169753);
        Object term2752 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2752, term2752.getClass(), "change", term2753);
        setField(term2752, term2752.getClass(), "move", null);
        Integer term2756 = new Integer(318591690);
        Object term2755 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2755, term2755.getClass(), "change", term2756);
        setField(term2755, term2755.getClass(), "move", null);
        ArrayList term2747 = new ArrayList();
        ((ArrayList) term2747).add(term2749);
        ((ArrayList) term2747).add(term2752);
        ((ArrayList) term2747).add(term2755);
        Integer term2763 = new Integer(-165587447);
        Object term2762 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2762, term2762.getClass(), "change", term2763);
        setField(term2762, term2762.getClass(), "move", null);
        Integer term2766 = new Integer(-1347358701);
        Object term2765 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2765, term2765.getClass(), "change", term2766);
        setField(term2765, term2765.getClass(), "move", null);
        Integer term2769 = new Integer(806595993);
        Object term2768 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2768, term2768.getClass(), "change", term2769);
        setField(term2768, term2768.getClass(), "move", null);
        Integer term2772 = new Integer(548228925);
        Object term2771 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2771, term2771.getClass(), "change", term2772);
        setField(term2771, term2771.getClass(), "move", null);
        Integer term2775 = new Integer(-749861210);
        Object term2774 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2774, term2774.getClass(), "change", term2775);
        setField(term2774, term2774.getClass(), "move", null);
        Integer term2778 = new Integer(1694224101);
        Object term2777 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2777, term2777.getClass(), "change", term2778);
        setField(term2777, term2777.getClass(), "move", null);
        Integer term2781 = new Integer(937859191);
        Object term2780 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2780, term2780.getClass(), "change", term2781);
        setField(term2780, term2780.getClass(), "move", null);
        ArrayList term2760 = new ArrayList();
        ((ArrayList) term2760).add(term2762);
        ((ArrayList) term2760).add(term2765);
        ((ArrayList) term2760).add(term2768);
        ((ArrayList) term2760).add(term2771);
        ((ArrayList) term2760).add(term2774);
        ((ArrayList) term2760).add(term2777);
        ((ArrayList) term2760).add(term2780);
        ArrayList term2786 = new ArrayList();
        ArrayList term2790 = new ArrayList();
        ArrayList term2794 = new ArrayList();
        Object term2825 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2827 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2825, term2825.getClass(), "name", "");
        setField(term2827, term2827.getClass(), "name", null);
        setField(term2827, term2827.getClass(), "url", null);
        setField(term2825, term2825.getClass(), "language", term2827);
        Object term2828 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2830 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2828, term2828.getClass(), "name", "");
        setField(term2830, term2830.getClass(), "name", null);
        setField(term2830, term2830.getClass(), "url", null);
        setField(term2828, term2828.getClass(), "language", term2830);
        Object term2831 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2833 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2831, term2831.getClass(), "name", "");
        setField(term2833, term2833.getClass(), "name", null);
        setField(term2833, term2833.getClass(), "url", null);
        setField(term2831, term2831.getClass(), "language", term2833);
        Object term2834 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2836 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2834, term2834.getClass(), "name", "");
        setField(term2836, term2836.getClass(), "name", null);
        setField(term2836, term2836.getClass(), "url", null);
        setField(term2834, term2834.getClass(), "language", term2836);
        Object term2837 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2839 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2837, term2837.getClass(), "name", "");
        setField(term2839, term2839.getClass(), "name", null);
        setField(term2839, term2839.getClass(), "url", null);
        setField(term2837, term2837.getClass(), "language", term2839);
        ArrayList term2823 = new ArrayList();
        ((ArrayList) term2823).add(term2825);
        ((ArrayList) term2823).add(term2828);
        ((ArrayList) term2823).add(term2831);
        ((ArrayList) term2823).add(term2834);
        ((ArrayList) term2823).add(term2837);
        term2727 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term2746 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term2785 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term2798 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2727, term2727.getClass(), "id", term2728);
        setField(term2727, term2727.getClass(), "name", "HknsTajwxJ");
        setField(term2727, term2727.getClass(), "gameIndex", term2742);
        setField(term2727, term2727.getClass(), "isBattleOnly", term2744);
        setField(term2746, term2746.getClass(), "increase", term2747);
        setField(term2746, term2746.getClass(), "decrease", term2760);
        setField(term2727, term2727.getClass(), "affectingMoves", term2746);
        setField(term2785, term2785.getClass(), "increase", term2786);
        setField(term2785, term2785.getClass(), "decrease", term2790);
        setField(term2727, term2727.getClass(), "affectingNatures", term2785);
        setField(term2727, term2727.getClass(), "characteristics", term2794);
        setField(term2798, term2798.getClass(), "name", "xjoSGPWUgu");
        setField(term2798, term2798.getClass(), "url", "uzmqjnOUXu");
        setField(term2727, term2727.getClass(), "moveDamageClass", term2798);
        setField(term2727, term2727.getClass(), "names", term2823);
        term2842 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2842, term2842.getClass(), "name", "zMsSLTfGhl");
        setField(term2842, term2842.getClass(), "url", "bEmHScVZaQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term2842;
        callMethod(klass, "setMoveDamageClass", argTypes, term2727, args);
    }

};


