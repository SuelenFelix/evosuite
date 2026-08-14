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

public class Stat_setId_4867287392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term775;

    public Stat_setId_4867287392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term670 = new Integer(2055867847);
        Integer term684 = new Integer(-1048298087);
        Boolean term686 = new Boolean(false);
        Integer term692 = new Integer(292681826);
        Object term691 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term691, term691.getClass(), "change", term692);
        setField(term691, term691.getClass(), "move", null);
        Integer term695 = new Integer(458147407);
        Object term694 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term694, term694.getClass(), "change", term695);
        setField(term694, term694.getClass(), "move", null);
        Integer term698 = new Integer(-184153539);
        Object term697 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term697, term697.getClass(), "change", term698);
        setField(term697, term697.getClass(), "move", null);
        Integer term701 = new Integer(493620644);
        Object term700 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term700, term700.getClass(), "change", term701);
        setField(term700, term700.getClass(), "move", null);
        Integer term704 = new Integer(1328271830);
        Object term703 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term703, term703.getClass(), "change", term704);
        setField(term703, term703.getClass(), "move", null);
        ArrayList term689 = new ArrayList();
        ((ArrayList) term689).add(term691);
        ((ArrayList) term689).add(term694);
        ((ArrayList) term689).add(term697);
        ((ArrayList) term689).add(term700);
        ((ArrayList) term689).add(term703);
        Integer term711 = new Integer(1596070772);
        Object term710 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term710, term710.getClass(), "change", term711);
        setField(term710, term710.getClass(), "move", null);
        Integer term714 = new Integer(97029295);
        Object term713 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term713, term713.getClass(), "change", term714);
        setField(term713, term713.getClass(), "move", null);
        Integer term717 = new Integer(-1371869594);
        Object term716 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term716, term716.getClass(), "change", term717);
        setField(term716, term716.getClass(), "move", null);
        Integer term720 = new Integer(-2095575670);
        Object term719 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term719, term719.getClass(), "change", term720);
        setField(term719, term719.getClass(), "move", null);
        Integer term723 = new Integer(1225272962);
        Object term722 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term722, term722.getClass(), "change", term723);
        setField(term722, term722.getClass(), "move", null);
        ArrayList term708 = new ArrayList();
        ((ArrayList) term708).add(term710);
        ((ArrayList) term708).add(term713);
        ((ArrayList) term708).add(term716);
        ((ArrayList) term708).add(term719);
        ((ArrayList) term708).add(term722);
        ((ArrayList) term708).add(term716);
        ArrayList term728 = new ArrayList();
        ArrayList term732 = new ArrayList();
        ArrayList term736 = new ArrayList();
        Object term767 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term769 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term767, term767.getClass(), "name", "");
        setField(term769, term769.getClass(), "name", null);
        setField(term769, term769.getClass(), "url", null);
        setField(term767, term767.getClass(), "language", term769);
        Object term770 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term772 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term770, term770.getClass(), "name", "");
        setField(term772, term772.getClass(), "name", null);
        setField(term772, term772.getClass(), "url", null);
        setField(term770, term770.getClass(), "language", term772);
        ArrayList term765 = new ArrayList();
        ((ArrayList) term765).add(term767);
        ((ArrayList) term765).add(term770);
        term669 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term688 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term727 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term740 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term669, term669.getClass(), "id", term670);
        setField(term669, term669.getClass(), "name", "AdxvLJhNLe");
        setField(term669, term669.getClass(), "gameIndex", term684);
        setField(term669, term669.getClass(), "isBattleOnly", term686);
        setField(term688, term688.getClass(), "increase", term689);
        setField(term688, term688.getClass(), "decrease", term708);
        setField(term669, term669.getClass(), "affectingMoves", term688);
        setField(term727, term727.getClass(), "increase", term728);
        setField(term727, term727.getClass(), "decrease", term732);
        setField(term669, term669.getClass(), "affectingNatures", term727);
        setField(term669, term669.getClass(), "characteristics", term736);
        setField(term740, term740.getClass(), "name", "yVMkkQhvmN");
        setField(term740, term740.getClass(), "url", "mvrkADEgpp");
        setField(term669, term669.getClass(), "moveDamageClass", term740);
        setField(term669, term669.getClass(), "names", term765);
        term775 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term775;
        callMethod(klass, "setId", argTypes, term669, args);
    }

};


