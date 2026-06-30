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

public class EtcParameter_getResetpasswdclose_1579012174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;

    public EtcParameter_getResetpasswdclose_1579012174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term118 = new Boolean(false);
        Boolean term120 = new Boolean(true);
        Boolean term122 = new Boolean(true);
        Boolean term124 = new Boolean(true);
        Boolean term126 = new Boolean(false);
        Boolean term128 = new Boolean(false);
        Boolean term130 = new Boolean(true);
        Boolean term132 = new Boolean(false);
        Integer term134 = new Integer(0);
        Boolean term136 = new Boolean(false);
        Boolean term138 = new Boolean(true);
        Boolean term140 = new Boolean(true);
        Boolean term142 = new Boolean(true);
        Boolean term144 = new Boolean(false);
        term117 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term117, term117.getClass(), "module_shop_close", term118);
        setField(term117, term117.getClass(), "card_reissue_close", term120);
        setField(term117, term117.getClass(), "card_renewal_close", term122);
        setField(term117, term117.getClass(), "reset_passwd_close", term124);
        setField(term117, term117.getClass(), "change_passwd_close", term126);
        setField(term117, term117.getClass(), "change_name_close", term128);
        setField(term117, term117.getClass(), "encore_mode_close", term130);
        setField(term117, term117.getClass(), "third_stg_mode_close", term132);
        setField(term117, term117.getClass(), "slow_down_threshold", term134);
        setField(term117, term117.getClass(), "log_write_flag", term136);
        setField(term117, term117.getClass(), "daily_quest_close", term138);
        setField(term117, term117.getClass(), "weekly_quest_close", term140);
        setField(term117, term117.getClass(), "special_quest_close", term142);
        setField(term117, term117.getClass(), "nppg_close", term144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReset_passwd_close", argTypes, term117, args);
    }

};


