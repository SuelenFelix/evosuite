package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_setNickname_148465144027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24501;

    public PowerOnResponseV2_setNickname_148465144027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24501 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term24501, term24501.getClass(), "stat", -1022990421);
        setField(term24501, term24501.getClass(), "uri", "LFZNDELxUZ");
        setField(term24501, term24501.getClass(), "host", "GNIVsSTglt");
        setField(term24501, term24501.getClass(), "place_id", "mzPebFiUSP");
        setField(term24501, term24501.getClass(), "name", "HvbkjsQyDy");
        setField(term24501, term24501.getClass(), "nickname", "wzSukELQFL");
        setField(term24501, term24501.getClass(), "region0", "VZyeaOWYEj");
        setField(term24501, term24501.getClass(), "region_name0", "PErxMBQSUv");
        setField(term24501, term24501.getClass(), "region_name1", "KZQwbvujui");
        setField(term24501, term24501.getClass(), "region_name2", "JPUZuGxKlI");
        setField(term24501, term24501.getClass(), "region_name3", "xqIbVsUspl");
        setField(term24501, term24501.getClass(), "country", "GnjLRtJywq");
        setIntField(term24501, term24501.getClass(), "year", 1045547089);
        setIntField(term24501, term24501.getClass(), "month", -1122880881);
        setIntField(term24501, term24501.getClass(), "day", -542712742);
        setIntField(term24501, term24501.getClass(), "hour", -1254072822);
        setIntField(term24501, term24501.getClass(), "minute", -1111249833);
        setIntField(term24501, term24501.getClass(), "second", -1692331299);
        setField(term24501, term24501.getClass(), "setting", "TDaodpHTRK");
        setField(term24501, term24501.getClass(), "timezone", "JayazbYDLK");
        setField(term24501, term24501.getClass(), "res_class", "ORDuSTrpNA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hysThIPoEJ";
        callMethod(klass, "setNickname", argTypes, term24501, args);
    }

};


