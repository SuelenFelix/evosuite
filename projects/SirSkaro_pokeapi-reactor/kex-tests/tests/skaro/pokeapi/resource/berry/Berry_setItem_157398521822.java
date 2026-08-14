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

public class Berry_setItem_157398521822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4082;
     Object term4196;

    public Berry_setItem_157398521822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4083 = new Integer(-130649791);
        Integer term4097 = new Integer(534834644);
        Integer term4099 = new Integer(1959097203);
        Integer term4101 = new Integer(-209654048);
        Integer term4103 = new Integer(477625804);
        Integer term4105 = new Integer(252575029);
        Integer term4107 = new Integer(57189932);
        Integer term4137 = new Integer(1460722225);
        Object term4136 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term4139 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4136, term4136.getClass(), "potency", term4137);
        setField(term4139, term4139.getClass(), "name", null);
        setField(term4139, term4139.getClass(), "url", null);
        setField(term4136, term4136.getClass(), "flavor", term4139);
        Integer term4141 = new Integer(1743224434);
        Object term4140 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term4143 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4140, term4140.getClass(), "potency", term4141);
        setField(term4143, term4143.getClass(), "name", null);
        setField(term4143, term4143.getClass(), "url", null);
        setField(term4140, term4140.getClass(), "flavor", term4143);
        ArrayList term4134 = new ArrayList();
        ((ArrayList) term4134).add(term4136);
        ((ArrayList) term4134).add(term4140);
        term4082 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term4109 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4146 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4171 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4082, term4082.getClass(), "id", term4083);
        setField(term4082, term4082.getClass(), "name", "pumvwBWvpy");
        setField(term4082, term4082.getClass(), "growthTime", term4097);
        setField(term4082, term4082.getClass(), "maxHarvest", term4099);
        setField(term4082, term4082.getClass(), "naturalGiftPower", term4101);
        setField(term4082, term4082.getClass(), "size", term4103);
        setField(term4082, term4082.getClass(), "smoothness", term4105);
        setField(term4082, term4082.getClass(), "soilDryness", term4107);
        setField(term4109, term4109.getClass(), "name", "HwLHeGLyhe");
        setField(term4109, term4109.getClass(), "url", "RDnkgWkcbz");
        setField(term4082, term4082.getClass(), "firmness", term4109);
        setField(term4082, term4082.getClass(), "flavors", term4134);
        setField(term4146, term4146.getClass(), "name", "jnwVnmKAFv");
        setField(term4146, term4146.getClass(), "url", "TXyHhqeCjR");
        setField(term4082, term4082.getClass(), "item", term4146);
        setField(term4171, term4171.getClass(), "name", "lZIgPZPgTu");
        setField(term4171, term4171.getClass(), "url", "iuCxnHGMoW");
        setField(term4082, term4082.getClass(), "naturalGiftType", term4171);
        term4196 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4196, term4196.getClass(), "name", "TSyCeEZPaT");
        setField(term4196, term4196.getClass(), "url", "JeZFtaqkzW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4196;
        callMethod(klass, "setItem", argTypes, term4082, args);
    }

};


