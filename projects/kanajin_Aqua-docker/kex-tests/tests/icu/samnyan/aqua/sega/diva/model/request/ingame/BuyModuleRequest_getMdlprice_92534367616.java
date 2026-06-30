package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BuyModuleRequest_getMdlprice_92534367616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258857;

    public BuyModuleRequest_getMdlprice_92534367616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258857 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        setIntField(term258857, term258857.getClass(), "pd_id", 0);
        setIntField(term258857, term258857.getClass(), "accept_idx", 0);
        setIntField(term258857, term258857.getClass(), "start_idx", 0);
        setIntField(term258857, term258857.getClass(), "mdl_id", 0);
        setIntField(term258857, term258857.getClass(), "mdl_price", 0);
        setField(term258857, term258857.getClass(), "cmd", null);
        setField(term258857, term258857.getClass(), "req_id", null);
        setField(term258857, term258857.getClass(), "game_id", null);
        setField(term258857, term258857.getClass(), "r_ver", null);
        setField(term258857, term258857.getClass(), "kc_serial", null);
        setField(term258857, term258857.getClass(), "b_serial", null);
        setField(term258857, term258857.getClass(), "place_id", null);
        setField(term258857, term258857.getClass(), "time_stamp", null);
        setField(term258857, term258857.getClass(), "start_up_mode", null);
        setField(term258857, term258857.getClass(), "cmm_dly_mod", null);
        setField(term258857, term258857.getClass(), "cmm_dly_sec", null);
        setField(term258857, term258857.getClass(), "cmm_err_mod", null);
        setField(term258857, term258857.getClass(), "country_code", null);
        setField(term258857, term258857.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_price", argTypes, term258857, args);
    }

};


