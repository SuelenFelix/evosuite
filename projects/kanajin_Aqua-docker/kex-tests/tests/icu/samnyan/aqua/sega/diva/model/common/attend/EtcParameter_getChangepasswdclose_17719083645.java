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

public class EtcParameter_getChangepasswdclose_17719083645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;

    public EtcParameter_getChangepasswdclose_17719083645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term147 = new Boolean(false);
        Boolean term149 = new Boolean(true);
        Boolean term151 = new Boolean(true);
        Boolean term153 = new Boolean(true);
        Boolean term155 = new Boolean(false);
        Boolean term157 = new Boolean(false);
        Boolean term159 = new Boolean(true);
        Boolean term161 = new Boolean(false);
        Integer term163 = new Integer(0);
        Boolean term165 = new Boolean(false);
        Boolean term167 = new Boolean(true);
        Boolean term169 = new Boolean(true);
        Boolean term171 = new Boolean(true);
        Boolean term173 = new Boolean(false);
        term146 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term146, term146.getClass(), "module_shop_close", term147);
        setField(term146, term146.getClass(), "card_reissue_close", term149);
        setField(term146, term146.getClass(), "card_renewal_close", term151);
        setField(term146, term146.getClass(), "reset_passwd_close", term153);
        setField(term146, term146.getClass(), "change_passwd_close", term155);
        setField(term146, term146.getClass(), "change_name_close", term157);
        setField(term146, term146.getClass(), "encore_mode_close", term159);
        setField(term146, term146.getClass(), "third_stg_mode_close", term161);
        setField(term146, term146.getClass(), "slow_down_threshold", term163);
        setField(term146, term146.getClass(), "log_write_flag", term165);
        setField(term146, term146.getClass(), "daily_quest_close", term167);
        setField(term146, term146.getClass(), "weekly_quest_close", term169);
        setField(term146, term146.getClass(), "special_quest_close", term171);
        setField(term146, term146.getClass(), "nppg_close", term173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChange_passwd_close", argTypes, term146, args);
    }

};


