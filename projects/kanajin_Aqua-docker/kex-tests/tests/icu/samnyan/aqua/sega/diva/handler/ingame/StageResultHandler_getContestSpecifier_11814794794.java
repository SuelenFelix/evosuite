package icu.samnyan.aqua.sega.diva.handler.ingame;

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
import static icu.samnyan.aqua.sega.diva.handler.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class StageResultHandler_getContestSpecifier_11814794794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7102;

    public StageResultHandler_getContestSpecifier_11814794794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7105 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress"));
        setIntField(term7105, term7105.getClass(), "pvId", -1281083262);
        setIntField(term7105, term7105.getClass(), "hardness", 1059930704);
        setIntField(term7105, term7105.getClass(), "edition", -1967153290);
        setIntField(term7105, term7105.getClass(), "stars", -1397251956);
        setIntField(term7105, term7105.getClass(), "scores", -796934571);
        setIntField(term7105, term7105.getClass(), "version", 405295896);
        term7102 = new LinkedList();
        ((LinkedList) term7102).add(term7105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.StageResultHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7102;
        callMethod(klass, "getContestSpecifier", argTypes, null, args);
    }

};


