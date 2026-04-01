package org.openRealmOfStars.player;

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
import static org.openRealmOfStars.player.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PlayerList_savePlayerList_1155233328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2759283;
     Object term2759289;

    public PlayerList_savePlayerList_1155233328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2759284 = new ArrayList();
        term2759283 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term2759283, term2759283.getClass(), "list", term2759284);
        setIntField(term2759283, term2759283.getClass(), "currentPlayer", -631364622);
        term2759289 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term2759291 = (byte[]) newByteArray(5);
        byte[] term2759297 = (byte[]) newByteArray(4);
        Object term2759303 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2759289, term2759289.getClass(), "written", -1347483832);
        setByteElement(term2759291, 0, (byte) -87);
        setByteElement(term2759291, 1, (byte) 65);
        setByteElement(term2759291, 2, (byte) 86);
        setByteElement(term2759291, 3, (byte) 77);
        setByteElement(term2759291, 4, (byte) 55);
        setField(term2759289, term2759289.getClass(), "bytearr", term2759291);
        setByteElement(term2759297, 0, (byte) 118);
        setByteElement(term2759297, 1, (byte) 87);
        setByteElement(term2759297, 2, (byte) 48);
        setByteElement(term2759297, 3, (byte) -5);
        setField(term2759289, term2759289.getClass(), "writeBuffer", term2759297);
        setField(term2759289, term2759289.getClass(), "out", null);
        setBooleanField(term2759289, term2759289.getClass(), "closed", true);
        setField(term2759289, term2759289.getClass(), "closeLock", term2759303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term2759289;
        callMethod(klass, "savePlayerList", argTypes, term2759283, args);
    }

};


