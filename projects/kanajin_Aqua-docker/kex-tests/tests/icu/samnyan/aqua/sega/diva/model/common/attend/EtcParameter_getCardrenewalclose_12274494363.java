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

public class EtcParameter_getCardrenewalclose_12274494363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;

    public EtcParameter_getCardrenewalclose_12274494363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term89 = new Boolean(false);
        Boolean term91 = new Boolean(true);
        Boolean term93 = new Boolean(true);
        Boolean term95 = new Boolean(true);
        Boolean term97 = new Boolean(false);
        Boolean term99 = new Boolean(false);
        Boolean term101 = new Boolean(true);
        Boolean term103 = new Boolean(false);
        Integer term105 = new Integer(0);
        Boolean term107 = new Boolean(false);
        Boolean term109 = new Boolean(true);
        Boolean term111 = new Boolean(true);
        Boolean term113 = new Boolean(true);
        Boolean term115 = new Boolean(false);
        term88 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term88, term88.getClass(), "module_shop_close", term89);
        setField(term88, term88.getClass(), "card_reissue_close", term91);
        setField(term88, term88.getClass(), "card_renewal_close", term93);
        setField(term88, term88.getClass(), "reset_passwd_close", term95);
        setField(term88, term88.getClass(), "change_passwd_close", term97);
        setField(term88, term88.getClass(), "change_name_close", term99);
        setField(term88, term88.getClass(), "encore_mode_close", term101);
        setField(term88, term88.getClass(), "third_stg_mode_close", term103);
        setField(term88, term88.getClass(), "slow_down_threshold", term105);
        setField(term88, term88.getClass(), "log_write_flag", term107);
        setField(term88, term88.getClass(), "daily_quest_close", term109);
        setField(term88, term88.getClass(), "weekly_quest_close", term111);
        setField(term88, term88.getClass(), "special_quest_close", term113);
        setField(term88, term88.getClass(), "nppg_close", term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard_renewal_close", argTypes, term88, args);
    }

};


