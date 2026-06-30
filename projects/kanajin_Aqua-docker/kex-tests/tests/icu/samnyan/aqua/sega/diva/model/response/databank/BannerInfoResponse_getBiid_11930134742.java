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

public class BannerInfoResponse_getBiid_11930134742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13238;

    public BannerInfoResponse_getBiid_11930134742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13238 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term13238, term13238.getClass(), "bi_lut", "aYLvcxZohT");
        setField(term13238, term13238.getClass(), "bi_id", "mnHyQbMyld");
        setField(term13238, term13238.getClass(), "bi_st", "KHtaDOIcJZ");
        setField(term13238, term13238.getClass(), "bi_et", "vgdwrCZczl");
        setField(term13238, term13238.getClass(), "bi_ut", "gKMNrpKBpu");
        setField(term13238, term13238.getClass(), "cmd", "ZbHJVEqcoa");
        setField(term13238, term13238.getClass(), "req_id", "awDQVEVIKi");
        setField(term13238, term13238.getClass(), "stat", "HJwNgUzZZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBi_id", argTypes, term13238, args);
    }

};


