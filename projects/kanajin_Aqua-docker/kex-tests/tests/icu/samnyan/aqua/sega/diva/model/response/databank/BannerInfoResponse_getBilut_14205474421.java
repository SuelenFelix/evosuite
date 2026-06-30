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

public class BannerInfoResponse_getBilut_14205474421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13061;

    public BannerInfoResponse_getBilut_14205474421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13061 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term13061, term13061.getClass(), "bi_lut", "AdSHvysxQB");
        setField(term13061, term13061.getClass(), "bi_id", "jlraKkBWFA");
        setField(term13061, term13061.getClass(), "bi_st", "mRBtFTxVdE");
        setField(term13061, term13061.getClass(), "bi_et", "IVacFDAZcj");
        setField(term13061, term13061.getClass(), "bi_ut", "EEYmuwyVDP");
        setField(term13061, term13061.getClass(), "cmd", "EWFbEDAVrE");
        setField(term13061, term13061.getClass(), "req_id", "EMiMtYgfvr");
        setField(term13061, term13061.getClass(), "stat", "OyYyYYnJuF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBi_lut", argTypes, term13061, args);
    }

};


