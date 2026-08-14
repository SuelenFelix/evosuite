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

public class Decoder_subtract_110759460428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1144866;

    public Decoder_subtract_110759460428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term1154926 = new ArrayDeque();
        ArrayDeque term1164991 = new ArrayDeque();
        HashMap term1164997 = new HashMap();
        term1144866 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term1144867 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term1144868 = (byte[]) newByteArray(16);
        byte[] term1144885 = (byte[]) newByteArray(16);
        byte[] term1144902 = (byte[]) newByteArray(16);
        byte[] term1144922 = (byte[]) newByteArray(65535);
        Object term1154930 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term1154932 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term1154933 = (byte[]) newByteArray(16);
        byte[] term1154950 = (byte[]) newByteArray(16);
        byte[] term1154967 = (byte[]) newByteArray(16);
        byte[] term1154987 = (byte[]) newByteArray(65535);
        Object term1164996 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term1165002 = (Object[]) newArray("[[Z", 0);
        Object[] term1165007 = (Object[]) newArray("[Z", 1);
        boolean[] term1165008 = (boolean[]) newBooleanArray(4);
        Object term1165018 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term1165019 = (boolean[]) newBooleanArray(16);
        Object[] term1165036 = (Object[]) newArray("java.lang.String", 16);
        Object term1165097 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term1165197 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term1144867, term1144867.getClass(), "v", term1144868);
        setField(term1144867, term1144867.getClass(), "rpl", term1144885);
        setByteElement(term1144902, 3, (byte) 32);
        setByteElement(term1144902, 4, (byte) 64);
        setByteElement(term1144902, 5, (byte) 32);
        setByteElement(term1144902, 7, (byte) 32);
        setByteElement(term1144902, 8, (byte) 64);
        setByteElement(term1144902, 9, (byte) 32);
        setByteElement(term1144902, 11, (byte) 32);
        setByteElement(term1144902, 12, (byte) 64);
        setByteElement(term1144902, 13, (byte) 32);
        setField(term1144867, term1144867.getClass(), "audio", term1144902);
        setShortField(term1144867, term1144867.getClass(), "pitch", (short) 64);
        setShortField(term1144867, term1144867.getClass(), "i", (short) 8827);
        setShortField(term1144867, term1144867.getClass(), "pc", (short) 512);
        setField(term1144867, term1144867.getClass(), "ram", term1144922);
        setByteField(term1144867, term1144867.getClass(), "delayTimer", (byte) 85);
        setByteField(term1144867, term1144867.getClass(), "soundTimer", (byte) -17);
        setField(term1144867, term1144867.getClass(), "stack", term1154926);
        setField(term1144866, term1144866.getClass(), "m", term1144867);
        setShortField(term1154930, term1154930.getClass(), "opcode", (short) -21744);
        setField(term1154932, term1154932.getClass(), "v", term1154933);
        setField(term1154932, term1154932.getClass(), "rpl", term1154950);
        setByteElement(term1154967, 3, (byte) 32);
        setByteElement(term1154967, 4, (byte) 64);
        setByteElement(term1154967, 5, (byte) 32);
        setByteElement(term1154967, 7, (byte) 32);
        setByteElement(term1154967, 8, (byte) 64);
        setByteElement(term1154967, 9, (byte) 32);
        setByteElement(term1154967, 11, (byte) 32);
        setByteElement(term1154967, 12, (byte) 64);
        setByteElement(term1154967, 13, (byte) 32);
        setField(term1154932, term1154932.getClass(), "audio", term1154967);
        setShortField(term1154932, term1154932.getClass(), "pitch", (short) 64);
        setShortField(term1154932, term1154932.getClass(), "i", (short) 23042);
        setShortField(term1154932, term1154932.getClass(), "pc", (short) 512);
        setField(term1154932, term1154932.getClass(), "ram", term1154987);
        setByteField(term1154932, term1154932.getClass(), "delayTimer", (byte) -83);
        setByteField(term1154932, term1154932.getClass(), "soundTimer", (byte) 48);
        setField(term1154932, term1154932.getClass(), "stack", term1164991);
        setField(term1154930, term1154930.getClass(), "m", term1154932);
        setLongField(term1154930, term1154930.getClass(), "currentTime", 1967728129628047933L);
        setField(term1144866, term1144866.getClass(), "fetcher", term1154930);
        setField(term1164996, term1164996.getClass(), "fadeMap", term1164997);
        setField(term1164996, term1164996.getClass(), "display", term1165002);
        setIntField(term1164996, term1164996.getClass(), "x", -1801760683);
        setIntField(term1164996, term1164996.getClass(), "y", 1141317871);
        setBooleanField(term1164996, term1164996.getClass(), "fade", true);
        setDoubleField(term1164996, term1164996.getClass(), "fadeSpeed", 0.53094494792755);
        setBooleanElement(term1165008, 0, true);
        setElement(term1165007, 0, term1165008);
        setField(term1164996, term1164996.getClass(), "spriteViewer", term1165007);
        setIntField(term1164996, term1164996.getClass(), "spriteHeight", 890669485);
        setBooleanField(term1164996, term1164996.getClass(), "resolutionMode", true);
        setIntField(term1164996, term1164996.getClass(), "currentPlane", 691577392);
        setBooleanField(term1164996, term1164996.getClass(), "xoMode", false);
        setField(term1144866, term1144866.getClass(), "pixels", term1164996);
        setShortField(term1144866, term1144866.getClass(), "opcode", (short) 21128);
        setField(term1165018, term1165018.getClass(), "keys", term1165019);
        setElement(term1165036, 0, "1");
        setElement(term1165036, 1, "2");
        setElement(term1165036, 2, "3");
        setElement(term1165036, 3, "4");
        setElement(term1165036, 4, "Q");
        setElement(term1165036, 5, "W");
        setElement(term1165036, 6, "E");
        setElement(term1165036, 7, "R");
        setElement(term1165036, 8, "A");
        setElement(term1165036, 9, "S");
        setElement(term1165036, 10, "D");
        setElement(term1165036, 11, "F");
        setElement(term1165036, 12, "Z");
        setElement(term1165036, 13, "X");
        setElement(term1165036, 14, "C");
        setElement(term1165036, 15, "V");
        setField(term1165018, term1165018.getClass(), "binds", term1165036);
        setField(term1144866, term1144866.getClass(), "keys", term1165018);
        setField(term1144866, term1144866.getClass(), "detailed", "jNxbVmoZgq");
        setShortField(term1165097, term1165097.getClass(), "opcode", (short) -2720);
        setField(term1165097, term1165097.getClass(), "x", "PvmBHIXaMY");
        setField(term1165097, term1165097.getClass(), "y", "hulYxtowxw");
        setField(term1165097, term1165097.getClass(), "nnn", "GNEmuHPNcU");
        setField(term1165097, term1165097.getClass(), "nn", "IoSfuKDFRe");
        setField(term1165097, term1165097.getClass(), "n", "AWYyZiNfsm");
        setField(term1165097, term1165097.getClass(), "iBefore", "ITRRYiuDwH");
        setField(term1165097, term1165097.getClass(), "i", "llRfwANcVF");
        setField(term1165097, term1165097.getClass(), "pc", "sUEeHQTWkA");
        setBooleanField(term1165097, term1165097.getClass(), "state", true);
        setBooleanField(term1165097, term1165097.getClass(), "resolutionMode", false);
        setField(term1144866, term1144866.getClass(), "d", term1165097);
        setBooleanField(term1165197, term1165197.getClass(), "printToConsole", true);
        setBooleanField(term1165197, term1165197.getClass(), "disableUiUpdates", true);
        setField(term1165197, term1165197.getClass(), "printSymbol", "#");
        setBooleanField(term1165197, term1165197.getClass(), "spriteExtracting", false);
        setBooleanField(term1165197, term1165197.getClass(), "roundPixels", true);
        setBooleanField(term1165197, term1165197.getClass(), "blur", true);
        setBooleanField(term1165197, term1165197.getClass(), "glow", true);
        setDoubleField(term1165197, term1165197.getClass(), "blurValue", 0.146431486357265);
        setDoubleField(term1165197, term1165197.getClass(), "glowValue", 0.24259014218848696);
        setField(term1165197, term1165197.getClass(), "bgColor", "BDIRCxAWLA");
        setField(term1165197, term1165197.getClass(), "spriteColor", "eOJfbiZLnb");
        setField(term1165197, term1165197.getClass(), "planeColor", "nKZKnxWYCK");
        setField(term1165197, term1165197.getClass(), "bothColor", "JOqQxuzRuZ");
        setBooleanField(term1165197, term1165197.getClass(), "quirkShift", false);
        setBooleanField(term1165197, term1165197.getClass(), "quirkJump", true);
        setBooleanField(term1165197, term1165197.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term1165197, term1165197.getClass(), "quirkOrder", false);
        setField(term1144866, term1144866.getClass(), "c", term1165197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "subtract", argTypes, term1144866, args);
    }

};


