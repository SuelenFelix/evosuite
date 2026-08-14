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
import java.util.LinkedList;

public class Type_setNames_12665378422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58703;
     Object term58853;

    public Type_setNames_12665378422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58704 = new Integer(1377148923);
        ArrayList term58719 = new ArrayList();
        ArrayList term58723 = new ArrayList();
        ArrayList term58727 = new ArrayList();
        ArrayList term58731 = new ArrayList();
        ArrayList term58735 = new ArrayList();
        ArrayList term58739 = new ArrayList();
        Object term58745 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term58746 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term58747 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term58746, term58746.getClass(), "name", null);
        setField(term58746, term58746.getClass(), "url", null);
        setField(term58745, term58745.getClass(), "generation", term58746);
        setField(term58747, term58747.getClass(), "noDamageTo", null);
        setField(term58747, term58747.getClass(), "halfDamageTo", null);
        setField(term58747, term58747.getClass(), "doubleDamageTo", null);
        setField(term58747, term58747.getClass(), "noDamageFrom", null);
        setField(term58747, term58747.getClass(), "halfDamageFrom", null);
        setField(term58747, term58747.getClass(), "doubleDamageFrom", null);
        setField(term58745, term58745.getClass(), "damageRelations", term58747);
        ArrayList term58743 = new ArrayList();
        ((ArrayList) term58743).add(term58745);
        Integer term58753 = new Integer(540775467);
        Object term58752 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58755 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58752, term58752.getClass(), "gameIndex", term58753);
        setField(term58755, term58755.getClass(), "name", null);
        setField(term58755, term58755.getClass(), "url", null);
        setField(term58752, term58752.getClass(), "generation", term58755);
        Integer term58757 = new Integer(-2083028527);
        Object term58756 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term58759 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58756, term58756.getClass(), "gameIndex", term58757);
        setField(term58759, term58759.getClass(), "name", null);
        setField(term58759, term58759.getClass(), "url", null);
        setField(term58756, term58756.getClass(), "generation", term58759);
        ArrayList term58750 = new ArrayList();
        ((ArrayList) term58750).add(term58752);
        ((ArrayList) term58750).add(term58756);
        Object term58814 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term58816 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58814, term58814.getClass(), "name", "");
        setField(term58816, term58816.getClass(), "name", null);
        setField(term58816, term58816.getClass(), "url", null);
        setField(term58814, term58814.getClass(), "language", term58816);
        Object term58817 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term58819 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58817, term58817.getClass(), "name", "");
        setField(term58819, term58819.getClass(), "name", null);
        setField(term58819, term58819.getClass(), "url", null);
        setField(term58817, term58817.getClass(), "language", term58819);
        Object term58820 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term58822 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58820, term58820.getClass(), "name", "");
        setField(term58822, term58822.getClass(), "name", null);
        setField(term58822, term58822.getClass(), "url", null);
        setField(term58820, term58820.getClass(), "language", term58822);
        ArrayList term58812 = new ArrayList();
        ((ArrayList) term58812).add(term58814);
        ((ArrayList) term58812).add(term58817);
        ((ArrayList) term58812).add(term58820);
        Integer term58828 = new Integer(1631605263);
        Object term58827 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term58830 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58827, term58827.getClass(), "slot", term58828);
        setField(term58830, term58830.getClass(), "name", null);
        setField(term58830, term58830.getClass(), "url", null);
        setField(term58827, term58827.getClass(), "pokemon", term58830);
        Integer term58832 = new Integer(-1378134881);
        Object term58831 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term58834 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58831, term58831.getClass(), "slot", term58832);
        setField(term58834, term58834.getClass(), "name", null);
        setField(term58834, term58834.getClass(), "url", null);
        setField(term58831, term58831.getClass(), "pokemon", term58834);
        Integer term58836 = new Integer(-1887131478);
        Object term58835 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term58835, term58835.getClass(), "slot", term58836);
        setField(term58835, term58835.getClass(), "pokemon", term58822);
        Integer term58839 = new Integer(1916020077);
        Object term58838 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term58838, term58838.getClass(), "slot", term58839);
        setField(term58838, term58838.getClass(), "pokemon", term58830);
        Integer term58842 = new Integer(-1842191454);
        Object term58841 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term58841, term58841.getClass(), "slot", term58842);
        setField(term58841, term58841.getClass(), "pokemon", term58746);
        Integer term58845 = new Integer(384551988);
        Object term58844 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term58844, term58844.getClass(), "slot", term58845);
        setField(term58844, term58844.getClass(), "pokemon", term58816);
        ArrayList term58825 = new ArrayList();
        ((ArrayList) term58825).add(term58827);
        ((ArrayList) term58825).add(term58831);
        ((ArrayList) term58825).add(term58835);
        ((ArrayList) term58825).add(term58838);
        ((ArrayList) term58825).add(term58841);
        ((ArrayList) term58825).add(term58844);
        ArrayList term58849 = new ArrayList();
        term58703 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term58718 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        Object term58762 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term58787 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58703, term58703.getClass(), "id", term58704);
        setField(term58703, term58703.getClass(), "name", "qItcoIgEyi");
        setField(term58718, term58718.getClass(), "noDamageTo", term58719);
        setField(term58718, term58718.getClass(), "halfDamageTo", term58723);
        setField(term58718, term58718.getClass(), "doubleDamageTo", term58727);
        setField(term58718, term58718.getClass(), "noDamageFrom", term58731);
        setField(term58718, term58718.getClass(), "halfDamageFrom", term58735);
        setField(term58718, term58718.getClass(), "doubleDamageFrom", term58739);
        setField(term58703, term58703.getClass(), "damageRelations", term58718);
        setField(term58703, term58703.getClass(), "pastDamageRelations", term58743);
        setField(term58703, term58703.getClass(), "gameIndices", term58750);
        setField(term58762, term58762.getClass(), "name", "uTWBfvAsyO");
        setField(term58762, term58762.getClass(), "url", "PjflZBjLQm");
        setField(term58703, term58703.getClass(), "generation", term58762);
        setField(term58787, term58787.getClass(), "name", "vKTFdmINnO");
        setField(term58787, term58787.getClass(), "url", "yluqSskhal");
        setField(term58703, term58703.getClass(), "moveDamageClass", term58787);
        setField(term58703, term58703.getClass(), "names", term58812);
        setField(term58703, term58703.getClass(), "pokemon", term58825);
        setField(term58703, term58703.getClass(), "moves", term58849);
        term58853 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term58853;
        callMethod(klass, "setNames", argTypes, term58703, args);
    }

};


