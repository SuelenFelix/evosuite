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

public class Stat_setName_4282261044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term951;

    public Stat_setName_4282261044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term952 = new Integer(1375330971);
        Integer term966 = new Integer(-478195677);
        Boolean term968 = new Boolean(false);
        Integer term974 = new Integer(972867650);
        Object term973 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term973, term973.getClass(), "change", term974);
        setField(term973, term973.getClass(), "move", null);
        Integer term977 = new Integer(1655935355);
        Object term976 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term976, term976.getClass(), "change", term977);
        setField(term976, term976.getClass(), "move", null);
        Integer term980 = new Integer(-481533957);
        Object term979 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term979, term979.getClass(), "change", term980);
        setField(term979, term979.getClass(), "move", null);
        Integer term983 = new Integer(1240914516);
        Object term982 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term982, term982.getClass(), "change", term983);
        setField(term982, term982.getClass(), "move", null);
        Integer term986 = new Integer(-1465035361);
        Object term985 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term985, term985.getClass(), "change", term986);
        setField(term985, term985.getClass(), "move", null);
        ArrayList term971 = new ArrayList();
        ((ArrayList) term971).add(term973);
        ((ArrayList) term971).add(term976);
        ((ArrayList) term971).add(term979);
        ((ArrayList) term971).add(term982);
        ((ArrayList) term971).add(term985);
        Integer term993 = new Integer(1090617576);
        Object term992 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term992, term992.getClass(), "change", term993);
        setField(term992, term992.getClass(), "move", null);
        ArrayList term990 = new ArrayList();
        ((ArrayList) term990).add(term992);
        ArrayList term998 = new ArrayList();
        ArrayList term1002 = new ArrayList();
        ArrayList term1006 = new ArrayList();
        Object term1037 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1039 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1037, term1037.getClass(), "name", "");
        setField(term1039, term1039.getClass(), "name", null);
        setField(term1039, term1039.getClass(), "url", null);
        setField(term1037, term1037.getClass(), "language", term1039);
        Object term1040 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1042 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1040, term1040.getClass(), "name", "");
        setField(term1042, term1042.getClass(), "name", null);
        setField(term1042, term1042.getClass(), "url", null);
        setField(term1040, term1040.getClass(), "language", term1042);
        Object term1043 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1045 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1043, term1043.getClass(), "name", "");
        setField(term1045, term1045.getClass(), "name", null);
        setField(term1045, term1045.getClass(), "url", null);
        setField(term1043, term1043.getClass(), "language", term1045);
        Object term1046 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1046, term1046.getClass(), "name", "");
        setField(term1046, term1046.getClass(), "language", term1039);
        Object term1048 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1048, term1048.getClass(), "name", "");
        setField(term1048, term1048.getClass(), "language", term1042);
        Object term1050 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1052 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1050, term1050.getClass(), "name", "");
        setField(term1052, term1052.getClass(), "name", null);
        setField(term1052, term1052.getClass(), "url", null);
        setField(term1050, term1050.getClass(), "language", term1052);
        Object term1053 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1055 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1053, term1053.getClass(), "name", "");
        setField(term1055, term1055.getClass(), "name", null);
        setField(term1055, term1055.getClass(), "url", null);
        setField(term1053, term1053.getClass(), "language", term1055);
        Object term1056 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1058 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1056, term1056.getClass(), "name", "");
        setField(term1058, term1058.getClass(), "name", null);
        setField(term1058, term1058.getClass(), "url", null);
        setField(term1056, term1056.getClass(), "language", term1058);
        ArrayList term1035 = new ArrayList();
        ((ArrayList) term1035).add(term1037);
        ((ArrayList) term1035).add(term1040);
        ((ArrayList) term1035).add(term1043);
        ((ArrayList) term1035).add(term1046);
        ((ArrayList) term1035).add(term1048);
        ((ArrayList) term1035).add(term1050);
        ((ArrayList) term1035).add(term1053);
        ((ArrayList) term1035).add(term1056);
        term951 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term970 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term997 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term1010 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term951, term951.getClass(), "id", term952);
        setField(term951, term951.getClass(), "name", "vwbEQQNQrx");
        setField(term951, term951.getClass(), "gameIndex", term966);
        setField(term951, term951.getClass(), "isBattleOnly", term968);
        setField(term970, term970.getClass(), "increase", term971);
        setField(term970, term970.getClass(), "decrease", term990);
        setField(term951, term951.getClass(), "affectingMoves", term970);
        setField(term997, term997.getClass(), "increase", term998);
        setField(term997, term997.getClass(), "decrease", term1002);
        setField(term951, term951.getClass(), "affectingNatures", term997);
        setField(term951, term951.getClass(), "characteristics", term1006);
        setField(term1010, term1010.getClass(), "name", "JppkknKVOw");
        setField(term1010, term1010.getClass(), "url", "iljANwuEjk");
        setField(term951, term951.getClass(), "moveDamageClass", term1010);
        setField(term951, term951.getClass(), "names", term1035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZkMALXpEAZ";
        callMethod(klass, "setName", argTypes, term951, args);
    }

};


