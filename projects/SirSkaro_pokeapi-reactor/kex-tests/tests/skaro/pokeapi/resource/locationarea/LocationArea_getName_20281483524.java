package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class LocationArea_getName_20281483524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112669;

    public LocationArea_getName_20281483524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term112670 = new Integer(264290749);
        Integer term112684 = new Integer(481697403);
        ArrayList term112690 = new ArrayList();
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        ((ArrayList) term112690).add((Object)null);
        Object term112688 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term112689 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112689, term112689.getClass(), "name", null);
        setField(term112689, term112689.getClass(), "url", null);
        setField(term112688, term112688.getClass(), "encounterMethod", term112689);
        setField(term112688, term112688.getClass(), "versionDetails", term112690);
        ArrayList term112686 = new ArrayList();
        ((ArrayList) term112686).add(term112688);
        ArrayList term112720 = new ArrayList();
        ArrayList term112728 = new ArrayList();
        ((ArrayList) term112728).add((Object)null);
        ((ArrayList) term112728).add((Object)null);
        ((ArrayList) term112728).add((Object)null);
        ((ArrayList) term112728).add((Object)null);
        Object term112726 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term112727 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112727, term112727.getClass(), "name", null);
        setField(term112727, term112727.getClass(), "url", null);
        setField(term112726, term112726.getClass(), "pokemon", term112727);
        setField(term112726, term112726.getClass(), "versionDetails", term112728);
        ArrayList term112733 = new ArrayList();
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        ((ArrayList) term112733).add((Object)null);
        Object term112731 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term112732 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112732, term112732.getClass(), "name", null);
        setField(term112732, term112732.getClass(), "url", null);
        setField(term112731, term112731.getClass(), "pokemon", term112732);
        setField(term112731, term112731.getClass(), "versionDetails", term112733);
        ArrayList term112737 = new ArrayList();
        ((ArrayList) term112737).add((Object)null);
        ((ArrayList) term112737).add((Object)null);
        ((ArrayList) term112737).add((Object)null);
        ((ArrayList) term112737).add((Object)null);
        ((ArrayList) term112737).add((Object)null);
        Object term112736 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term112736, term112736.getClass(), "pokemon", term112732);
        setField(term112736, term112736.getClass(), "versionDetails", term112737);
        ArrayList term112742 = new ArrayList();
        ((ArrayList) term112742).add((Object)null);
        ((ArrayList) term112742).add((Object)null);
        ((ArrayList) term112742).add((Object)null);
        Object term112740 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term112741 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112741, term112741.getClass(), "name", null);
        setField(term112741, term112741.getClass(), "url", null);
        setField(term112740, term112740.getClass(), "pokemon", term112741);
        setField(term112740, term112740.getClass(), "versionDetails", term112742);
        ArrayList term112747 = new ArrayList();
        ((ArrayList) term112747).add((Object)null);
        ((ArrayList) term112747).add((Object)null);
        Object term112745 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term112746 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112746, term112746.getClass(), "name", null);
        setField(term112746, term112746.getClass(), "url", null);
        setField(term112745, term112745.getClass(), "pokemon", term112746);
        setField(term112745, term112745.getClass(), "versionDetails", term112747);
        ArrayList term112751 = new ArrayList();
        ((ArrayList) term112751).add((Object)null);
        ((ArrayList) term112751).add((Object)null);
        ((ArrayList) term112751).add((Object)null);
        Object term112750 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term112750, term112750.getClass(), "pokemon", term112746);
        setField(term112750, term112750.getClass(), "versionDetails", term112751);
        ArrayList term112756 = new ArrayList();
        ((ArrayList) term112756).add((Object)null);
        ((ArrayList) term112756).add((Object)null);
        ((ArrayList) term112756).add((Object)null);
        ((ArrayList) term112756).add((Object)null);
        Object term112754 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term112755 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112755, term112755.getClass(), "name", null);
        setField(term112755, term112755.getClass(), "url", null);
        setField(term112754, term112754.getClass(), "pokemon", term112755);
        setField(term112754, term112754.getClass(), "versionDetails", term112756);
        ArrayList term112760 = new ArrayList();
        ((ArrayList) term112760).add((Object)null);
        ((ArrayList) term112760).add((Object)null);
        ((ArrayList) term112760).add((Object)null);
        ((ArrayList) term112760).add((Object)null);
        ((ArrayList) term112760).add((Object)null);
        ((ArrayList) term112760).add((Object)null);
        Object term112759 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term112759, term112759.getClass(), "pokemon", term112732);
        setField(term112759, term112759.getClass(), "versionDetails", term112760);
        ArrayList term112724 = new ArrayList();
        ((ArrayList) term112724).add(term112726);
        ((ArrayList) term112724).add(term112731);
        ((ArrayList) term112724).add(term112736);
        ((ArrayList) term112724).add(term112740);
        ((ArrayList) term112724).add(term112745);
        ((ArrayList) term112724).add(term112750);
        ((ArrayList) term112724).add(term112754);
        ((ArrayList) term112724).add(term112759);
        term112669 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        Object term112695 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112669, term112669.getClass(), "Id", term112670);
        setField(term112669, term112669.getClass(), "name", "KpdFuIpvff");
        setField(term112669, term112669.getClass(), "gameIndex", term112684);
        setField(term112669, term112669.getClass(), "encoutnerMethodRates", term112686);
        setField(term112695, term112695.getClass(), "name", "uzxNiqLTnV");
        setField(term112695, term112695.getClass(), "url", "pRfljizVIo");
        setField(term112669, term112669.getClass(), "location", term112695);
        setField(term112669, term112669.getClass(), "names", term112720);
        setField(term112669, term112669.getClass(), "pokemonEncounters", term112724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term112669, args);
    }

};


