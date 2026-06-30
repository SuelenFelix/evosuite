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

public class EtcParameter_setWeeklyquestclose_27890766526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777;
     Object term806;

    public EtcParameter_setWeeklyquestclose_27890766526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term778 = new Boolean(false);
        Boolean term780 = new Boolean(true);
        Boolean term782 = new Boolean(true);
        Boolean term784 = new Boolean(true);
        Boolean term786 = new Boolean(false);
        Boolean term788 = new Boolean(false);
        Boolean term790 = new Boolean(true);
        Boolean term792 = new Boolean(false);
        Integer term794 = new Integer(0);
        Boolean term796 = new Boolean(false);
        Boolean term798 = new Boolean(true);
        Boolean term800 = new Boolean(true);
        Boolean term802 = new Boolean(true);
        Boolean term804 = new Boolean(false);
        term777 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term777, term777.getClass(), "module_shop_close", term778);
        setField(term777, term777.getClass(), "card_reissue_close", term780);
        setField(term777, term777.getClass(), "card_renewal_close", term782);
        setField(term777, term777.getClass(), "reset_passwd_close", term784);
        setField(term777, term777.getClass(), "change_passwd_close", term786);
        setField(term777, term777.getClass(), "change_name_close", term788);
        setField(term777, term777.getClass(), "encore_mode_close", term790);
        setField(term777, term777.getClass(), "third_stg_mode_close", term792);
        setField(term777, term777.getClass(), "slow_down_threshold", term794);
        setField(term777, term777.getClass(), "log_write_flag", term796);
        setField(term777, term777.getClass(), "daily_quest_close", term798);
        setField(term777, term777.getClass(), "weekly_quest_close", term800);
        setField(term777, term777.getClass(), "special_quest_close", term802);
        setField(term777, term777.getClass(), "nppg_close", term804);
        term806 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term806;
        callMethod(klass, "setWeekly_quest_close", argTypes, term777, args);
    }

};


