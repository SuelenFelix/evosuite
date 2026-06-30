package icu.samnyan.aqua.sega.diva.model.common.attend;

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
import static icu.samnyan.aqua.sega.diva.model.common.attend.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class EtcParameter_getSpecialquestclose_139349497913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378;

    public EtcParameter_getSpecialquestclose_139349497913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term379 = new Boolean(false);
        Boolean term381 = new Boolean(true);
        Boolean term383 = new Boolean(true);
        Boolean term385 = new Boolean(true);
        Boolean term387 = new Boolean(false);
        Boolean term389 = new Boolean(false);
        Boolean term391 = new Boolean(true);
        Boolean term393 = new Boolean(false);
        Integer term395 = new Integer(0);
        Boolean term397 = new Boolean(false);
        Boolean term399 = new Boolean(true);
        Boolean term401 = new Boolean(true);
        Boolean term403 = new Boolean(true);
        Boolean term405 = new Boolean(false);
        term378 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term378, term378.getClass(), "module_shop_close", term379);
        setField(term378, term378.getClass(), "card_reissue_close", term381);
        setField(term378, term378.getClass(), "card_renewal_close", term383);
        setField(term378, term378.getClass(), "reset_passwd_close", term385);
        setField(term378, term378.getClass(), "change_passwd_close", term387);
        setField(term378, term378.getClass(), "change_name_close", term389);
        setField(term378, term378.getClass(), "encore_mode_close", term391);
        setField(term378, term378.getClass(), "third_stg_mode_close", term393);
        setField(term378, term378.getClass(), "slow_down_threshold", term395);
        setField(term378, term378.getClass(), "log_write_flag", term397);
        setField(term378, term378.getClass(), "daily_quest_close", term399);
        setField(term378, term378.getClass(), "weekly_quest_close", term401);
        setField(term378, term378.getClass(), "special_quest_close", term403);
        setField(term378, term378.getClass(), "nppg_close", term405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecial_quest_close", argTypes, term378, args);
    }

};


