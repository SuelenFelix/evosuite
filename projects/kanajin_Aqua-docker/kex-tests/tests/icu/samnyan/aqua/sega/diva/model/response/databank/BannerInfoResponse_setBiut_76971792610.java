package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BannerInfoResponse_setBiut_76971792610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14742;

    public BannerInfoResponse_setBiut_76971792610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14742 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term14742, term14742.getClass(), "bi_lut", "IiNCZfdouL");
        setField(term14742, term14742.getClass(), "bi_id", "AhOHzCsHKW");
        setField(term14742, term14742.getClass(), "bi_st", "UqgLPaaAHi");
        setField(term14742, term14742.getClass(), "bi_et", "xypryEkUPF");
        setField(term14742, term14742.getClass(), "bi_ut", "zyZTzHNjQr");
        setField(term14742, term14742.getClass(), "cmd", "YSrFKQQwXE");
        setField(term14742, term14742.getClass(), "req_id", "qxhOsmyyjm");
        setField(term14742, term14742.getClass(), "stat", "DuKcNfVVYR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fRujHWvXjJ";
        callMethod(klass, "setBi_ut", argTypes, term14742, args);
    }

};


