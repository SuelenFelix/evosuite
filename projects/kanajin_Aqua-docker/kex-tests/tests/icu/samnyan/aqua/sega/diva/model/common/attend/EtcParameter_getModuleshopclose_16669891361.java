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

public class EtcParameter_getModuleshopclose_16669891361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;

    public EtcParameter_getModuleshopclose_16669891361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31 = new Boolean(false);
        Boolean term33 = new Boolean(true);
        Boolean term35 = new Boolean(true);
        Boolean term37 = new Boolean(true);
        Boolean term39 = new Boolean(false);
        Boolean term41 = new Boolean(false);
        Boolean term43 = new Boolean(true);
        Boolean term45 = new Boolean(false);
        Integer term47 = new Integer(0);
        Boolean term49 = new Boolean(false);
        Boolean term51 = new Boolean(true);
        Boolean term53 = new Boolean(true);
        Boolean term55 = new Boolean(true);
        Boolean term57 = new Boolean(false);
        term30 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term30, term30.getClass(), "module_shop_close", term31);
        setField(term30, term30.getClass(), "card_reissue_close", term33);
        setField(term30, term30.getClass(), "card_renewal_close", term35);
        setField(term30, term30.getClass(), "reset_passwd_close", term37);
        setField(term30, term30.getClass(), "change_passwd_close", term39);
        setField(term30, term30.getClass(), "change_name_close", term41);
        setField(term30, term30.getClass(), "encore_mode_close", term43);
        setField(term30, term30.getClass(), "third_stg_mode_close", term45);
        setField(term30, term30.getClass(), "slow_down_threshold", term47);
        setField(term30, term30.getClass(), "log_write_flag", term49);
        setField(term30, term30.getClass(), "daily_quest_close", term51);
        setField(term30, term30.getClass(), "weekly_quest_close", term53);
        setField(term30, term30.getClass(), "special_quest_close", term55);
        setField(term30, term30.getClass(), "nppg_close", term57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModule_shop_close", argTypes, term30, args);
    }

};


