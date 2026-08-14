package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_getGrowthTime_4788444485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;

    public Berry_getGrowthTime_4788444485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term794 = new Integer(-817164822);
        Integer term808 = new Integer(-1016503459);
        Integer term810 = new Integer(-1968847291);
        Integer term812 = new Integer(579005622);
        Integer term814 = new Integer(-14890619);
        Integer term816 = new Integer(1632125673);
        Integer term818 = new Integer(454281060);
        Integer term848 = new Integer(-1786399638);
        Object term847 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term850 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term847, term847.getClass(), "potency", term848);
        setField(term850, term850.getClass(), "name", null);
        setField(term850, term850.getClass(), "url", null);
        setField(term847, term847.getClass(), "flavor", term850);
        ArrayList term845 = new ArrayList();
        ((ArrayList) term845).add(term847);
        term793 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term820 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term853 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term878 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term793, term793.getClass(), "id", term794);
        setField(term793, term793.getClass(), "name", "dEnhdmILtU");
        setField(term793, term793.getClass(), "growthTime", term808);
        setField(term793, term793.getClass(), "maxHarvest", term810);
        setField(term793, term793.getClass(), "naturalGiftPower", term812);
        setField(term793, term793.getClass(), "size", term814);
        setField(term793, term793.getClass(), "smoothness", term816);
        setField(term793, term793.getClass(), "soilDryness", term818);
        setField(term820, term820.getClass(), "name", "hoicvmsovO");
        setField(term820, term820.getClass(), "url", "eqJfYWRaEL");
        setField(term793, term793.getClass(), "firmness", term820);
        setField(term793, term793.getClass(), "flavors", term845);
        setField(term853, term853.getClass(), "name", "kBdSllIBVz");
        setField(term853, term853.getClass(), "url", "TJmVBGfTML");
        setField(term793, term793.getClass(), "item", term853);
        setField(term878, term878.getClass(), "name", "tPlsykYBqO");
        setField(term878, term878.getClass(), "url", "bLPjGVBhlX");
        setField(term793, term793.getClass(), "naturalGiftType", term878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGrowthTime", argTypes, term793, args);
    }

};


