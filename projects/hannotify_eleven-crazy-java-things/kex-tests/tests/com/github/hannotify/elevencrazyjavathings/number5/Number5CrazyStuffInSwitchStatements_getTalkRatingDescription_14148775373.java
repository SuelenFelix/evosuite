package com.github.hannotify.elevencrazyjavathings.number5;

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
import static com.github.hannotify.elevencrazyjavathings.number5.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class Number5CrazyStuffInSwitchStatements_getTalkRatingDescription_14148775373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;

    public Number5CrazyStuffInSwitchStatements_getTalkRatingDescription_14148775373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number5.Number5CrazyStuffInSwitchStatements"));
        term4 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.hannotify.elevencrazyjavathings.number5.Number5CrazyStuffInSwitchStatements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "getTalkRatingDescription", argTypes, term3, args);
    }

};


