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

public class EtcParameter_setSlowdownthreshold_66714205423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684;
     Object term713;

    public EtcParameter_setSlowdownthreshold_66714205423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term685 = new Boolean(false);
        Boolean term687 = new Boolean(true);
        Boolean term689 = new Boolean(true);
        Boolean term691 = new Boolean(true);
        Boolean term693 = new Boolean(false);
        Boolean term695 = new Boolean(false);
        Boolean term697 = new Boolean(true);
        Boolean term699 = new Boolean(false);
        Integer term701 = new Integer(0);
        Boolean term703 = new Boolean(false);
        Boolean term705 = new Boolean(true);
        Boolean term707 = new Boolean(true);
        Boolean term709 = new Boolean(true);
        Boolean term711 = new Boolean(false);
        term684 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term684, term684.getClass(), "module_shop_close", term685);
        setField(term684, term684.getClass(), "card_reissue_close", term687);
        setField(term684, term684.getClass(), "card_renewal_close", term689);
        setField(term684, term684.getClass(), "reset_passwd_close", term691);
        setField(term684, term684.getClass(), "change_passwd_close", term693);
        setField(term684, term684.getClass(), "change_name_close", term695);
        setField(term684, term684.getClass(), "encore_mode_close", term697);
        setField(term684, term684.getClass(), "third_stg_mode_close", term699);
        setField(term684, term684.getClass(), "slow_down_threshold", term701);
        setField(term684, term684.getClass(), "log_write_flag", term703);
        setField(term684, term684.getClass(), "daily_quest_close", term705);
        setField(term684, term684.getClass(), "weekly_quest_close", term707);
        setField(term684, term684.getClass(), "special_quest_close", term709);
        setField(term684, term684.getClass(), "nppg_close", term711);
        term713 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term713;
        callMethod(klass, "setSlow_down_threshold", argTypes, term684, args);
    }

};


