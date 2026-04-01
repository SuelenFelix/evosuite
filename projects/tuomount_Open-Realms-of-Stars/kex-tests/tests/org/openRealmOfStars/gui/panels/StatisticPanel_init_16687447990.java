package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StatisticPanel_init_16687447990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216483;

    public StatisticPanel_init_16687447990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216483 = (Object[]) newArray("java.awt.Color", 8);
        Object term216484 = newInstance(Class.forName("java.awt.Color"));
        float[] term216486 = (float[]) newFloatArray(6);
        float[] term216493 = (float[]) newFloatArray(6);
        Object term216501 = newInstance(Class.forName("java.awt.Color"));
        float[] term216503 = (float[]) newFloatArray(6);
        float[] term216510 = (float[]) newFloatArray(8);
        Object term216520 = newInstance(Class.forName("java.awt.Color"));
        float[] term216522 = (float[]) newFloatArray(3);
        float[] term216526 = (float[]) newFloatArray(5);
        Object term216533 = newInstance(Class.forName("java.awt.Color"));
        float[] term216535 = (float[]) newFloatArray(4);
        float[] term216540 = (float[]) newFloatArray(8);
        Object term216550 = newInstance(Class.forName("java.awt.Color"));
        float[] term216552 = (float[]) newFloatArray(9);
        float[] term216562 = (float[]) newFloatArray(4);
        Object term216568 = newInstance(Class.forName("java.awt.Color"));
        float[] term216570 = (float[]) newFloatArray(7);
        float[] term216578 = (float[]) newFloatArray(3);
        Object term216583 = newInstance(Class.forName("java.awt.Color"));
        float[] term216585 = (float[]) newFloatArray(1);
        float[] term216587 = (float[]) newFloatArray(6);
        Object term216595 = newInstance(Class.forName("java.awt.Color"));
        float[] term216597 = (float[]) newFloatArray(6);
        float[] term216604 = (float[]) newFloatArray(1);
        setIntField(term216484, term216484.getClass(), "value", -385542140);
        setFloatElement(term216486, 0, 0.8818646F);
        setFloatElement(term216486, 1, 0.5412182F);
        setFloatElement(term216486, 2, 0.5584653F);
        setFloatElement(term216486, 3, 0.16988689F);
        setFloatElement(term216486, 4, 0.026718378F);
        setFloatElement(term216486, 5, 0.39286935F);
        setField(term216484, term216484.getClass(), "frgbvalue", term216486);
        setFloatElement(term216493, 0, 0.13618106F);
        setFloatElement(term216493, 1, 0.11577946F);
        setFloatElement(term216493, 2, 0.55778444F);
        setFloatElement(term216493, 3, 0.5617009F);
        setFloatElement(term216493, 4, 0.6716574F);
        setFloatElement(term216493, 5, 0.090670586F);
        setField(term216484, term216484.getClass(), "fvalue", term216493);
        setFloatField(term216484, term216484.getClass(), "falpha", 0.54697996F);
        setField(term216484, term216484.getClass(), "cs", null);
        setElement(term216483, 0, term216484);
        setIntField(term216501, term216501.getClass(), "value", -1652323059);
        setFloatElement(term216503, 0, 0.268304F);
        setFloatElement(term216503, 1, 0.6116407F);
        setFloatElement(term216503, 2, 0.71719724F);
        setFloatElement(term216503, 3, 0.25674725F);
        setFloatElement(term216503, 4, 0.9006361F);
        setFloatElement(term216503, 5, 0.71533775F);
        setField(term216501, term216501.getClass(), "frgbvalue", term216503);
        setFloatElement(term216510, 0, 0.5644914F);
        setFloatElement(term216510, 1, 0.6949883F);
        setFloatElement(term216510, 2, 0.5098958F);
        setFloatElement(term216510, 3, 0.86701417F);
        setFloatElement(term216510, 4, 0.07417786F);
        setFloatElement(term216510, 5, 0.96144617F);
        setFloatElement(term216510, 6, 0.6862936F);
        setFloatElement(term216510, 7, 0.18780023F);
        setField(term216501, term216501.getClass(), "fvalue", term216510);
        setFloatField(term216501, term216501.getClass(), "falpha", 0.12764448F);
        setField(term216501, term216501.getClass(), "cs", null);
        setElement(term216483, 1, term216501);
        setIntField(term216520, term216520.getClass(), "value", -1928764789);
        setFloatElement(term216522, 0, 0.8254093F);
        setFloatElement(term216522, 1, 0.39446723F);
        setFloatElement(term216522, 2, 0.21836233F);
        setField(term216520, term216520.getClass(), "frgbvalue", term216522);
        setFloatElement(term216526, 0, 0.78659093F);
        setFloatElement(term216526, 1, 0.5037956F);
        setFloatElement(term216526, 2, 0.06587154F);
        setFloatElement(term216526, 3, 0.20511848F);
        setFloatElement(term216526, 4, 0.08659977F);
        setField(term216520, term216520.getClass(), "fvalue", term216526);
        setFloatField(term216520, term216520.getClass(), "falpha", 0.22873008F);
        setField(term216520, term216520.getClass(), "cs", null);
        setElement(term216483, 2, term216520);
        setIntField(term216533, term216533.getClass(), "value", -673697686);
        setFloatElement(term216535, 0, 0.96286476F);
        setFloatElement(term216535, 1, 0.9824895F);
        setFloatElement(term216535, 2, 0.62323177F);
        setFloatElement(term216535, 3, 0.59315026F);
        setField(term216533, term216533.getClass(), "frgbvalue", term216535);
        setFloatElement(term216540, 0, 0.09037483F);
        setFloatElement(term216540, 1, 0.39231926F);
        setFloatElement(term216540, 2, 0.6561919F);
        setFloatElement(term216540, 3, 0.2958501F);
        setFloatElement(term216540, 4, 0.73301786F);
        setFloatElement(term216540, 5, 0.7997349F);
        setFloatElement(term216540, 6, 0.76181644F);
        setFloatElement(term216540, 7, 0.24343538F);
        setField(term216533, term216533.getClass(), "fvalue", term216540);
        setFloatField(term216533, term216533.getClass(), "falpha", 0.7385589F);
        setField(term216533, term216533.getClass(), "cs", null);
        setElement(term216483, 3, term216533);
        setIntField(term216550, term216550.getClass(), "value", -757914190);
        setFloatElement(term216552, 0, 0.8736398F);
        setFloatElement(term216552, 1, 0.7080134F);
        setFloatElement(term216552, 2, 0.74126697F);
        setFloatElement(term216552, 3, 0.60597336F);
        setFloatElement(term216552, 4, 0.11164951F);
        setFloatElement(term216552, 5, 0.30746937F);
        setFloatElement(term216552, 6, 0.9695807F);
        setFloatElement(term216552, 7, 0.124525845F);
        setFloatElement(term216552, 8, 0.45613784F);
        setField(term216550, term216550.getClass(), "frgbvalue", term216552);
        setFloatElement(term216562, 0, 0.95118606F);
        setFloatElement(term216562, 1, 0.111205876F);
        setFloatElement(term216562, 2, 0.058807194F);
        setFloatElement(term216562, 3, 0.013315558F);
        setField(term216550, term216550.getClass(), "fvalue", term216562);
        setFloatField(term216550, term216550.getClass(), "falpha", 0.34010088F);
        setField(term216550, term216550.getClass(), "cs", null);
        setElement(term216483, 4, term216550);
        setIntField(term216568, term216568.getClass(), "value", 991323397);
        setFloatElement(term216570, 0, 0.40587604F);
        setFloatElement(term216570, 1, 0.19625396F);
        setFloatElement(term216570, 2, 0.234712F);
        setFloatElement(term216570, 3, 0.450692F);
        setFloatElement(term216570, 4, 0.35089302F);
        setFloatElement(term216570, 5, 0.9341364F);
        setFloatElement(term216570, 6, 0.7244789F);
        setField(term216568, term216568.getClass(), "frgbvalue", term216570);
        setFloatElement(term216578, 0, 0.9022041F);
        setFloatElement(term216578, 1, 0.06234348F);
        setFloatElement(term216578, 2, 0.6512871F);
        setField(term216568, term216568.getClass(), "fvalue", term216578);
        setFloatField(term216568, term216568.getClass(), "falpha", 0.011630058F);
        setField(term216568, term216568.getClass(), "cs", null);
        setElement(term216483, 5, term216568);
        setIntField(term216583, term216583.getClass(), "value", -791114332);
        setFloatElement(term216585, 0, 0.87770385F);
        setField(term216583, term216583.getClass(), "frgbvalue", term216585);
        setFloatElement(term216587, 0, 0.034274876F);
        setFloatElement(term216587, 1, 0.008025646F);
        setFloatElement(term216587, 2, 0.47933108F);
        setFloatElement(term216587, 3, 0.40598297F);
        setFloatElement(term216587, 4, 0.7799478F);
        setFloatElement(term216587, 5, 0.37100673F);
        setField(term216583, term216583.getClass(), "fvalue", term216587);
        setFloatField(term216583, term216583.getClass(), "falpha", 0.119950235F);
        setField(term216583, term216583.getClass(), "cs", null);
        setElement(term216483, 6, term216583);
        setIntField(term216595, term216595.getClass(), "value", 350325506);
        setFloatElement(term216597, 0, 0.78186196F);
        setFloatElement(term216597, 1, 0.9698374F);
        setFloatElement(term216597, 2, 0.04640019F);
        setFloatElement(term216597, 3, 0.7216883F);
        setFloatElement(term216597, 4, 0.9123573F);
        setFloatElement(term216597, 5, 0.07144344F);
        setField(term216595, term216595.getClass(), "frgbvalue", term216597);
        setFloatElement(term216604, 0, 0.4063537F);
        setField(term216595, term216595.getClass(), "fvalue", term216604);
        setFloatField(term216595, term216595.getClass(), "falpha", 0.46776146F);
        setField(term216595, term216595.getClass(), "cs", null);
        setElement(term216483, 7, term216595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.Color"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term216483;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


