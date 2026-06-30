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

public class CardProcedureResponse_init_16287120561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum8;

    public CardProcedureResponse_init_16287120561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term2763 = ((Class) term2764).getDeclaredField((String) "SUCCESS");
        ((Field) term2763).setAccessible(true);
        enum8 = ((Field) term2763).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[4];
        args[0] = "hNxWaHcfhY";
        args[1] = "RkybSrpybU";
        args[2] = "xOEqzGAmDU";
        args[3] = enum8;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


