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

public class LocationArea_getNames_180218183414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113766;

    public LocationArea_getNames_180218183414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term113767 = new Integer(-1053825347);
        Integer term113781 = new Integer(2141886355);
        ArrayList term113787 = new ArrayList();
        ((ArrayList) term113787).add((Object)null);
        Object term113785 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term113786 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113786, term113786.getClass(), "name", null);
        setField(term113786, term113786.getClass(), "url", null);
        setField(term113785, term113785.getClass(), "encounterMethod", term113786);
        setField(term113785, term113785.getClass(), "versionDetails", term113787);
        ArrayList term113792 = new ArrayList();
        ((ArrayList) term113792).add((Object)null);
        ((ArrayList) term113792).add((Object)null);
        ((ArrayList) term113792).add((Object)null);
        ((ArrayList) term113792).add((Object)null);
        Object term113790 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term113791 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113791, term113791.getClass(), "name", null);
        setField(term113791, term113791.getClass(), "url", null);
        setField(term113790, term113790.getClass(), "encounterMethod", term113791);
        setField(term113790, term113790.getClass(), "versionDetails", term113792);
        ArrayList term113797 = new ArrayList();
        ((ArrayList) term113797).add((Object)null);
        ((ArrayList) term113797).add((Object)null);
        Object term113795 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term113796 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113796, term113796.getClass(), "name", null);
        setField(term113796, term113796.getClass(), "url", null);
        setField(term113795, term113795.getClass(), "encounterMethod", term113796);
        setField(term113795, term113795.getClass(), "versionDetails", term113797);
        ArrayList term113801 = new ArrayList();
        Object term113800 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        setField(term113800, term113800.getClass(), "encounterMethod", term113796);
        setField(term113800, term113800.getClass(), "versionDetails", term113801);
        ArrayList term113783 = new ArrayList();
        ((ArrayList) term113783).add(term113785);
        ((ArrayList) term113783).add(term113790);
        ((ArrayList) term113783).add(term113795);
        ((ArrayList) term113783).add(term113800);
        Object term113833 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term113833, term113833.getClass(), "name", "");
        setField(term113833, term113833.getClass(), "language", term113786);
        Object term113835 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113837 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113835, term113835.getClass(), "name", "");
        setField(term113837, term113837.getClass(), "name", null);
        setField(term113837, term113837.getClass(), "url", null);
        setField(term113835, term113835.getClass(), "language", term113837);
        Object term113838 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113840 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113838, term113838.getClass(), "name", "");
        setField(term113840, term113840.getClass(), "name", null);
        setField(term113840, term113840.getClass(), "url", null);
        setField(term113838, term113838.getClass(), "language", term113840);
        Object term113841 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113843 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113841, term113841.getClass(), "name", "");
        setField(term113843, term113843.getClass(), "name", null);
        setField(term113843, term113843.getClass(), "url", null);
        setField(term113841, term113841.getClass(), "language", term113843);
        Object term113844 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term113844, term113844.getClass(), "name", "");
        setField(term113844, term113844.getClass(), "language", term113843);
        ArrayList term113831 = new ArrayList();
        ((ArrayList) term113831).add(term113833);
        ((ArrayList) term113831).add(term113835);
        ((ArrayList) term113831).add(term113838);
        ((ArrayList) term113831).add(term113841);
        ((ArrayList) term113831).add(term113844);
        ArrayList term113848 = new ArrayList();
        term113766 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        Object term113806 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113766, term113766.getClass(), "Id", term113767);
        setField(term113766, term113766.getClass(), "name", "MucriAAsmU");
        setField(term113766, term113766.getClass(), "gameIndex", term113781);
        setField(term113766, term113766.getClass(), "encoutnerMethodRates", term113783);
        setField(term113806, term113806.getClass(), "name", "fkifcQASow");
        setField(term113806, term113806.getClass(), "url", "euRVCcdTFR");
        setField(term113766, term113766.getClass(), "location", term113806);
        setField(term113766, term113766.getClass(), "names", term113831);
        setField(term113766, term113766.getClass(), "pokemonEncounters", term113848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term113766, args);
    }

};


