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

public class Berry_setNaturalGiftPower_5041135410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1765;
     Object term1875;

    public Berry_setNaturalGiftPower_5041135410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1766 = new Integer(-268815336);
        Integer term1780 = new Integer(-1210583429);
        Integer term1782 = new Integer(-663691365);
        Integer term1784 = new Integer(339854490);
        Integer term1786 = new Integer(-615654495);
        Integer term1788 = new Integer(-1476117762);
        Integer term1790 = new Integer(-341962980);
        Integer term1820 = new Integer(1532716628);
        Object term1819 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1822 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1819, term1819.getClass(), "potency", term1820);
        setField(term1822, term1822.getClass(), "name", null);
        setField(term1822, term1822.getClass(), "url", null);
        setField(term1819, term1819.getClass(), "flavor", term1822);
        ArrayList term1817 = new ArrayList();
        ((ArrayList) term1817).add(term1819);
        term1765 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term1792 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1825 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1850 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1765, term1765.getClass(), "id", term1766);
        setField(term1765, term1765.getClass(), "name", "LWyEaeIyAo");
        setField(term1765, term1765.getClass(), "growthTime", term1780);
        setField(term1765, term1765.getClass(), "maxHarvest", term1782);
        setField(term1765, term1765.getClass(), "naturalGiftPower", term1784);
        setField(term1765, term1765.getClass(), "size", term1786);
        setField(term1765, term1765.getClass(), "smoothness", term1788);
        setField(term1765, term1765.getClass(), "soilDryness", term1790);
        setField(term1792, term1792.getClass(), "name", "yVMkkQhvmN");
        setField(term1792, term1792.getClass(), "url", "mvrkADEgpp");
        setField(term1765, term1765.getClass(), "firmness", term1792);
        setField(term1765, term1765.getClass(), "flavors", term1817);
        setField(term1825, term1825.getClass(), "name", "EeBVbzjcCI");
        setField(term1825, term1825.getClass(), "url", "UfQtPRyWRC");
        setField(term1765, term1765.getClass(), "item", term1825);
        setField(term1850, term1850.getClass(), "name", "FPvxVzzSvD");
        setField(term1850, term1850.getClass(), "url", "WHcwFgsGFC");
        setField(term1765, term1765.getClass(), "naturalGiftType", term1850);
        term1875 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1875;
        callMethod(klass, "setNaturalGiftPower", argTypes, term1765, args);
    }

};


