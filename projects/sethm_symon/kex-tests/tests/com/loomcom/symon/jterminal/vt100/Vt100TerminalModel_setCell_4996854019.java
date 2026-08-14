package com.loomcom.symon.jterminal.vt100;

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
import static com.loomcom.symon.jterminal.vt100.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Vt100TerminalModel_setCell_4996854019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;
     Object term766;
     Object term768;
     Object term770;

    public Vt100TerminalModel_setCell_4996854019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel"));
        Object term706 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        Object term709 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequenceParser"));
        Object term710 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term711 = (byte[]) newByteArray(16);
        Object term730 = newInstance(Class.forName("com.loomcom.symon.jterminal.bell.NopBellStrategy"));
        Object[] term731 = (Object[]) newObjectArray(Array.newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"), 0).getClass(), 25);
        Object[] term732 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term733 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term734 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term735 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term736 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term737 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term738 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term739 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term740 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term741 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term742 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term743 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term744 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term745 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term746 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term747 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term748 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term749 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term750 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term751 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term752 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term753 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term754 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term755 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        Object[] term756 = (Object[]) newArray("com.loomcom.symon.jterminal.TerminalCell", 80);
        setIntField(term706, term706.getClass(), "savedCursorRow", -1);
        setIntField(term706, term706.getClass(), "savedCursorColumn", -1);
        setField(term706, term706.getClass(), "this$0", term705);
        setField(term705, term705.getClass(), "listener", term706);
        setField(term710, term710.getClass(), "value", term711);
        setByteField(term710, term710.getClass(), "coder", (byte) 0);
        setIntField(term710, term710.getClass(), "count", 0);
        setField(term709, term709.getClass(), "buffer", term710);
        setField(term709, term709.getClass(), "listener", term706);
        setField(term705, term705.getClass(), "parser", term709);
        setField(term705, term705.getClass(), "bellStrategy", term730);
        setElement(term731, 0, term732);
        setElement(term731, 1, term733);
        setElement(term731, 2, term734);
        setElement(term731, 3, term735);
        setElement(term731, 4, term736);
        setElement(term731, 5, term737);
        setElement(term731, 6, term738);
        setElement(term731, 7, term739);
        setElement(term731, 8, term740);
        setElement(term731, 9, term741);
        setElement(term731, 10, term742);
        setElement(term731, 11, term743);
        setElement(term731, 12, term744);
        setElement(term731, 13, term745);
        setElement(term731, 14, term746);
        setElement(term731, 15, term747);
        setElement(term731, 16, term748);
        setElement(term731, 17, term749);
        setElement(term731, 18, term750);
        setElement(term731, 19, term751);
        setElement(term731, 20, term752);
        setElement(term731, 21, term753);
        setElement(term731, 22, term754);
        setElement(term731, 23, term755);
        setElement(term731, 24, term756);
        setField(term705, term705.getClass(), "cells", term731);
        setIntField(term705, term705.getClass(), "columns", 80);
        setIntField(term705, term705.getClass(), "rows", 25);
        setIntField(term705, term705.getClass(), "bufferSize", 25);
        setIntField(term705, term705.getClass(), "cursorRow", -602026508);
        setIntField(term705, term705.getClass(), "cursorColumn", -157887805);
        setBooleanField(term705, term705.getClass(), "foregroundBold", true);
        setBooleanField(term705, term705.getClass(), "backgroundBold", true);
        setIntField(term705, term705.getClass(), "foregroundColor", 7);
        setIntField(term705, term705.getClass(), "backgroundColor", 1876565163);
        term766 = new Integer(-817164822);
        term768 = new Integer(-1016503459);
        term770 = newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"));
        Object term772 = newInstance(Class.forName("java.awt.Color"));
        float[] term774 = (float[]) newFloatArray(4);
        float[] term779 = (float[]) newFloatArray(3);
        Object term784 = newInstance(Class.forName("java.awt.Color"));
        float[] term786 = (float[]) newFloatArray(4);
        float[] term791 = (float[]) newFloatArray(1);
        setCharField(term770, term770.getClass(), "character", 'A');
        setIntField(term772, term772.getClass(), "value", -1968847291);
        setFloatElement(term774, 0, 0.13238746F);
        setFloatElement(term774, 1, 0.2707036F);
        setFloatElement(term774, 2, 0.3455959F);
        setFloatElement(term774, 3, 0.09123778F);
        setField(term772, term772.getClass(), "frgbvalue", term774);
        setFloatElement(term779, 0, 0.5523636F);
        setFloatElement(term779, 1, 0.8564069F);
        setFloatElement(term779, 2, 0.5446086F);
        setField(term772, term772.getClass(), "fvalue", term779);
        setFloatField(term772, term772.getClass(), "falpha", 0.5254275F);
        setField(term772, term772.getClass(), "cs", null);
        setField(term770, term770.getClass(), "backgroundColor", term772);
        setIntField(term784, term784.getClass(), "value", 579005622);
        setFloatElement(term786, 0, 0.2857073F);
        setFloatElement(term786, 1, 0.6880585F);
        setFloatElement(term786, 2, 0.40176582F);
        setFloatElement(term786, 3, 0.8783184F);
        setField(term784, term784.getClass(), "frgbvalue", term786);
        setFloatElement(term791, 0, 0.26413453F);
        setField(term784, term784.getClass(), "fvalue", term791);
        setFloatField(term784, term784.getClass(), "falpha", 0.7944024F);
        setField(term784, term784.getClass(), "cs", null);
        setField(term770, term770.getClass(), "foregroundColor", term784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Object[] args = new Object[3];
        args[0] = term766;
        args[1] = term768;
        args[2] = term770;
        callMethod(klass, "setCell", argTypes, term705, args);
    }

};


