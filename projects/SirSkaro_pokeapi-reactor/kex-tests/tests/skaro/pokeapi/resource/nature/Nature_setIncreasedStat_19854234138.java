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

public class Nature_setIncreasedStat_19854234138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1608;
     Object term1745;

    public Nature_setIncreasedStat_19854234138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1609 = new Integer(1227103734);
        Object term1725 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1727 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1725, term1725.getClass(), "name", "");
        setField(term1727, term1727.getClass(), "name", null);
        setField(term1727, term1727.getClass(), "url", null);
        setField(term1725, term1725.getClass(), "language", term1727);
        Object term1728 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1730 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1728, term1728.getClass(), "name", "");
        setField(term1730, term1730.getClass(), "name", null);
        setField(term1730, term1730.getClass(), "url", null);
        setField(term1728, term1728.getClass(), "language", term1730);
        Object term1731 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1733 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1731, term1731.getClass(), "name", "");
        setField(term1733, term1733.getClass(), "name", null);
        setField(term1733, term1733.getClass(), "url", null);
        setField(term1731, term1731.getClass(), "language", term1733);
        Object term1734 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1734, term1734.getClass(), "name", "");
        setField(term1736, term1736.getClass(), "name", null);
        setField(term1736, term1736.getClass(), "url", null);
        setField(term1734, term1734.getClass(), "language", term1736);
        Object term1737 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1739 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1737, term1737.getClass(), "name", "");
        setField(term1739, term1739.getClass(), "name", null);
        setField(term1739, term1739.getClass(), "url", null);
        setField(term1737, term1737.getClass(), "language", term1739);
        Object term1740 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1742 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1740, term1740.getClass(), "name", "");
        setField(term1742, term1742.getClass(), "name", null);
        setField(term1742, term1742.getClass(), "url", null);
        setField(term1740, term1740.getClass(), "language", term1742);
        ArrayList term1723 = new ArrayList();
        ((ArrayList) term1723).add(term1725);
        ((ArrayList) term1723).add(term1728);
        ((ArrayList) term1723).add(term1731);
        ((ArrayList) term1723).add(term1734);
        ((ArrayList) term1723).add(term1737);
        ((ArrayList) term1723).add(term1740);
        term1608 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term1623 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1648 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1673 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1698 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1608, term1608.getClass(), "id", term1609);
        setField(term1608, term1608.getClass(), "name", "pXOkjyeIRb");
        setField(term1623, term1623.getClass(), "name", "GgZWSjxjyE");
        setField(term1623, term1623.getClass(), "url", "EeBVbzjcCI");
        setField(term1608, term1608.getClass(), "decreasedStat", term1623);
        setField(term1648, term1648.getClass(), "name", "UfQtPRyWRC");
        setField(term1648, term1648.getClass(), "url", "FPvxVzzSvD");
        setField(term1608, term1608.getClass(), "increasedStat", term1648);
        setField(term1673, term1673.getClass(), "name", "WHcwFgsGFC");
        setField(term1673, term1673.getClass(), "url", "HzqpegHiRq");
        setField(term1608, term1608.getClass(), "hatesFlavor", term1673);
        setField(term1698, term1698.getClass(), "name", "jwsfVjMoJT");
        setField(term1698, term1698.getClass(), "url", "ZfdXfCCFDf");
        setField(term1608, term1608.getClass(), "likesFlavor", term1698);
        setField(term1608, term1608.getClass(), "names", term1723);
        term1745 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1745, term1745.getClass(), "name", "zUlRdimJtU");
        setField(term1745, term1745.getClass(), "url", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1745;
        callMethod(klass, "setIncreasedStat", argTypes, term1608, args);
    }

};


