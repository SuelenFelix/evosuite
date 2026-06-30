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

public class ContestInfoResponse_getCilut_2384166156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15477;

    public ContestInfoResponse_getCilut_2384166156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15477 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse"));
        setField(term15477, term15477.getClass(), "ci_lut", null);
        setField(term15477, term15477.getClass(), "ci_str", null);
        setField(term15477, term15477.getClass(), "cmd", null);
        setField(term15477, term15477.getClass(), "req_id", null);
        setField(term15477, term15477.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCi_lut", argTypes, term15477, args);
    }

};


