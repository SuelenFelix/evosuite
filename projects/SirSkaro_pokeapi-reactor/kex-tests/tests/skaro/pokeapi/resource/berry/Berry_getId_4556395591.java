package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_getId_4556395591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Berry_getId_4556395591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term16 = new Integer(1162663216);
        Integer term18 = new Integer(1484323161);
        Integer term20 = new Integer(391863371);
        Integer term22 = new Integer(-1922583790);
        Integer term24 = new Integer(-616727354);
        Integer term26 = new Integer(-1955890973);
        Integer term56 = new Integer(-2038273078);
        Object term55 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term58 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term55, term55.getClass(), "potency", term56);
        setField(term58, term58.getClass(), "name", null);
        setField(term58, term58.getClass(), "url", null);
        setField(term55, term55.getClass(), "flavor", term58);
        Integer term60 = new Integer(1227103734);
        Object term59 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term62 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59, term59.getClass(), "potency", term60);
        setField(term62, term62.getClass(), "name", null);
        setField(term62, term62.getClass(), "url", null);
        setField(term59, term59.getClass(), "flavor", term62);
        Integer term64 = new Integer(-1339778481);
        Object term63 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term66 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term63, term63.getClass(), "potency", term64);
        setField(term66, term66.getClass(), "name", null);
        setField(term66, term66.getClass(), "url", null);
        setField(term63, term63.getClass(), "flavor", term66);
        Integer term68 = new Integer(1725571209);
        Object term67 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term70 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term67, term67.getClass(), "potency", term68);
        setField(term70, term70.getClass(), "name", null);
        setField(term70, term70.getClass(), "url", null);
        setField(term67, term67.getClass(), "flavor", term70);
        Integer term72 = new Integer(-522618178);
        Object term71 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term74 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term71, term71.getClass(), "potency", term72);
        setField(term74, term74.getClass(), "name", null);
        setField(term74, term74.getClass(), "url", null);
        setField(term71, term71.getClass(), "flavor", term74);
        ArrayList term53 = new ArrayList();
        ((ArrayList) term53).add(term55);
        ((ArrayList) term53).add(term59);
        ((ArrayList) term53).add(term63);
        ((ArrayList) term53).add(term67);
        ((ArrayList) term53).add(term71);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term28 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term77 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term102 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "growthTime", term16);
        setField(term1, term1.getClass(), "maxHarvest", term18);
        setField(term1, term1.getClass(), "naturalGiftPower", term20);
        setField(term1, term1.getClass(), "size", term22);
        setField(term1, term1.getClass(), "smoothness", term24);
        setField(term1, term1.getClass(), "soilDryness", term26);
        setField(term28, term28.getClass(), "name", "sjlJAEtRrb");
        setField(term28, term28.getClass(), "url", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "firmness", term28);
        setField(term1, term1.getClass(), "flavors", term53);
        setField(term77, term77.getClass(), "name", "LQFpaHEwXR");
        setField(term77, term77.getClass(), "url", "oVcInYnLWB");
        setField(term1, term1.getClass(), "item", term77);
        setField(term102, term102.getClass(), "name", "aJlieCFVtF");
        setField(term102, term102.getClass(), "url", "ZiaGIbnzTs");
        setField(term1, term1.getClass(), "naturalGiftType", term102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


