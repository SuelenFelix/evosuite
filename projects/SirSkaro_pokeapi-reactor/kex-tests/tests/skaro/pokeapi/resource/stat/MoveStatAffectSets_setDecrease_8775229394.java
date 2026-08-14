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

public class MoveStatAffectSets_setDecrease_8775229394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483;
     Object term524;

    public MoveStatAffectSets_setDecrease_8775229394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term487 = new Integer(-226514366);
        Object term486 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term489 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term486, term486.getClass(), "change", term487);
        setField(term489, term489.getClass(), "name", null);
        setField(term489, term489.getClass(), "url", null);
        setField(term486, term486.getClass(), "move", term489);
        Integer term491 = new Integer(1193880199);
        Object term490 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term493 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term490, term490.getClass(), "change", term491);
        setField(term493, term493.getClass(), "name", null);
        setField(term493, term493.getClass(), "url", null);
        setField(term490, term490.getClass(), "move", term493);
        Integer term495 = new Integer(-1087774327);
        Object term494 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term497 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term494, term494.getClass(), "change", term495);
        setField(term497, term497.getClass(), "name", null);
        setField(term497, term497.getClass(), "url", null);
        setField(term494, term494.getClass(), "move", term497);
        Integer term499 = new Integer(-1530420153);
        Object term498 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term501 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term498, term498.getClass(), "change", term499);
        setField(term501, term501.getClass(), "name", null);
        setField(term501, term501.getClass(), "url", null);
        setField(term498, term498.getClass(), "move", term501);
        Integer term503 = new Integer(-469968304);
        Object term502 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term502, term502.getClass(), "change", term503);
        setField(term505, term505.getClass(), "name", null);
        setField(term505, term505.getClass(), "url", null);
        setField(term502, term502.getClass(), "move", term505);
        Integer term507 = new Integer(-1145578966);
        Object term506 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term509 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term506, term506.getClass(), "change", term507);
        setField(term509, term509.getClass(), "name", null);
        setField(term509, term509.getClass(), "url", null);
        setField(term506, term506.getClass(), "move", term509);
        Integer term511 = new Integer(679763016);
        Object term510 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term513 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term510, term510.getClass(), "change", term511);
        setField(term513, term513.getClass(), "name", null);
        setField(term513, term513.getClass(), "url", null);
        setField(term510, term510.getClass(), "move", term513);
        ArrayList term484 = new ArrayList();
        ((ArrayList) term484).add(term486);
        ((ArrayList) term484).add(term490);
        ((ArrayList) term484).add(term494);
        ((ArrayList) term484).add(term498);
        ((ArrayList) term484).add(term502);
        ((ArrayList) term484).add(term506);
        ((ArrayList) term484).add(term510);
        Integer term519 = new Integer(1962444399);
        Object term518 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term521 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term518, term518.getClass(), "change", term519);
        setField(term521, term521.getClass(), "name", null);
        setField(term521, term521.getClass(), "url", null);
        setField(term518, term518.getClass(), "move", term521);
        ArrayList term516 = new ArrayList();
        ((ArrayList) term516).add(term518);
        term483 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        setField(term483, term483.getClass(), "increase", term484);
        setField(term483, term483.getClass(), "decrease", term516);
        term524 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term524;
        callMethod(klass, "setDecrease", argTypes, term483, args);
    }

};


