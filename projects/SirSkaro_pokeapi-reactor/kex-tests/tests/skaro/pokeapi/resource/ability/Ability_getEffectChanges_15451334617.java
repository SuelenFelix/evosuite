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

public class Ability_getEffectChanges_15451334617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2724;

    public Ability_getEffectChanges_15451334617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2725 = new Integer(-478195677);
        Boolean term2739 = new Boolean(true);
        Object term2768 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2770 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2768, term2768.getClass(), "name", "");
        setField(term2770, term2770.getClass(), "name", null);
        setField(term2770, term2770.getClass(), "url", null);
        setField(term2768, term2768.getClass(), "language", term2770);
        ArrayList term2766 = new ArrayList();
        ((ArrayList) term2766).add(term2768);
        ArrayList term2773 = new ArrayList();
        ArrayList term2780 = new ArrayList();
        ((ArrayList) term2780).add((Object)null);
        ((ArrayList) term2780).add((Object)null);
        ((ArrayList) term2780).add((Object)null);
        Object term2779 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term2783 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2779, term2779.getClass(), "effectEntries", term2780);
        setField(term2783, term2783.getClass(), "name", null);
        setField(term2783, term2783.getClass(), "url", null);
        setField(term2779, term2779.getClass(), "versionGroup", term2783);
        ArrayList term2785 = new ArrayList();
        ((ArrayList) term2785).add((Object)null);
        ((ArrayList) term2785).add((Object)null);
        ((ArrayList) term2785).add((Object)null);
        ((ArrayList) term2785).add((Object)null);
        Object term2784 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term2788 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2784, term2784.getClass(), "effectEntries", term2785);
        setField(term2788, term2788.getClass(), "name", null);
        setField(term2788, term2788.getClass(), "url", null);
        setField(term2784, term2784.getClass(), "versionGroup", term2788);
        ArrayList term2790 = new ArrayList();
        ((ArrayList) term2790).add((Object)null);
        ((ArrayList) term2790).add((Object)null);
        ((ArrayList) term2790).add((Object)null);
        ((ArrayList) term2790).add((Object)null);
        ((ArrayList) term2790).add((Object)null);
        Object term2789 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term2789, term2789.getClass(), "effectEntries", term2790);
        setField(term2789, term2789.getClass(), "versionGroup", term2770);
        ArrayList term2794 = new ArrayList();
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        ((ArrayList) term2794).add((Object)null);
        Object term2793 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term2797 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2793, term2793.getClass(), "effectEntries", term2794);
        setField(term2797, term2797.getClass(), "name", null);
        setField(term2797, term2797.getClass(), "url", null);
        setField(term2793, term2793.getClass(), "versionGroup", term2797);
        ArrayList term2799 = new ArrayList();
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        ((ArrayList) term2799).add((Object)null);
        Object term2798 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term2802 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2798, term2798.getClass(), "effectEntries", term2799);
        setField(term2802, term2802.getClass(), "name", null);
        setField(term2802, term2802.getClass(), "url", null);
        setField(term2798, term2798.getClass(), "versionGroup", term2802);
        ArrayList term2804 = new ArrayList();
        ((ArrayList) term2804).add((Object)null);
        ((ArrayList) term2804).add((Object)null);
        ((ArrayList) term2804).add((Object)null);
        ((ArrayList) term2804).add((Object)null);
        ((ArrayList) term2804).add((Object)null);
        Object term2803 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term2803, term2803.getClass(), "effectEntries", term2804);
        setField(term2803, term2803.getClass(), "versionGroup", term2770);
        ArrayList term2777 = new ArrayList();
        ((ArrayList) term2777).add(term2779);
        ((ArrayList) term2777).add(term2784);
        ((ArrayList) term2777).add(term2789);
        ((ArrayList) term2777).add(term2793);
        ((ArrayList) term2777).add(term2798);
        ((ArrayList) term2777).add(term2803);
        Object term2811 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term2811, term2811.getClass(), "flavorText", "");
        setField(term2811, term2811.getClass(), "language", term2788);
        setField(term2811, term2811.getClass(), "versionGroup", term2783);
        Object term2813 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term2815 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2813, term2813.getClass(), "flavorText", "");
        setField(term2813, term2813.getClass(), "language", term2783);
        setField(term2815, term2815.getClass(), "name", null);
        setField(term2815, term2815.getClass(), "url", null);
        setField(term2813, term2813.getClass(), "versionGroup", term2815);
        Object term2816 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term2816, term2816.getClass(), "flavorText", "");
        setField(term2816, term2816.getClass(), "language", term2797);
        setField(term2816, term2816.getClass(), "versionGroup", term2770);
        Object term2818 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term2818, term2818.getClass(), "flavorText", "");
        setField(term2818, term2818.getClass(), "language", term2802);
        setField(term2818, term2818.getClass(), "versionGroup", term2783);
        Object term2820 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term2822 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2820, term2820.getClass(), "flavorText", "");
        setField(term2822, term2822.getClass(), "name", null);
        setField(term2822, term2822.getClass(), "url", null);
        setField(term2820, term2820.getClass(), "language", term2822);
        setField(term2820, term2820.getClass(), "versionGroup", term2815);
        Object term2823 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term2823, term2823.getClass(), "flavorText", "");
        setField(term2823, term2823.getClass(), "language", term2770);
        setField(term2823, term2823.getClass(), "versionGroup", term2797);
        ArrayList term2809 = new ArrayList();
        ((ArrayList) term2809).add(term2811);
        ((ArrayList) term2809).add(term2813);
        ((ArrayList) term2809).add(term2816);
        ((ArrayList) term2809).add(term2818);
        ((ArrayList) term2809).add(term2820);
        ((ArrayList) term2809).add(term2823);
        Boolean term2830 = new Boolean(false);
        Integer term2832 = new Integer(972867650);
        Object term2829 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term2829, term2829.getClass(), "isHidden", term2830);
        setField(term2829, term2829.getClass(), "slot", term2832);
        setField(term2829, term2829.getClass(), "pokemon", term2783);
        Boolean term2835 = new Boolean(false);
        Integer term2837 = new Integer(1655935355);
        Object term2834 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term2834, term2834.getClass(), "isHidden", term2835);
        setField(term2834, term2834.getClass(), "slot", term2837);
        setField(term2834, term2834.getClass(), "pokemon", term2770);
        Boolean term2840 = new Boolean(true);
        Integer term2842 = new Integer(-481533957);
        Object term2839 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term2839, term2839.getClass(), "isHidden", term2840);
        setField(term2839, term2839.getClass(), "slot", term2842);
        setField(term2839, term2839.getClass(), "pokemon", term2788);
        ArrayList term2827 = new ArrayList();
        ((ArrayList) term2827).add(term2829);
        ((ArrayList) term2827).add(term2834);
        ((ArrayList) term2827).add(term2839);
        term2724 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        Object term2741 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2724, term2724.getClass(), "id", term2725);
        setField(term2724, term2724.getClass(), "name", "blSffTnsOv");
        setField(term2724, term2724.getClass(), "isMainSeries", term2739);
        setField(term2741, term2741.getClass(), "name", "qbUMcIvEXH");
        setField(term2741, term2741.getClass(), "url", "TVxGTjeDcu");
        setField(term2724, term2724.getClass(), "generation", term2741);
        setField(term2724, term2724.getClass(), "names", term2766);
        setField(term2724, term2724.getClass(), "effectEntries", term2773);
        setField(term2724, term2724.getClass(), "effectChanges", term2777);
        setField(term2724, term2724.getClass(), "flavorTextEntries", term2809);
        setField(term2724, term2724.getClass(), "pokemon", term2827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectChanges", argTypes, term2724, args);
    }

};


