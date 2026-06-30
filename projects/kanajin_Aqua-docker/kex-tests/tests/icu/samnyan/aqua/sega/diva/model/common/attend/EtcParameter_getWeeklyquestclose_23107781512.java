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

public class EtcParameter_getWeeklyquestclose_23107781512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;

    public EtcParameter_getWeeklyquestclose_23107781512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term350 = new Boolean(false);
        Boolean term352 = new Boolean(true);
        Boolean term354 = new Boolean(true);
        Boolean term356 = new Boolean(true);
        Boolean term358 = new Boolean(false);
        Boolean term360 = new Boolean(false);
        Boolean term362 = new Boolean(true);
        Boolean term364 = new Boolean(false);
        Integer term366 = new Integer(0);
        Boolean term368 = new Boolean(false);
        Boolean term370 = new Boolean(true);
        Boolean term372 = new Boolean(true);
        Boolean term374 = new Boolean(true);
        Boolean term376 = new Boolean(false);
        term349 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term349, term349.getClass(), "module_shop_close", term350);
        setField(term349, term349.getClass(), "card_reissue_close", term352);
        setField(term349, term349.getClass(), "card_renewal_close", term354);
        setField(term349, term349.getClass(), "reset_passwd_close", term356);
        setField(term349, term349.getClass(), "change_passwd_close", term358);
        setField(term349, term349.getClass(), "change_name_close", term360);
        setField(term349, term349.getClass(), "encore_mode_close", term362);
        setField(term349, term349.getClass(), "third_stg_mode_close", term364);
        setField(term349, term349.getClass(), "slow_down_threshold", term366);
        setField(term349, term349.getClass(), "log_write_flag", term368);
        setField(term349, term349.getClass(), "daily_quest_close", term370);
        setField(term349, term349.getClass(), "weekly_quest_close", term372);
        setField(term349, term349.getClass(), "special_quest_close", term374);
        setField(term349, term349.getClass(), "nppg_close", term376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeekly_quest_close", argTypes, term349, args);
    }

};


