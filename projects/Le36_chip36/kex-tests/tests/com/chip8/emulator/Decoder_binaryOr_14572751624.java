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

public class Decoder_binaryOr_14572751624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981537;

    public Decoder_binaryOr_14572751624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term991597 = new ArrayDeque();
        ArrayDeque term1001662 = new ArrayDeque();
        HashMap term1001668 = new HashMap();
        term981537 = newInstance(Class.forName("com.chip8.emulator.Decoder"));
        Object term981538 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term981539 = (byte[]) newByteArray(16);
        byte[] term981556 = (byte[]) newByteArray(16);
        byte[] term981573 = (byte[]) newByteArray(16);
        byte[] term981593 = (byte[]) newByteArray(65535);
        Object term991601 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term991603 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term991604 = (byte[]) newByteArray(16);
        byte[] term991621 = (byte[]) newByteArray(16);
        byte[] term991638 = (byte[]) newByteArray(16);
        byte[] term991658 = (byte[]) newByteArray(65535);
        Object term1001667 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term1001673 = (Object[]) newArray("[[Z", 0);
        Object[] term1001678 = (Object[]) newArray("[Z", 5);
        boolean[] term1001679 = (boolean[]) newBooleanArray(0);
        boolean[] term1001680 = (boolean[]) newBooleanArray(5);
        boolean[] term1001686 = (boolean[]) newBooleanArray(8);
        boolean[] term1001695 = (boolean[]) newBooleanArray(2);
        boolean[] term1001698 = (boolean[]) newBooleanArray(9);
        Object term1001713 = newInstance(Class.forName("com.chip8.emulator.Keys"));
        boolean[] term1001714 = (boolean[]) newBooleanArray(16);
        Object[] term1001731 = (Object[]) newArray("java.lang.String", 16);
        Object term1001792 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        Object term1001892 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setField(term981538, term981538.getClass(), "v", term981539);
        setField(term981538, term981538.getClass(), "rpl", term981556);
        setByteElement(term981573, 3, (byte) 32);
        setByteElement(term981573, 4, (byte) 64);
        setByteElement(term981573, 5, (byte) 32);
        setByteElement(term981573, 7, (byte) 32);
        setByteElement(term981573, 8, (byte) 64);
        setByteElement(term981573, 9, (byte) 32);
        setByteElement(term981573, 11, (byte) 32);
        setByteElement(term981573, 12, (byte) 64);
        setByteElement(term981573, 13, (byte) 32);
        setField(term981538, term981538.getClass(), "audio", term981573);
        setShortField(term981538, term981538.getClass(), "pitch", (short) 64);
        setShortField(term981538, term981538.getClass(), "i", (short) 30323);
        setShortField(term981538, term981538.getClass(), "pc", (short) 512);
        setField(term981538, term981538.getClass(), "ram", term981593);
        setByteField(term981538, term981538.getClass(), "delayTimer", (byte) -44);
        setByteField(term981538, term981538.getClass(), "soundTimer", (byte) 33);
        setField(term981538, term981538.getClass(), "stack", term991597);
        setField(term981537, term981537.getClass(), "m", term981538);
        setShortField(term991601, term991601.getClass(), "opcode", (short) -21920);
        setField(term991603, term991603.getClass(), "v", term991604);
        setField(term991603, term991603.getClass(), "rpl", term991621);
        setByteElement(term991638, 3, (byte) 32);
        setByteElement(term991638, 4, (byte) 64);
        setByteElement(term991638, 5, (byte) 32);
        setByteElement(term991638, 7, (byte) 32);
        setByteElement(term991638, 8, (byte) 64);
        setByteElement(term991638, 9, (byte) 32);
        setByteElement(term991638, 11, (byte) 32);
        setByteElement(term991638, 12, (byte) 64);
        setByteElement(term991638, 13, (byte) 32);
        setField(term991603, term991603.getClass(), "audio", term991638);
        setShortField(term991603, term991603.getClass(), "pitch", (short) 64);
        setShortField(term991603, term991603.getClass(), "i", (short) -32205);
        setShortField(term991603, term991603.getClass(), "pc", (short) 512);
        setField(term991603, term991603.getClass(), "ram", term991658);
        setByteField(term991603, term991603.getClass(), "delayTimer", (byte) -74);
        setByteField(term991603, term991603.getClass(), "soundTimer", (byte) -84);
        setField(term991603, term991603.getClass(), "stack", term1001662);
        setField(term991601, term991601.getClass(), "m", term991603);
        setLongField(term991601, term991601.getClass(), "currentTime", 2486810210675247493L);
        setField(term981537, term981537.getClass(), "fetcher", term991601);
        setField(term1001667, term1001667.getClass(), "fadeMap", term1001668);
        setField(term1001667, term1001667.getClass(), "display", term1001673);
        setIntField(term1001667, term1001667.getClass(), "x", -1034506028);
        setIntField(term1001667, term1001667.getClass(), "y", -1263114719);
        setBooleanField(term1001667, term1001667.getClass(), "fade", true);
        setDoubleField(term1001667, term1001667.getClass(), "fadeSpeed", 0.0022646783892913414);
        setElement(term1001678, 0, term1001679);
        setBooleanElement(term1001680, 3, true);
        setElement(term1001678, 1, term1001680);
        setBooleanElement(term1001686, 5, true);
        setBooleanElement(term1001686, 6, true);
        setElement(term1001678, 2, term1001686);
        setBooleanElement(term1001695, 1, true);
        setElement(term1001678, 3, term1001695);
        setBooleanElement(term1001698, 0, true);
        setBooleanElement(term1001698, 1, true);
        setBooleanElement(term1001698, 3, true);
        setBooleanElement(term1001698, 5, true);
        setBooleanElement(term1001698, 6, true);
        setElement(term1001678, 4, term1001698);
        setField(term1001667, term1001667.getClass(), "spriteViewer", term1001678);
        setIntField(term1001667, term1001667.getClass(), "spriteHeight", -894662986);
        setBooleanField(term1001667, term1001667.getClass(), "resolutionMode", true);
        setIntField(term1001667, term1001667.getClass(), "currentPlane", 304775596);
        setBooleanField(term1001667, term1001667.getClass(), "xoMode", false);
        setField(term981537, term981537.getClass(), "pixels", term1001667);
        setShortField(term981537, term981537.getClass(), "opcode", (short) 30923);
        setField(term1001713, term1001713.getClass(), "keys", term1001714);
        setElement(term1001731, 0, "1");
        setElement(term1001731, 1, "2");
        setElement(term1001731, 2, "3");
        setElement(term1001731, 3, "4");
        setElement(term1001731, 4, "Q");
        setElement(term1001731, 5, "W");
        setElement(term1001731, 6, "E");
        setElement(term1001731, 7, "R");
        setElement(term1001731, 8, "A");
        setElement(term1001731, 9, "S");
        setElement(term1001731, 10, "D");
        setElement(term1001731, 11, "F");
        setElement(term1001731, 12, "Z");
        setElement(term1001731, 13, "X");
        setElement(term1001731, 14, "C");
        setElement(term1001731, 15, "V");
        setField(term1001713, term1001713.getClass(), "binds", term1001731);
        setField(term981537, term981537.getClass(), "keys", term1001713);
        setField(term981537, term981537.getClass(), "detailed", "DzHVBMqWtE");
        setShortField(term1001792, term1001792.getClass(), "opcode", (short) 29688);
        setField(term1001792, term1001792.getClass(), "x", "THZSpzBRYP");
        setField(term1001792, term1001792.getClass(), "y", "ZfBIVGBQOE");
        setField(term1001792, term1001792.getClass(), "nnn", "QSrDQfEsTR");
        setField(term1001792, term1001792.getClass(), "nn", "PsqusYmejD");
        setField(term1001792, term1001792.getClass(), "n", "NTWMiBEaDF");
        setField(term1001792, term1001792.getClass(), "iBefore", "SPBstwKFVr");
        setField(term1001792, term1001792.getClass(), "i", "WxYUTuqmIq");
        setField(term1001792, term1001792.getClass(), "pc", "OeQLvhVERT");
        setBooleanField(term1001792, term1001792.getClass(), "state", true);
        setBooleanField(term1001792, term1001792.getClass(), "resolutionMode", true);
        setField(term981537, term981537.getClass(), "d", term1001792);
        setBooleanField(term1001892, term1001892.getClass(), "printToConsole", false);
        setBooleanField(term1001892, term1001892.getClass(), "disableUiUpdates", true);
        setField(term1001892, term1001892.getClass(), "printSymbol", "#");
        setBooleanField(term1001892, term1001892.getClass(), "spriteExtracting", true);
        setBooleanField(term1001892, term1001892.getClass(), "roundPixels", false);
        setBooleanField(term1001892, term1001892.getClass(), "blur", false);
        setBooleanField(term1001892, term1001892.getClass(), "glow", false);
        setDoubleField(term1001892, term1001892.getClass(), "blurValue", 0.36226058076369927);
        setDoubleField(term1001892, term1001892.getClass(), "glowValue", 0.03699061125289671);
        setField(term1001892, term1001892.getClass(), "bgColor", "IlvgFINwIa");
        setField(term1001892, term1001892.getClass(), "spriteColor", "GEJABPlHSI");
        setField(term1001892, term1001892.getClass(), "planeColor", "aQFUvuaYxd");
        setField(term1001892, term1001892.getClass(), "bothColor", "zNFLXMifnS");
        setBooleanField(term1001892, term1001892.getClass(), "quirkShift", true);
        setBooleanField(term1001892, term1001892.getClass(), "quirkJump", true);
        setBooleanField(term1001892, term1001892.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term1001892, term1001892.getClass(), "quirkOrder", false);
        setField(term981537, term981537.getClass(), "c", term1001892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Decoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "binaryOr", argTypes, term981537, args);
    }

};


