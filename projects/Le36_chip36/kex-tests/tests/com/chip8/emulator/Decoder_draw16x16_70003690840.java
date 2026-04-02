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
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.lang.Byte;

public class Decoder_draw16x16_70003690840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1635308;
     Object term1655703;
     Object term1655705;

    public Decoder_draw16x16_70003690840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term1645368 = new ArrayDeque();
        ArrayDeque term1655433 = new ArrayDeque();
        HashMap term1655439 = new HashMap();
        term1635308 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term1635309 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term1635310 = (byte[]) newByteArray(16);
        byte[] term1635327 = (byte[]) newByteArray(16);
        byte[] term1635344 = (byte[]) newByteArray(16);
        byte[] term1635364 = (byte[]) newByteArray(65535);
        Object term1645372 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term1645374 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term1645375 = (byte[]) newByteArray(16);
        byte[] term1645392 = (byte[]) newByteArray(16);
        byte[] term1645409 = (byte[]) newByteArray(16);
        byte[] term1645429 = (byte[]) newByteArray(65535);
        Object term1655438 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term1655444 = (Object[]) newArray("[[Z", 0);
        Object[] term1655449 = (Object[]) newArray("[Z", 1);
        boolean[] term1655450 = (boolean[]) newBooleanArray(4);
        Object term1655460 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term1655461 = (boolean[]) newBooleanArray(16);
        Object[] term1655478 = (Object[]) newArray("java.lang.String", 16);
        Object term1655539 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term1655639 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term1635309, term1635309.getClass(), "v", term1635310);
        setField(term1635309, term1635309.getClass(), "rpl", term1635327);
        setByteElement(term1635344, 3, (byte) 32);
        setByteElement(term1635344, 4, (byte) 64);
        setByteElement(term1635344, 5, (byte) 32);
        setByteElement(term1635344, 7, (byte) 32);
        setByteElement(term1635344, 8, (byte) 64);
        setByteElement(term1635344, 9, (byte) 32);
        setByteElement(term1635344, 11, (byte) 32);
        setByteElement(term1635344, 12, (byte) 64);
        setByteElement(term1635344, 13, (byte) 32);
        setField(term1635309, term1635309.getClass(), "audio", term1635344);
        setShortField(term1635309, term1635309.getClass(), "pitch", (short) 64);
        setShortField(term1635309, term1635309.getClass(), "i", (short) 31905);
        setShortField(term1635309, term1635309.getClass(), "pc", (short) 512);
        setField(term1635309, term1635309.getClass(), "ram", term1635364);
        setByteField(term1635309, term1635309.getClass(), "delayTimer", (byte) -2);
        setByteField(term1635309, term1635309.getClass(), "soundTimer", (byte) 103);
        setField(term1635309, term1635309.getClass(), "stack", term1645368);
        setField(term1635308, term1635308.getClass(), "m", term1635309);
        setShortField(term1645372, term1645372.getClass(), "opcode", (short) 15866);
        setField(term1645374, term1645374.getClass(), "v", term1645375);
        setField(term1645374, term1645374.getClass(), "rpl", term1645392);
        setByteElement(term1645409, 3, (byte) 32);
        setByteElement(term1645409, 4, (byte) 64);
        setByteElement(term1645409, 5, (byte) 32);
        setByteElement(term1645409, 7, (byte) 32);
        setByteElement(term1645409, 8, (byte) 64);
        setByteElement(term1645409, 9, (byte) 32);
        setByteElement(term1645409, 11, (byte) 32);
        setByteElement(term1645409, 12, (byte) 64);
        setByteElement(term1645409, 13, (byte) 32);
        setField(term1645374, term1645374.getClass(), "audio", term1645409);
        setShortField(term1645374, term1645374.getClass(), "pitch", (short) 64);
        setShortField(term1645374, term1645374.getClass(), "i", (short) 12339);
        setShortField(term1645374, term1645374.getClass(), "pc", (short) 512);
        setField(term1645374, term1645374.getClass(), "ram", term1645429);
        setByteField(term1645374, term1645374.getClass(), "delayTimer", (byte) 23);
        setByteField(term1645374, term1645374.getClass(), "soundTimer", (byte) 96);
        setField(term1645374, term1645374.getClass(), "stack", term1655433);
        setField(term1645372, term1645372.getClass(), "m", term1645374);
        setLongField(term1645372, term1645372.getClass(), "currentTime", 4178434741742309755L);
        setField(term1635308, term1635308.getClass(), "fetcher", term1645372);
        setField(term1655438, term1655438.getClass(), "fadeMap", term1655439);
        setField(term1655438, term1655438.getClass(), "display", term1655444);
        setIntField(term1655438, term1655438.getClass(), "x", 229204365);
        setIntField(term1655438, term1655438.getClass(), "y", -461771056);
        setBooleanField(term1655438, term1655438.getClass(), "fade", false);
        setDoubleField(term1655438, term1655438.getClass(), "fadeSpeed", 0.3074693824288357);
        setBooleanElement(term1655450, 1, true);
        setBooleanElement(term1655450, 2, true);
        setElement(term1655449, 0, term1655450);
        setField(term1655438, term1655438.getClass(), "spriteViewer", term1655449);
        setIntField(term1655438, term1655438.getClass(), "spriteHeight", -243422082);
        setBooleanField(term1655438, term1655438.getClass(), "resolutionMode", false);
        setIntField(term1655438, term1655438.getClass(), "currentPlane", 1384592638);
        setBooleanField(term1655438, term1655438.getClass(), "xoMode", true);
        setField(term1635308, term1635308.getClass(), "pixels", term1655438);
        setShortField(term1635308, term1635308.getClass(), "opcode", (short) 5754);
        setField(term1655460, term1655460.getClass(), "keys", term1655461);
        setElement(term1655478, 0, "1");
        setElement(term1655478, 1, "2");
        setElement(term1655478, 2, "3");
        setElement(term1655478, 3, "4");
        setElement(term1655478, 4, "Q");
        setElement(term1655478, 5, "W");
        setElement(term1655478, 6, "E");
        setElement(term1655478, 7, "R");
        setElement(term1655478, 8, "A");
        setElement(term1655478, 9, "S");
        setElement(term1655478, 10, "D");
        setElement(term1655478, 11, "F");
        setElement(term1655478, 12, "Z");
        setElement(term1655478, 13, "X");
        setElement(term1655478, 14, "C");
        setElement(term1655478, 15, "V");
        setField(term1655460, term1655460.getClass(), "binds", term1655478);
        setField(term1635308, term1635308.getClass(), "keys", term1655460);
        setField(term1635308, term1635308.getClass(), "detailed", "iiHBhsNFgk");
        setShortField(term1655539, term1655539.getClass(), "opcode", (short) 24660);
        setField(term1655539, term1655539.getClass(), "x", "HknsTajwxJ");
        setField(term1655539, term1655539.getClass(), "y", "XtiurrVYKw");
        setField(term1655539, term1655539.getClass(), "nnn", "rsumfoDNHa");
        setField(term1655539, term1655539.getClass(), "nn", "ceCWHUTQUM");
        setField(term1655539, term1655539.getClass(), "n", "LrqwfrKKtS");
        setField(term1655539, term1655539.getClass(), "iBefore", "ZUdnQXfzCI");
        setField(term1655539, term1655539.getClass(), "i", "EULDrUNQvw");
        setField(term1655539, term1655539.getClass(), "pc", "BtvAvsJSei");
        setBooleanField(term1655539, term1655539.getClass(), "state", false);
        setBooleanField(term1655539, term1655539.getClass(), "resolutionMode", false);
        setField(term1635308, term1635308.getClass(), "d", term1655539);
        setBooleanField(term1655639, term1655639.getClass(), "printToConsole", true);
        setBooleanField(term1655639, term1655639.getClass(), "disableUiUpdates", false);
        setField(term1655639, term1655639.getClass(), "printSymbol", "#");
        setBooleanField(term1655639, term1655639.getClass(), "spriteExtracting", false);
        setBooleanField(term1655639, term1655639.getClass(), "roundPixels", false);
        setBooleanField(term1655639, term1655639.getClass(), "blur", true);
        setBooleanField(term1655639, term1655639.getClass(), "glow", true);
        setDoubleField(term1655639, term1655639.getClass(), "blurValue", 0.1245258965512791);
        setDoubleField(term1655639, term1655639.getClass(), "glowValue", 0.9511861072660375);
        setField(term1655639, term1655639.getClass(), "bgColor", "vqnBkkxoIa");
        setField(term1655639, term1655639.getClass(), "spriteColor", "bycpZjxXFn");
        setField(term1655639, term1655639.getClass(), "planeColor", "jQWttOAiwL");
        setField(term1655639, term1655639.getClass(), "bothColor", "DzKFxEuEEC");
        setBooleanField(term1655639, term1655639.getClass(), "quirkShift", true);
        setBooleanField(term1655639, term1655639.getClass(), "quirkJump", false);
        setBooleanField(term1655639, term1655639.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term1655639, term1655639.getClass(), "quirkOrder", true);
        setField(term1635308, term1635308.getClass(), "c", term1655639);
        term1655703 = new Byte((byte) -70);
        term1655705 = new Byte((byte) -73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term1655703;
        args[1] = term1655705;
        callMethod(klass, "draw16x16", argTypes, term1635308, args);
    }

};


