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

public class Stat_setNames_82472066420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130115;
     Object term130215;

    public Stat_setNames_82472066420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term130116 = new Integer(-19383762);
        Integer term130130 = new Integer(1225890361);
        Boolean term130132 = new Boolean(false);
        Integer term130138 = new Integer(629422211);
        Object term130137 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130137, term130137.getClass(), "change", term130138);
        setField(term130137, term130137.getClass(), "move", null);
        ArrayList term130135 = new ArrayList();
        ((ArrayList) term130135).add(term130137);
        Integer term130145 = new Integer(59956966);
        Object term130144 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130144, term130144.getClass(), "change", term130145);
        setField(term130144, term130144.getClass(), "move", null);
        Integer term130148 = new Integer(-841682366);
        Object term130147 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130147, term130147.getClass(), "change", term130148);
        setField(term130147, term130147.getClass(), "move", null);
        Integer term130151 = new Integer(974285842);
        Object term130150 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130150, term130150.getClass(), "change", term130151);
        setField(term130150, term130150.getClass(), "move", null);
        Integer term130154 = new Integer(104380458);
        Object term130153 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130153, term130153.getClass(), "change", term130154);
        setField(term130153, term130153.getClass(), "move", null);
        Integer term130157 = new Integer(2035665173);
        Object term130156 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130156, term130156.getClass(), "change", term130157);
        setField(term130156, term130156.getClass(), "move", null);
        Integer term130160 = new Integer(1551975054);
        Object term130159 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130159, term130159.getClass(), "change", term130160);
        setField(term130159, term130159.getClass(), "move", null);
        Integer term130163 = new Integer(1198414570);
        Object term130162 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130162, term130162.getClass(), "change", term130163);
        setField(term130162, term130162.getClass(), "move", null);
        Integer term130166 = new Integer(-1816324255);
        Object term130165 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term130165, term130165.getClass(), "change", term130166);
        setField(term130165, term130165.getClass(), "move", null);
        ArrayList term130142 = new ArrayList();
        ((ArrayList) term130142).add(term130144);
        ((ArrayList) term130142).add(term130147);
        ((ArrayList) term130142).add(term130150);
        ((ArrayList) term130142).add(term130153);
        ((ArrayList) term130142).add(term130156);
        ((ArrayList) term130142).add(term130159);
        ((ArrayList) term130142).add(term130162);
        ((ArrayList) term130142).add(term130165);
        ArrayList term130171 = new ArrayList();
        ArrayList term130175 = new ArrayList();
        ArrayList term130179 = new ArrayList();
        Object term130210 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term130212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term130210, term130210.getClass(), "name", "");
        setField(term130212, term130212.getClass(), "name", null);
        setField(term130212, term130212.getClass(), "url", null);
        setField(term130210, term130210.getClass(), "language", term130212);
        ArrayList term130208 = new ArrayList();
        ((ArrayList) term130208).add(term130210);
        term130115 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term130134 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term130170 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term130183 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term130115, term130115.getClass(), "id", term130116);
        setField(term130115, term130115.getClass(), "name", "AgPgPxadNN");
        setField(term130115, term130115.getClass(), "gameIndex", term130130);
        setField(term130115, term130115.getClass(), "isBattleOnly", term130132);
        setField(term130134, term130134.getClass(), "increase", term130135);
        setField(term130134, term130134.getClass(), "decrease", term130142);
        setField(term130115, term130115.getClass(), "affectingMoves", term130134);
        setField(term130170, term130170.getClass(), "increase", term130171);
        setField(term130170, term130170.getClass(), "decrease", term130175);
        setField(term130115, term130115.getClass(), "affectingNatures", term130170);
        setField(term130115, term130115.getClass(), "characteristics", term130179);
        setField(term130183, term130183.getClass(), "name", "BfdfXfZxDn");
        setField(term130183, term130183.getClass(), "url", "YXjiSUCCHo");
        setField(term130115, term130115.getClass(), "moveDamageClass", term130183);
        setField(term130115, term130115.getClass(), "names", term130208);
        term130215 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term130215;
        callMethod(klass, "setNames", argTypes, term130115, args);
    }

};


