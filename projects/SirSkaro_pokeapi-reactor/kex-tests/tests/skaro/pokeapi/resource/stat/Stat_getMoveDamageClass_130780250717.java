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

public class Stat_getMoveDamageClass_130780250717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2588;

    public Stat_getMoveDamageClass_130780250717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2589 = new Integer(-1899301124);
        Integer term2603 = new Integer(-1882480155);
        Boolean term2605 = new Boolean(false);
        Integer term2611 = new Integer(-1410220680);
        Object term2610 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2610, term2610.getClass(), "change", term2611);
        setField(term2610, term2610.getClass(), "move", null);
        Integer term2614 = new Integer(389427431);
        Object term2613 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2613, term2613.getClass(), "change", term2614);
        setField(term2613, term2613.getClass(), "move", null);
        Integer term2617 = new Integer(-1945706126);
        Object term2616 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2616, term2616.getClass(), "change", term2617);
        setField(term2616, term2616.getClass(), "move", null);
        ArrayList term2608 = new ArrayList();
        ((ArrayList) term2608).add(term2610);
        ((ArrayList) term2608).add(term2613);
        ((ArrayList) term2608).add(term2616);
        Integer term2624 = new Integer(1152356969);
        Object term2623 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2623, term2623.getClass(), "change", term2624);
        setField(term2623, term2623.getClass(), "move", null);
        Integer term2627 = new Integer(-1667990367);
        Object term2626 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2626, term2626.getClass(), "change", term2627);
        setField(term2626, term2626.getClass(), "move", null);
        Integer term2630 = new Integer(-1214628358);
        Object term2629 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2629, term2629.getClass(), "change", term2630);
        setField(term2629, term2629.getClass(), "move", null);
        Integer term2633 = new Integer(1102721075);
        Object term2632 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2632, term2632.getClass(), "change", term2633);
        setField(term2632, term2632.getClass(), "move", null);
        Integer term2636 = new Integer(-426764678);
        Object term2635 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2635, term2635.getClass(), "change", term2636);
        setField(term2635, term2635.getClass(), "move", null);
        Integer term2639 = new Integer(-1222614956);
        Object term2638 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2638, term2638.getClass(), "change", term2639);
        setField(term2638, term2638.getClass(), "move", null);
        ArrayList term2621 = new ArrayList();
        ((ArrayList) term2621).add(term2623);
        ((ArrayList) term2621).add(term2626);
        ((ArrayList) term2621).add(term2629);
        ((ArrayList) term2621).add(term2632);
        ((ArrayList) term2621).add(term2635);
        ((ArrayList) term2621).add(term2638);
        ArrayList term2644 = new ArrayList();
        ArrayList term2648 = new ArrayList();
        ArrayList term2652 = new ArrayList();
        Object term2683 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2685 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2683, term2683.getClass(), "name", "");
        setField(term2685, term2685.getClass(), "name", null);
        setField(term2685, term2685.getClass(), "url", null);
        setField(term2683, term2683.getClass(), "language", term2685);
        Object term2686 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2688 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2686, term2686.getClass(), "name", "");
        setField(term2688, term2688.getClass(), "name", null);
        setField(term2688, term2688.getClass(), "url", null);
        setField(term2686, term2686.getClass(), "language", term2688);
        Object term2689 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2691 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2689, term2689.getClass(), "name", "");
        setField(term2691, term2691.getClass(), "name", null);
        setField(term2691, term2691.getClass(), "url", null);
        setField(term2689, term2689.getClass(), "language", term2691);
        Object term2692 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2694 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2692, term2692.getClass(), "name", "");
        setField(term2694, term2694.getClass(), "name", null);
        setField(term2694, term2694.getClass(), "url", null);
        setField(term2692, term2692.getClass(), "language", term2694);
        ArrayList term2681 = new ArrayList();
        ((ArrayList) term2681).add(term2683);
        ((ArrayList) term2681).add(term2686);
        ((ArrayList) term2681).add(term2689);
        ((ArrayList) term2681).add(term2692);
        term2588 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term2607 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term2643 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term2656 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2588, term2588.getClass(), "id", term2589);
        setField(term2588, term2588.getClass(), "name", "mwmFMNEzkK");
        setField(term2588, term2588.getClass(), "gameIndex", term2603);
        setField(term2588, term2588.getClass(), "isBattleOnly", term2605);
        setField(term2607, term2607.getClass(), "increase", term2608);
        setField(term2607, term2607.getClass(), "decrease", term2621);
        setField(term2588, term2588.getClass(), "affectingMoves", term2607);
        setField(term2643, term2643.getClass(), "increase", term2644);
        setField(term2643, term2643.getClass(), "decrease", term2648);
        setField(term2588, term2588.getClass(), "affectingNatures", term2643);
        setField(term2588, term2588.getClass(), "characteristics", term2652);
        setField(term2656, term2656.getClass(), "name", "oNLcCYDAsO");
        setField(term2656, term2656.getClass(), "url", "CNqMxLvtcJ");
        setField(term2588, term2588.getClass(), "moveDamageClass", term2656);
        setField(term2588, term2588.getClass(), "names", term2681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveDamageClass", argTypes, term2588, args);
    }

};


