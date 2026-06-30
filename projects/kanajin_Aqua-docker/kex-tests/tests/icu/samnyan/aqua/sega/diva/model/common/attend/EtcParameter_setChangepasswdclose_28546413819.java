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

public class EtcParameter_setChangepasswdclose_28546413819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;
     Object term589;

    public EtcParameter_setChangepasswdclose_28546413819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term561 = new Boolean(false);
        Boolean term563 = new Boolean(true);
        Boolean term565 = new Boolean(true);
        Boolean term567 = new Boolean(true);
        Boolean term569 = new Boolean(false);
        Boolean term571 = new Boolean(false);
        Boolean term573 = new Boolean(true);
        Boolean term575 = new Boolean(false);
        Integer term577 = new Integer(0);
        Boolean term579 = new Boolean(false);
        Boolean term581 = new Boolean(true);
        Boolean term583 = new Boolean(true);
        Boolean term585 = new Boolean(true);
        Boolean term587 = new Boolean(false);
        term560 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term560, term560.getClass(), "module_shop_close", term561);
        setField(term560, term560.getClass(), "card_reissue_close", term563);
        setField(term560, term560.getClass(), "card_renewal_close", term565);
        setField(term560, term560.getClass(), "reset_passwd_close", term567);
        setField(term560, term560.getClass(), "change_passwd_close", term569);
        setField(term560, term560.getClass(), "change_name_close", term571);
        setField(term560, term560.getClass(), "encore_mode_close", term573);
        setField(term560, term560.getClass(), "third_stg_mode_close", term575);
        setField(term560, term560.getClass(), "slow_down_threshold", term577);
        setField(term560, term560.getClass(), "log_write_flag", term579);
        setField(term560, term560.getClass(), "daily_quest_close", term581);
        setField(term560, term560.getClass(), "weekly_quest_close", term583);
        setField(term560, term560.getClass(), "special_quest_close", term585);
        setField(term560, term560.getClass(), "nppg_close", term587);
        term589 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term589;
        callMethod(klass, "setChange_passwd_close", argTypes, term560, args);
    }

};


