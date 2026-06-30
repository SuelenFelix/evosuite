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

public class PstdItemNgLstResponse_setPstdisenlst_7136526176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3822;

    public PstdItemNgLstResponse_setPstdisenlst_7136526176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3822 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse"));
        setField(term3822, term3822.getClass(), "p_std_i_n_lut", "smnHEqRFRx");
        setField(term3822, term3822.getClass(), "p_std_i_ie_n_lst", "XYtryyobou");
        setField(term3822, term3822.getClass(), "p_std_i_se_n_lst", "OYbzXylRWW");
        setField(term3822, term3822.getClass(), "cmd", "DSNsTGYXDF");
        setField(term3822, term3822.getClass(), "req_id", "sQvGcVjdEx");
        setField(term3822, term3822.getClass(), "stat", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zUlRdimJtU";
        callMethod(klass, "setP_std_i_se_n_lst", argTypes, term3822, args);
    }

};


