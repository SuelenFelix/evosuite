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

public class EtcParameter_setThirdstgmodeclose_40381411322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;
     Object term682;

    public EtcParameter_setThirdstgmodeclose_40381411322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term654 = new Boolean(false);
        Boolean term656 = new Boolean(true);
        Boolean term658 = new Boolean(true);
        Boolean term660 = new Boolean(true);
        Boolean term662 = new Boolean(false);
        Boolean term664 = new Boolean(false);
        Boolean term666 = new Boolean(true);
        Boolean term668 = new Boolean(false);
        Integer term670 = new Integer(0);
        Boolean term672 = new Boolean(false);
        Boolean term674 = new Boolean(true);
        Boolean term676 = new Boolean(true);
        Boolean term678 = new Boolean(true);
        Boolean term680 = new Boolean(false);
        term653 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term653, term653.getClass(), "module_shop_close", term654);
        setField(term653, term653.getClass(), "card_reissue_close", term656);
        setField(term653, term653.getClass(), "card_renewal_close", term658);
        setField(term653, term653.getClass(), "reset_passwd_close", term660);
        setField(term653, term653.getClass(), "change_passwd_close", term662);
        setField(term653, term653.getClass(), "change_name_close", term664);
        setField(term653, term653.getClass(), "encore_mode_close", term666);
        setField(term653, term653.getClass(), "third_stg_mode_close", term668);
        setField(term653, term653.getClass(), "slow_down_threshold", term670);
        setField(term653, term653.getClass(), "log_write_flag", term672);
        setField(term653, term653.getClass(), "daily_quest_close", term674);
        setField(term653, term653.getClass(), "weekly_quest_close", term676);
        setField(term653, term653.getClass(), "special_quest_close", term678);
        setField(term653, term653.getClass(), "nppg_close", term680);
        term682 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term682;
        callMethod(klass, "setThird_stg_mode_close", argTypes, term653, args);
    }

};


