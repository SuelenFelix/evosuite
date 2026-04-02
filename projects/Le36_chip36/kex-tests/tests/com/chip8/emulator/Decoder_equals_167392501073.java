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

public class Decoder_equals_167392501073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3025473;
     Object term3045873;

    public Decoder_equals_167392501073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term3035533 = new ArrayDeque();
        ArrayDeque term3045598 = new ArrayDeque();
        HashMap term3045604 = new HashMap();
        term3025473 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term3025474 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term3025475 = (byte[]) newByteArray(16);
        byte[] term3025492 = (byte[]) newByteArray(16);
        byte[] term3025509 = (byte[]) newByteArray(16);
        byte[] term3025529 = (byte[]) newByteArray(65535);
        Object term3035537 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term3035539 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term3035540 = (byte[]) newByteArray(16);
        byte[] term3035557 = (byte[]) newByteArray(16);
        byte[] term3035574 = (byte[]) newByteArray(16);
        byte[] term3035594 = (byte[]) newByteArray(65535);
        Object term3045603 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term3045609 = (Object[]) newArray("[[Z", 0);
        Object[] term3045614 = (Object[]) newArray("[Z", 5);
        boolean[] term3045615 = (boolean[]) newBooleanArray(2);
        boolean[] term3045618 = (boolean[]) newBooleanArray(0);
        boolean[] term3045619 = (boolean[]) newBooleanArray(0);
        boolean[] term3045620 = (boolean[]) newBooleanArray(3);
        boolean[] term3045624 = (boolean[]) newBooleanArray(0);
        Object term3045630 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term3045631 = (boolean[]) newBooleanArray(16);
        Object[] term3045648 = (Object[]) newArray("java.lang.String", 16);
        Object term3045709 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term3045809 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term3025474, term3025474.getClass(), "v", term3025475);
        setField(term3025474, term3025474.getClass(), "rpl", term3025492);
        setByteElement(term3025509, 3, (byte) 32);
        setByteElement(term3025509, 4, (byte) 64);
        setByteElement(term3025509, 5, (byte) 32);
        setByteElement(term3025509, 7, (byte) 32);
        setByteElement(term3025509, 8, (byte) 64);
        setByteElement(term3025509, 9, (byte) 32);
        setByteElement(term3025509, 11, (byte) 32);
        setByteElement(term3025509, 12, (byte) 64);
        setByteElement(term3025509, 13, (byte) 32);
        setField(term3025474, term3025474.getClass(), "audio", term3025509);
        setShortField(term3025474, term3025474.getClass(), "pitch", (short) 64);
        setShortField(term3025474, term3025474.getClass(), "i", (short) 14307);
        setShortField(term3025474, term3025474.getClass(), "pc", (short) 512);
        setField(term3025474, term3025474.getClass(), "ram", term3025529);
        setByteField(term3025474, term3025474.getClass(), "delayTimer", (byte) -96);
        setByteField(term3025474, term3025474.getClass(), "soundTimer", (byte) -88);
        setField(term3025474, term3025474.getClass(), "stack", term3035533);
        setField(term3025473, term3025473.getClass(), "m", term3025474);
        setShortField(term3035537, term3035537.getClass(), "opcode", (short) 30841);
        setField(term3035539, term3035539.getClass(), "v", term3035540);
        setField(term3035539, term3035539.getClass(), "rpl", term3035557);
        setByteElement(term3035574, 3, (byte) 32);
        setByteElement(term3035574, 4, (byte) 64);
        setByteElement(term3035574, 5, (byte) 32);
        setByteElement(term3035574, 7, (byte) 32);
        setByteElement(term3035574, 8, (byte) 64);
        setByteElement(term3035574, 9, (byte) 32);
        setByteElement(term3035574, 11, (byte) 32);
        setByteElement(term3035574, 12, (byte) 64);
        setByteElement(term3035574, 13, (byte) 32);
        setField(term3035539, term3035539.getClass(), "audio", term3035574);
        setShortField(term3035539, term3035539.getClass(), "pitch", (short) 64);
        setShortField(term3035539, term3035539.getClass(), "i", (short) -2577);
        setShortField(term3035539, term3035539.getClass(), "pc", (short) 512);
        setField(term3035539, term3035539.getClass(), "ram", term3035594);
        setByteField(term3035539, term3035539.getClass(), "delayTimer", (byte) -73);
        setByteField(term3035539, term3035539.getClass(), "soundTimer", (byte) 105);
        setField(term3035539, term3035539.getClass(), "stack", term3045598);
        setField(term3035537, term3035537.getClass(), "m", term3035539);
        setLongField(term3035537, term3035537.getClass(), "currentTime", 682356318767179819L);
        setField(term3025473, term3025473.getClass(), "fetcher", term3035537);
        setField(term3045603, term3045603.getClass(), "fadeMap", term3045604);
        setField(term3045603, term3045603.getClass(), "display", term3045609);
        setIntField(term3045603, term3045603.getClass(), "x", 574481092);
        setIntField(term3045603, term3045603.getClass(), "y", -310528004);
        setBooleanField(term3045603, term3045603.getClass(), "fade", true);
        setDoubleField(term3045603, term3045603.getClass(), "fadeSpeed", 0.9013029318694921);
        setBooleanElement(term3045615, 1, true);
        setElement(term3045614, 0, term3045615);
        setElement(term3045614, 1, term3045618);
        setElement(term3045614, 2, term3045619);
        setBooleanElement(term3045620, 2, true);
        setElement(term3045614, 3, term3045620);
        setElement(term3045614, 4, term3045624);
        setField(term3045603, term3045603.getClass(), "spriteViewer", term3045614);
        setIntField(term3045603, term3045603.getClass(), "spriteHeight", -634976996);
        setBooleanField(term3045603, term3045603.getClass(), "resolutionMode", false);
        setIntField(term3045603, term3045603.getClass(), "currentPlane", -1015274146);
        setBooleanField(term3045603, term3045603.getClass(), "xoMode", false);
        setField(term3025473, term3025473.getClass(), "pixels", term3045603);
        setShortField(term3025473, term3025473.getClass(), "opcode", (short) 9861);
        setField(term3045630, term3045630.getClass(), "keys", term3045631);
        setElement(term3045648, 0, "1");
        setElement(term3045648, 1, "2");
        setElement(term3045648, 2, "3");
        setElement(term3045648, 3, "4");
        setElement(term3045648, 4, "Q");
        setElement(term3045648, 5, "W");
        setElement(term3045648, 6, "E");
        setElement(term3045648, 7, "R");
        setElement(term3045648, 8, "A");
        setElement(term3045648, 9, "S");
        setElement(term3045648, 10, "D");
        setElement(term3045648, 11, "F");
        setElement(term3045648, 12, "Z");
        setElement(term3045648, 13, "X");
        setElement(term3045648, 14, "C");
        setElement(term3045648, 15, "V");
        setField(term3045630, term3045630.getClass(), "binds", term3045648);
        setField(term3025473, term3025473.getClass(), "keys", term3045630);
        setField(term3025473, term3025473.getClass(), "detailed", "TbiwoiebNe");
        setShortField(term3045709, term3045709.getClass(), "opcode", (short) -30284);
        setField(term3045709, term3045709.getClass(), "x", "laTITSWZuc");
        setField(term3045709, term3045709.getClass(), "y", "fkzRpxlAqS");
        setField(term3045709, term3045709.getClass(), "nnn", "VYvbTGKslj");
        setField(term3045709, term3045709.getClass(), "nn", "owLqDDnwZA");
        setField(term3045709, term3045709.getClass(), "n", "eBcTbweeYp");
        setField(term3045709, term3045709.getClass(), "iBefore", "drcmjfQUDq");
        setField(term3045709, term3045709.getClass(), "i", "GjdWUoUSyA");
        setField(term3045709, term3045709.getClass(), "pc", "YEkxWsWaUl");
        setBooleanField(term3045709, term3045709.getClass(), "state", true);
        setBooleanField(term3045709, term3045709.getClass(), "resolutionMode", true);
        setField(term3025473, term3025473.getClass(), "d", term3045709);
        setBooleanField(term3045809, term3045809.getClass(), "printToConsole", false);
        setBooleanField(term3045809, term3045809.getClass(), "disableUiUpdates", false);
        setField(term3045809, term3045809.getClass(), "printSymbol", "#");
        setBooleanField(term3045809, term3045809.getClass(), "spriteExtracting", true);
        setBooleanField(term3045809, term3045809.getClass(), "roundPixels", true);
        setBooleanField(term3045809, term3045809.getClass(), "blur", true);
        setBooleanField(term3045809, term3045809.getClass(), "glow", true);
        setDoubleField(term3045809, term3045809.getClass(), "blurValue", 0.1755673139619638);
        setDoubleField(term3045809, term3045809.getClass(), "glowValue", 0.9136597256674437);
        setField(term3045809, term3045809.getClass(), "bgColor", "RINhPkhhct");
        setField(term3045809, term3045809.getClass(), "spriteColor", "vjNPcTSqmS");
        setField(term3045809, term3045809.getClass(), "planeColor", "fFhdWuJbdC");
        setField(term3045809, term3045809.getClass(), "bothColor", "JlgLIHPabR");
        setBooleanField(term3045809, term3045809.getClass(), "quirkShift", true);
        setBooleanField(term3045809, term3045809.getClass(), "quirkJump", false);
        setBooleanField(term3045809, term3045809.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term3045809, term3045809.getClass(), "quirkOrder", true);
        setField(term3025473, term3025473.getClass(), "c", term3045809);
        term3045873 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3045873;
        callMethod(klass, "equals", argTypes, term3025473, args);
    }

};


