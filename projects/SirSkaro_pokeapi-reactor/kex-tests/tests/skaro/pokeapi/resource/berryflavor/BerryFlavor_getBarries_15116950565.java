package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_getBarries_15116950565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684;

    public BerryFlavor_getBarries_15116950565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term685 = new Integer(-6029667);
        Integer term702 = new Integer(-2068769794);
        Object term701 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term704 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term701, term701.getClass(), "potency", term702);
        setField(term704, term704.getClass(), "name", null);
        setField(term704, term704.getClass(), "url", null);
        setField(term701, term701.getClass(), "berry", term704);
        Integer term706 = new Integer(-117576464);
        Object term705 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term708 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term705, term705.getClass(), "potency", term706);
        setField(term708, term708.getClass(), "name", null);
        setField(term708, term708.getClass(), "url", null);
        setField(term705, term705.getClass(), "berry", term708);
        Integer term710 = new Integer(-1007160944);
        Object term709 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term712 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term709, term709.getClass(), "potency", term710);
        setField(term712, term712.getClass(), "name", null);
        setField(term712, term712.getClass(), "url", null);
        setField(term709, term709.getClass(), "berry", term712);
        Integer term714 = new Integer(1135664017);
        Object term713 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term716 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term713, term713.getClass(), "potency", term714);
        setField(term716, term716.getClass(), "name", null);
        setField(term716, term716.getClass(), "url", null);
        setField(term713, term713.getClass(), "berry", term716);
        Integer term718 = new Integer(590364439);
        Object term717 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term720 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term717, term717.getClass(), "potency", term718);
        setField(term720, term720.getClass(), "name", null);
        setField(term720, term720.getClass(), "url", null);
        setField(term717, term717.getClass(), "berry", term720);
        Integer term722 = new Integer(865208305);
        Object term721 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term724 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term721, term721.getClass(), "potency", term722);
        setField(term724, term724.getClass(), "name", null);
        setField(term724, term724.getClass(), "url", null);
        setField(term721, term721.getClass(), "berry", term724);
        Integer term726 = new Integer(-1275173084);
        Object term725 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term728 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term725, term725.getClass(), "potency", term726);
        setField(term728, term728.getClass(), "name", null);
        setField(term728, term728.getClass(), "url", null);
        setField(term725, term725.getClass(), "berry", term728);
        ArrayList term699 = new ArrayList();
        ((ArrayList) term699).add(term701);
        ((ArrayList) term699).add(term705);
        ((ArrayList) term699).add(term709);
        ((ArrayList) term699).add(term713);
        ((ArrayList) term699).add(term717);
        ((ArrayList) term699).add(term721);
        ((ArrayList) term699).add(term725);
        Object term758 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term760 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term758, term758.getClass(), "name", "");
        setField(term760, term760.getClass(), "name", null);
        setField(term760, term760.getClass(), "url", null);
        setField(term758, term758.getClass(), "language", term760);
        ArrayList term756 = new ArrayList();
        ((ArrayList) term756).add(term758);
        term684 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term731 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term684, term684.getClass(), "id", term685);
        setField(term684, term684.getClass(), "name", "sEnIVFtZuQ");
        setField(term684, term684.getClass(), "barries", term699);
        setField(term731, term731.getClass(), "name", "WzMEhMXkKx");
        setField(term731, term731.getClass(), "url", "XOiDvlDhdc");
        setField(term684, term684.getClass(), "contestType", term731);
        setField(term684, term684.getClass(), "names", term756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBarries", argTypes, term684, args);
    }

};


