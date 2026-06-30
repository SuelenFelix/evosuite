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

public class BannerInfoResponse_getBist_11933267603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13415;

    public BannerInfoResponse_getBist_11933267603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13415 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term13415, term13415.getClass(), "bi_lut", "FvUCZgTXhq");
        setField(term13415, term13415.getClass(), "bi_id", "wWWidPCHzx");
        setField(term13415, term13415.getClass(), "bi_st", "OwPIiBRuKK");
        setField(term13415, term13415.getClass(), "bi_et", "sgfGySMODT");
        setField(term13415, term13415.getClass(), "bi_ut", "ndAITnOsny");
        setField(term13415, term13415.getClass(), "cmd", "CVZnTiJucs");
        setField(term13415, term13415.getClass(), "req_id", "ecHEQufXoq");
        setField(term13415, term13415.getClass(), "stat", "btBLMvHzJg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBi_st", argTypes, term13415, args);
    }

};


