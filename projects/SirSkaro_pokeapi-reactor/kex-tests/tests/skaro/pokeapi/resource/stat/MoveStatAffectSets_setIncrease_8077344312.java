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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;
import java.util.LinkedList;

public class MoveStatAffectSets_setIncrease_8077344312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term429;

    public MoveStatAffectSets_setIncrease_8077344312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term384 = new Integer(1134449235);
        Object term383 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term386 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term383, term383.getClass(), "change", term384);
        setField(term386, term386.getClass(), "name", null);
        setField(term386, term386.getClass(), "url", null);
        setField(term383, term383.getClass(), "move", term386);
        Integer term388 = new Integer(-883034806);
        Object term387 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term390 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term387, term387.getClass(), "change", term388);
        setField(term390, term390.getClass(), "name", null);
        setField(term390, term390.getClass(), "url", null);
        setField(term387, term387.getClass(), "move", term390);
        Integer term392 = new Integer(1585847225);
        Object term391 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term394 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term391, term391.getClass(), "change", term392);
        setField(term394, term394.getClass(), "name", null);
        setField(term394, term394.getClass(), "url", null);
        setField(term391, term391.getClass(), "move", term394);
        Integer term396 = new Integer(597278769);
        Object term395 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term398 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term395, term395.getClass(), "change", term396);
        setField(term398, term398.getClass(), "name", null);
        setField(term398, term398.getClass(), "url", null);
        setField(term395, term395.getClass(), "move", term398);
        Integer term400 = new Integer(-1685132342);
        Object term399 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term402 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term399, term399.getClass(), "change", term400);
        setField(term402, term402.getClass(), "name", null);
        setField(term402, term402.getClass(), "url", null);
        setField(term399, term399.getClass(), "move", term402);
        ArrayList term381 = new ArrayList();
        ((ArrayList) term381).add(term383);
        ((ArrayList) term381).add(term387);
        ((ArrayList) term381).add(term391);
        ((ArrayList) term381).add(term395);
        ((ArrayList) term381).add(term399);
        Integer term408 = new Integer(-1456670397);
        Object term407 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term410 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term407, term407.getClass(), "change", term408);
        setField(term410, term410.getClass(), "name", null);
        setField(term410, term410.getClass(), "url", null);
        setField(term407, term407.getClass(), "move", term410);
        Integer term412 = new Integer(1622346318);
        Object term411 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term414 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term411, term411.getClass(), "change", term412);
        setField(term414, term414.getClass(), "name", null);
        setField(term414, term414.getClass(), "url", null);
        setField(term411, term411.getClass(), "move", term414);
        Integer term416 = new Integer(1048535127);
        Object term415 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term415, term415.getClass(), "change", term416);
        setField(term418, term418.getClass(), "name", null);
        setField(term418, term418.getClass(), "url", null);
        setField(term415, term415.getClass(), "move", term418);
        Integer term420 = new Integer(-655067527);
        Object term419 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term422 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term419, term419.getClass(), "change", term420);
        setField(term422, term422.getClass(), "name", null);
        setField(term422, term422.getClass(), "url", null);
        setField(term419, term419.getClass(), "move", term422);
        Integer term424 = new Integer(-6029667);
        Object term423 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term426 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term423, term423.getClass(), "change", term424);
        setField(term426, term426.getClass(), "name", null);
        setField(term426, term426.getClass(), "url", null);
        setField(term423, term423.getClass(), "move", term426);
        ArrayList term405 = new ArrayList();
        ((ArrayList) term405).add(term407);
        ((ArrayList) term405).add(term411);
        ((ArrayList) term405).add(term415);
        ((ArrayList) term405).add(term419);
        ((ArrayList) term405).add(term423);
        term380 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        setField(term380, term380.getClass(), "increase", term381);
        setField(term380, term380.getClass(), "decrease", term405);
        Integer term433 = new Integer(-2068769794);
        Object term432 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term435 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term432, term432.getClass(), "change", term433);
        setField(term435, term435.getClass(), "name", "");
        setField(term435, term435.getClass(), "url", "");
        setField(term432, term432.getClass(), "move", term435);
        Integer term440 = new Integer(-117576464);
        Object term439 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term442 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term439, term439.getClass(), "change", term440);
        setField(term442, term442.getClass(), "name", null);
        setField(term442, term442.getClass(), "url", null);
        setField(term439, term439.getClass(), "move", term442);
        Integer term445 = new Integer(-1007160944);
        Object term444 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term444, term444.getClass(), "change", term445);
        setField(term444, term444.getClass(), "move", null);
        term429 = new LinkedList();
        ((LinkedList) term429).add(term432);
        ((LinkedList) term429).add(term439);
        ((LinkedList) term429).add(term444);
        ((LinkedList) term429).add((Object)null);
        ((LinkedList) term429).add((Object)null);
        ((LinkedList) term429).add((Object)null);
        ((LinkedList) term429).add((Object)null);
        ((LinkedList) term429).add((Object)null);
        ((LinkedList) term429).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term429;
        callMethod(klass, "setIncrease", argTypes, term380, args);
    }

};


