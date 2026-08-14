package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_setId_174900093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140117;
     Object term140183;

    public BerryFlavor_setId_174900093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140118 = new Integer(-1878750819);
        Integer term140135 = new Integer(1772604053);
        Object term140134 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140137 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140134, term140134.getClass(), "potency", term140135);
        setField(term140137, term140137.getClass(), "name", null);
        setField(term140137, term140137.getClass(), "url", null);
        setField(term140134, term140134.getClass(), "berry", term140137);
        Integer term140139 = new Integer(704647579);
        Object term140138 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140141 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140138, term140138.getClass(), "potency", term140139);
        setField(term140141, term140141.getClass(), "name", null);
        setField(term140141, term140141.getClass(), "url", null);
        setField(term140138, term140138.getClass(), "berry", term140141);
        Integer term140143 = new Integer(-3495334);
        Object term140142 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140145 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140142, term140142.getClass(), "potency", term140143);
        setField(term140145, term140145.getClass(), "name", null);
        setField(term140145, term140145.getClass(), "url", null);
        setField(term140142, term140142.getClass(), "berry", term140145);
        ArrayList term140132 = new ArrayList();
        ((ArrayList) term140132).add(term140134);
        ((ArrayList) term140132).add(term140138);
        ((ArrayList) term140132).add(term140142);
        Object term140175 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140177 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140175, term140175.getClass(), "name", "");
        setField(term140177, term140177.getClass(), "name", null);
        setField(term140177, term140177.getClass(), "url", null);
        setField(term140175, term140175.getClass(), "language", term140177);
        Object term140178 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140180 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140178, term140178.getClass(), "name", "");
        setField(term140180, term140180.getClass(), "name", null);
        setField(term140180, term140180.getClass(), "url", null);
        setField(term140178, term140178.getClass(), "language", term140180);
        ArrayList term140173 = new ArrayList();
        ((ArrayList) term140173).add(term140175);
        ((ArrayList) term140173).add(term140178);
        term140117 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140117, term140117.getClass(), "id", term140118);
        setField(term140117, term140117.getClass(), "name", "ibPzxzcdfD");
        setField(term140117, term140117.getClass(), "barries", term140132);
        setField(term140148, term140148.getClass(), "name", "NAKGpCvecp");
        setField(term140148, term140148.getClass(), "url", "FPWaoqucQb");
        setField(term140117, term140117.getClass(), "contestType", term140148);
        setField(term140117, term140117.getClass(), "names", term140173);
        term140183 = new Integer(745336129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term140183;
        callMethod(klass, "setId", argTypes, term140117, args);
    }

};


