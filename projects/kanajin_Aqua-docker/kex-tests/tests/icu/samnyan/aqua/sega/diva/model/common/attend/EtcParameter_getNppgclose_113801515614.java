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

public class EtcParameter_getNppgclose_113801515614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407;

    public EtcParameter_getNppgclose_113801515614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term408 = new Boolean(false);
        Boolean term410 = new Boolean(true);
        Boolean term412 = new Boolean(true);
        Boolean term414 = new Boolean(true);
        Boolean term416 = new Boolean(false);
        Boolean term418 = new Boolean(false);
        Boolean term420 = new Boolean(true);
        Boolean term422 = new Boolean(false);
        Integer term424 = new Integer(0);
        Boolean term426 = new Boolean(false);
        Boolean term428 = new Boolean(true);
        Boolean term430 = new Boolean(true);
        Boolean term432 = new Boolean(true);
        Boolean term434 = new Boolean(false);
        term407 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term407, term407.getClass(), "module_shop_close", term408);
        setField(term407, term407.getClass(), "card_reissue_close", term410);
        setField(term407, term407.getClass(), "card_renewal_close", term412);
        setField(term407, term407.getClass(), "reset_passwd_close", term414);
        setField(term407, term407.getClass(), "change_passwd_close", term416);
        setField(term407, term407.getClass(), "change_name_close", term418);
        setField(term407, term407.getClass(), "encore_mode_close", term420);
        setField(term407, term407.getClass(), "third_stg_mode_close", term422);
        setField(term407, term407.getClass(), "slow_down_threshold", term424);
        setField(term407, term407.getClass(), "log_write_flag", term426);
        setField(term407, term407.getClass(), "daily_quest_close", term428);
        setField(term407, term407.getClass(), "weekly_quest_close", term430);
        setField(term407, term407.getClass(), "special_quest_close", term432);
        setField(term407, term407.getClass(), "nppg_close", term434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNppg_close", argTypes, term407, args);
    }

};


