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

public class EtcParameter_setResetpasswdclose_20573106718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;
     Object term558;

    public EtcParameter_setResetpasswdclose_20573106718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term530 = new Boolean(false);
        Boolean term532 = new Boolean(true);
        Boolean term534 = new Boolean(true);
        Boolean term536 = new Boolean(true);
        Boolean term538 = new Boolean(false);
        Boolean term540 = new Boolean(false);
        Boolean term542 = new Boolean(true);
        Boolean term544 = new Boolean(false);
        Integer term546 = new Integer(0);
        Boolean term548 = new Boolean(false);
        Boolean term550 = new Boolean(true);
        Boolean term552 = new Boolean(true);
        Boolean term554 = new Boolean(true);
        Boolean term556 = new Boolean(false);
        term529 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term529, term529.getClass(), "module_shop_close", term530);
        setField(term529, term529.getClass(), "card_reissue_close", term532);
        setField(term529, term529.getClass(), "card_renewal_close", term534);
        setField(term529, term529.getClass(), "reset_passwd_close", term536);
        setField(term529, term529.getClass(), "change_passwd_close", term538);
        setField(term529, term529.getClass(), "change_name_close", term540);
        setField(term529, term529.getClass(), "encore_mode_close", term542);
        setField(term529, term529.getClass(), "third_stg_mode_close", term544);
        setField(term529, term529.getClass(), "slow_down_threshold", term546);
        setField(term529, term529.getClass(), "log_write_flag", term548);
        setField(term529, term529.getClass(), "daily_quest_close", term550);
        setField(term529, term529.getClass(), "weekly_quest_close", term552);
        setField(term529, term529.getClass(), "special_quest_close", term554);
        setField(term529, term529.getClass(), "nppg_close", term556);
        term558 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term558;
        callMethod(klass, "setReset_passwd_close", argTypes, term529, args);
    }

};


