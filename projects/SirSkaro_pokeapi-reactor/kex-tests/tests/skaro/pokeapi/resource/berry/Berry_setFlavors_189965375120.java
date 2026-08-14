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
import java.util.LinkedList;

public class Berry_setFlavors_189965375120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3665;
     Object term3795;

    public Berry_setFlavors_189965375120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3666 = new Integer(806595993);
        Integer term3680 = new Integer(548228925);
        Integer term3682 = new Integer(-749861210);
        Integer term3684 = new Integer(1694224101);
        Integer term3686 = new Integer(937859191);
        Integer term3688 = new Integer(-916584829);
        Integer term3690 = new Integer(-2131181468);
        Integer term3720 = new Integer(282916351);
        Object term3719 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3722 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3719, term3719.getClass(), "potency", term3720);
        setField(term3722, term3722.getClass(), "name", null);
        setField(term3722, term3722.getClass(), "url", null);
        setField(term3719, term3719.getClass(), "flavor", term3722);
        Integer term3724 = new Integer(880977281);
        Object term3723 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3726 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3723, term3723.getClass(), "potency", term3724);
        setField(term3726, term3726.getClass(), "name", null);
        setField(term3726, term3726.getClass(), "url", null);
        setField(term3723, term3723.getClass(), "flavor", term3726);
        Integer term3728 = new Integer(371943306);
        Object term3727 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3730 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3727, term3727.getClass(), "potency", term3728);
        setField(term3730, term3730.getClass(), "name", null);
        setField(term3730, term3730.getClass(), "url", null);
        setField(term3727, term3727.getClass(), "flavor", term3730);
        Integer term3732 = new Integer(982388293);
        Object term3731 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3734 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3731, term3731.getClass(), "potency", term3732);
        setField(term3734, term3734.getClass(), "name", null);
        setField(term3734, term3734.getClass(), "url", null);
        setField(term3731, term3731.getClass(), "flavor", term3734);
        Integer term3736 = new Integer(-159494544);
        Object term3735 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3738 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3735, term3735.getClass(), "potency", term3736);
        setField(term3738, term3738.getClass(), "name", null);
        setField(term3738, term3738.getClass(), "url", null);
        setField(term3735, term3735.getClass(), "flavor", term3738);
        Integer term3740 = new Integer(-75206835);
        Object term3739 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3742 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3739, term3739.getClass(), "potency", term3740);
        setField(term3742, term3742.getClass(), "name", null);
        setField(term3742, term3742.getClass(), "url", null);
        setField(term3739, term3739.getClass(), "flavor", term3742);
        ArrayList term3717 = new ArrayList();
        ((ArrayList) term3717).add(term3719);
        ((ArrayList) term3717).add(term3723);
        ((ArrayList) term3717).add(term3727);
        ((ArrayList) term3717).add(term3731);
        ((ArrayList) term3717).add(term3735);
        ((ArrayList) term3717).add(term3739);
        term3665 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term3692 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3745 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3770 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3665, term3665.getClass(), "id", term3666);
        setField(term3665, term3665.getClass(), "name", "uPuCVuZYOI");
        setField(term3665, term3665.getClass(), "growthTime", term3680);
        setField(term3665, term3665.getClass(), "maxHarvest", term3682);
        setField(term3665, term3665.getClass(), "naturalGiftPower", term3684);
        setField(term3665, term3665.getClass(), "size", term3686);
        setField(term3665, term3665.getClass(), "smoothness", term3688);
        setField(term3665, term3665.getClass(), "soilDryness", term3690);
        setField(term3692, term3692.getClass(), "name", "TweMFhxNdj");
        setField(term3692, term3692.getClass(), "url", "NBrvVzvQHe");
        setField(term3665, term3665.getClass(), "firmness", term3692);
        setField(term3665, term3665.getClass(), "flavors", term3717);
        setField(term3745, term3745.getClass(), "name", "TXZAIPQJHt");
        setField(term3745, term3745.getClass(), "url", "DIbeDHICho");
        setField(term3665, term3665.getClass(), "item", term3745);
        setField(term3770, term3770.getClass(), "name", "dJGPlmSRnz");
        setField(term3770, term3770.getClass(), "url", "DPskuFUobI");
        setField(term3665, term3665.getClass(), "naturalGiftType", term3770);
        Integer term3799 = new Integer(-1618206977);
        Object term3798 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3801 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3798, term3798.getClass(), "potency", term3799);
        setField(term3801, term3801.getClass(), "name", "");
        setField(term3801, term3801.getClass(), "url", "");
        setField(term3798, term3798.getClass(), "flavor", term3801);
        Integer term3806 = new Integer(-1747406163);
        Object term3805 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3808 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3805, term3805.getClass(), "potency", term3806);
        setField(term3808, term3808.getClass(), "name", null);
        setField(term3808, term3808.getClass(), "url", null);
        setField(term3805, term3805.getClass(), "flavor", term3808);
        Integer term3811 = new Integer(388157121);
        Object term3810 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        setField(term3810, term3810.getClass(), "potency", term3811);
        setField(term3810, term3810.getClass(), "flavor", null);
        term3795 = new LinkedList();
        ((LinkedList) term3795).add(term3798);
        ((LinkedList) term3795).add(term3805);
        ((LinkedList) term3795).add(term3810);
        ((LinkedList) term3795).add((Object)null);
        ((LinkedList) term3795).add((Object)null);
        ((LinkedList) term3795).add((Object)null);
        ((LinkedList) term3795).add((Object)null);
        ((LinkedList) term3795).add((Object)null);
        ((LinkedList) term3795).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3795;
        callMethod(klass, "setFlavors", argTypes, term3665, args);
    }

};


