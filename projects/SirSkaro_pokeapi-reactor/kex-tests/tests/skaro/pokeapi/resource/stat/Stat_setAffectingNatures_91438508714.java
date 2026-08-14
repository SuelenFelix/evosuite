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

public class Stat_setAffectingNatures_91438508714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2130;
     Object term2233;

    public Stat_setAffectingNatures_91438508714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2131 = new Integer(11724947);
        Integer term2145 = new Integer(1953277050);
        Boolean term2147 = new Boolean(false);
        ArrayList term2150 = new ArrayList();
        Integer term2157 = new Integer(1283079251);
        Object term2156 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2156, term2156.getClass(), "change", term2157);
        setField(term2156, term2156.getClass(), "move", null);
        Integer term2160 = new Integer(-523949691);
        Object term2159 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2159, term2159.getClass(), "change", term2160);
        setField(term2159, term2159.getClass(), "move", null);
        Integer term2163 = new Integer(1398204340);
        Object term2162 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2162, term2162.getClass(), "change", term2163);
        setField(term2162, term2162.getClass(), "move", null);
        Integer term2166 = new Integer(229204365);
        Object term2165 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2165, term2165.getClass(), "change", term2166);
        setField(term2165, term2165.getClass(), "move", null);
        Integer term2169 = new Integer(-461771056);
        Object term2168 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2168, term2168.getClass(), "change", term2169);
        setField(term2168, term2168.getClass(), "move", null);
        Integer term2172 = new Integer(-243422082);
        Object term2171 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2171, term2171.getClass(), "change", term2172);
        setField(term2171, term2171.getClass(), "move", null);
        Integer term2175 = new Integer(1384592638);
        Object term2174 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2174, term2174.getClass(), "change", term2175);
        setField(term2174, term2174.getClass(), "move", null);
        Integer term2178 = new Integer(-1002370457);
        Object term2177 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2177, term2177.getClass(), "change", term2178);
        setField(term2177, term2177.getClass(), "move", null);
        Integer term2181 = new Integer(-2014576105);
        Object term2180 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2180, term2180.getClass(), "change", term2181);
        setField(term2180, term2180.getClass(), "move", null);
        ArrayList term2154 = new ArrayList();
        ((ArrayList) term2154).add(term2156);
        ((ArrayList) term2154).add(term2159);
        ((ArrayList) term2154).add(term2162);
        ((ArrayList) term2154).add(term2165);
        ((ArrayList) term2154).add(term2168);
        ((ArrayList) term2154).add(term2171);
        ((ArrayList) term2154).add(term2174);
        ((ArrayList) term2154).add(term2177);
        ((ArrayList) term2154).add(term2180);
        ArrayList term2186 = new ArrayList();
        ArrayList term2190 = new ArrayList();
        ArrayList term2194 = new ArrayList();
        Object term2225 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2227 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2225, term2225.getClass(), "name", "");
        setField(term2227, term2227.getClass(), "name", null);
        setField(term2227, term2227.getClass(), "url", null);
        setField(term2225, term2225.getClass(), "language", term2227);
        Object term2228 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2230 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2228, term2228.getClass(), "name", "");
        setField(term2230, term2230.getClass(), "name", null);
        setField(term2230, term2230.getClass(), "url", null);
        setField(term2228, term2228.getClass(), "language", term2230);
        ArrayList term2223 = new ArrayList();
        ((ArrayList) term2223).add(term2225);
        ((ArrayList) term2223).add(term2228);
        term2130 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term2149 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term2185 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term2198 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2130, term2130.getClass(), "id", term2131);
        setField(term2130, term2130.getClass(), "name", "GsWxOwXvSu");
        setField(term2130, term2130.getClass(), "gameIndex", term2145);
        setField(term2130, term2130.getClass(), "isBattleOnly", term2147);
        setField(term2149, term2149.getClass(), "increase", term2150);
        setField(term2149, term2149.getClass(), "decrease", term2154);
        setField(term2130, term2130.getClass(), "affectingMoves", term2149);
        setField(term2185, term2185.getClass(), "increase", term2186);
        setField(term2185, term2185.getClass(), "decrease", term2190);
        setField(term2130, term2130.getClass(), "affectingNatures", term2185);
        setField(term2130, term2130.getClass(), "characteristics", term2194);
        setField(term2198, term2198.getClass(), "name", "tIpkeYIezR");
        setField(term2198, term2198.getClass(), "url", "YkZtEtthvz");
        setField(term2130, term2130.getClass(), "moveDamageClass", term2198);
        setField(term2130, term2130.getClass(), "names", term2223);
        ArrayList term2234 = new ArrayList();
        ArrayList term2238 = new ArrayList();
        term2233 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        setField(term2233, term2233.getClass(), "increase", term2234);
        setField(term2233, term2233.getClass(), "decrease", term2238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets");
        Object[] args = new Object[1];
        args[0] = term2233;
        callMethod(klass, "setAffectingNatures", argTypes, term2130, args);
    }

};


