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
import java.util.LinkedList;

public class Stat_setNames_82472066421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3050;
     Object term3147;

    public Stat_setNames_82472066421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3051 = new Integer(-1476644457);
        Integer term3065 = new Integer(1270666529);
        Boolean term3067 = new Boolean(false);
        Integer term3073 = new Integer(-1146679443);
        Object term3072 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3072, term3072.getClass(), "change", term3073);
        setField(term3072, term3072.getClass(), "move", null);
        ArrayList term3070 = new ArrayList();
        ((ArrayList) term3070).add(term3072);
        Integer term3080 = new Integer(-860131894);
        Object term3079 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3079, term3079.getClass(), "change", term3080);
        setField(term3079, term3079.getClass(), "move", null);
        Integer term3083 = new Integer(-1022990421);
        Object term3082 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3082, term3082.getClass(), "change", term3083);
        setField(term3082, term3082.getClass(), "move", null);
        Integer term3086 = new Integer(1045547089);
        Object term3085 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3085, term3085.getClass(), "change", term3086);
        setField(term3085, term3085.getClass(), "move", null);
        Integer term3089 = new Integer(-1122880881);
        Object term3088 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3088, term3088.getClass(), "change", term3089);
        setField(term3088, term3088.getClass(), "move", null);
        Integer term3092 = new Integer(-542712742);
        Object term3091 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3091, term3091.getClass(), "change", term3092);
        setField(term3091, term3091.getClass(), "move", null);
        Integer term3095 = new Integer(-1254072822);
        Object term3094 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term3094, term3094.getClass(), "change", term3095);
        setField(term3094, term3094.getClass(), "move", null);
        ArrayList term3077 = new ArrayList();
        ((ArrayList) term3077).add(term3079);
        ((ArrayList) term3077).add(term3082);
        ((ArrayList) term3077).add(term3085);
        ((ArrayList) term3077).add(term3088);
        ((ArrayList) term3077).add(term3091);
        ((ArrayList) term3077).add(term3094);
        ArrayList term3100 = new ArrayList();
        ArrayList term3104 = new ArrayList();
        ArrayList term3108 = new ArrayList();
        Object term3139 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3141 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3139, term3139.getClass(), "name", "");
        setField(term3141, term3141.getClass(), "name", null);
        setField(term3141, term3141.getClass(), "url", null);
        setField(term3139, term3139.getClass(), "language", term3141);
        Object term3142 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3144 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3142, term3142.getClass(), "name", "");
        setField(term3144, term3144.getClass(), "name", null);
        setField(term3144, term3144.getClass(), "url", null);
        setField(term3142, term3142.getClass(), "language", term3144);
        ArrayList term3137 = new ArrayList();
        ((ArrayList) term3137).add(term3139);
        ((ArrayList) term3137).add(term3142);
        term3050 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term3069 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term3099 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term3112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3050, term3050.getClass(), "id", term3051);
        setField(term3050, term3050.getClass(), "name", "ONcbPCQnHd");
        setField(term3050, term3050.getClass(), "gameIndex", term3065);
        setField(term3050, term3050.getClass(), "isBattleOnly", term3067);
        setField(term3069, term3069.getClass(), "increase", term3070);
        setField(term3069, term3069.getClass(), "decrease", term3077);
        setField(term3050, term3050.getClass(), "affectingMoves", term3069);
        setField(term3099, term3099.getClass(), "increase", term3100);
        setField(term3099, term3099.getClass(), "decrease", term3104);
        setField(term3050, term3050.getClass(), "affectingNatures", term3099);
        setField(term3050, term3050.getClass(), "characteristics", term3108);
        setField(term3112, term3112.getClass(), "name", "uePedtiAfL");
        setField(term3112, term3112.getClass(), "url", "AdSHvysxQB");
        setField(term3050, term3050.getClass(), "moveDamageClass", term3112);
        setField(term3050, term3050.getClass(), "names", term3137);
        Object term3150 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3163 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3150, term3150.getClass(), "name", "OyYyYYnJuF");
        setField(term3163, term3163.getClass(), "name", "");
        setField(term3163, term3163.getClass(), "url", "");
        setField(term3150, term3150.getClass(), "language", term3163);
        Object term3167 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3169 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3167, term3167.getClass(), "name", "");
        setField(term3169, term3169.getClass(), "name", null);
        setField(term3169, term3169.getClass(), "url", null);
        setField(term3167, term3167.getClass(), "language", term3169);
        term3147 = new LinkedList();
        ((LinkedList) term3147).add(term3150);
        ((LinkedList) term3147).add(term3167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3147;
        callMethod(klass, "setNames", argTypes, term3050, args);
    }

};


