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

public class EtcParameter_setNppgclose_206326263028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;
     Object term868;

    public EtcParameter_setNppgclose_206326263028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term840 = new Boolean(false);
        Boolean term842 = new Boolean(true);
        Boolean term844 = new Boolean(true);
        Boolean term846 = new Boolean(true);
        Boolean term848 = new Boolean(false);
        Boolean term850 = new Boolean(false);
        Boolean term852 = new Boolean(true);
        Boolean term854 = new Boolean(false);
        Integer term856 = new Integer(0);
        Boolean term858 = new Boolean(false);
        Boolean term860 = new Boolean(true);
        Boolean term862 = new Boolean(true);
        Boolean term864 = new Boolean(true);
        Boolean term866 = new Boolean(false);
        term839 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term839, term839.getClass(), "module_shop_close", term840);
        setField(term839, term839.getClass(), "card_reissue_close", term842);
        setField(term839, term839.getClass(), "card_renewal_close", term844);
        setField(term839, term839.getClass(), "reset_passwd_close", term846);
        setField(term839, term839.getClass(), "change_passwd_close", term848);
        setField(term839, term839.getClass(), "change_name_close", term850);
        setField(term839, term839.getClass(), "encore_mode_close", term852);
        setField(term839, term839.getClass(), "third_stg_mode_close", term854);
        setField(term839, term839.getClass(), "slow_down_threshold", term856);
        setField(term839, term839.getClass(), "log_write_flag", term858);
        setField(term839, term839.getClass(), "daily_quest_close", term860);
        setField(term839, term839.getClass(), "weekly_quest_close", term862);
        setField(term839, term839.getClass(), "special_quest_close", term864);
        setField(term839, term839.getClass(), "nppg_close", term866);
        term868 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term868;
        callMethod(klass, "setNppg_close", argTypes, term839, args);
    }

};


