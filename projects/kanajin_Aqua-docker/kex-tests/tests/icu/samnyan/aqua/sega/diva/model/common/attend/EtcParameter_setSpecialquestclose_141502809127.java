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

public class EtcParameter_setSpecialquestclose_141502809127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;
     Object term837;

    public EtcParameter_setSpecialquestclose_141502809127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term809 = new Boolean(false);
        Boolean term811 = new Boolean(true);
        Boolean term813 = new Boolean(true);
        Boolean term815 = new Boolean(true);
        Boolean term817 = new Boolean(false);
        Boolean term819 = new Boolean(false);
        Boolean term821 = new Boolean(true);
        Boolean term823 = new Boolean(false);
        Integer term825 = new Integer(0);
        Boolean term827 = new Boolean(false);
        Boolean term829 = new Boolean(true);
        Boolean term831 = new Boolean(true);
        Boolean term833 = new Boolean(true);
        Boolean term835 = new Boolean(false);
        term808 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term808, term808.getClass(), "module_shop_close", term809);
        setField(term808, term808.getClass(), "card_reissue_close", term811);
        setField(term808, term808.getClass(), "card_renewal_close", term813);
        setField(term808, term808.getClass(), "reset_passwd_close", term815);
        setField(term808, term808.getClass(), "change_passwd_close", term817);
        setField(term808, term808.getClass(), "change_name_close", term819);
        setField(term808, term808.getClass(), "encore_mode_close", term821);
        setField(term808, term808.getClass(), "third_stg_mode_close", term823);
        setField(term808, term808.getClass(), "slow_down_threshold", term825);
        setField(term808, term808.getClass(), "log_write_flag", term827);
        setField(term808, term808.getClass(), "daily_quest_close", term829);
        setField(term808, term808.getClass(), "weekly_quest_close", term831);
        setField(term808, term808.getClass(), "special_quest_close", term833);
        setField(term808, term808.getClass(), "nppg_close", term835);
        term837 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term837;
        callMethod(klass, "setSpecial_quest_close", argTypes, term808, args);
    }

};


