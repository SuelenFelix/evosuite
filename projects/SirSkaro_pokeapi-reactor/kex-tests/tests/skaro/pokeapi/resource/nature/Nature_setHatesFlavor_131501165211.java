package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_setHatesFlavor_131501165211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18571;
     Object term18710;

    public Nature_setHatesFlavor_131501165211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18572 = new Integer(-574105759);
        Object term18688 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18690 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18688, term18688.getClass(), "name", "");
        setField(term18690, term18690.getClass(), "name", null);
        setField(term18690, term18690.getClass(), "url", null);
        setField(term18688, term18688.getClass(), "language", term18690);
        Object term18691 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18693 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18691, term18691.getClass(), "name", "");
        setField(term18693, term18693.getClass(), "name", null);
        setField(term18693, term18693.getClass(), "url", null);
        setField(term18691, term18691.getClass(), "language", term18693);
        Object term18694 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18696 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18694, term18694.getClass(), "name", "");
        setField(term18696, term18696.getClass(), "name", null);
        setField(term18696, term18696.getClass(), "url", null);
        setField(term18694, term18694.getClass(), "language", term18696);
        Object term18697 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18699 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18697, term18697.getClass(), "name", "");
        setField(term18699, term18699.getClass(), "name", null);
        setField(term18699, term18699.getClass(), "url", null);
        setField(term18697, term18697.getClass(), "language", term18699);
        Object term18700 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18702 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18700, term18700.getClass(), "name", "");
        setField(term18702, term18702.getClass(), "name", null);
        setField(term18702, term18702.getClass(), "url", null);
        setField(term18700, term18700.getClass(), "language", term18702);
        Object term18703 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18705 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18703, term18703.getClass(), "name", "");
        setField(term18705, term18705.getClass(), "name", null);
        setField(term18705, term18705.getClass(), "url", null);
        setField(term18703, term18703.getClass(), "language", term18705);
        Object term18706 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term18706, term18706.getClass(), "name", "");
        setField(term18706, term18706.getClass(), "language", term18699);
        ArrayList term18686 = new ArrayList();
        ((ArrayList) term18686).add(term18688);
        ((ArrayList) term18686).add(term18691);
        ((ArrayList) term18686).add(term18694);
        ((ArrayList) term18686).add(term18697);
        ((ArrayList) term18686).add(term18700);
        ((ArrayList) term18686).add(term18703);
        ((ArrayList) term18686).add(term18706);
        term18571 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term18586 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18611 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18636 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18661 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18571, term18571.getClass(), "id", term18572);
        setField(term18571, term18571.getClass(), "name", "CVhsNqYDrO");
        setField(term18586, term18586.getClass(), "name", "dMpUbtHwly");
        setField(term18586, term18586.getClass(), "url", "bxEEJVIcPG");
        setField(term18571, term18571.getClass(), "decreasedStat", term18586);
        setField(term18611, term18611.getClass(), "name", "UttOGDGpEr");
        setField(term18611, term18611.getClass(), "url", "aPScTdSsoS");
        setField(term18571, term18571.getClass(), "increasedStat", term18611);
        setField(term18636, term18636.getClass(), "name", "CZYngwdoHw");
        setField(term18636, term18636.getClass(), "url", "ZbWZNiPrBA");
        setField(term18571, term18571.getClass(), "hatesFlavor", term18636);
        setField(term18661, term18661.getClass(), "name", "ilMWoyWLja");
        setField(term18661, term18661.getClass(), "url", "DejzaVMRwf");
        setField(term18571, term18571.getClass(), "likesFlavor", term18661);
        setField(term18571, term18571.getClass(), "names", term18686);
        term18710 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18710, term18710.getClass(), "name", "qBRgIZjugc");
        setField(term18710, term18710.getClass(), "url", "ZPnUGVLyiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term18710;
        callMethod(klass, "setHatesFlavor", argTypes, term18571, args);
    }

};


