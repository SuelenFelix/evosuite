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
import java.util.LinkedList;

public class Item_setCategory_61661765027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;
     Object term3187;

    public Item_setCategory_61661765027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3060 = new Integer(497269071);
        Integer term3074 = new Integer(-1899301124);
        Integer term3076 = new Integer(-1882480155);
        ArrayList term3103 = new ArrayList();
        ArrayList term3107 = new ArrayList();
        Object term3113 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term3116 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3113, term3113.getClass(), "effect", "");
        setField(term3113, term3113.getClass(), "shortEffect", "");
        setField(term3116, term3116.getClass(), "name", null);
        setField(term3116, term3116.getClass(), "url", null);
        setField(term3113, term3113.getClass(), "language", term3116);
        Object term3117 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term3120 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3117, term3117.getClass(), "effect", "");
        setField(term3117, term3117.getClass(), "shortEffect", "");
        setField(term3120, term3120.getClass(), "name", null);
        setField(term3120, term3120.getClass(), "url", null);
        setField(term3117, term3117.getClass(), "language", term3120);
        ArrayList term3111 = new ArrayList();
        ((ArrayList) term3111).add(term3113);
        ((ArrayList) term3111).add(term3117);
        ArrayList term3123 = new ArrayList();
        Integer term3130 = new Integer(-1410220680);
        Object term3129 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term3132 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3129, term3129.getClass(), "gameIndex", term3130);
        setField(term3132, term3132.getClass(), "name", null);
        setField(term3132, term3132.getClass(), "url", null);
        setField(term3129, term3129.getClass(), "generation", term3132);
        Integer term3134 = new Integer(389427431);
        Object term3133 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term3136 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3133, term3133.getClass(), "gameIndex", term3134);
        setField(term3136, term3136.getClass(), "name", null);
        setField(term3136, term3136.getClass(), "url", null);
        setField(term3133, term3133.getClass(), "generation", term3136);
        Integer term3138 = new Integer(-1945706126);
        Object term3137 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term3140 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3137, term3137.getClass(), "gameIndex", term3138);
        setField(term3140, term3140.getClass(), "name", null);
        setField(term3140, term3140.getClass(), "url", null);
        setField(term3137, term3137.getClass(), "generation", term3140);
        ArrayList term3127 = new ArrayList();
        ((ArrayList) term3127).add(term3129);
        ((ArrayList) term3127).add(term3133);
        ((ArrayList) term3127).add(term3137);
        ArrayList term3143 = new ArrayList();
        ArrayList term3160 = new ArrayList();
        Object term3179 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term3180 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        Object term3181 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3180, term3180.getClass(), "url", null);
        setField(term3179, term3179.getClass(), "machine", term3180);
        setField(term3181, term3181.getClass(), "name", null);
        setField(term3181, term3181.getClass(), "url", null);
        setField(term3179, term3179.getClass(), "versionGroup", term3181);
        Object term3182 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term3183 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        Object term3184 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3183, term3183.getClass(), "url", null);
        setField(term3182, term3182.getClass(), "machine", term3183);
        setField(term3184, term3184.getClass(), "name", null);
        setField(term3184, term3184.getClass(), "url", null);
        setField(term3182, term3182.getClass(), "versionGroup", term3184);
        ArrayList term3177 = new ArrayList();
        ((ArrayList) term3177).add(term3179);
        ((ArrayList) term3177).add(term3182);
        term3059 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        Object term3078 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3147 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemSprites"));
        Object term3164 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term3059, term3059.getClass(), "id", term3060);
        setField(term3059, term3059.getClass(), "name", "wrikqJwXvL");
        setField(term3059, term3059.getClass(), "cost", term3074);
        setField(term3059, term3059.getClass(), "flingPower", term3076);
        setField(term3078, term3078.getClass(), "name", "UiWhvbypdr");
        setField(term3078, term3078.getClass(), "url", "CgleElJNje");
        setField(term3059, term3059.getClass(), "flingEffect", term3078);
        setField(term3059, term3059.getClass(), "attributes", term3103);
        setField(term3059, term3059.getClass(), "category", term3107);
        setField(term3059, term3059.getClass(), "effectEntries", term3111);
        setField(term3059, term3059.getClass(), "flavorTextEntries", term3123);
        setField(term3059, term3059.getClass(), "gameIndices", term3127);
        setField(term3059, term3059.getClass(), "names", term3143);
        setField(term3147, term3147.getClass(), "imageUrl", "PGfCDJTBek");
        setField(term3059, term3059.getClass(), "sprites", term3147);
        setField(term3059, term3059.getClass(), "heldByPokemon", term3160);
        setField(term3164, term3164.getClass(), "url", "ZwjARhAtHC");
        setField(term3059, term3059.getClass(), "babyTriggerFor", term3164);
        setField(term3059, term3059.getClass(), "machines", term3177);
        Object term3190 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3190, term3190.getClass(), "name", "EMiMtYgfvr");
        setField(term3190, term3190.getClass(), "url", "OyYyYYnJuF");
        Object term3216 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3216, term3216.getClass(), "name", "");
        setField(term3216, term3216.getClass(), "url", "");
        Object term3220 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3220, term3220.getClass(), "name", null);
        setField(term3220, term3220.getClass(), "url", null);
        term3187 = new LinkedList();
        ((LinkedList) term3187).add(term3190);
        ((LinkedList) term3187).add(term3216);
        ((LinkedList) term3187).add(term3220);
        ((LinkedList) term3187).add((Object)null);
        ((LinkedList) term3187).add((Object)null);
        ((LinkedList) term3187).add((Object)null);
        ((LinkedList) term3187).add((Object)null);
        ((LinkedList) term3187).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3187;
        callMethod(klass, "setCategory", argTypes, term3059, args);
    }

};


