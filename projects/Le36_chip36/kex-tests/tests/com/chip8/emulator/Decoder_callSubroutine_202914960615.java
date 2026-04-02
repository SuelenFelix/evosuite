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

public class Decoder_callSubroutine_202914960615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613751;

    public Decoder_callSubroutine_202914960615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term623811 = new ArrayDeque();
        ArrayDeque term633876 = new ArrayDeque();
        HashMap term633882 = new HashMap();
        term613751 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term613752 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term613753 = (byte[]) newByteArray(16);
        byte[] term613770 = (byte[]) newByteArray(16);
        byte[] term613787 = (byte[]) newByteArray(16);
        byte[] term613807 = (byte[]) newByteArray(65535);
        Object term623815 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term623817 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term623818 = (byte[]) newByteArray(16);
        byte[] term623835 = (byte[]) newByteArray(16);
        byte[] term623852 = (byte[]) newByteArray(16);
        byte[] term623872 = (byte[]) newByteArray(65535);
        Object term633881 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term633887 = (Object[]) newArray("[[Z", 0);
        Object[] term633892 = (Object[]) newArray("[Z", 4);
        boolean[] term633893 = (boolean[]) newBooleanArray(9);
        boolean[] term633903 = (boolean[]) newBooleanArray(3);
        boolean[] term633907 = (boolean[]) newBooleanArray(6);
        boolean[] term633914 = (boolean[]) newBooleanArray(8);
        Object term633928 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term633929 = (boolean[]) newBooleanArray(16);
        Object[] term633946 = (Object[]) newArray("java.lang.String", 16);
        Object term634007 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term634107 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term613752, term613752.getClass(), "v", term613753);
        setField(term613752, term613752.getClass(), "rpl", term613770);
        setByteElement(term613787, 3, (byte) 32);
        setByteElement(term613787, 4, (byte) 64);
        setByteElement(term613787, 5, (byte) 32);
        setByteElement(term613787, 7, (byte) 32);
        setByteElement(term613787, 8, (byte) 64);
        setByteElement(term613787, 9, (byte) 32);
        setByteElement(term613787, 11, (byte) 32);
        setByteElement(term613787, 12, (byte) 64);
        setByteElement(term613787, 13, (byte) 32);
        setField(term613752, term613752.getClass(), "audio", term613787);
        setShortField(term613752, term613752.getClass(), "pitch", (short) 64);
        setShortField(term613752, term613752.getClass(), "i", (short) 27116);
        setShortField(term613752, term613752.getClass(), "pc", (short) 512);
        setField(term613752, term613752.getClass(), "ram", term613807);
        setByteField(term613752, term613752.getClass(), "delayTimer", (byte) 116);
        setByteField(term613752, term613752.getClass(), "soundTimer", (byte) -81);
        setField(term613752, term613752.getClass(), "stack", term623811);
        setField(term613751, term613751.getClass(), "m", term613752);
        setShortField(term623815, term623815.getClass(), "opcode", (short) -6646);
        setField(term623817, term623817.getClass(), "v", term623818);
        setField(term623817, term623817.getClass(), "rpl", term623835);
        setByteElement(term623852, 3, (byte) 32);
        setByteElement(term623852, 4, (byte) 64);
        setByteElement(term623852, 5, (byte) 32);
        setByteElement(term623852, 7, (byte) 32);
        setByteElement(term623852, 8, (byte) 64);
        setByteElement(term623852, 9, (byte) 32);
        setByteElement(term623852, 11, (byte) 32);
        setByteElement(term623852, 12, (byte) 64);
        setByteElement(term623852, 13, (byte) 32);
        setField(term623817, term623817.getClass(), "audio", term623852);
        setShortField(term623817, term623817.getClass(), "pitch", (short) 64);
        setShortField(term623817, term623817.getClass(), "i", (short) 18765);
        setShortField(term623817, term623817.getClass(), "pc", (short) 512);
        setField(term623817, term623817.getClass(), "ram", term623872);
        setByteField(term623817, term623817.getClass(), "delayTimer", (byte) 102);
        setByteField(term623817, term623817.getClass(), "soundTimer", (byte) -118);
        setField(term623817, term623817.getClass(), "stack", term633876);
        setField(term623815, term623815.getClass(), "m", term623817);
        setLongField(term623815, term623815.getClass(), "currentTime", -872011222785455006L);
        setField(term613751, term613751.getClass(), "fetcher", term623815);
        setField(term633881, term633881.getClass(), "fadeMap", term633882);
        setField(term633881, term633881.getClass(), "display", term633887);
        setIntField(term633881, term633881.getClass(), "x", 1596070772);
        setIntField(term633881, term633881.getClass(), "y", 97029295);
        setBooleanField(term633881, term633881.getClass(), "fade", true);
        setDoubleField(term633881, term633881.getClass(), "fadeSpeed", 0.5873228247510078);
        setBooleanElement(term633893, 4, true);
        setBooleanElement(term633893, 7, true);
        setElement(term633892, 0, term633893);
        setBooleanElement(term633903, 0, true);
        setBooleanElement(term633903, 2, true);
        setElement(term633892, 1, term633903);
        setBooleanElement(term633907, 1, true);
        setBooleanElement(term633907, 2, true);
        setBooleanElement(term633907, 3, true);
        setElement(term633892, 2, term633907);
        setBooleanElement(term633914, 2, true);
        setBooleanElement(term633914, 5, true);
        setBooleanElement(term633914, 7, true);
        setElement(term633892, 3, term633914);
        setField(term633881, term633881.getClass(), "spriteViewer", term633892);
        setIntField(term633881, term633881.getClass(), "spriteHeight", -1371869594);
        setBooleanField(term633881, term633881.getClass(), "resolutionMode", false);
        setIntField(term633881, term633881.getClass(), "currentPlane", -2095575670);
        setBooleanField(term633881, term633881.getClass(), "xoMode", true);
        setField(term613751, term613751.getClass(), "pixels", term633881);
        setShortField(term613751, term613751.getClass(), "opcode", (short) -31730);
        setField(term633928, term633928.getClass(), "keys", term633929);
        setElement(term633946, 0, "1");
        setElement(term633946, 1, "2");
        setElement(term633946, 2, "3");
        setElement(term633946, 3, "4");
        setElement(term633946, 4, "Q");
        setElement(term633946, 5, "W");
        setElement(term633946, 6, "E");
        setElement(term633946, 7, "R");
        setElement(term633946, 8, "A");
        setElement(term633946, 9, "S");
        setElement(term633946, 10, "D");
        setElement(term633946, 11, "F");
        setElement(term633946, 12, "Z");
        setElement(term633946, 13, "X");
        setElement(term633946, 14, "C");
        setElement(term633946, 15, "V");
        setField(term633928, term633928.getClass(), "binds", term633946);
        setField(term613751, term613751.getClass(), "keys", term633928);
        setField(term613751, term613751.getClass(), "detailed", "JppkknKVOw");
        setShortField(term634007, term634007.getClass(), "opcode", (short) -7525);
        setField(term634007, term634007.getClass(), "x", "iljANwuEjk");
        setField(term634007, term634007.getClass(), "y", "kNqaJKIATy");
        setField(term634007, term634007.getClass(), "nnn", "vKQukfbJUd");
        setField(term634007, term634007.getClass(), "nn", "lFRJFUMVbx");
        setField(term634007, term634007.getClass(), "n", "sZdUNdggUW");
        setField(term634007, term634007.getClass(), "iBefore", "OqbwYQfvAe");
        setField(term634007, term634007.getClass(), "i", "tRxZafjqIx");
        setField(term634007, term634007.getClass(), "pc", "DhjNLmRMCu");
        setBooleanField(term634007, term634007.getClass(), "state", true);
        setBooleanField(term634007, term634007.getClass(), "resolutionMode", true);
        setField(term613751, term613751.getClass(), "d", term634007);
        setBooleanField(term634107, term634107.getClass(), "printToConsole", true);
        setBooleanField(term634107, term634107.getClass(), "disableUiUpdates", false);
        setField(term634107, term634107.getClass(), "printSymbol", "#");
        setBooleanField(term634107, term634107.getClass(), "spriteExtracting", true);
        setBooleanField(term634107, term634107.getClass(), "roundPixels", true);
        setBooleanField(term634107, term634107.getClass(), "blur", true);
        setBooleanField(term634107, term634107.getClass(), "glow", true);
        setDoubleField(term634107, term634107.getClass(), "blurValue", 0.8823181080774973);
        setDoubleField(term634107, term634107.getClass(), "glowValue", 0.2192450926212024);
        setField(term634107, term634107.getClass(), "bgColor", "PgPzMSEjjX");
        setField(term634107, term634107.getClass(), "spriteColor", "wzsPSPcRdj");
        setField(term634107, term634107.getClass(), "planeColor", "kGMQdqJYyB");
        setField(term634107, term634107.getClass(), "bothColor", "XJJNClzHRf");
        setBooleanField(term634107, term634107.getClass(), "quirkShift", false);
        setBooleanField(term634107, term634107.getClass(), "quirkJump", false);
        setBooleanField(term634107, term634107.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term634107, term634107.getClass(), "quirkOrder", true);
        setField(term613751, term613751.getClass(), "c", term634107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "callSubroutine", argTypes, term613751, args);
    }

};


