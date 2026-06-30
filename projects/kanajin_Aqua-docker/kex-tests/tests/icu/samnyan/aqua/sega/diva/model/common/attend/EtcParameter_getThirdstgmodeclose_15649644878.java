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

public class EtcParameter_getThirdstgmodeclose_15649644878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;

    public EtcParameter_getThirdstgmodeclose_15649644878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term234 = new Boolean(false);
        Boolean term236 = new Boolean(true);
        Boolean term238 = new Boolean(true);
        Boolean term240 = new Boolean(true);
        Boolean term242 = new Boolean(false);
        Boolean term244 = new Boolean(false);
        Boolean term246 = new Boolean(true);
        Boolean term248 = new Boolean(false);
        Integer term250 = new Integer(0);
        Boolean term252 = new Boolean(false);
        Boolean term254 = new Boolean(true);
        Boolean term256 = new Boolean(true);
        Boolean term258 = new Boolean(true);
        Boolean term260 = new Boolean(false);
        term233 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term233, term233.getClass(), "module_shop_close", term234);
        setField(term233, term233.getClass(), "card_reissue_close", term236);
        setField(term233, term233.getClass(), "card_renewal_close", term238);
        setField(term233, term233.getClass(), "reset_passwd_close", term240);
        setField(term233, term233.getClass(), "change_passwd_close", term242);
        setField(term233, term233.getClass(), "change_name_close", term244);
        setField(term233, term233.getClass(), "encore_mode_close", term246);
        setField(term233, term233.getClass(), "third_stg_mode_close", term248);
        setField(term233, term233.getClass(), "slow_down_threshold", term250);
        setField(term233, term233.getClass(), "log_write_flag", term252);
        setField(term233, term233.getClass(), "daily_quest_close", term254);
        setField(term233, term233.getClass(), "weekly_quest_close", term256);
        setField(term233, term233.getClass(), "special_quest_close", term258);
        setField(term233, term233.getClass(), "nppg_close", term260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThird_stg_mode_close", argTypes, term233, args);
    }

};


