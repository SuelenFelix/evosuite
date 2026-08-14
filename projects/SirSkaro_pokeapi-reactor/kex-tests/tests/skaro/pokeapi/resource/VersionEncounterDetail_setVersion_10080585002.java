package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class VersionEncounterDetail_setVersion_10080585002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38468;
     Object term38533;

    public VersionEncounterDetail_setVersion_10080585002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38494 = new Integer(-824369460);
        Integer term38499 = new Integer(-1573760035);
        Integer term38501 = new Integer(-1147965121);
        ArrayList term38503 = new ArrayList();
        Integer term38506 = new Integer(-867099093);
        Object term38498 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38508 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38498, term38498.getClass(), "minLevel", term38499);
        setField(term38498, term38498.getClass(), "maxLevel", term38501);
        setField(term38498, term38498.getClass(), "conditionValues", term38503);
        setField(term38498, term38498.getClass(), "chance", term38506);
        setField(term38508, term38508.getClass(), "name", null);
        setField(term38508, term38508.getClass(), "url", null);
        setField(term38498, term38498.getClass(), "method", term38508);
        Integer term38510 = new Integer(-1091199008);
        Integer term38512 = new Integer(1837886253);
        ArrayList term38514 = new ArrayList();
        Integer term38517 = new Integer(-269528550);
        Object term38509 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38519 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38509, term38509.getClass(), "minLevel", term38510);
        setField(term38509, term38509.getClass(), "maxLevel", term38512);
        setField(term38509, term38509.getClass(), "conditionValues", term38514);
        setField(term38509, term38509.getClass(), "chance", term38517);
        setField(term38519, term38519.getClass(), "name", null);
        setField(term38519, term38519.getClass(), "url", null);
        setField(term38509, term38509.getClass(), "method", term38519);
        Integer term38521 = new Integer(2108571355);
        Integer term38523 = new Integer(1909966089);
        ArrayList term38525 = new ArrayList();
        Integer term38528 = new Integer(1827255916);
        Object term38520 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38530 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38520, term38520.getClass(), "minLevel", term38521);
        setField(term38520, term38520.getClass(), "maxLevel", term38523);
        setField(term38520, term38520.getClass(), "conditionValues", term38525);
        setField(term38520, term38520.getClass(), "chance", term38528);
        setField(term38530, term38530.getClass(), "name", null);
        setField(term38530, term38530.getClass(), "url", null);
        setField(term38520, term38520.getClass(), "method", term38530);
        ArrayList term38496 = new ArrayList();
        ((ArrayList) term38496).add(term38498);
        ((ArrayList) term38496).add(term38509);
        ((ArrayList) term38496).add(term38520);
        term38468 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term38469 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38469, term38469.getClass(), "name", "xfyCONULzw");
        setField(term38469, term38469.getClass(), "url", "SmpXEpmGyR");
        setField(term38468, term38468.getClass(), "version", term38469);
        setField(term38468, term38468.getClass(), "maxChance", term38494);
        setField(term38468, term38468.getClass(), "encounterDetails", term38496);
        term38533 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38533, term38533.getClass(), "name", "WjRIILfuQl");
        setField(term38533, term38533.getClass(), "url", "FqgiIhfmCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionEncounterDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term38533;
        callMethod(klass, "setVersion", argTypes, term38468, args);
    }

};


