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

public class EtcParameter_setCardrenewalclose_127527928617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;
     Object term527;

    public EtcParameter_setCardrenewalclose_127527928617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term499 = new Boolean(false);
        Boolean term501 = new Boolean(true);
        Boolean term503 = new Boolean(true);
        Boolean term505 = new Boolean(true);
        Boolean term507 = new Boolean(false);
        Boolean term509 = new Boolean(false);
        Boolean term511 = new Boolean(true);
        Boolean term513 = new Boolean(false);
        Integer term515 = new Integer(0);
        Boolean term517 = new Boolean(false);
        Boolean term519 = new Boolean(true);
        Boolean term521 = new Boolean(true);
        Boolean term523 = new Boolean(true);
        Boolean term525 = new Boolean(false);
        term498 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term498, term498.getClass(), "module_shop_close", term499);
        setField(term498, term498.getClass(), "card_reissue_close", term501);
        setField(term498, term498.getClass(), "card_renewal_close", term503);
        setField(term498, term498.getClass(), "reset_passwd_close", term505);
        setField(term498, term498.getClass(), "change_passwd_close", term507);
        setField(term498, term498.getClass(), "change_name_close", term509);
        setField(term498, term498.getClass(), "encore_mode_close", term511);
        setField(term498, term498.getClass(), "third_stg_mode_close", term513);
        setField(term498, term498.getClass(), "slow_down_threshold", term515);
        setField(term498, term498.getClass(), "log_write_flag", term517);
        setField(term498, term498.getClass(), "daily_quest_close", term519);
        setField(term498, term498.getClass(), "weekly_quest_close", term521);
        setField(term498, term498.getClass(), "special_quest_close", term523);
        setField(term498, term498.getClass(), "nppg_close", term525);
        term527 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term527;
        callMethod(klass, "setCard_renewal_close", argTypes, term498, args);
    }

};


