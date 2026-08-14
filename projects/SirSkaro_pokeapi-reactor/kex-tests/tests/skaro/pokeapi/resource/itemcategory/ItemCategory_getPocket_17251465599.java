package skaro.pokeapi.resource.itemcategory;

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
import static skaro.pokeapi.resource.itemcategory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemCategory_getPocket_17251465599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;

    public ItemCategory_getPocket_17251465599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term755 = new Integer(-1339778481);
        ArrayList term769 = new ArrayList();
        Object term775 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term777 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term775, term775.getClass(), "name", "");
        setField(term777, term777.getClass(), "name", null);
        setField(term777, term777.getClass(), "url", null);
        setField(term775, term775.getClass(), "language", term777);
        Object term778 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term780 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term778, term778.getClass(), "name", "");
        setField(term780, term780.getClass(), "name", null);
        setField(term780, term780.getClass(), "url", null);
        setField(term778, term778.getClass(), "language", term780);
        Object term781 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term783 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term781, term781.getClass(), "name", "");
        setField(term783, term783.getClass(), "name", null);
        setField(term783, term783.getClass(), "url", null);
        setField(term781, term781.getClass(), "language", term783);
        Object term784 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term786 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term784, term784.getClass(), "name", "");
        setField(term786, term786.getClass(), "name", null);
        setField(term786, term786.getClass(), "url", null);
        setField(term784, term784.getClass(), "language", term786);
        Object term787 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term789 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term787, term787.getClass(), "name", "");
        setField(term789, term789.getClass(), "name", null);
        setField(term789, term789.getClass(), "url", null);
        setField(term787, term787.getClass(), "language", term789);
        Object term790 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term792 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term790, term790.getClass(), "name", "");
        setField(term792, term792.getClass(), "name", null);
        setField(term792, term792.getClass(), "url", null);
        setField(term790, term790.getClass(), "language", term792);
        Object term793 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term795 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term793, term793.getClass(), "name", "");
        setField(term795, term795.getClass(), "name", null);
        setField(term795, term795.getClass(), "url", null);
        setField(term793, term793.getClass(), "language", term795);
        Object term796 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term798 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term796, term796.getClass(), "name", "");
        setField(term798, term798.getClass(), "name", null);
        setField(term798, term798.getClass(), "url", null);
        setField(term796, term796.getClass(), "language", term798);
        ArrayList term773 = new ArrayList();
        ((ArrayList) term773).add(term775);
        ((ArrayList) term773).add(term778);
        ((ArrayList) term773).add(term781);
        ((ArrayList) term773).add(term784);
        ((ArrayList) term773).add(term787);
        ((ArrayList) term773).add(term790);
        ((ArrayList) term773).add(term793);
        ((ArrayList) term773).add(term796);
        term754 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term801 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term754, term754.getClass(), "id", term755);
        setField(term754, term754.getClass(), "name", "AdxvLJhNLe");
        setField(term754, term754.getClass(), "items", term769);
        setField(term754, term754.getClass(), "names", term773);
        setField(term801, term801.getClass(), "name", "HzqpegHiRq");
        setField(term801, term801.getClass(), "url", "jwsfVjMoJT");
        setField(term754, term754.getClass(), "pocket", term801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPocket", argTypes, term754, args);
    }

};


