package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class MyObject_setEnabled_20815123256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381;
     Object term442;

    public MyObject_setEnabled_20815123256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term385 = new ArrayList();
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        Object term384 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term384, term384.getClass(), "children", term385);
        setField(term384, term384.getClass(), "description", "");
        setLongField(term384, term384.getClass(), "size", 4784595517102746672L);
        setBooleanField(term384, term384.getClass(), "enabled", true);
        ArrayList term392 = new ArrayList();
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        Object term391 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term391, term391.getClass(), "children", term392);
        setField(term391, term391.getClass(), "description", "");
        setLongField(term391, term391.getClass(), "size", 1439298019805881866L);
        setBooleanField(term391, term391.getClass(), "enabled", true);
        ArrayList term399 = new ArrayList();
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        ((ArrayList) term399).add((Object)null);
        Object term398 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term398, term398.getClass(), "children", term399);
        setField(term398, term398.getClass(), "description", "");
        setLongField(term398, term398.getClass(), "size", -6645965768855543712L);
        setBooleanField(term398, term398.getClass(), "enabled", false);
        ArrayList term406 = new ArrayList();
        ((ArrayList) term406).add((Object)null);
        ((ArrayList) term406).add((Object)null);
        ((ArrayList) term406).add((Object)null);
        Object term405 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term405, term405.getClass(), "children", term406);
        setField(term405, term405.getClass(), "description", "");
        setLongField(term405, term405.getClass(), "size", 5907001541142728739L);
        setBooleanField(term405, term405.getClass(), "enabled", false);
        ArrayList term413 = new ArrayList();
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        ((ArrayList) term413).add((Object)null);
        Object term412 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term412, term412.getClass(), "children", term413);
        setField(term412, term412.getClass(), "description", "");
        setLongField(term412, term412.getClass(), "size", 6617340557564669657L);
        setBooleanField(term412, term412.getClass(), "enabled", true);
        ArrayList term420 = new ArrayList();
        ((ArrayList) term420).add((Object)null);
        ((ArrayList) term420).add((Object)null);
        ((ArrayList) term420).add((Object)null);
        ((ArrayList) term420).add((Object)null);
        ((ArrayList) term420).add((Object)null);
        ((ArrayList) term420).add((Object)null);
        Object term419 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term419, term419.getClass(), "children", term420);
        setField(term419, term419.getClass(), "description", "");
        setLongField(term419, term419.getClass(), "size", -6292278961887936280L);
        setBooleanField(term419, term419.getClass(), "enabled", true);
        ArrayList term382 = new ArrayList();
        ((ArrayList) term382).add(term384);
        ((ArrayList) term382).add(term391);
        ((ArrayList) term382).add(term398);
        ((ArrayList) term382).add(term384);
        ((ArrayList) term382).add(term391);
        ((ArrayList) term382).add(term405);
        ((ArrayList) term382).add(term381);
        ((ArrayList) term382).add(term412);
        ((ArrayList) term382).add(term419);
        term381 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term381, term381.getClass(), "children", term382);
        setField(term381, term381.getClass(), "description", "xLbjWUgOIL");
        setLongField(term381, term381.getClass(), "size", -7612550318181586304L);
        setBooleanField(term381, term381.getClass(), "enabled", true);
        term442 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term442;
        callMethod(klass, "setEnabled", argTypes, term381, args);
    }

};


