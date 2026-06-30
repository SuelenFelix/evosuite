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

public class ClientSetting_getBordId_15792627716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76790;

    public ClientSetting_getBordId_15792627716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76790 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term76790, term76790.getClass(), "placeId", "pttzoCMsTO");
        setField(term76790, term76790.getClass(), "clientId", "UZDKpgGSjX");
        setField(term76790, term76790.getClass(), "placeName", "foaQZmXMHo");
        setField(term76790, term76790.getClass(), "regionId", "BTiRFFuMmf");
        setField(term76790, term76790.getClass(), "regionName", "eUQNprkBYk");
        setField(term76790, term76790.getClass(), "allNetId", "RCWgKGfqgy");
        setField(term76790, term76790.getClass(), "bordId", "RownRxaaCW");
        setField(term76790, term76790.getClass(), "romVersion", "QJsmuCTCTh");
        setField(term76790, term76790.getClass(), "dataVersion", "kTuulZLRxo");
        setField(term76790, term76790.getClass(), "dumpFileNum", "ZiwCIBjVsO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBordId", argTypes, term76790, args);
    }

};


