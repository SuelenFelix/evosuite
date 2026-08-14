package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class VersionEncounterDetail_setMaxChance_12812590194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38738;
     Object term38814;

    public VersionEncounterDetail_setMaxChance_12812590194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38764 = new Integer(-2024983877);
        Integer term38769 = new Integer(1757149811);
        Integer term38771 = new Integer(1505375686);
        ArrayList term38773 = new ArrayList();
        Integer term38776 = new Integer(-132005524);
        Object term38768 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38778 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38768, term38768.getClass(), "minLevel", term38769);
        setField(term38768, term38768.getClass(), "maxLevel", term38771);
        setField(term38768, term38768.getClass(), "conditionValues", term38773);
        setField(term38768, term38768.getClass(), "chance", term38776);
        setField(term38778, term38778.getClass(), "name", null);
        setField(term38778, term38778.getClass(), "url", null);
        setField(term38768, term38768.getClass(), "method", term38778);
        Integer term38780 = new Integer(-1235127374);
        Integer term38782 = new Integer(-2077814162);
        ArrayList term38784 = new ArrayList();
        Integer term38787 = new Integer(444514470);
        Object term38779 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38789 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38779, term38779.getClass(), "minLevel", term38780);
        setField(term38779, term38779.getClass(), "maxLevel", term38782);
        setField(term38779, term38779.getClass(), "conditionValues", term38784);
        setField(term38779, term38779.getClass(), "chance", term38787);
        setField(term38789, term38789.getClass(), "name", null);
        setField(term38789, term38789.getClass(), "url", null);
        setField(term38779, term38779.getClass(), "method", term38789);
        Integer term38791 = new Integer(-147055177);
        Integer term38793 = new Integer(1979044375);
        ArrayList term38795 = new ArrayList();
        Integer term38798 = new Integer(961252909);
        Object term38790 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38800 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38790, term38790.getClass(), "minLevel", term38791);
        setField(term38790, term38790.getClass(), "maxLevel", term38793);
        setField(term38790, term38790.getClass(), "conditionValues", term38795);
        setField(term38790, term38790.getClass(), "chance", term38798);
        setField(term38800, term38800.getClass(), "name", null);
        setField(term38800, term38800.getClass(), "url", null);
        setField(term38790, term38790.getClass(), "method", term38800);
        Integer term38802 = new Integer(1455842357);
        Integer term38804 = new Integer(1349806561);
        ArrayList term38806 = new ArrayList();
        Integer term38809 = new Integer(923905351);
        Object term38801 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38811 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38801, term38801.getClass(), "minLevel", term38802);
        setField(term38801, term38801.getClass(), "maxLevel", term38804);
        setField(term38801, term38801.getClass(), "conditionValues", term38806);
        setField(term38801, term38801.getClass(), "chance", term38809);
        setField(term38811, term38811.getClass(), "name", null);
        setField(term38811, term38811.getClass(), "url", null);
        setField(term38801, term38801.getClass(), "method", term38811);
        ArrayList term38766 = new ArrayList();
        ((ArrayList) term38766).add(term38768);
        ((ArrayList) term38766).add(term38779);
        ((ArrayList) term38766).add(term38790);
        ((ArrayList) term38766).add(term38801);
        term38738 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term38739 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38739, term38739.getClass(), "name", "hKDHCIiSuI");
        setField(term38739, term38739.getClass(), "url", "ZDvGrpCzSc");
        setField(term38738, term38738.getClass(), "version", term38739);
        setField(term38738, term38738.getClass(), "maxChance", term38764);
        setField(term38738, term38738.getClass(), "encounterDetails", term38766);
        term38814 = new Integer(428360161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionEncounterDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38814;
        callMethod(klass, "setMaxChance", argTypes, term38738, args);
    }

};


