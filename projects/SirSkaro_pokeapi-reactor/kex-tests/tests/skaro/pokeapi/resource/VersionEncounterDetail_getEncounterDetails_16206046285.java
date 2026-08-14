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

public class VersionEncounterDetail_getEncounterDetails_16206046285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38836;

    public VersionEncounterDetail_getEncounterDetails_16206046285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38862 = new Integer(631528579);
        Integer term38867 = new Integer(-1652091834);
        Integer term38869 = new Integer(-282021579);
        ArrayList term38871 = new ArrayList();
        Integer term38874 = new Integer(-1652588127);
        Object term38866 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38876 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38866, term38866.getClass(), "minLevel", term38867);
        setField(term38866, term38866.getClass(), "maxLevel", term38869);
        setField(term38866, term38866.getClass(), "conditionValues", term38871);
        setField(term38866, term38866.getClass(), "chance", term38874);
        setField(term38876, term38876.getClass(), "name", null);
        setField(term38876, term38876.getClass(), "url", null);
        setField(term38866, term38866.getClass(), "method", term38876);
        Integer term38878 = new Integer(-1902823385);
        Integer term38880 = new Integer(-784924879);
        ArrayList term38882 = new ArrayList();
        Integer term38885 = new Integer(-1062027102);
        Object term38877 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38887 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38877, term38877.getClass(), "minLevel", term38878);
        setField(term38877, term38877.getClass(), "maxLevel", term38880);
        setField(term38877, term38877.getClass(), "conditionValues", term38882);
        setField(term38877, term38877.getClass(), "chance", term38885);
        setField(term38887, term38887.getClass(), "name", null);
        setField(term38887, term38887.getClass(), "url", null);
        setField(term38877, term38877.getClass(), "method", term38887);
        ArrayList term38864 = new ArrayList();
        ((ArrayList) term38864).add(term38866);
        ((ArrayList) term38864).add(term38877);
        term38836 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term38837 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38837, term38837.getClass(), "name", "TrQnxgLKzu");
        setField(term38837, term38837.getClass(), "url", "MsenaDqyDy");
        setField(term38836, term38836.getClass(), "version", term38837);
        setField(term38836, term38836.getClass(), "maxChance", term38862);
        setField(term38836, term38836.getClass(), "encounterDetails", term38864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionEncounterDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncounterDetails", argTypes, term38836, args);
    }

};


