package com.chip8.emulator;

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
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class Executer_init_970992490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189227;
     Object term3189292;
     Object term3189359;

    public Executer_init_970992490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3189228 = new HashMap();
        term3189227 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term3189233 = (Object[]) newArray("[[Z", 3);
        Object[] term3189234 = (Object[]) newArray("[Z", 1);
        boolean[] term3189235 = (boolean[]) newBooleanArray(8);
        Object[] term3189244 = (Object[]) newArray("[Z", 0);
        Object[] term3189245 = (Object[]) newArray("[Z", 0);
        Object[] term3189250 = (Object[]) newArray("[Z", 6);
        boolean[] term3189251 = (boolean[]) newBooleanArray(2);
        boolean[] term3189254 = (boolean[]) newBooleanArray(5);
        boolean[] term3189260 = (boolean[]) newBooleanArray(7);
        boolean[] term3189268 = (boolean[]) newBooleanArray(5);
        boolean[] term3189274 = (boolean[]) newBooleanArray(8);
        boolean[] term3189283 = (boolean[]) newBooleanArray(4);
        setField(term3189227, term3189227.getClass(), "fadeMap", term3189228);
        setBooleanElement(term3189235, 2, true);
        setBooleanElement(term3189235, 3, true);
        setBooleanElement(term3189235, 5, true);
        setBooleanElement(term3189235, 6, true);
        setElement(term3189234, 0, term3189235);
        setElement(term3189233, 0, term3189234);
        setElement(term3189233, 1, term3189244);
        setElement(term3189233, 2, term3189245);
        setField(term3189227, term3189227.getClass(), "display", term3189233);
        setIntField(term3189227, term3189227.getClass(), "x", 1466373988);
        setIntField(term3189227, term3189227.getClass(), "y", -358526505);
        setBooleanField(term3189227, term3189227.getClass(), "fade", false);
        setDoubleField(term3189227, term3189227.getClass(), "fadeSpeed", 0.5195852993308188);
        setBooleanElement(term3189251, 0, true);
        setElement(term3189250, 0, term3189251);
        setBooleanElement(term3189254, 3, true);
        setElement(term3189250, 1, term3189254);
        setBooleanElement(term3189260, 1, true);
        setBooleanElement(term3189260, 3, true);
        setElement(term3189250, 2, term3189260);
        setBooleanElement(term3189268, 1, true);
        setBooleanElement(term3189268, 2, true);
        setBooleanElement(term3189268, 4, true);
        setElement(term3189250, 3, term3189268);
        setBooleanElement(term3189274, 0, true);
        setBooleanElement(term3189274, 1, true);
        setBooleanElement(term3189274, 2, true);
        setBooleanElement(term3189274, 3, true);
        setBooleanElement(term3189274, 4, true);
        setBooleanElement(term3189274, 7, true);
        setElement(term3189250, 4, term3189274);
        setBooleanElement(term3189283, 3, true);
        setElement(term3189250, 5, term3189283);
        setField(term3189227, term3189227.getClass(), "spriteViewer", term3189250);
        setIntField(term3189227, term3189227.getClass(), "spriteHeight", 1843268026);
        setBooleanField(term3189227, term3189227.getClass(), "resolutionMode", true);
        setIntField(term3189227, term3189227.getClass(), "currentPlane", 954660603);
        setBooleanField(term3189227, term3189227.getClass(), "xoMode", true);
        term3189292 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term3189293 = (boolean[]) newBooleanArray(16);
        Object[] term3189310 = (Object[]) newArray("java.lang.String", 16);
        setField(term3189292, term3189292.getClass(), "keys", term3189293);
        setElement(term3189310, 0, "1");
        setElement(term3189310, 1, "2");
        setElement(term3189310, 2, "3");
        setElement(term3189310, 3, "4");
        setElement(term3189310, 4, "Q");
        setElement(term3189310, 5, "W");
        setElement(term3189310, 6, "E");
        setElement(term3189310, 7, "R");
        setElement(term3189310, 8, "A");
        setElement(term3189310, 9, "S");
        setElement(term3189310, 10, "D");
        setElement(term3189310, 11, "F");
        setElement(term3189310, 12, "Z");
        setElement(term3189310, 13, "X");
        setElement(term3189310, 14, "C");
        setElement(term3189310, 15, "V");
        setField(term3189292, term3189292.getClass(), "binds", term3189310);
        term3189359 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term3189359, term3189359.getClass(), "printToConsole", false);
        setBooleanField(term3189359, term3189359.getClass(), "disableUiUpdates", true);
        setField(term3189359, term3189359.getClass(), "printSymbol", "#");
        setBooleanField(term3189359, term3189359.getClass(), "spriteExtracting", false);
        setBooleanField(term3189359, term3189359.getClass(), "roundPixels", false);
        setBooleanField(term3189359, term3189359.getClass(), "blur", true);
        setBooleanField(term3189359, term3189359.getClass(), "glow", false);
        setDoubleField(term3189359, term3189359.getClass(), "blurValue", 0.6533293939565151);
        setDoubleField(term3189359, term3189359.getClass(), "glowValue", 0.7361083671494018);
        setField(term3189359, term3189359.getClass(), "bgColor", "olYpqbolWL");
        setField(term3189359, term3189359.getClass(), "spriteColor", "MCMCjxXzjw");
        setField(term3189359, term3189359.getClass(), "planeColor", "pZbbwCURge");
        setField(term3189359, term3189359.getClass(), "bothColor", "RsOfgdMCMv");
        setBooleanField(term3189359, term3189359.getClass(), "quirkShift", true);
        setBooleanField(term3189359, term3189359.getClass(), "quirkJump", true);
        setBooleanField(term3189359, term3189359.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term3189359, term3189359.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Executer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.chip8.emulator.PixelManager");
        argTypes[2] = Class.forName("com.chip8.emulator.Keys");
        argTypes[3] = Class.forName("com.chip8.configs.Configs");
        Object[] args = new Object[4];
        args[0] = "lMUBBGRjfY";
        args[1] = term3189227;
        args[2] = term3189292;
        args[3] = term3189359;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


