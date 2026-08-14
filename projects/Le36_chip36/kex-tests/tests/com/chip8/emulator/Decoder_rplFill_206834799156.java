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

public class Decoder_rplFill_206834799156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2289318;

    public Decoder_rplFill_206834799156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2299378 = new ArrayDeque();
        ArrayDeque term2309443 = new ArrayDeque();
        HashMap term2309449 = new HashMap();
        term2289318 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term2289319 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term2289320 = (byte[]) newByteArray(16);
        byte[] term2289337 = (byte[]) newByteArray(16);
        byte[] term2289354 = (byte[]) newByteArray(16);
        byte[] term2289374 = (byte[]) newByteArray(65535);
        Object term2299382 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term2299384 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term2299385 = (byte[]) newByteArray(16);
        byte[] term2299402 = (byte[]) newByteArray(16);
        byte[] term2299419 = (byte[]) newByteArray(16);
        byte[] term2299439 = (byte[]) newByteArray(65535);
        Object term2309448 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term2309454 = (Object[]) newArray("[[Z", 1);
        Object[] term2309455 = (Object[]) newArray("[Z", 3);
        boolean[] term2309456 = (boolean[]) newBooleanArray(0);
        boolean[] term2309457 = (boolean[]) newBooleanArray(2);
        boolean[] term2309460 = (boolean[]) newBooleanArray(4);
        Object[] term2309469 = (Object[]) newArray("[Z", 3);
        boolean[] term2309470 = (boolean[]) newBooleanArray(2);
        boolean[] term2309473 = (boolean[]) newBooleanArray(6);
        boolean[] term2309480 = (boolean[]) newBooleanArray(5);
        Object term2309491 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term2309492 = (boolean[]) newBooleanArray(16);
        Object[] term2309509 = (Object[]) newArray("java.lang.String", 16);
        Object term2309570 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term2309670 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term2289319, term2289319.getClass(), "v", term2289320);
        setField(term2289319, term2289319.getClass(), "rpl", term2289337);
        setByteElement(term2289354, 3, (byte) 32);
        setByteElement(term2289354, 4, (byte) 64);
        setByteElement(term2289354, 5, (byte) 32);
        setByteElement(term2289354, 7, (byte) 32);
        setByteElement(term2289354, 8, (byte) 64);
        setByteElement(term2289354, 9, (byte) 32);
        setByteElement(term2289354, 11, (byte) 32);
        setByteElement(term2289354, 12, (byte) 64);
        setByteElement(term2289354, 13, (byte) 32);
        setField(term2289319, term2289319.getClass(), "audio", term2289354);
        setShortField(term2289319, term2289319.getClass(), "pitch", (short) 64);
        setShortField(term2289319, term2289319.getClass(), "i", (short) -27234);
        setShortField(term2289319, term2289319.getClass(), "pc", (short) 512);
        setField(term2289319, term2289319.getClass(), "ram", term2289374);
        setByteField(term2289319, term2289319.getClass(), "delayTimer", (byte) -85);
        setByteField(term2289319, term2289319.getClass(), "soundTimer", (byte) 81);
        setField(term2289319, term2289319.getClass(), "stack", term2299378);
        setField(term2289318, term2289318.getClass(), "m", term2289319);
        setShortField(term2299382, term2299382.getClass(), "opcode", (short) -2935);
        setField(term2299384, term2299384.getClass(), "v", term2299385);
        setField(term2299384, term2299384.getClass(), "rpl", term2299402);
        setByteElement(term2299419, 3, (byte) 32);
        setByteElement(term2299419, 4, (byte) 64);
        setByteElement(term2299419, 5, (byte) 32);
        setByteElement(term2299419, 7, (byte) 32);
        setByteElement(term2299419, 8, (byte) 64);
        setByteElement(term2299419, 9, (byte) 32);
        setByteElement(term2299419, 11, (byte) 32);
        setByteElement(term2299419, 12, (byte) 64);
        setByteElement(term2299419, 13, (byte) 32);
        setField(term2299384, term2299384.getClass(), "audio", term2299419);
        setShortField(term2299384, term2299384.getClass(), "pitch", (short) 64);
        setShortField(term2299384, term2299384.getClass(), "i", (short) 12408);
        setShortField(term2299384, term2299384.getClass(), "pc", (short) 512);
        setField(term2299384, term2299384.getClass(), "ram", term2299439);
        setByteField(term2299384, term2299384.getClass(), "delayTimer", (byte) -113);
        setByteField(term2299384, term2299384.getClass(), "soundTimer", (byte) 90);
        setField(term2299384, term2299384.getClass(), "stack", term2309443);
        setField(term2299382, term2299382.getClass(), "m", term2299384);
        setLongField(term2299382, term2299382.getClass(), "currentTime", -7738503207562305297L);
        setField(term2289318, term2289318.getClass(), "fetcher", term2299382);
        setField(term2309448, term2309448.getClass(), "fadeMap", term2309449);
        setElement(term2309455, 0, term2309456);
        setBooleanElement(term2309457, 0, true);
        setBooleanElement(term2309457, 1, true);
        setElement(term2309455, 1, term2309457);
        setBooleanElement(term2309460, 1, true);
        setBooleanElement(term2309460, 3, true);
        setElement(term2309455, 2, term2309460);
        setElement(term2309454, 0, term2309455);
        setField(term2309448, term2309448.getClass(), "display", term2309454);
        setIntField(term2309448, term2309448.getClass(), "x", 1684998508);
        setIntField(term2309448, term2309448.getClass(), "y", -1476644457);
        setBooleanField(term2309448, term2309448.getClass(), "fade", true);
        setDoubleField(term2309448, term2309448.getClass(), "fadeSpeed", 0.5179319342588155);
        setBooleanElement(term2309470, 0, true);
        setBooleanElement(term2309470, 1, true);
        setElement(term2309469, 0, term2309470);
        setBooleanElement(term2309473, 2, true);
        setBooleanElement(term2309473, 3, true);
        setBooleanElement(term2309473, 4, true);
        setBooleanElement(term2309473, 5, true);
        setElement(term2309469, 1, term2309473);
        setBooleanElement(term2309480, 0, true);
        setBooleanElement(term2309480, 2, true);
        setElement(term2309469, 2, term2309480);
        setField(term2309448, term2309448.getClass(), "spriteViewer", term2309469);
        setIntField(term2309448, term2309448.getClass(), "spriteHeight", 1270666529);
        setBooleanField(term2309448, term2309448.getClass(), "resolutionMode", false);
        setIntField(term2309448, term2309448.getClass(), "currentPlane", -1146679443);
        setBooleanField(term2309448, term2309448.getClass(), "xoMode", true);
        setField(term2289318, term2289318.getClass(), "pixels", term2309448);
        setShortField(term2289318, term2289318.getClass(), "opcode", (short) 2545);
        setField(term2309491, term2309491.getClass(), "keys", term2309492);
        setElement(term2309509, 0, "1");
        setElement(term2309509, 1, "2");
        setElement(term2309509, 2, "3");
        setElement(term2309509, 3, "4");
        setElement(term2309509, 4, "Q");
        setElement(term2309509, 5, "W");
        setElement(term2309509, 6, "E");
        setElement(term2309509, 7, "R");
        setElement(term2309509, 8, "A");
        setElement(term2309509, 9, "S");
        setElement(term2309509, 10, "D");
        setElement(term2309509, 11, "F");
        setElement(term2309509, 12, "Z");
        setElement(term2309509, 13, "X");
        setElement(term2309509, 14, "C");
        setElement(term2309509, 15, "V");
        setField(term2309491, term2309491.getClass(), "binds", term2309509);
        setField(term2289318, term2289318.getClass(), "keys", term2309491);
        setField(term2289318, term2289318.getClass(), "detailed", "PTEndmPMzk");
        setShortField(term2309570, term2309570.getClass(), "opcode", (short) 15987);
        setField(term2309570, term2309570.getClass(), "x", "aJQuCOCvZs");
        setField(term2309570, term2309570.getClass(), "y", "lHYNCJRiOv");
        setField(term2309570, term2309570.getClass(), "nnn", "QVLresHoaP");
        setField(term2309570, term2309570.getClass(), "nn", "IbxeAMwLVt");
        setField(term2309570, term2309570.getClass(), "n", "bShlAqoTmZ");
        setField(term2309570, term2309570.getClass(), "iBefore", "nOKlKlNhtU");
        setField(term2309570, term2309570.getClass(), "i", "gXFNBHJSey");
        setField(term2309570, term2309570.getClass(), "pc", "wUcSfItZgv");
        setBooleanField(term2309570, term2309570.getClass(), "state", false);
        setBooleanField(term2309570, term2309570.getClass(), "resolutionMode", true);
        setField(term2289318, term2289318.getClass(), "d", term2309570);
        setBooleanField(term2309670, term2309670.getClass(), "printToConsole", false);
        setBooleanField(term2309670, term2309670.getClass(), "disableUiUpdates", false);
        setField(term2309670, term2309670.getClass(), "printSymbol", "#");
        setBooleanField(term2309670, term2309670.getClass(), "spriteExtracting", false);
        setBooleanField(term2309670, term2309670.getClass(), "roundPixels", true);
        setBooleanField(term2309670, term2309670.getClass(), "blur", true);
        setBooleanField(term2309670, term2309670.getClass(), "glow", false);
        setDoubleField(term2309670, term2309670.getClass(), "blurValue", 0.25025774487844066);
        setDoubleField(term2309670, term2309670.getClass(), "glowValue", 0.1858089882752998);
        setField(term2309670, term2309670.getClass(), "bgColor", "rOfPCPHmtJ");
        setField(term2309670, term2309670.getClass(), "spriteColor", "EnmiAvfpJv");
        setField(term2309670, term2309670.getClass(), "planeColor", "AdYzLPMcwe");
        setField(term2309670, term2309670.getClass(), "bothColor", "FrTZLybkKk");
        setBooleanField(term2309670, term2309670.getClass(), "quirkShift", false);
        setBooleanField(term2309670, term2309670.getClass(), "quirkJump", true);
        setBooleanField(term2309670, term2309670.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term2309670, term2309670.getClass(), "quirkOrder", true);
        setField(term2289318, term2289318.getClass(), "c", term2309670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rplFill", argTypes, term2289318, args);
    }

};


