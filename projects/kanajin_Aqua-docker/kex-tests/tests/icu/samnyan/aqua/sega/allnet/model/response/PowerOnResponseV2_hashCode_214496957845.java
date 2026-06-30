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

public class PowerOnResponseV2_hashCode_214496957845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30423;

    public PowerOnResponseV2_hashCode_214496957845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30423 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term30423, term30423.getClass(), "stat", 1116576792);
        setField(term30423, term30423.getClass(), "uri", "PQLyoEKWSa");
        setField(term30423, term30423.getClass(), "host", "HOgkhttJZS");
        setField(term30423, term30423.getClass(), "place_id", "goqNSmXSSS");
        setField(term30423, term30423.getClass(), "name", "AkViBLdqXM");
        setField(term30423, term30423.getClass(), "nickname", "UlxGFzEifL");
        setField(term30423, term30423.getClass(), "region0", "HilHTbDKDF");
        setField(term30423, term30423.getClass(), "region_name0", "IaEqlVwmNS");
        setField(term30423, term30423.getClass(), "region_name1", "ljNOgdPWrL");
        setField(term30423, term30423.getClass(), "region_name2", "oBlIZiyRMS");
        setField(term30423, term30423.getClass(), "region_name3", "QUYAkhtCNh");
        setField(term30423, term30423.getClass(), "country", "kOaAQOLyqd");
        setIntField(term30423, term30423.getClass(), "year", -942194446);
        setIntField(term30423, term30423.getClass(), "month", -938508470);
        setIntField(term30423, term30423.getClass(), "day", 1242676024);
        setIntField(term30423, term30423.getClass(), "hour", -1865023308);
        setIntField(term30423, term30423.getClass(), "minute", 1698510819);
        setIntField(term30423, term30423.getClass(), "second", -1553893255);
        setField(term30423, term30423.getClass(), "setting", "ICBWiKaeHC");
        setField(term30423, term30423.getClass(), "timezone", "WAljagiCzu");
        setField(term30423, term30423.getClass(), "res_class", "XKMXfDZajw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term30423, args);
    }

};


