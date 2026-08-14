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

public class Stat_setAffectingNatures_91438508713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131224;
     Object term131327;

    public Stat_setAffectingNatures_91438508713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term131225 = new Integer(1788263953);
        Integer term131239 = new Integer(-1672203019);
        Boolean term131241 = new Boolean(false);
        Integer term131247 = new Integer(-1184413887);
        Object term131246 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131246, term131246.getClass(), "change", term131247);
        setField(term131246, term131246.getClass(), "move", null);
        Integer term131250 = new Integer(-831173295);
        Object term131249 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131249, term131249.getClass(), "change", term131250);
        setField(term131249, term131249.getClass(), "move", null);
        Integer term131253 = new Integer(1563333150);
        Object term131252 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131252, term131252.getClass(), "change", term131253);
        setField(term131252, term131252.getClass(), "move", null);
        Integer term131256 = new Integer(-766475202);
        Object term131255 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131255, term131255.getClass(), "change", term131256);
        setField(term131255, term131255.getClass(), "move", null);
        ArrayList term131244 = new ArrayList();
        ((ArrayList) term131244).add(term131246);
        ((ArrayList) term131244).add(term131249);
        ((ArrayList) term131244).add(term131252);
        ((ArrayList) term131244).add(term131255);
        Integer term131263 = new Integer(1362362674);
        Object term131262 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131262, term131262.getClass(), "change", term131263);
        setField(term131262, term131262.getClass(), "move", null);
        Integer term131266 = new Integer(553585097);
        Object term131265 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131265, term131265.getClass(), "change", term131266);
        setField(term131265, term131265.getClass(), "move", null);
        Integer term131269 = new Integer(1212393039);
        Object term131268 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131268, term131268.getClass(), "change", term131269);
        setField(term131268, term131268.getClass(), "move", null);
        Integer term131272 = new Integer(-1346793067);
        Object term131271 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131271, term131271.getClass(), "change", term131272);
        setField(term131271, term131271.getClass(), "move", null);
        Integer term131275 = new Integer(517580821);
        Object term131274 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131274, term131274.getClass(), "change", term131275);
        setField(term131274, term131274.getClass(), "move", null);
        Integer term131278 = new Integer(1804537299);
        Object term131277 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131277, term131277.getClass(), "change", term131278);
        setField(term131277, term131277.getClass(), "move", null);
        ArrayList term131260 = new ArrayList();
        ((ArrayList) term131260).add(term131262);
        ((ArrayList) term131260).add(term131265);
        ((ArrayList) term131260).add(term131268);
        ((ArrayList) term131260).add(term131271);
        ((ArrayList) term131260).add(term131274);
        ((ArrayList) term131260).add(term131277);
        ((ArrayList) term131260).add(term131271);
        ArrayList term131283 = new ArrayList();
        ArrayList term131287 = new ArrayList();
        ArrayList term131291 = new ArrayList();
        Object term131322 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term131324 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131322, term131322.getClass(), "name", "");
        setField(term131324, term131324.getClass(), "name", null);
        setField(term131324, term131324.getClass(), "url", null);
        setField(term131322, term131322.getClass(), "language", term131324);
        ArrayList term131320 = new ArrayList();
        ((ArrayList) term131320).add(term131322);
        term131224 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term131243 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term131282 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term131295 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131224, term131224.getClass(), "id", term131225);
        setField(term131224, term131224.getClass(), "name", "VZQXiPRCpg");
        setField(term131224, term131224.getClass(), "gameIndex", term131239);
        setField(term131224, term131224.getClass(), "isBattleOnly", term131241);
        setField(term131243, term131243.getClass(), "increase", term131244);
        setField(term131243, term131243.getClass(), "decrease", term131260);
        setField(term131224, term131224.getClass(), "affectingMoves", term131243);
        setField(term131282, term131282.getClass(), "increase", term131283);
        setField(term131282, term131282.getClass(), "decrease", term131287);
        setField(term131224, term131224.getClass(), "affectingNatures", term131282);
        setField(term131224, term131224.getClass(), "characteristics", term131291);
        setField(term131295, term131295.getClass(), "name", "vuKXOGOYUT");
        setField(term131295, term131295.getClass(), "url", "bQVkfrsOCv");
        setField(term131224, term131224.getClass(), "moveDamageClass", term131295);
        setField(term131224, term131224.getClass(), "names", term131320);
        ArrayList term131328 = new ArrayList();
        ArrayList term131332 = new ArrayList();
        term131327 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        setField(term131327, term131327.getClass(), "increase", term131328);
        setField(term131327, term131327.getClass(), "decrease", term131332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets");
        Object[] args = new Object[1];
        args[0] = term131327;
        callMethod(klass, "setAffectingNatures", argTypes, term131224, args);
    }

};


