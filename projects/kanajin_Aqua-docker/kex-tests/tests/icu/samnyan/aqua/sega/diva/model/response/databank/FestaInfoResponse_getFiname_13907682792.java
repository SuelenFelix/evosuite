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

public class FestaInfoResponse_getFiname_13907682792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4600;

    public FestaInfoResponse_getFiname_13907682792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4600 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term4600, term4600.getClass(), "fi_id", "nhoHrZfnIN");
        setField(term4600, term4600.getClass(), "fi_name", "ZkMALXpEAZ");
        setField(term4600, term4600.getClass(), "fi_kind", "tXfQjSqDzN");
        setField(term4600, term4600.getClass(), "fi_difficulty", "BjugTaMcxJ");
        setField(term4600, term4600.getClass(), "fi_pv_id_lst", "vGiuZVPJNH");
        setField(term4600, term4600.getClass(), "fi_attr", "tlzpzIjMib");
        setField(term4600, term4600.getClass(), "fi_add_vp", "AZdLeSugwv");
        setField(term4600, term4600.getClass(), "fi_mul_vp", "RMsXuyzKJV");
        setField(term4600, term4600.getClass(), "fi_st", "FwPbDZcHmB");
        setField(term4600, term4600.getClass(), "fi_et", "hOncybyCAH");
        setField(term4600, term4600.getClass(), "fi_lut", "QduALnDSVo");
        setField(term4600, term4600.getClass(), "cmd", "izPpKDErnQ");
        setField(term4600, term4600.getClass(), "req_id", "NnpwZBUTvx");
        setField(term4600, term4600.getClass(), "stat", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_name", argTypes, term4600, args);
    }

};


