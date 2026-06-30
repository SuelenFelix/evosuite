package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SMLPublicOpenResponse_getCodepage_359244121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;

    public SMLPublicOpenResponse_getCodepage_359244121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term167 = new Integer(-1275173084);
        term142 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term143 = (byte[]) newByteArray(6);
        byte[] term150 = (byte[]) newByteArray(7);
        byte[] term158 = (byte[]) newByteArray(1);
        byte[] term160 = (byte[]) newByteArray(6);
        setByteElement(term143, 0, (byte) -111);
        setByteElement(term143, 1, (byte) 23);
        setByteElement(term143, 2, (byte) -15);
        setByteElement(term143, 3, (byte) 36);
        setByteElement(term143, 4, (byte) 118);
        setByteElement(term143, 5, (byte) 106);
        setField(term142, term142.getClass(), "codepage", term143);
        setByteElement(term150, 0, (byte) 98);
        setByteElement(term150, 1, (byte) 67);
        setByteElement(term150, 2, (byte) 66);
        setByteElement(term150, 3, (byte) -121);
        setByteElement(term150, 4, (byte) -119);
        setByteElement(term150, 5, (byte) 71);
        setByteElement(term150, 6, (byte) 80);
        setField(term142, term142.getClass(), "clientId", term150);
        setByteElement(term158, 0, (byte) 42);
        setField(term142, term142.getClass(), "reqFileId", term158);
        setByteElement(term160, 0, (byte) 72);
        setByteElement(term160, 1, (byte) 111);
        setByteElement(term160, 2, (byte) 99);
        setByteElement(term160, 3, (byte) -12);
        setByteElement(term160, 4, (byte) -61);
        setByteElement(term160, 5, (byte) -85);
        setField(term142, term142.getClass(), "serverId", term160);
        setField(term142, term142.getClass(), "refTime", null);
        setField(term142, term142.getClass(), "smlVersion", term167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodepage", argTypes, term142, args);
    }

};


