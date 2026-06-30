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

public class FestaInfoResponse_setFist_192490995320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10338;

    public FestaInfoResponse_setFist_192490995320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10338 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term10338, term10338.getClass(), "fi_id", "pXxkiXgQnq");
        setField(term10338, term10338.getClass(), "fi_name", "tKmrUDURku");
        setField(term10338, term10338.getClass(), "fi_kind", "JeZbrwZmsP");
        setField(term10338, term10338.getClass(), "fi_difficulty", "bxyfeicqrK");
        setField(term10338, term10338.getClass(), "fi_pv_id_lst", "vBnWPlsZMk");
        setField(term10338, term10338.getClass(), "fi_attr", "fIZsWucfXz");
        setField(term10338, term10338.getClass(), "fi_add_vp", "IApvtmfhnq");
        setField(term10338, term10338.getClass(), "fi_mul_vp", "VSaNnhMpRc");
        setField(term10338, term10338.getClass(), "fi_st", "QNjNTLlUaV");
        setField(term10338, term10338.getClass(), "fi_et", "hIYsRyOZxk");
        setField(term10338, term10338.getClass(), "fi_lut", "RjNoEywJbC");
        setField(term10338, term10338.getClass(), "cmd", "RTTvrwwhou");
        setField(term10338, term10338.getClass(), "req_id", "lRORwXipuk");
        setField(term10338, term10338.getClass(), "stat", "fVdTcjgHdw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wwAwLLcLPp";
        callMethod(klass, "setFi_st", argTypes, term10338, args);
    }

};


