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

public class EtcParameter_setEncoremodeclose_189055030121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;
     Object term651;

    public EtcParameter_setEncoremodeclose_189055030121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term623 = new Boolean(false);
        Boolean term625 = new Boolean(true);
        Boolean term627 = new Boolean(true);
        Boolean term629 = new Boolean(true);
        Boolean term631 = new Boolean(false);
        Boolean term633 = new Boolean(false);
        Boolean term635 = new Boolean(true);
        Boolean term637 = new Boolean(false);
        Integer term639 = new Integer(0);
        Boolean term641 = new Boolean(false);
        Boolean term643 = new Boolean(true);
        Boolean term645 = new Boolean(true);
        Boolean term647 = new Boolean(true);
        Boolean term649 = new Boolean(false);
        term622 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term622, term622.getClass(), "module_shop_close", term623);
        setField(term622, term622.getClass(), "card_reissue_close", term625);
        setField(term622, term622.getClass(), "card_renewal_close", term627);
        setField(term622, term622.getClass(), "reset_passwd_close", term629);
        setField(term622, term622.getClass(), "change_passwd_close", term631);
        setField(term622, term622.getClass(), "change_name_close", term633);
        setField(term622, term622.getClass(), "encore_mode_close", term635);
        setField(term622, term622.getClass(), "third_stg_mode_close", term637);
        setField(term622, term622.getClass(), "slow_down_threshold", term639);
        setField(term622, term622.getClass(), "log_write_flag", term641);
        setField(term622, term622.getClass(), "daily_quest_close", term643);
        setField(term622, term622.getClass(), "weekly_quest_close", term645);
        setField(term622, term622.getClass(), "special_quest_close", term647);
        setField(term622, term622.getClass(), "nppg_close", term649);
        term651 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term651;
        callMethod(klass, "setEncore_mode_close", argTypes, term622, args);
    }

};


