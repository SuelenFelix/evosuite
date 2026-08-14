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

public class LocationArea_setLocation_182388693013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113592;
     Object term113691;

    public LocationArea_setLocation_182388693013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term113593 = new Integer(-912972263);
        Integer term113607 = new Integer(-340318694);
        ArrayList term113613 = new ArrayList();
        ((ArrayList) term113613).add((Object)null);
        ((ArrayList) term113613).add((Object)null);
        Object term113611 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term113612 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113612, term113612.getClass(), "name", null);
        setField(term113612, term113612.getClass(), "url", null);
        setField(term113611, term113611.getClass(), "encounterMethod", term113612);
        setField(term113611, term113611.getClass(), "versionDetails", term113613);
        ArrayList term113609 = new ArrayList();
        ((ArrayList) term113609).add(term113611);
        Object term113645 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113647 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113645, term113645.getClass(), "name", "");
        setField(term113647, term113647.getClass(), "name", null);
        setField(term113647, term113647.getClass(), "url", null);
        setField(term113645, term113645.getClass(), "language", term113647);
        Object term113648 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113650 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113648, term113648.getClass(), "name", "");
        setField(term113650, term113650.getClass(), "name", null);
        setField(term113650, term113650.getClass(), "url", null);
        setField(term113648, term113648.getClass(), "language", term113650);
        Object term113651 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113653 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113651, term113651.getClass(), "name", "");
        setField(term113653, term113653.getClass(), "name", null);
        setField(term113653, term113653.getClass(), "url", null);
        setField(term113651, term113651.getClass(), "language", term113653);
        Object term113654 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113656 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113654, term113654.getClass(), "name", "");
        setField(term113656, term113656.getClass(), "name", null);
        setField(term113656, term113656.getClass(), "url", null);
        setField(term113654, term113654.getClass(), "language", term113656);
        Object term113657 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113659 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113657, term113657.getClass(), "name", "");
        setField(term113659, term113659.getClass(), "name", null);
        setField(term113659, term113659.getClass(), "url", null);
        setField(term113657, term113657.getClass(), "language", term113659);
        ArrayList term113643 = new ArrayList();
        ((ArrayList) term113643).add(term113645);
        ((ArrayList) term113643).add(term113648);
        ((ArrayList) term113643).add(term113651);
        ((ArrayList) term113643).add(term113654);
        ((ArrayList) term113643).add(term113657);
        ArrayList term113666 = new ArrayList();
        ((ArrayList) term113666).add((Object)null);
        ((ArrayList) term113666).add((Object)null);
        ((ArrayList) term113666).add((Object)null);
        Object term113664 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term113665 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113665, term113665.getClass(), "name", null);
        setField(term113665, term113665.getClass(), "url", null);
        setField(term113664, term113664.getClass(), "pokemon", term113665);
        setField(term113664, term113664.getClass(), "versionDetails", term113666);
        ArrayList term113670 = new ArrayList();
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        ((ArrayList) term113670).add((Object)null);
        Object term113669 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term113669, term113669.getClass(), "pokemon", term113650);
        setField(term113669, term113669.getClass(), "versionDetails", term113670);
        ArrayList term113674 = new ArrayList();
        ((ArrayList) term113674).add((Object)null);
        ((ArrayList) term113674).add((Object)null);
        ((ArrayList) term113674).add((Object)null);
        ((ArrayList) term113674).add((Object)null);
        ((ArrayList) term113674).add((Object)null);
        ((ArrayList) term113674).add((Object)null);
        Object term113673 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term113673, term113673.getClass(), "pokemon", term113650);
        setField(term113673, term113673.getClass(), "versionDetails", term113674);
        ArrayList term113678 = new ArrayList();
        Object term113677 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term113677, term113677.getClass(), "pokemon", term113647);
        setField(term113677, term113677.getClass(), "versionDetails", term113678);
        ArrayList term113682 = new ArrayList();
        ((ArrayList) term113682).add((Object)null);
        Object term113681 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term113681, term113681.getClass(), "pokemon", term113656);
        setField(term113681, term113681.getClass(), "versionDetails", term113682);
        ArrayList term113686 = new ArrayList();
        ((ArrayList) term113686).add((Object)null);
        Object term113685 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term113685, term113685.getClass(), "pokemon", term113653);
        setField(term113685, term113685.getClass(), "versionDetails", term113686);
        ArrayList term113662 = new ArrayList();
        ((ArrayList) term113662).add(term113664);
        ((ArrayList) term113662).add(term113669);
        ((ArrayList) term113662).add(term113673);
        ((ArrayList) term113662).add(term113677);
        ((ArrayList) term113662).add(term113681);
        ((ArrayList) term113662).add(term113685);
        term113592 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        Object term113618 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113592, term113592.getClass(), "Id", term113593);
        setField(term113592, term113592.getClass(), "name", "CpbeVUdClO");
        setField(term113592, term113592.getClass(), "gameIndex", term113607);
        setField(term113592, term113592.getClass(), "encoutnerMethodRates", term113609);
        setField(term113618, term113618.getClass(), "name", "LaQZxTZNBp");
        setField(term113618, term113618.getClass(), "url", "GSOQFzITcM");
        setField(term113592, term113592.getClass(), "location", term113618);
        setField(term113592, term113592.getClass(), "names", term113643);
        setField(term113592, term113592.getClass(), "pokemonEncounters", term113662);
        term113691 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113691, term113691.getClass(), "name", "bzJrFgQDLd");
        setField(term113691, term113691.getClass(), "url", "IHCnCsbphV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term113691;
        callMethod(klass, "setLocation", argTypes, term113592, args);
    }

};


