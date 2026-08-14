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

public class Stat_setAffectingMoves_86775447512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128946;
     Object term129040;

    public Stat_setAffectingMoves_86775447512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term128947 = new Integer(1466641302);
        Integer term128961 = new Integer(-365255901);
        Boolean term128963 = new Boolean(false);
        Integer term128969 = new Integer(-1861629783);
        Object term128968 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term128968, term128968.getClass(), "change", term128969);
        setField(term128968, term128968.getClass(), "move", null);
        ArrayList term128966 = new ArrayList();
        ((ArrayList) term128966).add(term128968);
        Integer term128976 = new Integer(1512542473);
        Object term128975 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term128975, term128975.getClass(), "change", term128976);
        setField(term128975, term128975.getClass(), "move", null);
        Integer term128979 = new Integer(395474596);
        Object term128978 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term128978, term128978.getClass(), "change", term128979);
        setField(term128978, term128978.getClass(), "move", null);
        Integer term128982 = new Integer(-181917615);
        Object term128981 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term128981, term128981.getClass(), "change", term128982);
        setField(term128981, term128981.getClass(), "move", null);
        Integer term128985 = new Integer(-175990400);
        Object term128984 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term128984, term128984.getClass(), "change", term128985);
        setField(term128984, term128984.getClass(), "move", null);
        ArrayList term128973 = new ArrayList();
        ((ArrayList) term128973).add(term128975);
        ((ArrayList) term128973).add(term128978);
        ((ArrayList) term128973).add(term128981);
        ((ArrayList) term128973).add(term128984);
        ArrayList term128990 = new ArrayList();
        ArrayList term128994 = new ArrayList();
        ArrayList term128998 = new ArrayList();
        Object term129029 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term129031 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129029, term129029.getClass(), "name", "");
        setField(term129031, term129031.getClass(), "name", null);
        setField(term129031, term129031.getClass(), "url", null);
        setField(term129029, term129029.getClass(), "language", term129031);
        Object term129032 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term129034 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129032, term129032.getClass(), "name", "");
        setField(term129034, term129034.getClass(), "name", null);
        setField(term129034, term129034.getClass(), "url", null);
        setField(term129032, term129032.getClass(), "language", term129034);
        Object term129035 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term129037 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129035, term129035.getClass(), "name", "");
        setField(term129037, term129037.getClass(), "name", null);
        setField(term129037, term129037.getClass(), "url", null);
        setField(term129035, term129035.getClass(), "language", term129037);
        ArrayList term129027 = new ArrayList();
        ((ArrayList) term129027).add(term129029);
        ((ArrayList) term129027).add(term129032);
        ((ArrayList) term129027).add(term129035);
        term128946 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term128965 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term128989 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term129002 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term128946, term128946.getClass(), "id", term128947);
        setField(term128946, term128946.getClass(), "name", "cOsplNHghp");
        setField(term128946, term128946.getClass(), "gameIndex", term128961);
        setField(term128946, term128946.getClass(), "isBattleOnly", term128963);
        setField(term128965, term128965.getClass(), "increase", term128966);
        setField(term128965, term128965.getClass(), "decrease", term128973);
        setField(term128946, term128946.getClass(), "affectingMoves", term128965);
        setField(term128989, term128989.getClass(), "increase", term128990);
        setField(term128989, term128989.getClass(), "decrease", term128994);
        setField(term128946, term128946.getClass(), "affectingNatures", term128989);
        setField(term128946, term128946.getClass(), "characteristics", term128998);
        setField(term129002, term129002.getClass(), "name", "fXVEiVSLDm");
        setField(term129002, term129002.getClass(), "url", "ZMWPbYExvT");
        setField(term128946, term128946.getClass(), "moveDamageClass", term129002);
        setField(term128946, term128946.getClass(), "names", term129027);
        Integer term129044 = new Integer(-1756176486);
        Object term129043 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term129046 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129043, term129043.getClass(), "change", term129044);
        setField(term129046, term129046.getClass(), "name", null);
        setField(term129046, term129046.getClass(), "url", null);
        setField(term129043, term129043.getClass(), "move", term129046);
        ArrayList term129041 = new ArrayList();
        ((ArrayList) term129041).add(term129043);
        Integer term129052 = new Integer(-1049589248);
        Object term129051 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term129054 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129051, term129051.getClass(), "change", term129052);
        setField(term129054, term129054.getClass(), "name", null);
        setField(term129054, term129054.getClass(), "url", null);
        setField(term129051, term129051.getClass(), "move", term129054);
        Integer term129056 = new Integer(120294405);
        Object term129055 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term129058 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129055, term129055.getClass(), "change", term129056);
        setField(term129058, term129058.getClass(), "name", null);
        setField(term129058, term129058.getClass(), "url", null);
        setField(term129055, term129055.getClass(), "move", term129058);
        Integer term129060 = new Integer(1525059844);
        Object term129059 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term129062 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129059, term129059.getClass(), "change", term129060);
        setField(term129062, term129062.getClass(), "name", null);
        setField(term129062, term129062.getClass(), "url", null);
        setField(term129059, term129059.getClass(), "move", term129062);
        Integer term129064 = new Integer(1788101978);
        Object term129063 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term129066 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129063, term129063.getClass(), "change", term129064);
        setField(term129066, term129066.getClass(), "name", null);
        setField(term129066, term129066.getClass(), "url", null);
        setField(term129063, term129063.getClass(), "move", term129066);
        ArrayList term129049 = new ArrayList();
        ((ArrayList) term129049).add(term129051);
        ((ArrayList) term129049).add(term129055);
        ((ArrayList) term129049).add(term129059);
        ((ArrayList) term129049).add(term129063);
        term129040 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        setField(term129040, term129040.getClass(), "increase", term129041);
        setField(term129040, term129040.getClass(), "decrease", term129049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Object[] args = new Object[1];
        args[0] = term129040;
        callMethod(klass, "setAffectingMoves", argTypes, term128946, args);
    }

};


