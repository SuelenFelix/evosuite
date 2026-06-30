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

public class EtcParameter_setLogwriteflag_194858813358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012;

    public EtcParameter_setLogwriteflag_194858813358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1012 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term1012, term1012.getClass(), "module_shop_close", null);
        setField(term1012, term1012.getClass(), "card_reissue_close", null);
        setField(term1012, term1012.getClass(), "card_renewal_close", null);
        setField(term1012, term1012.getClass(), "reset_passwd_close", null);
        setField(term1012, term1012.getClass(), "change_passwd_close", null);
        setField(term1012, term1012.getClass(), "change_name_close", null);
        setField(term1012, term1012.getClass(), "encore_mode_close", null);
        setField(term1012, term1012.getClass(), "third_stg_mode_close", null);
        setField(term1012, term1012.getClass(), "slow_down_threshold", null);
        setField(term1012, term1012.getClass(), "log_write_flag", null);
        setField(term1012, term1012.getClass(), "daily_quest_close", null);
        setField(term1012, term1012.getClass(), "weekly_quest_close", null);
        setField(term1012, term1012.getClass(), "special_quest_close", null);
        setField(term1012, term1012.getClass(), "nppg_close", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLog_write_flag", argTypes, term1012, args);
    }

};


