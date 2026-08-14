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

public class Ability_getName_7580226023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713;

    public Ability_getName_7580226023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term714 = new Integer(-1007160944);
        Boolean term728 = new Boolean(true);
        Object term757 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term759 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term757, term757.getClass(), "name", "");
        setField(term759, term759.getClass(), "name", null);
        setField(term759, term759.getClass(), "url", null);
        setField(term757, term757.getClass(), "language", term759);
        Object term760 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term762 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term760, term760.getClass(), "name", "");
        setField(term762, term762.getClass(), "name", null);
        setField(term762, term762.getClass(), "url", null);
        setField(term760, term760.getClass(), "language", term762);
        Object term763 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term765 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term763, term763.getClass(), "name", "");
        setField(term765, term765.getClass(), "name", null);
        setField(term765, term765.getClass(), "url", null);
        setField(term763, term763.getClass(), "language", term765);
        Object term766 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term768 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term766, term766.getClass(), "name", "");
        setField(term768, term768.getClass(), "name", null);
        setField(term768, term768.getClass(), "url", null);
        setField(term766, term766.getClass(), "language", term768);
        Object term769 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term771 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term769, term769.getClass(), "name", "");
        setField(term771, term771.getClass(), "name", null);
        setField(term771, term771.getClass(), "url", null);
        setField(term769, term769.getClass(), "language", term771);
        Object term772 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term774 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term772, term772.getClass(), "name", "");
        setField(term774, term774.getClass(), "name", null);
        setField(term774, term774.getClass(), "url", null);
        setField(term772, term772.getClass(), "language", term774);
        ArrayList term755 = new ArrayList();
        ((ArrayList) term755).add(term757);
        ((ArrayList) term755).add(term760);
        ((ArrayList) term755).add(term763);
        ((ArrayList) term755).add(term766);
        ((ArrayList) term755).add(term769);
        ((ArrayList) term755).add(term772);
        Object term779 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term782 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term779, term779.getClass(), "effect", "");
        setField(term779, term779.getClass(), "shortEffect", "");
        setField(term782, term782.getClass(), "name", null);
        setField(term782, term782.getClass(), "url", null);
        setField(term779, term779.getClass(), "language", term782);
        Object term783 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term786 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term783, term783.getClass(), "effect", "");
        setField(term783, term783.getClass(), "shortEffect", "");
        setField(term786, term786.getClass(), "name", null);
        setField(term786, term786.getClass(), "url", null);
        setField(term783, term783.getClass(), "language", term786);
        ArrayList term777 = new ArrayList();
        ((ArrayList) term777).add(term779);
        ((ArrayList) term777).add(term783);
        ArrayList term792 = new ArrayList();
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        Object term791 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        setField(term791, term791.getClass(), "effectEntries", term792);
        setField(term791, term791.getClass(), "versionGroup", term782);
        ArrayList term789 = new ArrayList();
        ((ArrayList) term789).add(term791);
        Object term799 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term799, term799.getClass(), "flavorText", "");
        setField(term799, term799.getClass(), "language", term782);
        setField(term799, term799.getClass(), "versionGroup", term768);
        Object term801 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term803 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term801, term801.getClass(), "flavorText", "");
        setField(term803, term803.getClass(), "name", null);
        setField(term803, term803.getClass(), "url", null);
        setField(term801, term801.getClass(), "language", term803);
        setField(term801, term801.getClass(), "versionGroup", term782);
        Object term804 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        setField(term804, term804.getClass(), "flavorText", "");
        setField(term804, term804.getClass(), "language", term771);
        setField(term804, term804.getClass(), "versionGroup", term762);
        ArrayList term797 = new ArrayList();
        ((ArrayList) term797).add(term799);
        ((ArrayList) term797).add(term801);
        ((ArrayList) term797).add(term804);
        Boolean term811 = new Boolean(true);
        Integer term813 = new Integer(1135664017);
        Object term810 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term810, term810.getClass(), "isHidden", term811);
        setField(term810, term810.getClass(), "slot", term813);
        setField(term810, term810.getClass(), "pokemon", term768);
        Boolean term816 = new Boolean(false);
        Integer term818 = new Integer(590364439);
        Object term815 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term815, term815.getClass(), "isHidden", term816);
        setField(term815, term815.getClass(), "slot", term818);
        setField(term815, term815.getClass(), "pokemon", term782);
        Boolean term821 = new Boolean(false);
        Integer term823 = new Integer(865208305);
        Object term820 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term820, term820.getClass(), "isHidden", term821);
        setField(term820, term820.getClass(), "slot", term823);
        setField(term820, term820.getClass(), "pokemon", term803);
        Boolean term826 = new Boolean(false);
        Integer term828 = new Integer(-1275173084);
        Object term825 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term825, term825.getClass(), "isHidden", term826);
        setField(term825, term825.getClass(), "slot", term828);
        setField(term825, term825.getClass(), "pokemon", term803);
        Boolean term831 = new Boolean(true);
        Integer term833 = new Integer(-244121226);
        Object term830 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        setField(term830, term830.getClass(), "isHidden", term831);
        setField(term830, term830.getClass(), "slot", term833);
        setField(term830, term830.getClass(), "pokemon", term765);
        ArrayList term808 = new ArrayList();
        ((ArrayList) term808).add(term810);
        ((ArrayList) term808).add(term815);
        ((ArrayList) term808).add(term820);
        ((ArrayList) term808).add(term825);
        ((ArrayList) term808).add(term830);
        term713 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        Object term730 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term713, term713.getClass(), "id", term714);
        setField(term713, term713.getClass(), "name", "QXzGXbEXMu");
        setField(term713, term713.getClass(), "isMainSeries", term728);
        setField(term730, term730.getClass(), "name", "qxSDVejjiY");
        setField(term730, term730.getClass(), "url", "xBsXSDjXYK");
        setField(term713, term713.getClass(), "generation", term730);
        setField(term713, term713.getClass(), "names", term755);
        setField(term713, term713.getClass(), "effectEntries", term777);
        setField(term713, term713.getClass(), "effectChanges", term789);
        setField(term713, term713.getClass(), "flavorTextEntries", term797);
        setField(term713, term713.getClass(), "pokemon", term808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term713, args);
    }

};


