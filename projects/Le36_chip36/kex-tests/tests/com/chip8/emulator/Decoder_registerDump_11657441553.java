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

public class Decoder_registerDump_11657441553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2166549;

    public Decoder_registerDump_11657441553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2176609 = new ArrayDeque();
        ArrayDeque term2186674 = new ArrayDeque();
        HashMap term2186680 = new HashMap();
        term2166549 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term2166550 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term2166551 = (byte[]) newByteArray(16);
        byte[] term2166568 = (byte[]) newByteArray(16);
        byte[] term2166585 = (byte[]) newByteArray(16);
        byte[] term2166605 = (byte[]) newByteArray(65535);
        Object term2176613 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term2176615 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term2176616 = (byte[]) newByteArray(16);
        byte[] term2176633 = (byte[]) newByteArray(16);
        byte[] term2176650 = (byte[]) newByteArray(16);
        byte[] term2176670 = (byte[]) newByteArray(65535);
        Object term2186679 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term2186685 = (Object[]) newArray("[[Z", 1);
        Object[] term2186686 = (Object[]) newArray("[Z", 2);
        boolean[] term2186687 = (boolean[]) newBooleanArray(8);
        boolean[] term2186696 = (boolean[]) newBooleanArray(5);
        Object[] term2186706 = (Object[]) newArray("[Z", 1);
        boolean[] term2186707 = (boolean[]) newBooleanArray(8);
        Object term2186721 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term2186722 = (boolean[]) newBooleanArray(16);
        Object[] term2186739 = (Object[]) newArray("java.lang.String", 16);
        Object term2186800 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term2186900 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term2166550, term2166550.getClass(), "v", term2166551);
        setField(term2166550, term2166550.getClass(), "rpl", term2166568);
        setByteElement(term2166585, 3, (byte) 32);
        setByteElement(term2166585, 4, (byte) 64);
        setByteElement(term2166585, 5, (byte) 32);
        setByteElement(term2166585, 7, (byte) 32);
        setByteElement(term2166585, 8, (byte) 64);
        setByteElement(term2166585, 9, (byte) 32);
        setByteElement(term2166585, 11, (byte) 32);
        setByteElement(term2166585, 12, (byte) 64);
        setByteElement(term2166585, 13, (byte) 32);
        setField(term2166550, term2166550.getClass(), "audio", term2166585);
        setShortField(term2166550, term2166550.getClass(), "pitch", (short) 64);
        setShortField(term2166550, term2166550.getClass(), "i", (short) -32751);
        setShortField(term2166550, term2166550.getClass(), "pc", (short) 512);
        setField(term2166550, term2166550.getClass(), "ram", term2166605);
        setByteField(term2166550, term2166550.getClass(), "delayTimer", (byte) -118);
        setByteField(term2166550, term2166550.getClass(), "soundTimer", (byte) 69);
        setField(term2166550, term2166550.getClass(), "stack", term2176609);
        setField(term2166549, term2166549.getClass(), "m", term2166550);
        setShortField(term2176613, term2176613.getClass(), "opcode", (short) -22142);
        setField(term2176615, term2176615.getClass(), "v", term2176616);
        setField(term2176615, term2176615.getClass(), "rpl", term2176633);
        setByteElement(term2176650, 3, (byte) 32);
        setByteElement(term2176650, 4, (byte) 64);
        setByteElement(term2176650, 5, (byte) 32);
        setByteElement(term2176650, 7, (byte) 32);
        setByteElement(term2176650, 8, (byte) 64);
        setByteElement(term2176650, 9, (byte) 32);
        setByteElement(term2176650, 11, (byte) 32);
        setByteElement(term2176650, 12, (byte) 64);
        setByteElement(term2176650, 13, (byte) 32);
        setField(term2176615, term2176615.getClass(), "audio", term2176650);
        setShortField(term2176615, term2176615.getClass(), "pitch", (short) 64);
        setShortField(term2176615, term2176615.getClass(), "i", (short) 19491);
        setShortField(term2176615, term2176615.getClass(), "pc", (short) 512);
        setField(term2176615, term2176615.getClass(), "ram", term2176670);
        setByteField(term2176615, term2176615.getClass(), "delayTimer", (byte) 112);
        setByteField(term2176615, term2176615.getClass(), "soundTimer", (byte) 77);
        setField(term2176615, term2176615.getClass(), "stack", term2186674);
        setField(term2176613, term2176613.getClass(), "m", term2176615);
        setLongField(term2176613, term2176613.getClass(), "currentTime", -2850532706972744550L);
        setField(term2166549, term2166549.getClass(), "fetcher", term2176613);
        setField(term2186679, term2186679.getClass(), "fadeMap", term2186680);
        setBooleanElement(term2186687, 0, true);
        setBooleanElement(term2186687, 1, true);
        setBooleanElement(term2186687, 4, true);
        setBooleanElement(term2186687, 7, true);
        setElement(term2186686, 0, term2186687);
        setBooleanElement(term2186696, 2, true);
        setBooleanElement(term2186696, 4, true);
        setElement(term2186686, 1, term2186696);
        setElement(term2186685, 0, term2186686);
        setField(term2186679, term2186679.getClass(), "display", term2186685);
        setIntField(term2186679, term2186679.getClass(), "x", 937859191);
        setIntField(term2186679, term2186679.getClass(), "y", -916584829);
        setBooleanField(term2186679, term2186679.getClass(), "fade", true);
        setDoubleField(term2186679, term2186679.getClass(), "fadeSpeed", 0.22227423914231126);
        setBooleanElement(term2186707, 0, true);
        setBooleanElement(term2186707, 2, true);
        setBooleanElement(term2186707, 4, true);
        setBooleanElement(term2186707, 6, true);
        setBooleanElement(term2186707, 7, true);
        setElement(term2186706, 0, term2186707);
        setField(term2186679, term2186679.getClass(), "spriteViewer", term2186706);
        setIntField(term2186679, term2186679.getClass(), "spriteHeight", -2131181468);
        setBooleanField(term2186679, term2186679.getClass(), "resolutionMode", true);
        setIntField(term2186679, term2186679.getClass(), "currentPlane", 282916351);
        setBooleanField(term2186679, term2186679.getClass(), "xoMode", false);
        setField(term2166549, term2166549.getClass(), "pixels", term2186679);
        setShortField(term2166549, term2166549.getClass(), "opcode", (short) 4050);
        setField(term2186721, term2186721.getClass(), "keys", term2186722);
        setElement(term2186739, 0, "1");
        setElement(term2186739, 1, "2");
        setElement(term2186739, 2, "3");
        setElement(term2186739, 3, "4");
        setElement(term2186739, 4, "Q");
        setElement(term2186739, 5, "W");
        setElement(term2186739, 6, "E");
        setElement(term2186739, 7, "R");
        setElement(term2186739, 8, "A");
        setElement(term2186739, 9, "S");
        setElement(term2186739, 10, "D");
        setElement(term2186739, 11, "F");
        setElement(term2186739, 12, "Z");
        setElement(term2186739, 13, "X");
        setElement(term2186739, 14, "C");
        setElement(term2186739, 15, "V");
        setField(term2186721, term2186721.getClass(), "binds", term2186739);
        setField(term2166549, term2166549.getClass(), "keys", term2186721);
        setField(term2166549, term2166549.getClass(), "detailed", "POPYycoDBy");
        setShortField(term2186800, term2186800.getClass(), "opcode", (short) 7154);
        setField(term2186800, term2186800.getClass(), "x", "LuWMOXdAPA");
        setField(term2186800, term2186800.getClass(), "y", "blSffTnsOv");
        setField(term2186800, term2186800.getClass(), "nnn", "qbUMcIvEXH");
        setField(term2186800, term2186800.getClass(), "nn", "TVxGTjeDcu");
        setField(term2186800, term2186800.getClass(), "n", "ABPtcyCzkR");
        setField(term2186800, term2186800.getClass(), "iBefore", "QgHhxMyKvr");
        setField(term2186800, term2186800.getClass(), "i", "VGiXZZTWRO");
        setField(term2186800, term2186800.getClass(), "pc", "MlPtwXnJOJ");
        setBooleanField(term2186800, term2186800.getClass(), "state", false);
        setBooleanField(term2186800, term2186800.getClass(), "resolutionMode", false);
        setField(term2166549, term2166549.getClass(), "d", term2186800);
        setBooleanField(term2186900, term2186900.getClass(), "printToConsole", false);
        setBooleanField(term2186900, term2186900.getClass(), "disableUiUpdates", false);
        setField(term2186900, term2186900.getClass(), "printSymbol", "#");
        setBooleanField(term2186900, term2186900.getClass(), "spriteExtracting", false);
        setBooleanField(term2186900, term2186900.getClass(), "roundPixels", false);
        setBooleanField(term2186900, term2186900.getClass(), "blur", true);
        setBooleanField(term2186900, term2186900.getClass(), "glow", false);
        setDoubleField(term2186900, term2186900.getClass(), "blurValue", 0.06480976831423468);
        setDoubleField(term2186900, term2186900.getClass(), "glowValue", 0.8490790645379176);
        setField(term2186900, term2186900.getClass(), "bgColor", "DbfiyFeaTe");
        setField(term2186900, term2186900.getClass(), "spriteColor", "dQxXGBtDLZ");
        setField(term2186900, term2186900.getClass(), "planeColor", "EgSgEFIyyN");
        setField(term2186900, term2186900.getClass(), "bothColor", "iAOFcXaLSf");
        setBooleanField(term2186900, term2186900.getClass(), "quirkShift", true);
        setBooleanField(term2186900, term2186900.getClass(), "quirkJump", true);
        setBooleanField(term2186900, term2186900.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term2186900, term2186900.getClass(), "quirkOrder", false);
        setField(term2166549, term2166549.getClass(), "c", term2186900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "registerDump", argTypes, term2166549, args);
    }

};


