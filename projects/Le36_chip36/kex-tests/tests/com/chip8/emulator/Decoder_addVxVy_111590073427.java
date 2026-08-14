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

public class Decoder_addVxVy_111590073427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104188;

    public Decoder_addVxVy_111590073427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term1114248 = new ArrayDeque();
        ArrayDeque term1124313 = new ArrayDeque();
        HashMap term1124319 = new HashMap();
        term1104188 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term1104189 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term1104190 = (byte[]) newByteArray(16);
        byte[] term1104207 = (byte[]) newByteArray(16);
        byte[] term1104224 = (byte[]) newByteArray(16);
        byte[] term1104244 = (byte[]) newByteArray(65535);
        Object term1114252 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term1114254 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term1114255 = (byte[]) newByteArray(16);
        byte[] term1114272 = (byte[]) newByteArray(16);
        byte[] term1114289 = (byte[]) newByteArray(16);
        byte[] term1114309 = (byte[]) newByteArray(65535);
        Object term1124318 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term1124324 = (Object[]) newArray("[[Z", 1);
        Object[] term1124325 = (Object[]) newArray("[Z", 0);
        Object[] term1124330 = (Object[]) newArray("[Z", 2);
        boolean[] term1124331 = (boolean[]) newBooleanArray(8);
        boolean[] term1124340 = (boolean[]) newBooleanArray(4);
        Object term1124350 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term1124351 = (boolean[]) newBooleanArray(16);
        Object[] term1124368 = (Object[]) newArray("java.lang.String", 16);
        Object term1124429 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term1124529 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term1104189, term1104189.getClass(), "v", term1104190);
        setField(term1104189, term1104189.getClass(), "rpl", term1104207);
        setByteElement(term1104224, 3, (byte) 32);
        setByteElement(term1104224, 4, (byte) 64);
        setByteElement(term1104224, 5, (byte) 32);
        setByteElement(term1104224, 7, (byte) 32);
        setByteElement(term1104224, 8, (byte) 64);
        setByteElement(term1104224, 9, (byte) 32);
        setByteElement(term1104224, 11, (byte) 32);
        setByteElement(term1104224, 12, (byte) 64);
        setByteElement(term1104224, 13, (byte) 32);
        setField(term1104189, term1104189.getClass(), "audio", term1104224);
        setShortField(term1104189, term1104189.getClass(), "pitch", (short) 64);
        setShortField(term1104189, term1104189.getClass(), "i", (short) 7812);
        setShortField(term1104189, term1104189.getClass(), "pc", (short) 512);
        setField(term1104189, term1104189.getClass(), "ram", term1104244);
        setByteField(term1104189, term1104189.getClass(), "delayTimer", (byte) -95);
        setByteField(term1104189, term1104189.getClass(), "soundTimer", (byte) -2);
        setField(term1104189, term1104189.getClass(), "stack", term1114248);
        setField(term1104188, term1104188.getClass(), "m", term1104189);
        setShortField(term1114252, term1114252.getClass(), "opcode", (short) -6249);
        setField(term1114254, term1114254.getClass(), "v", term1114255);
        setField(term1114254, term1114254.getClass(), "rpl", term1114272);
        setByteElement(term1114289, 3, (byte) 32);
        setByteElement(term1114289, 4, (byte) 64);
        setByteElement(term1114289, 5, (byte) 32);
        setByteElement(term1114289, 7, (byte) 32);
        setByteElement(term1114289, 8, (byte) 64);
        setByteElement(term1114289, 9, (byte) 32);
        setByteElement(term1114289, 11, (byte) 32);
        setByteElement(term1114289, 12, (byte) 64);
        setByteElement(term1114289, 13, (byte) 32);
        setField(term1114254, term1114254.getClass(), "audio", term1114289);
        setShortField(term1114254, term1114254.getClass(), "pitch", (short) 64);
        setShortField(term1114254, term1114254.getClass(), "i", (short) 18201);
        setShortField(term1114254, term1114254.getClass(), "pc", (short) 512);
        setField(term1114254, term1114254.getClass(), "ram", term1114309);
        setByteField(term1114254, term1114254.getClass(), "delayTimer", (byte) 28);
        setByteField(term1114254, term1114254.getClass(), "soundTimer", (byte) 84);
        setField(term1114254, term1114254.getClass(), "stack", term1124313);
        setField(term1114252, term1114252.getClass(), "m", term1114254);
        setLongField(term1114252, term1114252.getClass(), "currentTime", -4502405999831680926L);
        setField(term1104188, term1104188.getClass(), "fetcher", term1114252);
        setField(term1124318, term1124318.getClass(), "fadeMap", term1124319);
        setElement(term1124324, 0, term1124325);
        setField(term1124318, term1124318.getClass(), "display", term1124324);
        setIntField(term1124318, term1124318.getClass(), "x", -615654495);
        setIntField(term1124318, term1124318.getClass(), "y", -1476117762);
        setBooleanField(term1124318, term1124318.getClass(), "fade", false);
        setDoubleField(term1124318, term1124318.getClass(), "fadeSpeed", 0.32554480512985284);
        setBooleanElement(term1124331, 0, true);
        setBooleanElement(term1124331, 1, true);
        setBooleanElement(term1124331, 4, true);
        setBooleanElement(term1124331, 6, true);
        setElement(term1124330, 0, term1124331);
        setBooleanElement(term1124340, 1, true);
        setBooleanElement(term1124340, 2, true);
        setBooleanElement(term1124340, 3, true);
        setElement(term1124330, 1, term1124340);
        setField(term1124318, term1124318.getClass(), "spriteViewer", term1124330);
        setIntField(term1124318, term1124318.getClass(), "spriteHeight", -341962980);
        setBooleanField(term1124318, term1124318.getClass(), "resolutionMode", true);
        setIntField(term1124318, term1124318.getClass(), "currentPlane", 1532716628);
        setBooleanField(term1124318, term1124318.getClass(), "xoMode", true);
        setField(term1104188, term1104188.getClass(), "pixels", term1124318);
        setShortField(term1104188, term1104188.getClass(), "opcode", (short) -27632);
        setField(term1124350, term1124350.getClass(), "keys", term1124351);
        setElement(term1124368, 0, "1");
        setElement(term1124368, 1, "2");
        setElement(term1124368, 2, "3");
        setElement(term1124368, 3, "4");
        setElement(term1124368, 4, "Q");
        setElement(term1124368, 5, "W");
        setElement(term1124368, 6, "E");
        setElement(term1124368, 7, "R");
        setElement(term1124368, 8, "A");
        setElement(term1124368, 9, "S");
        setElement(term1124368, 10, "D");
        setElement(term1124368, 11, "F");
        setElement(term1124368, 12, "Z");
        setElement(term1124368, 13, "X");
        setElement(term1124368, 14, "C");
        setElement(term1124368, 15, "V");
        setField(term1124350, term1124350.getClass(), "binds", term1124368);
        setField(term1104188, term1104188.getClass(), "keys", term1124350);
        setField(term1104188, term1104188.getClass(), "detailed", "aanyiAOJCl");
        setShortField(term1124429, term1124429.getClass(), "opcode", (short) -12761);
        setField(term1124429, term1124429.getClass(), "x", "VDokbsCuqq");
        setField(term1124429, term1124429.getClass(), "y", "xClUIcPECX");
        setField(term1124429, term1124429.getClass(), "nnn", "avhRaGZaBF");
        setField(term1124429, term1124429.getClass(), "nn", "JkgoRtImdE");
        setField(term1124429, term1124429.getClass(), "n", "qFGKIJjlmV");
        setField(term1124429, term1124429.getClass(), "iBefore", "IHqvyhMtuM");
        setField(term1124429, term1124429.getClass(), "i", "dAldIGYAXV");
        setField(term1124429, term1124429.getClass(), "pc", "mLwibAPEsa");
        setBooleanField(term1124429, term1124429.getClass(), "state", true);
        setBooleanField(term1124429, term1124429.getClass(), "resolutionMode", false);
        setField(term1104188, term1104188.getClass(), "d", term1124429);
        setBooleanField(term1124529, term1124529.getClass(), "printToConsole", false);
        setBooleanField(term1124529, term1124529.getClass(), "disableUiUpdates", false);
        setField(term1124529, term1124529.getClass(), "printSymbol", "#");
        setBooleanField(term1124529, term1124529.getClass(), "spriteExtracting", false);
        setBooleanField(term1124529, term1124529.getClass(), "roundPixels", true);
        setBooleanField(term1124529, term1124529.getClass(), "blur", false);
        setBooleanField(term1124529, term1124529.getClass(), "glow", true);
        setDoubleField(term1124529, term1124529.getClass(), "blurValue", 0.8924855581421237);
        setDoubleField(term1124529, term1124529.getClass(), "glowValue", 0.32237559209193944);
        setField(term1124529, term1124529.getClass(), "bgColor", "zsWKWiTFuo");
        setField(term1124529, term1124529.getClass(), "spriteColor", "UPUbwyHQKN");
        setField(term1124529, term1124529.getClass(), "planeColor", "lgQkrXANyI");
        setField(term1124529, term1124529.getClass(), "bothColor", "MeTmRZXErV");
        setBooleanField(term1124529, term1124529.getClass(), "quirkShift", true);
        setBooleanField(term1124529, term1124529.getClass(), "quirkJump", false);
        setBooleanField(term1124529, term1124529.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term1124529, term1124529.getClass(), "quirkOrder", false);
        setField(term1104188, term1104188.getClass(), "c", term1124529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addVxVy", argTypes, term1104188, args);
    }

};


