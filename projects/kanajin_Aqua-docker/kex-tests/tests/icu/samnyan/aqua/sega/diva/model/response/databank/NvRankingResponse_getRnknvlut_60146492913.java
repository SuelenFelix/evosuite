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

public class NvRankingResponse_getRnknvlut_60146492913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27676;

    public NvRankingResponse_getRnknvlut_60146492913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27676 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse"));
        setField(term27676, term27676.getClass(), "rnk_nv_tag_str", null);
        setField(term27676, term27676.getClass(), "rnk_nv_ts", null);
        setField(term27676, term27676.getClass(), "rnk_nv_data", null);
        setField(term27676, term27676.getClass(), "rnk_nv_lut", null);
        setField(term27676, term27676.getClass(), "cmd", null);
        setField(term27676, term27676.getClass(), "req_id", null);
        setField(term27676, term27676.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_nv_lut", argTypes, term27676, args);
    }

};


