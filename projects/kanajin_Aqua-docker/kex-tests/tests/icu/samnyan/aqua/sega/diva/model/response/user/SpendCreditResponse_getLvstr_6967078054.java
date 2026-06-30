package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpendCreditResponse_getLvstr_6967078054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;

    public SpendCreditResponse_getLvstr_6967078054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term464, term464.getClass(), "cmpgn_rslt", "hNxWaHcfhY");
        setIntField(term464, term464.getClass(), "cmpgn_rslt_num", -1685132342);
        setIntField(term464, term464.getClass(), "vcld_pts", -1456670397);
        setField(term464, term464.getClass(), "lv_str", "RkybSrpybU");
        setIntField(term464, term464.getClass(), "lv_efct_id", 1622346318);
        setIntField(term464, term464.getClass(), "lv_plt_id", 1048535127);
        setField(term464, term464.getClass(), "cmd", "xOEqzGAmDU");
        setField(term464, term464.getClass(), "req_id", "eZFUvlxvGV");
        setField(term464, term464.getClass(), "stat", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term464, args);
    }

};


