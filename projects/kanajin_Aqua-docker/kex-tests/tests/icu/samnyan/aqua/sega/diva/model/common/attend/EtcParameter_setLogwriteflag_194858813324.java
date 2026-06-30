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

public class EtcParameter_setLogwriteflag_194858813324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;
     Object term744;

    public EtcParameter_setLogwriteflag_194858813324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term716 = new Boolean(false);
        Boolean term718 = new Boolean(true);
        Boolean term720 = new Boolean(true);
        Boolean term722 = new Boolean(true);
        Boolean term724 = new Boolean(false);
        Boolean term726 = new Boolean(false);
        Boolean term728 = new Boolean(true);
        Boolean term730 = new Boolean(false);
        Integer term732 = new Integer(0);
        Boolean term734 = new Boolean(false);
        Boolean term736 = new Boolean(true);
        Boolean term738 = new Boolean(true);
        Boolean term740 = new Boolean(true);
        Boolean term742 = new Boolean(false);
        term715 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term715, term715.getClass(), "module_shop_close", term716);
        setField(term715, term715.getClass(), "card_reissue_close", term718);
        setField(term715, term715.getClass(), "card_renewal_close", term720);
        setField(term715, term715.getClass(), "reset_passwd_close", term722);
        setField(term715, term715.getClass(), "change_passwd_close", term724);
        setField(term715, term715.getClass(), "change_name_close", term726);
        setField(term715, term715.getClass(), "encore_mode_close", term728);
        setField(term715, term715.getClass(), "third_stg_mode_close", term730);
        setField(term715, term715.getClass(), "slow_down_threshold", term732);
        setField(term715, term715.getClass(), "log_write_flag", term734);
        setField(term715, term715.getClass(), "daily_quest_close", term736);
        setField(term715, term715.getClass(), "weekly_quest_close", term738);
        setField(term715, term715.getClass(), "special_quest_close", term740);
        setField(term715, term715.getClass(), "nppg_close", term742);
        term744 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term744;
        callMethod(klass, "setLog_write_flag", argTypes, term715, args);
    }

};


