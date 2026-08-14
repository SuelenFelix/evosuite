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
import java.lang.Byte;

public class DecodeDetails_detailBinary_175308439521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4712092;
     Object term4712192;
     Object term4712194;

    public DecodeDetails_detailBinary_175308439521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4712092 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4712092, term4712092.getClass(), "opcode", (short) -2611);
        setField(term4712092, term4712092.getClass(), "x", "MANlfBKTPY");
        setField(term4712092, term4712092.getClass(), "y", "mRoEmuCJhW");
        setField(term4712092, term4712092.getClass(), "nnn", "JJUWbMXpyM");
        setField(term4712092, term4712092.getClass(), "nn", "KDrRQWVXok");
        setField(term4712092, term4712092.getClass(), "n", "oOOwvWgxtf");
        setField(term4712092, term4712092.getClass(), "iBefore", "ywoADeiUfF");
        setField(term4712092, term4712092.getClass(), "i", "loHiudJxbt");
        setField(term4712092, term4712092.getClass(), "pc", "lRbxbybNew");
        setBooleanField(term4712092, term4712092.getClass(), "state", false);
        setBooleanField(term4712092, term4712092.getClass(), "resolutionMode", false);
        term4712192 = new Byte((byte) -67);
        term4712194 = new Byte((byte) -94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4712192;
        args[1] = term4712194;
        args[2] = "WzGudiEARD";
        args[3] = "IoefPqGtaj";
        callMethod(klass, "detailBinary", argTypes, term4712092, args);
    }

};


