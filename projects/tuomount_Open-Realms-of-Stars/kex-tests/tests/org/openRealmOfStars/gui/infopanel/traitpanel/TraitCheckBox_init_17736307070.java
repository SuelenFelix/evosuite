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

public class TraitCheckBox_init_17736307070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TraitCheckBox_init_17736307070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term50 = new ArrayList();
        ((ArrayList) term50).add("jJCZpVmanW");
        ((ArrayList) term50).add("EGtDIRbSSb");
        ((ArrayList) term50).add("SzjVpOQTyS");
        ((ArrayList) term50).add("MjGYSRKTNF");
        ((ArrayList) term50).add("hRNSzYYIrc");
        term1 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term1, term1.getClass(), "traitId", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "traitName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "description", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "group", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "conflictsWithIds", term50);
        setByteField(term1, term1.getClass(), "traitPoints", (byte) 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


