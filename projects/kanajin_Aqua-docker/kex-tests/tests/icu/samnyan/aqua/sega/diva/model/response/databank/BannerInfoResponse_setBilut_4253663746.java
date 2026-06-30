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

public class BannerInfoResponse_setBilut_4253663746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13946;

    public BannerInfoResponse_setBilut_4253663746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13946 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term13946, term13946.getClass(), "bi_lut", "JmnWRJUxGr");
        setField(term13946, term13946.getClass(), "bi_id", "wgRGBNrTGP");
        setField(term13946, term13946.getClass(), "bi_st", "FIdNVptZpW");
        setField(term13946, term13946.getClass(), "bi_et", "rQjxAhisjm");
        setField(term13946, term13946.getClass(), "bi_ut", "ZDhASPHjDG");
        setField(term13946, term13946.getClass(), "cmd", "HNVOAXYNEZ");
        setField(term13946, term13946.getClass(), "req_id", "gbbYBYyfvr");
        setField(term13946, term13946.getClass(), "stat", "SrWMUlbtWV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VePIumgrrU";
        callMethod(klass, "setBi_lut", argTypes, term13946, args);
    }

};


