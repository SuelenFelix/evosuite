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

public class EtcParameter_setChangenameclose_192951805120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;
     Object term620;

    public EtcParameter_setChangenameclose_192951805120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term592 = new Boolean(false);
        Boolean term594 = new Boolean(true);
        Boolean term596 = new Boolean(true);
        Boolean term598 = new Boolean(true);
        Boolean term600 = new Boolean(false);
        Boolean term602 = new Boolean(false);
        Boolean term604 = new Boolean(true);
        Boolean term606 = new Boolean(false);
        Integer term608 = new Integer(0);
        Boolean term610 = new Boolean(false);
        Boolean term612 = new Boolean(true);
        Boolean term614 = new Boolean(true);
        Boolean term616 = new Boolean(true);
        Boolean term618 = new Boolean(false);
        term591 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term591, term591.getClass(), "module_shop_close", term592);
        setField(term591, term591.getClass(), "card_reissue_close", term594);
        setField(term591, term591.getClass(), "card_renewal_close", term596);
        setField(term591, term591.getClass(), "reset_passwd_close", term598);
        setField(term591, term591.getClass(), "change_passwd_close", term600);
        setField(term591, term591.getClass(), "change_name_close", term602);
        setField(term591, term591.getClass(), "encore_mode_close", term604);
        setField(term591, term591.getClass(), "third_stg_mode_close", term606);
        setField(term591, term591.getClass(), "slow_down_threshold", term608);
        setField(term591, term591.getClass(), "log_write_flag", term610);
        setField(term591, term591.getClass(), "daily_quest_close", term612);
        setField(term591, term591.getClass(), "weekly_quest_close", term614);
        setField(term591, term591.getClass(), "special_quest_close", term616);
        setField(term591, term591.getClass(), "nppg_close", term618);
        term620 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term620;
        callMethod(klass, "setChange_name_close", argTypes, term591, args);
    }

};


