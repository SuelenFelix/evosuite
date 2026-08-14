package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Ability_getNames_53205608410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10546;

    public Ability_getNames_53205608410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10547 = new Integer(1053773809);
        Boolean term10561 = new Boolean(true);
        Object term10590 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10592 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10590, term10590.getClass(), "name", "");
        setField(term10592, term10592.getClass(), "name", null);
        setField(term10592, term10592.getClass(), "url", null);
        setField(term10590, term10590.getClass(), "language", term10592);
        Object term10593 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10595 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10593, term10593.getClass(), "name", "");
        setField(term10595, term10595.getClass(), "name", null);
        setField(term10595, term10595.getClass(), "url", null);
        setField(term10593, term10593.getClass(), "language", term10595);
        Object term10596 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10598 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10596, term10596.getClass(), "name", "");
        setField(term10598, term10598.getClass(), "name", null);
        setField(term10598, term10598.getClass(), "url", null);
        setField(term10596, term10596.getClass(), "language", term10598);
        Object term10599 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10601 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10599, term10599.getClass(), "name", "");
        setField(term10601, term10601.getClass(), "name", null);
        setField(term10601, term10601.getClass(), "url", null);
        setField(term10599, term10599.getClass(), "language", term10601);
        Object term10602 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10604 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10602, term10602.getClass(), "name", "");
        setField(term10604, term10604.getClass(), "name", null);
        setField(term10604, term10604.getClass(), "url", null);
        setField(term10602, term10602.getClass(), "language", term10604);
        Object term10605 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10607 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10605, term10605.getClass(), "name", "");
        setField(term10607, term10607.getClass(), "name", null);
        setField(term10607, term10607.getClass(), "url", null);
        setField(term10605, term10605.getClass(), "language", term10607);
        Object term10608 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10610 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10608, term10608.getClass(), "name", "");
        setField(term10610, term10610.getClass(), "name", null);
        setField(term10610, term10610.getClass(), "url", null);
        setField(term10608, term10608.getClass(), "language", term10610);
        Object term10611 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term10613 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10611, term10611.getClass(), "name", "");
        setField(term10613, term10613.getClass(), "name", null);
        setField(term10613, term10613.getClass(), "url", null);
        setField(term10611, term10611.getClass(), "language", term10613);
        ArrayList term10588 = new ArrayList();
        ((ArrayList) term10588).add(term10590);
        ((ArrayList) term10588).add(term10593);
        ((ArrayList) term10588).add(term10596);
        ((ArrayList) term10588).add(term10599);
        ((ArrayList) term10588).add(term10602);
        ((ArrayList) term10588).add(term10605);
        ((ArrayList) term10588).add(term10608);
        ((ArrayList) term10588).add(term10611);
        Object term10618 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term10621 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10618, term10618.getClass(), "effect", "");
        setField(term10618, term10618.getClass(), "shortEffect", "");
        setField(term10621, term10621.getClass(), "name", null);
        setField(term10621, term10621.getClass(), "url", null);
        setField(term10618, term10618.getClass(), "language", term10621);
        Object term10622 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        setField(term10622, term10622.getClass(), "effect", "");
        setField(term10622, term10622.getClass(), "shortEffect", "");
        setField(term10622, term10622.getClass(), "language", term10610);
        ArrayList term10616 = new ArrayList();
        ((ArrayList) term10616).add(term10618);
        ((ArrayList) term10616).add(term10622);
        ArrayList term10630 = new ArrayList();
        ((ArrayList) term10630).add((Object)null);
        ((ArrayList) term10630).add((Object)null);
        ((ArrayList) term10630).add((Object)null);
        ((ArrayList) term10630).add((Object)null);
        Object term10629 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term10629, term10629.getClass(), "effectEntries", term10630);
        setField(term10629, term10629.getClass(), "versionGroup", term10592);
        ArrayList term10634 = new ArrayList();
        ((ArrayList) term10634).add((Object)null);
        ((ArrayList) term10634).add((Object)null);
        ((ArrayList) term10634).add((Object)null);
        Object term10633 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term10633, term10633.getClass(), "effectEntries", term10634);
        setField(term10633, term10633.getClass(), "versionGroup", term10610);
        ArrayList term10638 = new ArrayList();
        ((ArrayList) term10638).add((Object)null);
        ((ArrayList) term10638).add((Object)null);
        ((ArrayList) term10638).add((Object)null);
        ((ArrayList) term10638).add((Object)null);
        Object term10637 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term10637, term10637.getClass(), "effectEntries", term10638);
        setField(term10637, term10637.getClass(), "versionGroup", term10595);
        ArrayList term10642 = new ArrayList();
        ((ArrayList) term10642).add((Object)null);
        ((ArrayList) term10642).add((Object)null);
        ((ArrayList) term10642).add((Object)null);
        ((ArrayList) term10642).add((Object)null);
        ((ArrayList) term10642).add((Object)null);
        Object term10641 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term10641, term10641.getClass(), "effectEntries", term10642);
        setField(term10641, term10641.getClass(), "versionGroup", term10601);
        ArrayList term10627 = new ArrayList();
        ((ArrayList) term10627).add(term10629);
        ((ArrayList) term10627).add(term10633);
        ((ArrayList) term10627).add(term10637);
        ((ArrayList) term10627).add(term10641);
        Object term10649 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term10649, term10649.getClass(), "flavorText", "");
        setField(term10649, term10649.getClass(), "language", term10601);
        setField(term10649, term10649.getClass(), "versionGroup", term10592);
        ArrayList term10647 = new ArrayList();
        ((ArrayList) term10647).add(term10649);
        Boolean term10656 = new Boolean(false);
        Integer term10658 = new Integer(924127883);
        Object term10655 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term10655, term10655.getClass(), "isHidden", term10656);
        setField(term10655, term10655.getClass(), "slot", term10658);
        setField(term10655, term10655.getClass(), "pokemon", term10607);
        Boolean term10661 = new Boolean(false);
        Integer term10663 = new Integer(-751079123);
        Object term10660 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term10660, term10660.getClass(), "isHidden", term10661);
        setField(term10660, term10660.getClass(), "slot", term10663);
        setField(term10660, term10660.getClass(), "pokemon", term10607);
        Boolean term10666 = new Boolean(true);
        Integer term10668 = new Integer(-110837188);
        Object term10665 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term10665, term10665.getClass(), "isHidden", term10666);
        setField(term10665, term10665.getClass(), "slot", term10668);
        setField(term10665, term10665.getClass(), "pokemon", term10613);
        ArrayList term10653 = new ArrayList();
        ((ArrayList) term10653).add(term10655);
        ((ArrayList) term10653).add(term10660);
        ((ArrayList) term10653).add(term10665);
        term10546 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        Object term10563 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10546, term10546.getClass(), "id", term10547);
        setField(term10546, term10546.getClass(), "name", "iNtHOROBMq");
        setField(term10546, term10546.getClass(), "isMainSeries", term10561);
        setField(term10563, term10563.getClass(), "name", "GbvfbbsrOl");
        setField(term10563, term10563.getClass(), "url", "IIZlqzOmtY");
        setField(term10546, term10546.getClass(), "generation", term10563);
        setField(term10546, term10546.getClass(), "names", term10588);
        setField(term10546, term10546.getClass(), "effectEntries", term10616);
        setField(term10546, term10546.getClass(), "effectChanges", term10627);
        setField(term10546, term10546.getClass(), "flavorTextEntries", term10647);
        setField(term10546, term10546.getClass(), "pokemon", term10653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term10546, args);
    }

};


