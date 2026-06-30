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

public class CstmzItmCtlgResponse_getCstmzitmctlglut_14097190671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2489;

    public CstmzItmCtlgResponse_getCstmzitmctlglut_14097190671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2489 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmCtlgResponse"));
        setField(term2489, term2489.getClass(), "cstmz_itm_ctlg_lut", "xBsXSDjXYK");
        setField(term2489, term2489.getClass(), "cstmz_itm_ctlg", "sEnIVFtZuQ");
        setField(term2489, term2489.getClass(), "cmd", "ZVecLZMLHF");
        setField(term2489, term2489.getClass(), "req_id", "fztQhjqwdP");
        setField(term2489, term2489.getClass(), "stat", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmCtlgResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_ctlg_lut", argTypes, term2489, args);
    }

};


