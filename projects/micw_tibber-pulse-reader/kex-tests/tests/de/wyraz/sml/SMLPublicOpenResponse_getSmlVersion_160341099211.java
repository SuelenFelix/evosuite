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

public class SMLPublicOpenResponse_getSmlVersion_160341099211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618;

    public SMLPublicOpenResponse_getSmlVersion_160341099211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term634 = new Integer(-1145578966);
        term618 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term619 = (byte[]) newByteArray(4);
        byte[] term624 = (byte[]) newByteArray(2);
        byte[] term627 = (byte[]) newByteArray(5);
        byte[] term633 = (byte[]) newByteArray(0);
        setByteElement(term619, 0, (byte) -63);
        setByteElement(term619, 1, (byte) 108);
        setByteElement(term619, 2, (byte) -105);
        setByteElement(term619, 3, (byte) 33);
        setField(term618, term618.getClass(), "codepage", term619);
        setByteElement(term624, 0, (byte) 109);
        setByteElement(term624, 1, (byte) -54);
        setField(term618, term618.getClass(), "clientId", term624);
        setByteElement(term627, 0, (byte) -85);
        setByteElement(term627, 1, (byte) 81);
        setByteElement(term627, 2, (byte) -113);
        setByteElement(term627, 3, (byte) 90);
        setByteElement(term627, 4, (byte) 10);
        setField(term618, term618.getClass(), "reqFileId", term627);
        setField(term618, term618.getClass(), "serverId", term633);
        setField(term618, term618.getClass(), "refTime", null);
        setField(term618, term618.getClass(), "smlVersion", term634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmlVersion", argTypes, term618, args);
    }

};


