package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class CardProcedureResponse_init_13016209540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;
     Object term2030;
     Object term2032;
     Object term2034;
     Object term2048;
     Object term2050;
     Object term2064;
     Object term2066;
     Object term2068;
     Object enum7;

    public CardProcedureResponse_init_13016209540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2110 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term2109 = ((Class) term2110).getDeclaredField((String) "SUCCESS");
        ((Field) term2109).setAccessible(true);
        enum6 = ((Field) term2109).get((Object) null);
        term2030 = new Integer(-1955890973);
        term2032 = new Integer(-2038273078);
        term2034 = new Integer(1227103734);
        term2048 = new Integer(568599855);
        term2050 = new Integer(1162663216);
        term2064 = new Integer(1484323161);
        term2066 = new Integer(391863371);
        term2068 = new Integer(-1922583790);
        Class<? extends Object> term2427 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term2426 = ((Class) term2427).getDeclaredField((String) "MISS");
        ((Field) term2426).setAccessible(true);
        enum7 = ((Field) term2426).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[15];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.Integer");
        argTypes[9] = Class.forName("java.lang.Integer");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.Integer");
        argTypes[12] = Class.forName("java.lang.Integer");
        argTypes[13] = Class.forName("java.lang.Integer");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Object[] args = new Object[15];
        args[0] = "aJlieCFVtF";
        args[1] = "ZiaGIbnzTs";
        args[2] = "tbcdzjIfER";
        args[3] = enum6;
        args[4] = term2030;
        args[5] = term2032;
        args[6] = term2034;
        args[7] = "HyxfbSQYBe";
        args[8] = term2048;
        args[9] = term2050;
        args[10] = "pCTimMblYc";
        args[11] = term2064;
        args[12] = term2066;
        args[13] = term2068;
        args[14] = enum7;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


