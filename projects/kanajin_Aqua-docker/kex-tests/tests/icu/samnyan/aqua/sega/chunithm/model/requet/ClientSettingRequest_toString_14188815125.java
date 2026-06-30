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
import java.lang.Object;

public class ClientSettingRequest_toString_14188815125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82567;

    public ClientSettingRequest_toString_14188815125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82567 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest"));
        Object term82568 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term82568, term82568.getClass(), "placeId", "YGWvExlOFa");
        setField(term82568, term82568.getClass(), "clientId", "DtiQRHgJmm");
        setField(term82568, term82568.getClass(), "placeName", "SDJYcRQAkM");
        setField(term82568, term82568.getClass(), "regionId", "UKWTVmTWAK");
        setField(term82568, term82568.getClass(), "regionName", "twYXqgjRmy");
        setField(term82568, term82568.getClass(), "allNetId", "HFaAuAnTOn");
        setField(term82568, term82568.getClass(), "bordId", "EJiGWkJgKE");
        setField(term82568, term82568.getClass(), "romVersion", "MJovsjjSeM");
        setField(term82568, term82568.getClass(), "dataVersion", "YONpdIaYPl");
        setField(term82568, term82568.getClass(), "dumpFileNum", "xQwJTVPqIz");
        setField(term82567, term82567.getClass(), "clientSetting", term82568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term82567, args);
    }

};


