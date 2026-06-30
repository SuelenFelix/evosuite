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

public class EtcParameter_toInternal_5789950590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EtcParameter_toInternal_5789950590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2 = new Boolean(false);
        Boolean term4 = new Boolean(true);
        Boolean term6 = new Boolean(true);
        Boolean term8 = new Boolean(true);
        Boolean term10 = new Boolean(false);
        Boolean term12 = new Boolean(false);
        Boolean term14 = new Boolean(true);
        Boolean term16 = new Boolean(false);
        Integer term18 = new Integer(0);
        Boolean term20 = new Boolean(false);
        Boolean term22 = new Boolean(true);
        Boolean term24 = new Boolean(true);
        Boolean term26 = new Boolean(true);
        Boolean term28 = new Boolean(false);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term1, term1.getClass(), "module_shop_close", term2);
        setField(term1, term1.getClass(), "card_reissue_close", term4);
        setField(term1, term1.getClass(), "card_renewal_close", term6);
        setField(term1, term1.getClass(), "reset_passwd_close", term8);
        setField(term1, term1.getClass(), "change_passwd_close", term10);
        setField(term1, term1.getClass(), "change_name_close", term12);
        setField(term1, term1.getClass(), "encore_mode_close", term14);
        setField(term1, term1.getClass(), "third_stg_mode_close", term16);
        setField(term1, term1.getClass(), "slow_down_threshold", term18);
        setField(term1, term1.getClass(), "log_write_flag", term20);
        setField(term1, term1.getClass(), "daily_quest_close", term22);
        setField(term1, term1.getClass(), "weekly_quest_close", term24);
        setField(term1, term1.getClass(), "special_quest_close", term26);
        setField(term1, term1.getClass(), "nppg_close", term28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInternal", argTypes, term1, args);
    }

};


