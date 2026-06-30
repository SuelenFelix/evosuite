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

public class EtcParameter_equals_155748172629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870;
     Object term899;

    public EtcParameter_equals_155748172629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term871 = new Boolean(false);
        Boolean term873 = new Boolean(true);
        Boolean term875 = new Boolean(true);
        Boolean term877 = new Boolean(true);
        Boolean term879 = new Boolean(false);
        Boolean term881 = new Boolean(false);
        Boolean term883 = new Boolean(true);
        Boolean term885 = new Boolean(false);
        Integer term887 = new Integer(0);
        Boolean term889 = new Boolean(false);
        Boolean term891 = new Boolean(true);
        Boolean term893 = new Boolean(true);
        Boolean term895 = new Boolean(true);
        Boolean term897 = new Boolean(false);
        term870 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term870, term870.getClass(), "module_shop_close", term871);
        setField(term870, term870.getClass(), "card_reissue_close", term873);
        setField(term870, term870.getClass(), "card_renewal_close", term875);
        setField(term870, term870.getClass(), "reset_passwd_close", term877);
        setField(term870, term870.getClass(), "change_passwd_close", term879);
        setField(term870, term870.getClass(), "change_name_close", term881);
        setField(term870, term870.getClass(), "encore_mode_close", term883);
        setField(term870, term870.getClass(), "third_stg_mode_close", term885);
        setField(term870, term870.getClass(), "slow_down_threshold", term887);
        setField(term870, term870.getClass(), "log_write_flag", term889);
        setField(term870, term870.getClass(), "daily_quest_close", term891);
        setField(term870, term870.getClass(), "weekly_quest_close", term893);
        setField(term870, term870.getClass(), "special_quest_close", term895);
        setField(term870, term870.getClass(), "nppg_close", term897);
        term899 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term899;
        callMethod(klass, "equals", argTypes, term870, args);
    }

};


