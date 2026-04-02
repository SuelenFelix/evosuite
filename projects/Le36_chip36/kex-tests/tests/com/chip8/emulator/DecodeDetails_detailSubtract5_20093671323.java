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

public class DecodeDetails_detailSubtract5_20093671323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4712504;
     Object term4712604;
     Object term4712606;

    public DecodeDetails_detailSubtract5_20093671323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4712504 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4712504, term4712504.getClass(), "opcode", (short) 17403);
        setField(term4712504, term4712504.getClass(), "x", "VoKhXiLAaW");
        setField(term4712504, term4712504.getClass(), "y", "CaalXzRXQI");
        setField(term4712504, term4712504.getClass(), "nnn", "eRBnKPjyVg");
        setField(term4712504, term4712504.getClass(), "nn", "svPqsHBvrm");
        setField(term4712504, term4712504.getClass(), "n", "sRzUJLYMmB");
        setField(term4712504, term4712504.getClass(), "iBefore", "XxILklSDwz");
        setField(term4712504, term4712504.getClass(), "i", "TLjhFZbwKO");
        setField(term4712504, term4712504.getClass(), "pc", "nxEbLIApFc");
        setBooleanField(term4712504, term4712504.getClass(), "state", false);
        setBooleanField(term4712504, term4712504.getClass(), "resolutionMode", true);
        term4712604 = new Byte((byte) 25);
        term4712606 = new Byte((byte) 103);
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
        args[0] = term4712604;
        args[1] = term4712606;
        args[2] = "zzsdNZhejE";
        args[3] = "ILoodMZrgR";
        callMethod(klass, "detailSubtract5", argTypes, term4712504, args);
    }

};


