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

public class BannerInfoResponse_getBiut_11933863425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13769;

    public BannerInfoResponse_getBiut_11933863425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13769 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term13769, term13769.getClass(), "bi_lut", "YfkhviKZwl");
        setField(term13769, term13769.getClass(), "bi_id", "DcOhhAfJTI");
        setField(term13769, term13769.getClass(), "bi_st", "gYTIkBFOoS");
        setField(term13769, term13769.getClass(), "bi_et", "xmzSoVgiED");
        setField(term13769, term13769.getClass(), "bi_ut", "pdSvedKgPq");
        setField(term13769, term13769.getClass(), "cmd", "epPTwvcoyb");
        setField(term13769, term13769.getClass(), "req_id", "UBPHmOICBs");
        setField(term13769, term13769.getClass(), "stat", "IDJUVPgUJf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBi_ut", argTypes, term13769, args);
    }

};


