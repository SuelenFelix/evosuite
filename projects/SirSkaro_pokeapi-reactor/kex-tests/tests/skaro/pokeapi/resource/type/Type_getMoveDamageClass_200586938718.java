package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Type_getMoveDamageClass_200586938718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58247;

    public Type_getMoveDamageClass_200586938718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58248 = new Integer(1427434947);
        ArrayList term58263 = new ArrayList();
        ArrayList term58267 = new ArrayList();
        ArrayList term58271 = new ArrayList();
        ArrayList term58275 = new ArrayList();
        ArrayList term58279 = new ArrayList();
        ArrayList term58283 = new ArrayList();
        Object term58289 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term58290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term58291 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term58290, term58290.getClass(), "name", null);
        setField(term58290, term58290.getClass(), "url", null);
        setField(term58289, term58289.getClass(), "generation", term58290);
        setField(term58291, term58291.getClass(), "noDamageTo", null);
        setField(term58291, term58291.getClass(), "halfDamageTo", null);
        setField(term58291, term58291.getClass(), "doubleDamageTo", null);
        setField(term58291, term58291.getClass(), "noDamageFrom", null);
        setField(term58291, term58291.getClass(), "halfDamageFrom", null);
        setField(term58291, term58291.getClass(), "doubleDamageFrom", null);
        setField(term58289, term58289.getClass(), "damageRelations", term58291);
        Object term58292 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term58293 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term58294 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term58293, term58293.getClass(), "name", null);
        setField(term58293, term58293.getClass(), "url", null);
        setField(term58292, term58292.getClass(), "generation", term58293);
        setField(term58294, term58294.getClass(), "noDamageTo", null);
        setField(term58294, term58294.getClass(), "halfDamageTo", null);
        setField(term58294, term58294.getClass(), "doubleDamageTo", null);
        setField(term58294, term58294.getClass(), "noDamageFrom", null);
        setField(term58294, term58294.getClass(), "halfDamageFrom", null);
        setField(term58294, term58294.getClass(), "doubleDamageFrom", null);
        setField(term58292, term58292.getClass(), "damageRelations", term58294);
        ArrayList term58287 = new ArrayList();
        ((ArrayList) term58287).add(term58289);
        ((ArrayList) term58287).add(term58292);
        Integer term58300 = new Integer(2130990985);
        Object term58299 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58302 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58299, term58299.getClass(), "gameIndex", term58300);
        setField(term58302, term58302.getClass(), "name", null);
        setField(term58302, term58302.getClass(), "url", null);
        setField(term58299, term58299.getClass(), "generation", term58302);
        Integer term58304 = new Integer(523197189);
        Object term58303 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58306 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58303, term58303.getClass(), "gameIndex", term58304);
        setField(term58306, term58306.getClass(), "name", null);
        setField(term58306, term58306.getClass(), "url", null);
        setField(term58303, term58303.getClass(), "generation", term58306);
        Integer term58308 = new Integer(658684460);
        Object term58307 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58310 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58307, term58307.getClass(), "gameIndex", term58308);
        setField(term58310, term58310.getClass(), "name", null);
        setField(term58310, term58310.getClass(), "url", null);
        setField(term58307, term58307.getClass(), "generation", term58310);
        Integer term58312 = new Integer(2073367039);
        Object term58311 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58314 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58311, term58311.getClass(), "gameIndex", term58312);
        setField(term58314, term58314.getClass(), "name", null);
        setField(term58314, term58314.getClass(), "url", null);
        setField(term58311, term58311.getClass(), "generation", term58314);
        Integer term58316 = new Integer(-365877126);
        Object term58315 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58318 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58315, term58315.getClass(), "gameIndex", term58316);
        setField(term58318, term58318.getClass(), "name", null);
        setField(term58318, term58318.getClass(), "url", null);
        setField(term58315, term58315.getClass(), "generation", term58318);
        Integer term58320 = new Integer(251018856);
        Object term58319 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58322 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58319, term58319.getClass(), "gameIndex", term58320);
        setField(term58322, term58322.getClass(), "name", null);
        setField(term58322, term58322.getClass(), "url", null);
        setField(term58319, term58319.getClass(), "generation", term58322);
        Integer term58324 = new Integer(-1965331640);
        Object term58323 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58326 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58323, term58323.getClass(), "gameIndex", term58324);
        setField(term58326, term58326.getClass(), "name", null);
        setField(term58326, term58326.getClass(), "url", null);
        setField(term58323, term58323.getClass(), "generation", term58326);
        Integer term58328 = new Integer(-514392629);
        Object term58327 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58330 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58327, term58327.getClass(), "gameIndex", term58328);
        setField(term58330, term58330.getClass(), "name", null);
        setField(term58330, term58330.getClass(), "url", null);
        setField(term58327, term58327.getClass(), "generation", term58330);
        ArrayList term58297 = new ArrayList();
        ((ArrayList) term58297).add(term58299);
        ((ArrayList) term58297).add(term58303);
        ((ArrayList) term58297).add(term58307);
        ((ArrayList) term58297).add(term58311);
        ((ArrayList) term58297).add(term58315);
        ((ArrayList) term58297).add(term58319);
        ((ArrayList) term58297).add(term58323);
        ((ArrayList) term58297).add(term58327);
        ArrayList term58333 = new ArrayList();
        ArrayList term58337 = new ArrayList();
        ArrayList term58341 = new ArrayList();
        term58247 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term58262 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term58247, term58247.getClass(), "id", term58248);
        setField(term58247, term58247.getClass(), "name", "iCNRyVJwAS");
        setField(term58262, term58262.getClass(), "noDamageTo", term58263);
        setField(term58262, term58262.getClass(), "halfDamageTo", term58267);
        setField(term58262, term58262.getClass(), "doubleDamageTo", term58271);
        setField(term58262, term58262.getClass(), "noDamageFrom", term58275);
        setField(term58262, term58262.getClass(), "halfDamageFrom", term58279);
        setField(term58262, term58262.getClass(), "doubleDamageFrom", term58283);
        setField(term58247, term58247.getClass(), "damageRelations", term58262);
        setField(term58247, term58247.getClass(), "pastDamageRelations", term58287);
        setField(term58247, term58247.getClass(), "gameIndices", term58297);
        setField(term58247, term58247.getClass(), "generation", term58322);
        setField(term58247, term58247.getClass(), "moveDamageClass", term58326);
        setField(term58247, term58247.getClass(), "names", term58333);
        setField(term58247, term58247.getClass(), "pokemon", term58337);
        setField(term58247, term58247.getClass(), "moves", term58341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveDamageClass", argTypes, term58247, args);
    }

};


