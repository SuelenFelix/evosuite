package skaro.pokeapi.resource.item;

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
import static skaro.pokeapi.resource.item.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Item_getHeldByPokemon_83759589548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5872;

    public Item_getHeldByPokemon_83759589548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5873 = new Integer(1094107751);
        Integer term5887 = new Integer(844222656);
        Integer term5889 = new Integer(-18216811);
        ArrayList term5916 = new ArrayList();
        ArrayList term5920 = new ArrayList();
        ArrayList term5924 = new ArrayList();
        Object term5930 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term5932 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5933 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5930, term5930.getClass(), "text", "");
        setField(term5932, term5932.getClass(), "name", null);
        setField(term5932, term5932.getClass(), "url", null);
        setField(term5930, term5930.getClass(), "language", term5932);
        setField(term5933, term5933.getClass(), "name", null);
        setField(term5933, term5933.getClass(), "url", null);
        setField(term5930, term5930.getClass(), "versionGroup", term5933);
        Object term5934 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term5936 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5937 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5934, term5934.getClass(), "text", "");
        setField(term5936, term5936.getClass(), "name", null);
        setField(term5936, term5936.getClass(), "url", null);
        setField(term5934, term5934.getClass(), "language", term5936);
        setField(term5937, term5937.getClass(), "name", null);
        setField(term5937, term5937.getClass(), "url", null);
        setField(term5934, term5934.getClass(), "versionGroup", term5937);
        ArrayList term5928 = new ArrayList();
        ((ArrayList) term5928).add(term5930);
        ((ArrayList) term5928).add(term5934);
        Integer term5943 = new Integer(-1813280137);
        Object term5942 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term5945 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5942, term5942.getClass(), "gameIndex", term5943);
        setField(term5945, term5945.getClass(), "name", null);
        setField(term5945, term5945.getClass(), "url", null);
        setField(term5942, term5942.getClass(), "generation", term5945);
        Integer term5947 = new Integer(719656595);
        Object term5946 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term5949 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5946, term5946.getClass(), "gameIndex", term5947);
        setField(term5949, term5949.getClass(), "name", null);
        setField(term5949, term5949.getClass(), "url", null);
        setField(term5946, term5946.getClass(), "generation", term5949);
        Integer term5951 = new Integer(-1516995753);
        Object term5950 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term5953 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5950, term5950.getClass(), "gameIndex", term5951);
        setField(term5953, term5953.getClass(), "name", null);
        setField(term5953, term5953.getClass(), "url", null);
        setField(term5950, term5950.getClass(), "generation", term5953);
        Integer term5955 = new Integer(-390501023);
        Object term5954 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term5957 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5954, term5954.getClass(), "gameIndex", term5955);
        setField(term5957, term5957.getClass(), "name", null);
        setField(term5957, term5957.getClass(), "url", null);
        setField(term5954, term5954.getClass(), "generation", term5957);
        Integer term5959 = new Integer(-1667482829);
        Object term5958 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term5961 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5958, term5958.getClass(), "gameIndex", term5959);
        setField(term5961, term5961.getClass(), "name", null);
        setField(term5961, term5961.getClass(), "url", null);
        setField(term5958, term5958.getClass(), "generation", term5961);
        ArrayList term5940 = new ArrayList();
        ((ArrayList) term5940).add(term5942);
        ((ArrayList) term5940).add(term5946);
        ((ArrayList) term5940).add(term5950);
        ((ArrayList) term5940).add(term5954);
        ((ArrayList) term5940).add(term5958);
        ArrayList term5964 = new ArrayList();
        ArrayList term5984 = new ArrayList();
        ((ArrayList) term5984).add((Object)null);
        ((ArrayList) term5984).add((Object)null);
        Object term5983 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term5983, term5983.getClass(), "pokemon", term5953);
        setField(term5983, term5983.getClass(), "versionDetails", term5984);
        ArrayList term5988 = new ArrayList();
        ((ArrayList) term5988).add((Object)null);
        ((ArrayList) term5988).add((Object)null);
        ((ArrayList) term5988).add((Object)null);
        ((ArrayList) term5988).add((Object)null);
        ((ArrayList) term5988).add((Object)null);
        ((ArrayList) term5988).add((Object)null);
        ((ArrayList) term5988).add((Object)null);
        Object term5987 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term5987, term5987.getClass(), "pokemon", term5945);
        setField(term5987, term5987.getClass(), "versionDetails", term5988);
        ArrayList term5992 = new ArrayList();
        ((ArrayList) term5992).add((Object)null);
        ((ArrayList) term5992).add((Object)null);
        ((ArrayList) term5992).add((Object)null);
        ((ArrayList) term5992).add((Object)null);
        Object term5991 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term5991, term5991.getClass(), "pokemon", term5961);
        setField(term5991, term5991.getClass(), "versionDetails", term5992);
        ArrayList term5996 = new ArrayList();
        ((ArrayList) term5996).add((Object)null);
        ((ArrayList) term5996).add((Object)null);
        Object term5995 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term5995, term5995.getClass(), "pokemon", term5953);
        setField(term5995, term5995.getClass(), "versionDetails", term5996);
        ArrayList term6000 = new ArrayList();
        ((ArrayList) term6000).add((Object)null);
        Object term5999 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term5999, term5999.getClass(), "pokemon", term5936);
        setField(term5999, term5999.getClass(), "versionDetails", term6000);
        ArrayList term6004 = new ArrayList();
        Object term6003 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term6003, term6003.getClass(), "pokemon", term5937);
        setField(term6003, term6003.getClass(), "versionDetails", term6004);
        ArrayList term5981 = new ArrayList();
        ((ArrayList) term5981).add(term5983);
        ((ArrayList) term5981).add(term5987);
        ((ArrayList) term5981).add(term5991);
        ((ArrayList) term5981).add(term5995);
        ((ArrayList) term5981).add(term5999);
        ((ArrayList) term5981).add(term6003);
        Object term6024 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term6025 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term6025, term6025.getClass(), "url", null);
        setField(term6024, term6024.getClass(), "machine", term6025);
        setField(term6024, term6024.getClass(), "versionGroup", term5932);
        Object term6026 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term6027 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term6027, term6027.getClass(), "url", null);
        setField(term6026, term6026.getClass(), "machine", term6027);
        setField(term6026, term6026.getClass(), "versionGroup", term5949);
        ArrayList term6022 = new ArrayList();
        ((ArrayList) term6022).add(term6024);
        ((ArrayList) term6022).add(term6026);
        term5872 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        Object term5891 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5968 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemSprites"));
        Object term6009 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term5872, term5872.getClass(), "id", term5873);
        setField(term5872, term5872.getClass(), "name", "kevWstoxwq");
        setField(term5872, term5872.getClass(), "cost", term5887);
        setField(term5872, term5872.getClass(), "flingPower", term5889);
        setField(term5891, term5891.getClass(), "name", "aSYOhFwzSm");
        setField(term5891, term5891.getClass(), "url", "pVZlzrBeDB");
        setField(term5872, term5872.getClass(), "flingEffect", term5891);
        setField(term5872, term5872.getClass(), "attributes", term5916);
        setField(term5872, term5872.getClass(), "category", term5920);
        setField(term5872, term5872.getClass(), "effectEntries", term5924);
        setField(term5872, term5872.getClass(), "flavorTextEntries", term5928);
        setField(term5872, term5872.getClass(), "gameIndices", term5940);
        setField(term5872, term5872.getClass(), "names", term5964);
        setField(term5968, term5968.getClass(), "imageUrl", "PsTQDxNIld");
        setField(term5872, term5872.getClass(), "sprites", term5968);
        setField(term5872, term5872.getClass(), "heldByPokemon", term5981);
        setField(term6009, term6009.getClass(), "url", "uoBijJjvaj");
        setField(term5872, term5872.getClass(), "babyTriggerFor", term6009);
        setField(term5872, term5872.getClass(), "machines", term6022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeldByPokemon", argTypes, term5872, args);
    }

};


