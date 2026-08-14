package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Type_getNames_207928343422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59531;

    public Type_getNames_207928343422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59532 = new Integer(-1976407622);
        ArrayList term59547 = new ArrayList();
        ArrayList term59551 = new ArrayList();
        ArrayList term59555 = new ArrayList();
        ArrayList term59559 = new ArrayList();
        ArrayList term59563 = new ArrayList();
        ArrayList term59567 = new ArrayList();
        Object term59573 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59574 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59575 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59574, term59574.getClass(), "name", null);
        setField(term59574, term59574.getClass(), "url", null);
        setField(term59573, term59573.getClass(), "generation", term59574);
        setField(term59575, term59575.getClass(), "noDamageTo", null);
        setField(term59575, term59575.getClass(), "halfDamageTo", null);
        setField(term59575, term59575.getClass(), "doubleDamageTo", null);
        setField(term59575, term59575.getClass(), "noDamageFrom", null);
        setField(term59575, term59575.getClass(), "halfDamageFrom", null);
        setField(term59575, term59575.getClass(), "doubleDamageFrom", null);
        setField(term59573, term59573.getClass(), "damageRelations", term59575);
        Object term59576 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59578 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59577, term59577.getClass(), "name", null);
        setField(term59577, term59577.getClass(), "url", null);
        setField(term59576, term59576.getClass(), "generation", term59577);
        setField(term59578, term59578.getClass(), "noDamageTo", null);
        setField(term59578, term59578.getClass(), "halfDamageTo", null);
        setField(term59578, term59578.getClass(), "doubleDamageTo", null);
        setField(term59578, term59578.getClass(), "noDamageFrom", null);
        setField(term59578, term59578.getClass(), "halfDamageFrom", null);
        setField(term59578, term59578.getClass(), "doubleDamageFrom", null);
        setField(term59576, term59576.getClass(), "damageRelations", term59578);
        ArrayList term59571 = new ArrayList();
        ((ArrayList) term59571).add(term59573);
        ((ArrayList) term59571).add(term59576);
        Integer term59584 = new Integer(-552996061);
        Object term59583 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term59586 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59583, term59583.getClass(), "gameIndex", term59584);
        setField(term59586, term59586.getClass(), "name", null);
        setField(term59586, term59586.getClass(), "url", null);
        setField(term59583, term59583.getClass(), "generation", term59586);
        ArrayList term59581 = new ArrayList();
        ((ArrayList) term59581).add(term59583);
        Object term59641 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59643 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59641, term59641.getClass(), "name", "");
        setField(term59643, term59643.getClass(), "name", null);
        setField(term59643, term59643.getClass(), "url", null);
        setField(term59641, term59641.getClass(), "language", term59643);
        Object term59644 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59646 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59644, term59644.getClass(), "name", "");
        setField(term59646, term59646.getClass(), "name", null);
        setField(term59646, term59646.getClass(), "url", null);
        setField(term59644, term59644.getClass(), "language", term59646);
        Object term59647 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59649 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59647, term59647.getClass(), "name", "");
        setField(term59649, term59649.getClass(), "name", null);
        setField(term59649, term59649.getClass(), "url", null);
        setField(term59647, term59647.getClass(), "language", term59649);
        Object term59650 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59652 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59650, term59650.getClass(), "name", "");
        setField(term59652, term59652.getClass(), "name", null);
        setField(term59652, term59652.getClass(), "url", null);
        setField(term59650, term59650.getClass(), "language", term59652);
        Object term59653 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59655 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59653, term59653.getClass(), "name", "");
        setField(term59655, term59655.getClass(), "name", null);
        setField(term59655, term59655.getClass(), "url", null);
        setField(term59653, term59653.getClass(), "language", term59655);
        Object term59656 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term59656, term59656.getClass(), "name", "");
        setField(term59656, term59656.getClass(), "language", term59649);
        ArrayList term59639 = new ArrayList();
        ((ArrayList) term59639).add(term59641);
        ((ArrayList) term59639).add(term59644);
        ((ArrayList) term59639).add(term59647);
        ((ArrayList) term59639).add(term59650);
        ((ArrayList) term59639).add(term59653);
        ((ArrayList) term59639).add(term59656);
        ArrayList term59660 = new ArrayList();
        ArrayList term59664 = new ArrayList();
        term59531 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term59546 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        Object term59589 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59614 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59531, term59531.getClass(), "id", term59532);
        setField(term59531, term59531.getClass(), "name", "qOiZVTUasG");
        setField(term59546, term59546.getClass(), "noDamageTo", term59547);
        setField(term59546, term59546.getClass(), "halfDamageTo", term59551);
        setField(term59546, term59546.getClass(), "doubleDamageTo", term59555);
        setField(term59546, term59546.getClass(), "noDamageFrom", term59559);
        setField(term59546, term59546.getClass(), "halfDamageFrom", term59563);
        setField(term59546, term59546.getClass(), "doubleDamageFrom", term59567);
        setField(term59531, term59531.getClass(), "damageRelations", term59546);
        setField(term59531, term59531.getClass(), "pastDamageRelations", term59571);
        setField(term59531, term59531.getClass(), "gameIndices", term59581);
        setField(term59589, term59589.getClass(), "name", "KciBQcVUbd");
        setField(term59589, term59589.getClass(), "url", "rVkPxsXMLd");
        setField(term59531, term59531.getClass(), "generation", term59589);
        setField(term59614, term59614.getClass(), "name", "TRbwDxScJC");
        setField(term59614, term59614.getClass(), "url", "ANMeqCzXZC");
        setField(term59531, term59531.getClass(), "moveDamageClass", term59614);
        setField(term59531, term59531.getClass(), "names", term59639);
        setField(term59531, term59531.getClass(), "pokemon", term59660);
        setField(term59531, term59531.getClass(), "moves", term59664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term59531, args);
    }

};


