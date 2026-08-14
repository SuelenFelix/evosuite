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

public class Berry_getSize_132519882911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1947;

    public Berry_getSize_132519882911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1948 = new Integer(1141317871);
        Integer term1962 = new Integer(890669485);
        Integer term1964 = new Integer(691577392);
        Integer term1966 = new Integer(-893623680);
        Integer term1968 = new Integer(-1963434938);
        Integer term1970 = new Integer(906181092);
        Integer term1972 = new Integer(1045657203);
        Integer term2002 = new Integer(1386130016);
        Object term2001 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2004 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2001, term2001.getClass(), "potency", term2002);
        setField(term2004, term2004.getClass(), "name", null);
        setField(term2004, term2004.getClass(), "url", null);
        setField(term2001, term2001.getClass(), "flavor", term2004);
        Integer term2006 = new Integer(1072005683);
        Object term2005 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2008 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2005, term2005.getClass(), "potency", term2006);
        setField(term2008, term2008.getClass(), "name", null);
        setField(term2008, term2008.getClass(), "url", null);
        setField(term2005, term2005.getClass(), "flavor", term2008);
        Integer term2010 = new Integer(1861318859);
        Object term2009 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2012 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2009, term2009.getClass(), "potency", term2010);
        setField(term2012, term2012.getClass(), "name", null);
        setField(term2012, term2012.getClass(), "url", null);
        setField(term2009, term2009.getClass(), "flavor", term2012);
        Integer term2014 = new Integer(1474524152);
        Object term2013 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2016 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2013, term2013.getClass(), "potency", term2014);
        setField(term2016, term2016.getClass(), "name", null);
        setField(term2016, term2016.getClass(), "url", null);
        setField(term2013, term2013.getClass(), "flavor", term2016);
        Integer term2018 = new Integer(568954359);
        Object term2017 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2020 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2017, term2017.getClass(), "potency", term2018);
        setField(term2020, term2020.getClass(), "name", null);
        setField(term2020, term2020.getClass(), "url", null);
        setField(term2017, term2017.getClass(), "flavor", term2020);
        Integer term2022 = new Integer(53410913);
        Object term2021 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2024 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2021, term2021.getClass(), "potency", term2022);
        setField(term2024, term2024.getClass(), "name", null);
        setField(term2024, term2024.getClass(), "url", null);
        setField(term2021, term2021.getClass(), "flavor", term2024);
        ArrayList term1999 = new ArrayList();
        ((ArrayList) term1999).add(term2001);
        ((ArrayList) term1999).add(term2005);
        ((ArrayList) term1999).add(term2009);
        ((ArrayList) term1999).add(term2013);
        ((ArrayList) term1999).add(term2017);
        ((ArrayList) term1999).add(term2021);
        term1947 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term1974 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2027 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2052 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1947, term1947.getClass(), "id", term1948);
        setField(term1947, term1947.getClass(), "name", "HzqpegHiRq");
        setField(term1947, term1947.getClass(), "growthTime", term1962);
        setField(term1947, term1947.getClass(), "maxHarvest", term1964);
        setField(term1947, term1947.getClass(), "naturalGiftPower", term1966);
        setField(term1947, term1947.getClass(), "size", term1968);
        setField(term1947, term1947.getClass(), "smoothness", term1970);
        setField(term1947, term1947.getClass(), "soilDryness", term1972);
        setField(term1974, term1974.getClass(), "name", "jwsfVjMoJT");
        setField(term1974, term1974.getClass(), "url", "ZfdXfCCFDf");
        setField(term1947, term1947.getClass(), "firmness", term1974);
        setField(term1947, term1947.getClass(), "flavors", term1999);
        setField(term2027, term2027.getClass(), "name", "WzFopsaDuG");
        setField(term2027, term2027.getClass(), "url", "PapWxkhEWe");
        setField(term1947, term1947.getClass(), "item", term2027);
        setField(term2052, term2052.getClass(), "name", "smnHEqRFRx");
        setField(term2052, term2052.getClass(), "url", "XYtryyobou");
        setField(term1947, term1947.getClass(), "naturalGiftType", term2052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term1947, args);
    }

};


