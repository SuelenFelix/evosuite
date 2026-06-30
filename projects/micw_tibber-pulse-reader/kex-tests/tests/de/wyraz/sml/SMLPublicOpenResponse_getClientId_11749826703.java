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

public class SMLPublicOpenResponse_getClientId_11749826703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public SMLPublicOpenResponse_getClientId_11749826703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term250 = new Integer(-203030934);
        term229 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term230 = (byte[]) newByteArray(0);
        byte[] term231 = (byte[]) newByteArray(2);
        byte[] term234 = (byte[]) newByteArray(8);
        byte[] term243 = (byte[]) newByteArray(6);
        setField(term229, term229.getClass(), "codepage", term230);
        setByteElement(term231, 0, (byte) -81);
        setByteElement(term231, 1, (byte) 102);
        setField(term229, term229.getClass(), "clientId", term231);
        setByteElement(term234, 0, (byte) -118);
        setByteElement(term234, 1, (byte) -126);
        setByteElement(term234, 2, (byte) -91);
        setByteElement(term234, 3, (byte) -104);
        setByteElement(term234, 4, (byte) -89);
        setByteElement(term234, 5, (byte) 13);
        setByteElement(term234, 6, (byte) 44);
        setByteElement(term234, 7, (byte) -63);
        setField(term229, term229.getClass(), "reqFileId", term234);
        setByteElement(term243, 0, (byte) 15);
        setByteElement(term243, 1, (byte) 45);
        setByteElement(term243, 2, (byte) -39);
        setByteElement(term243, 3, (byte) -20);
        setByteElement(term243, 4, (byte) 10);
        setByteElement(term243, 5, (byte) 77);
        setField(term229, term229.getClass(), "serverId", term243);
        setField(term229, term229.getClass(), "refTime", null);
        setField(term229, term229.getClass(), "smlVersion", term250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientId", argTypes, term229, args);
    }

};


