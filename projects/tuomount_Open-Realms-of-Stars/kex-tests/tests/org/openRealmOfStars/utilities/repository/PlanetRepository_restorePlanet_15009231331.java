package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class PlanetRepository_restorePlanet_15009231331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3164;
     Object term3165;
     Object term3191;

    public PlanetRepository_restorePlanet_15009231331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3164 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.PlanetRepository"));
        term3165 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term3166 = (byte[]) newByteArray(4);
        char[] term3171 = (char[]) newCharArray(8);
        byte[] term3180 = (byte[]) newByteArray(0);
        char[] term3181 = (char[]) newCharArray(9);
        setByteElement(term3166, 0, (byte) -53);
        setByteElement(term3166, 1, (byte) -93);
        setByteElement(term3166, 2, (byte) 82);
        setByteElement(term3166, 3, (byte) -89);
        setField(term3165, term3165.getClass(), "bytearr", term3166);
        setCharElement(term3171, 0, 'S');
        setCharElement(term3171, 1, 'M');
        setCharElement(term3171, 2, 'j');
        setCharElement(term3171, 3, 'G');
        setCharElement(term3171, 4, 'Y');
        setCharElement(term3171, 5, 'S');
        setCharElement(term3171, 6, 'R');
        setCharElement(term3171, 7, 'K');
        setField(term3165, term3165.getClass(), "chararr", term3171);
        setField(term3165, term3165.getClass(), "readBuffer", term3180);
        setCharElement(term3181, 0, 'T');
        setCharElement(term3181, 1, 'N');
        setCharElement(term3181, 2, 'F');
        setCharElement(term3181, 3, 'h');
        setCharElement(term3181, 4, 'R');
        setCharElement(term3181, 5, 'N');
        setCharElement(term3181, 6, 'S');
        setCharElement(term3181, 7, 'z');
        setCharElement(term3181, 8, 'Y');
        setField(term3165, term3165.getClass(), "lineBuffer", term3181);
        setField(term3165, term3165.getClass(), "in", null);
        ArrayList term3192 = new ArrayList();
        term3191 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term3191, term3191.getClass(), "list", term3192);
        setIntField(term3191, term3191.getClass(), "currentPlayer", -1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.PlanetRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term3165;
        args[1] = term3191;
        callMethod(klass, "restorePlanet", argTypes, term3164, args);
    }

};


