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

public class Stat_getName_12916504643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807;

    public Stat_getName_12916504643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term808 = new Integer(-1588772968);
        Integer term822 = new Integer(-93135961);
        Boolean term824 = new Boolean(false);
        Integer term830 = new Integer(-112921587);
        Object term829 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term829, term829.getClass(), "change", term830);
        setField(term829, term829.getClass(), "move", null);
        Integer term833 = new Integer(933028652);
        Object term832 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term832, term832.getClass(), "change", term833);
        setField(term832, term832.getClass(), "move", null);
        Integer term836 = new Integer(287287233);
        Object term835 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term835, term835.getClass(), "change", term836);
        setField(term835, term835.getClass(), "move", null);
        Integer term839 = new Integer(962840079);
        Object term838 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term838, term838.getClass(), "change", term839);
        setField(term838, term838.getClass(), "move", null);
        Integer term842 = new Integer(1540719661);
        Object term841 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term841, term841.getClass(), "change", term842);
        setField(term841, term841.getClass(), "move", null);
        Integer term845 = new Integer(1265463001);
        Object term844 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term844, term844.getClass(), "change", term845);
        setField(term844, term844.getClass(), "move", null);
        ArrayList term827 = new ArrayList();
        ((ArrayList) term827).add(term829);
        ((ArrayList) term827).add(term832);
        ((ArrayList) term827).add(term835);
        ((ArrayList) term827).add(term838);
        ((ArrayList) term827).add(term841);
        ((ArrayList) term827).add(term844);
        Integer term852 = new Integer(335112684);
        Object term851 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term851, term851.getClass(), "change", term852);
        setField(term851, term851.getClass(), "move", null);
        Integer term855 = new Integer(1551099402);
        Object term854 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term854, term854.getClass(), "change", term855);
        setField(term854, term854.getClass(), "move", null);
        Integer term858 = new Integer(-2027534003);
        Object term857 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term857, term857.getClass(), "change", term858);
        setField(term857, term857.getClass(), "move", null);
        Integer term861 = new Integer(1063420942);
        Object term860 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term860, term860.getClass(), "change", term861);
        setField(term860, term860.getClass(), "move", null);
        ArrayList term849 = new ArrayList();
        ((ArrayList) term849).add(term851);
        ((ArrayList) term849).add(term854);
        ((ArrayList) term849).add(term857);
        ((ArrayList) term849).add(term860);
        ((ArrayList) term849).add(term854);
        ((ArrayList) term849).add(term857);
        ArrayList term866 = new ArrayList();
        ArrayList term870 = new ArrayList();
        ArrayList term874 = new ArrayList();
        Object term905 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term907 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term905, term905.getClass(), "name", "");
        setField(term907, term907.getClass(), "name", null);
        setField(term907, term907.getClass(), "url", null);
        setField(term905, term905.getClass(), "language", term907);
        Object term908 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term910 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term908, term908.getClass(), "name", "");
        setField(term910, term910.getClass(), "name", null);
        setField(term910, term910.getClass(), "url", null);
        setField(term908, term908.getClass(), "language", term910);
        Object term911 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term913 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term911, term911.getClass(), "name", "");
        setField(term913, term913.getClass(), "name", null);
        setField(term913, term913.getClass(), "url", null);
        setField(term911, term911.getClass(), "language", term913);
        Object term914 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term914, term914.getClass(), "name", "");
        setField(term914, term914.getClass(), "language", term913);
        Object term916 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term918 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term916, term916.getClass(), "name", "");
        setField(term918, term918.getClass(), "name", null);
        setField(term918, term918.getClass(), "url", null);
        setField(term916, term916.getClass(), "language", term918);
        ArrayList term903 = new ArrayList();
        ((ArrayList) term903).add(term905);
        ((ArrayList) term903).add(term908);
        ((ArrayList) term903).add(term911);
        ((ArrayList) term903).add(term914);
        ((ArrayList) term903).add(term916);
        term807 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term826 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term865 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term878 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term807, term807.getClass(), "id", term808);
        setField(term807, term807.getClass(), "name", "FPvxVzzSvD");
        setField(term807, term807.getClass(), "gameIndex", term822);
        setField(term807, term807.getClass(), "isBattleOnly", term824);
        setField(term826, term826.getClass(), "increase", term827);
        setField(term826, term826.getClass(), "decrease", term849);
        setField(term807, term807.getClass(), "affectingMoves", term826);
        setField(term865, term865.getClass(), "increase", term866);
        setField(term865, term865.getClass(), "decrease", term870);
        setField(term807, term807.getClass(), "affectingNatures", term865);
        setField(term807, term807.getClass(), "characteristics", term874);
        setField(term878, term878.getClass(), "name", "WHcwFgsGFC");
        setField(term878, term878.getClass(), "url", "HzqpegHiRq");
        setField(term807, term807.getClass(), "moveDamageClass", term878);
        setField(term807, term807.getClass(), "names", term903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term807, args);
    }

};


