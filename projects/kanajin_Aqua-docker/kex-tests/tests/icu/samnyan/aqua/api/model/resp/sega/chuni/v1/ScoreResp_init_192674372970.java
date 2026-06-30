package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class ScoreResp_init_192674372970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58705;
     Object term58707;
     Object term58709;
     Object term58711;
     Object term58713;
     Object term58715;
     Object term58717;
     Object term58719;
     Object term58721;
     Object term58723;
     Object term58725;
     Object term58727;
     Object term58729;
     Object term58731;
     Object term58733;

    public ScoreResp_init_192674372970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58705 = new Integer(0);
        term58707 = new Integer(0);
        term58709 = new Integer(0);
        term58711 = new Integer(0);
        term58713 = new Integer(0);
        term58715 = new Integer(0);
        term58717 = new Integer(0);
        term58719 = new Integer(0);
        term58721 = new Integer(0);
        term58723 = new Boolean(false);
        term58725 = new Boolean(false);
        term58727 = new Boolean(false);
        term58729 = new Integer(0);
        term58731 = new Integer(0);
        term58733 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[15];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = boolean.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        Object[] args = new Object[15];
        args[0] = term58705;
        args[1] = term58707;
        args[2] = term58709;
        args[3] = term58711;
        args[4] = term58713;
        args[5] = term58715;
        args[6] = term58717;
        args[7] = term58719;
        args[8] = term58721;
        args[9] = term58723;
        args[10] = term58725;
        args[11] = term58727;
        args[12] = term58729;
        args[13] = term58731;
        args[14] = term58733;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


