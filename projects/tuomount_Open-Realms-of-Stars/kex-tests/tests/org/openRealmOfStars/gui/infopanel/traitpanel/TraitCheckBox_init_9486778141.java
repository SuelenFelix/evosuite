package org.openRealmOfStars.gui.infopanel.traitpanel;

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
import static org.openRealmOfStars.gui.infopanel.traitpanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class TraitCheckBox_init_9486778141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public TraitCheckBox_init_9486778141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term254 = new ArrayList();
        ((ArrayList) term254).add("LQFpaHEwXR");
        ((ArrayList) term254).add("oVcInYnLWB");
        ((ArrayList) term254).add("aJlieCFVtF");
        ((ArrayList) term254).add("ZiaGIbnzTs");
        term205 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term205, term205.getClass(), "traitId", "RMFIsYGgne");
        setField(term205, term205.getClass(), "traitName", "NRdvgJlhkX");
        setField(term205, term205.getClass(), "description", "uuaPigETmJ");
        setField(term205, term205.getClass(), "group", "MxlszYVzRf");
        setField(term205, term205.getClass(), "conflictsWithIds", term254);
        setByteField(term205, term205.getClass(), "traitPoints", (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Object[] args = new Object[1];
        args[0] = term205;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


