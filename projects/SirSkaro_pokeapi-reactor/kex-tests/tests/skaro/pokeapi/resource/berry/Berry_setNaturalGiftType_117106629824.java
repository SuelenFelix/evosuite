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

public class Berry_setNaturalGiftType_117106629824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4511;
     Object term4621;

    public Berry_setNaturalGiftType_117106629824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4512 = new Integer(2058711405);
        Integer term4526 = new Integer(1743683601);
        Integer term4528 = new Integer(-945116798);
        Integer term4530 = new Integer(1593461795);
        Integer term4532 = new Integer(515182546);
        Integer term4534 = new Integer(-936895502);
        Integer term4536 = new Integer(-129547140);
        Integer term4566 = new Integer(199287428);
        Object term4565 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term4568 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4565, term4565.getClass(), "potency", term4566);
        setField(term4568, term4568.getClass(), "name", null);
        setField(term4568, term4568.getClass(), "url", null);
        setField(term4565, term4565.getClass(), "flavor", term4568);
        ArrayList term4563 = new ArrayList();
        ((ArrayList) term4563).add(term4565);
        term4511 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term4538 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4571 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4596 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4511, term4511.getClass(), "id", term4512);
        setField(term4511, term4511.getClass(), "name", "GNEmuHPNcU");
        setField(term4511, term4511.getClass(), "growthTime", term4526);
        setField(term4511, term4511.getClass(), "maxHarvest", term4528);
        setField(term4511, term4511.getClass(), "naturalGiftPower", term4530);
        setField(term4511, term4511.getClass(), "size", term4532);
        setField(term4511, term4511.getClass(), "smoothness", term4534);
        setField(term4511, term4511.getClass(), "soilDryness", term4536);
        setField(term4538, term4538.getClass(), "name", "IoSfuKDFRe");
        setField(term4538, term4538.getClass(), "url", "AWYyZiNfsm");
        setField(term4511, term4511.getClass(), "firmness", term4538);
        setField(term4511, term4511.getClass(), "flavors", term4563);
        setField(term4571, term4571.getClass(), "name", "sUEeHQTWkA");
        setField(term4571, term4571.getClass(), "url", "BDIRCxAWLA");
        setField(term4511, term4511.getClass(), "item", term4571);
        setField(term4596, term4596.getClass(), "name", "eOJfbiZLnb");
        setField(term4596, term4596.getClass(), "url", "nKZKnxWYCK");
        setField(term4511, term4511.getClass(), "naturalGiftType", term4596);
        term4621 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4621, term4621.getClass(), "name", "cSHGbqKqlN");
        setField(term4621, term4621.getClass(), "url", "pFAfANnxup");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4621;
        callMethod(klass, "setNaturalGiftType", argTypes, term4511, args);
    }

};


