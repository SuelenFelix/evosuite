package org.openRealmOfStars.game.tutorial;

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
import static org.openRealmOfStars.game.tutorial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class TutorialList_add_15592326411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term6;

    public TutorialList_add_15592326411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        term1 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.TutorialList"));
        setField(term1, term1.getClass(), "list", term2);
        term6 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.HelpLine"));
        setIntField(term6, term6.getClass(), "index", 568599855);
        setField(term6, term6.getClass(), "category", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "title", "sjlJAEtRrb");
        setField(term6, term6.getClass(), "text", "MuLcgQHgqz");
        setBooleanField(term6, term6.getClass(), "shown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.TutorialList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.tutorial.HelpLine");
        Object[] args = new Object[1];
        args[0] = term6;
        callMethod(klass, "add", argTypes, term1, args);
    }

};


