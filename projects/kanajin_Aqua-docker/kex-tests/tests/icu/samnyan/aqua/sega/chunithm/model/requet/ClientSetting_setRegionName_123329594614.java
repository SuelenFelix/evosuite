package icu.samnyan.aqua.sega.chunithm.model.requet;

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
import static icu.samnyan.aqua.sega.chunithm.model.requet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientSetting_setRegionName_123329594614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78646;

    public ClientSetting_setRegionName_123329594614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78646 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term78646, term78646.getClass(), "placeId", "xDzfsTlPyO");
        setField(term78646, term78646.getClass(), "clientId", "xtNbDPazRs");
        setField(term78646, term78646.getClass(), "placeName", "STfGRumXvX");
        setField(term78646, term78646.getClass(), "regionId", "qoMGJyerSD");
        setField(term78646, term78646.getClass(), "regionName", "YHHJhPAXoN");
        setField(term78646, term78646.getClass(), "allNetId", "nFsigFFmWc");
        setField(term78646, term78646.getClass(), "bordId", "qehgMPhJMU");
        setField(term78646, term78646.getClass(), "romVersion", "IjpmHZDGJg");
        setField(term78646, term78646.getClass(), "dataVersion", "kNKLoDsbIJ");
        setField(term78646, term78646.getClass(), "dumpFileNum", "QETULvuUfM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "erGLJPrSFu";
        callMethod(klass, "setRegionName", argTypes, term78646, args);
    }

};


