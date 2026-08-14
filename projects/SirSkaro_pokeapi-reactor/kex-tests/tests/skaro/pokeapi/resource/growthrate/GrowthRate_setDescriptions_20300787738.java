package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class GrowthRate_setDescriptions_20300787738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;
     Object term750;

    public GrowthRate_setDescriptions_20300787738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term664 = new Integer(493620644);
        Object term692 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term694 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term692, term692.getClass(), "description", "");
        setField(term694, term694.getClass(), "name", null);
        setField(term694, term694.getClass(), "url", null);
        setField(term692, term692.getClass(), "language", term694);
        ArrayList term690 = new ArrayList();
        ((ArrayList) term690).add(term692);
        Integer term700 = new Integer(1328271830);
        Integer term702 = new Integer(1596070772);
        Object term699 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term699, term699.getClass(), "level", term700);
        setField(term699, term699.getClass(), "experience", term702);
        Integer term705 = new Integer(97029295);
        Integer term707 = new Integer(-1371869594);
        Object term704 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term704, term704.getClass(), "level", term705);
        setField(term704, term704.getClass(), "experience", term707);
        Integer term710 = new Integer(-2095575670);
        Integer term712 = new Integer(1225272962);
        Object term709 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term709, term709.getClass(), "level", term710);
        setField(term709, term709.getClass(), "experience", term712);
        Integer term715 = new Integer(1324040357);
        Integer term717 = new Integer(-1588772968);
        Object term714 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term714, term714.getClass(), "level", term715);
        setField(term714, term714.getClass(), "experience", term717);
        Integer term720 = new Integer(-93135961);
        Integer term722 = new Integer(-112921587);
        Object term719 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term719, term719.getClass(), "level", term720);
        setField(term719, term719.getClass(), "experience", term722);
        Integer term725 = new Integer(933028652);
        Integer term727 = new Integer(287287233);
        Object term724 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term724, term724.getClass(), "level", term725);
        setField(term724, term724.getClass(), "experience", term727);
        Integer term730 = new Integer(962840079);
        Integer term732 = new Integer(1540719661);
        Object term729 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term729, term729.getClass(), "level", term730);
        setField(term729, term729.getClass(), "experience", term732);
        Integer term735 = new Integer(1265463001);
        Integer term737 = new Integer(335112684);
        Object term734 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term734, term734.getClass(), "level", term735);
        setField(term734, term734.getClass(), "experience", term737);
        Integer term740 = new Integer(1551099402);
        Integer term742 = new Integer(-2027534003);
        Object term739 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term739, term739.getClass(), "level", term740);
        setField(term739, term739.getClass(), "experience", term742);
        ArrayList term697 = new ArrayList();
        ((ArrayList) term697).add(term699);
        ((ArrayList) term697).add(term704);
        ((ArrayList) term697).add(term709);
        ((ArrayList) term697).add(term714);
        ((ArrayList) term697).add(term719);
        ((ArrayList) term697).add(term724);
        ((ArrayList) term697).add(term729);
        ((ArrayList) term697).add(term734);
        ((ArrayList) term697).add(term739);
        ArrayList term746 = new ArrayList();
        term663 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term663, term663.getClass(), "id", term664);
        setField(term663, term663.getClass(), "name", "jiKYgYHqIS");
        setField(term663, term663.getClass(), "formula", "DfISiziTgG");
        setField(term663, term663.getClass(), "descriptions", term690);
        setField(term663, term663.getClass(), "levels", term697);
        setField(term663, term663.getClass(), "pokemonSpecies", term746);
        Object term753 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term766 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term753, term753.getClass(), "description", "BKLfkLiZTH");
        setField(term766, term766.getClass(), "name", "");
        setField(term766, term766.getClass(), "url", "");
        setField(term753, term753.getClass(), "language", term766);
        Object term770 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term772 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term770, term770.getClass(), "description", "");
        setField(term772, term772.getClass(), "name", null);
        setField(term772, term772.getClass(), "url", null);
        setField(term770, term770.getClass(), "language", term772);
        term750 = new LinkedList();
        ((LinkedList) term750).add(term753);
        ((LinkedList) term750).add(term770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term750;
        callMethod(klass, "setDescriptions", argTypes, term663, args);
    }

};


