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

public class CstmzItmCtlgResponse_setCstmzitmctlg_6463718014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2844;

    public CstmzItmCtlgResponse_setCstmzitmctlg_6463718014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2844 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmCtlgResponse"));
        setField(term2844, term2844.getClass(), "cstmz_itm_ctlg_lut", "WzMEhMXkKx");
        setField(term2844, term2844.getClass(), "cstmz_itm_ctlg", "XOiDvlDhdc");
        setField(term2844, term2844.getClass(), "cmd", "AdxvLJhNLe");
        setField(term2844, term2844.getClass(), "req_id", "lHfTrWKMPk");
        setField(term2844, term2844.getClass(), "stat", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmCtlgResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLUZFTfjle";
        callMethod(klass, "setCstmz_itm_ctlg", argTypes, term2844, args);
    }

};


