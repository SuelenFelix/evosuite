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

public class PixelManager_canEqual_198436479839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662138;
     Object term5662324;

    public PixelManager_canEqual_198436479839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5662139 = new HashMap();
        term5662138 = newInstance(Class.forName("com.chip8.emulator.PixelManager"));
        Object[] term5662144 = (Object[]) newArray("[[Z", 3);
        Object[] term5662145 = (Object[]) newArray("[Z", 8);
        boolean[] term5662146 = (boolean[]) newBooleanArray(6);
        boolean[] term5662153 = (boolean[]) newBooleanArray(9);
        boolean[] term5662163 = (boolean[]) newBooleanArray(7);
        boolean[] term5662171 = (boolean[]) newBooleanArray(7);
        boolean[] term5662179 = (boolean[]) newBooleanArray(4);
        boolean[] term5662184 = (boolean[]) newBooleanArray(0);
        boolean[] term5662185 = (boolean[]) newBooleanArray(5);
        boolean[] term5662191 = (boolean[]) newBooleanArray(3);
        Object[] term5662195 = (Object[]) newArray("[Z", 8);
        boolean[] term5662196 = (boolean[]) newBooleanArray(0);
        boolean[] term5662197 = (boolean[]) newBooleanArray(1);
        boolean[] term5662199 = (boolean[]) newBooleanArray(6);
        boolean[] term5662206 = (boolean[]) newBooleanArray(6);
        boolean[] term5662213 = (boolean[]) newBooleanArray(3);
        boolean[] term5662217 = (boolean[]) newBooleanArray(9);
        boolean[] term5662227 = (boolean[]) newBooleanArray(7);
        boolean[] term5662235 = (boolean[]) newBooleanArray(9);
        Object[] term5662245 = (Object[]) newArray("[Z", 8);
        boolean[] term5662246 = (boolean[]) newBooleanArray(6);
        boolean[] term5662253 = (boolean[]) newBooleanArray(5);
        boolean[] term5662259 = (boolean[]) newBooleanArray(7);
        boolean[] term5662267 = (boolean[]) newBooleanArray(2);
        boolean[] term5662270 = (boolean[]) newBooleanArray(2);
        boolean[] term5662273 = (boolean[]) newBooleanArray(6);
        boolean[] term5662280 = (boolean[]) newBooleanArray(6);
        boolean[] term5662287 = (boolean[]) newBooleanArray(7);
        Object[] term5662299 = (Object[]) newArray("[Z", 5);
        boolean[] term5662300 = (boolean[]) newBooleanArray(3);
        boolean[] term5662304 = (boolean[]) newBooleanArray(0);
        boolean[] term5662305 = (boolean[]) newBooleanArray(0);
        boolean[] term5662306 = (boolean[]) newBooleanArray(6);
        boolean[] term5662313 = (boolean[]) newBooleanArray(6);
        setField(term5662138, term5662138.getClass(), "fadeMap", term5662139);
        setBooleanElement(term5662146, 1, true);
        setBooleanElement(term5662146, 3, true);
        setElement(term5662145, 0, term5662146);
        setBooleanElement(term5662153, 4, true);
        setBooleanElement(term5662153, 6, true);
        setElement(term5662145, 1, term5662153);
        setBooleanElement(term5662163, 0, true);
        setBooleanElement(term5662163, 1, true);
        setBooleanElement(term5662163, 2, true);
        setBooleanElement(term5662163, 3, true);
        setBooleanElement(term5662163, 4, true);
        setBooleanElement(term5662163, 6, true);
        setElement(term5662145, 2, term5662163);
        setBooleanElement(term5662171, 0, true);
        setBooleanElement(term5662171, 2, true);
        setBooleanElement(term5662171, 4, true);
        setBooleanElement(term5662171, 5, true);
        setBooleanElement(term5662171, 6, true);
        setElement(term5662145, 3, term5662171);
        setBooleanElement(term5662179, 1, true);
        setBooleanElement(term5662179, 3, true);
        setElement(term5662145, 4, term5662179);
        setElement(term5662145, 5, term5662184);
        setBooleanElement(term5662185, 1, true);
        setElement(term5662145, 6, term5662185);
        setBooleanElement(term5662191, 0, true);
        setBooleanElement(term5662191, 1, true);
        setElement(term5662145, 7, term5662191);
        setElement(term5662144, 0, term5662145);
        setElement(term5662195, 0, term5662196);
        setElement(term5662195, 1, term5662197);
        setBooleanElement(term5662199, 4, true);
        setBooleanElement(term5662199, 5, true);
        setElement(term5662195, 2, term5662199);
        setBooleanElement(term5662206, 0, true);
        setBooleanElement(term5662206, 2, true);
        setBooleanElement(term5662206, 3, true);
        setBooleanElement(term5662206, 4, true);
        setBooleanElement(term5662206, 5, true);
        setElement(term5662195, 3, term5662206);
        setBooleanElement(term5662213, 1, true);
        setElement(term5662195, 4, term5662213);
        setBooleanElement(term5662217, 1, true);
        setBooleanElement(term5662217, 3, true);
        setBooleanElement(term5662217, 4, true);
        setBooleanElement(term5662217, 5, true);
        setBooleanElement(term5662217, 7, true);
        setElement(term5662195, 5, term5662217);
        setBooleanElement(term5662227, 3, true);
        setBooleanElement(term5662227, 4, true);
        setBooleanElement(term5662227, 5, true);
        setBooleanElement(term5662227, 6, true);
        setElement(term5662195, 6, term5662227);
        setBooleanElement(term5662235, 0, true);
        setBooleanElement(term5662235, 1, true);
        setBooleanElement(term5662235, 2, true);
        setBooleanElement(term5662235, 3, true);
        setBooleanElement(term5662235, 5, true);
        setBooleanElement(term5662235, 6, true);
        setBooleanElement(term5662235, 7, true);
        setBooleanElement(term5662235, 8, true);
        setElement(term5662195, 7, term5662235);
        setElement(term5662144, 1, term5662195);
        setBooleanElement(term5662246, 2, true);
        setBooleanElement(term5662246, 4, true);
        setBooleanElement(term5662246, 5, true);
        setElement(term5662245, 0, term5662246);
        setBooleanElement(term5662253, 0, true);
        setBooleanElement(term5662253, 2, true);
        setBooleanElement(term5662253, 4, true);
        setElement(term5662245, 1, term5662253);
        setBooleanElement(term5662259, 3, true);
        setBooleanElement(term5662259, 4, true);
        setBooleanElement(term5662259, 5, true);
        setElement(term5662245, 2, term5662259);
        setBooleanElement(term5662267, 0, true);
        setElement(term5662245, 3, term5662267);
        setBooleanElement(term5662270, 0, true);
        setBooleanElement(term5662270, 1, true);
        setElement(term5662245, 4, term5662270);
        setBooleanElement(term5662273, 4, true);
        setElement(term5662245, 5, term5662273);
        setBooleanElement(term5662280, 0, true);
        setBooleanElement(term5662280, 5, true);
        setElement(term5662245, 6, term5662280);
        setBooleanElement(term5662287, 0, true);
        setBooleanElement(term5662287, 1, true);
        setBooleanElement(term5662287, 4, true);
        setElement(term5662245, 7, term5662287);
        setElement(term5662144, 2, term5662245);
        setField(term5662138, term5662138.getClass(), "display", term5662144);
        setIntField(term5662138, term5662138.getClass(), "x", 520504102);
        setIntField(term5662138, term5662138.getClass(), "y", -457396133);
        setBooleanField(term5662138, term5662138.getClass(), "fade", false);
        setDoubleField(term5662138, term5662138.getClass(), "fadeSpeed", 0.4228841212022646);
        setBooleanElement(term5662300, 2, true);
        setElement(term5662299, 0, term5662300);
        setElement(term5662299, 1, term5662304);
        setElement(term5662299, 2, term5662305);
        setElement(term5662299, 3, term5662306);
        setBooleanElement(term5662313, 0, true);
        setBooleanElement(term5662313, 1, true);
        setBooleanElement(term5662313, 2, true);
        setElement(term5662299, 4, term5662313);
        setField(term5662138, term5662138.getClass(), "spriteViewer", term5662299);
        setIntField(term5662138, term5662138.getClass(), "spriteHeight", -1793950607);
        setBooleanField(term5662138, term5662138.getClass(), "resolutionMode", true);
        setIntField(term5662138, term5662138.getClass(), "currentPlane", 1091954101);
        setBooleanField(term5662138, term5662138.getClass(), "xoMode", true);
        term5662324 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.PixelManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5662324;
        callMethod(klass, "canEqual", argTypes, term5662138, args);
    }

};


