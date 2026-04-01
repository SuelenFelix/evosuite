package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EdgeSet1_init_7828084862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183369;

    public EdgeSet1_init_7828084862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183369 = (Object[]) newArray("[I", 9);
        int[] term183370 = (int[]) newIntArray(5);
        int[] term183376 = (int[]) newIntArray(6);
        int[] term183383 = (int[]) newIntArray(8);
        int[] term183392 = (int[]) newIntArray(2);
        int[] term183395 = (int[]) newIntArray(8);
        int[] term183404 = (int[]) newIntArray(5);
        int[] term183410 = (int[]) newIntArray(7);
        int[] term183418 = (int[]) newIntArray(3);
        int[] term183422 = (int[]) newIntArray(6);
        setIntElement(term183370, 0, -2052569647);
        setIntElement(term183370, 1, 865516052);
        setIntElement(term183370, 2, -261030972);
        setIntElement(term183370, 3, 646988271);
        setIntElement(term183370, 4, -898576615);
        setElement(term183369, 0, term183370);
        setIntElement(term183376, 0, -2025868645);
        setIntElement(term183376, 1, -1919151038);
        setIntElement(term183376, 2, 664157054);
        setIntElement(term183376, 3, -11823425);
        setIntElement(term183376, 4, 1249263542);
        setIntElement(term183376, 5, -1922895515);
        setElement(term183369, 1, term183376);
        setIntElement(term183383, 0, 208602729);
        setIntElement(term183383, 1, 1019849222);
        setIntElement(term183383, 2, -940103763);
        setIntElement(term183383, 3, 358092864);
        setIntElement(term183383, 4, -513782223);
        setIntElement(term183383, 5, -1178691471);
        setIntElement(term183383, 6, -679590382);
        setIntElement(term183383, 7, 115599145);
        setElement(term183369, 2, term183383);
        setIntElement(term183392, 0, 1178356602);
        setIntElement(term183392, 1, -709505386);
        setElement(term183369, 3, term183392);
        setIntElement(term183395, 0, 1422438402);
        setIntElement(term183395, 1, -25989457);
        setIntElement(term183395, 2, -1121104916);
        setIntElement(term183395, 3, 2145536567);
        setIntElement(term183395, 4, -1445046101);
        setIntElement(term183395, 5, -2142124597);
        setIntElement(term183395, 6, -992521125);
        setIntElement(term183395, 7, 1078786962);
        setElement(term183369, 4, term183395);
        setIntElement(term183404, 0, -189597169);
        setIntElement(term183404, 1, 469460308);
        setIntElement(term183404, 2, -1443938009);
        setIntElement(term183404, 3, -797480969);
        setIntElement(term183404, 4, 1525040647);
        setElement(term183369, 5, term183404);
        setIntElement(term183410, 0, 1756141240);
        setIntElement(term183410, 1, -1804007196);
        setIntElement(term183410, 2, 1441620379);
        setIntElement(term183410, 3, 879207305);
        setIntElement(term183410, 4, -1143725592);
        setIntElement(term183410, 5, 869598524);
        setIntElement(term183410, 6, 2107238572);
        setElement(term183369, 6, term183410);
        setIntElement(term183418, 0, -951976915);
        setIntElement(term183418, 1, 657352340);
        setIntElement(term183418, 2, -1663146476);
        setElement(term183369, 7, term183418);
        setIntElement(term183422, 0, -949974619);
        setIntElement(term183422, 1, 270032364);
        setIntElement(term183422, 2, -404990824);
        setIntElement(term183422, 3, -589614355);
        setIntElement(term183422, 4, -1212298014);
        setIntElement(term183422, 5, 1009022251);
        setElement(term183369, 8, term183422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeSet1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term183369;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


