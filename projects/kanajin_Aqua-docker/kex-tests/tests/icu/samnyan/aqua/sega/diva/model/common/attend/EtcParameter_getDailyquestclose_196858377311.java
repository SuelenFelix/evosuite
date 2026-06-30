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

public class EtcParameter_getDailyquestclose_196858377311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;

    public EtcParameter_getDailyquestclose_196858377311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term321 = new Boolean(false);
        Boolean term323 = new Boolean(true);
        Boolean term325 = new Boolean(true);
        Boolean term327 = new Boolean(true);
        Boolean term329 = new Boolean(false);
        Boolean term331 = new Boolean(false);
        Boolean term333 = new Boolean(true);
        Boolean term335 = new Boolean(false);
        Integer term337 = new Integer(0);
        Boolean term339 = new Boolean(false);
        Boolean term341 = new Boolean(true);
        Boolean term343 = new Boolean(true);
        Boolean term345 = new Boolean(true);
        Boolean term347 = new Boolean(false);
        term320 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term320, term320.getClass(), "module_shop_close", term321);
        setField(term320, term320.getClass(), "card_reissue_close", term323);
        setField(term320, term320.getClass(), "card_renewal_close", term325);
        setField(term320, term320.getClass(), "reset_passwd_close", term327);
        setField(term320, term320.getClass(), "change_passwd_close", term329);
        setField(term320, term320.getClass(), "change_name_close", term331);
        setField(term320, term320.getClass(), "encore_mode_close", term333);
        setField(term320, term320.getClass(), "third_stg_mode_close", term335);
        setField(term320, term320.getClass(), "slow_down_threshold", term337);
        setField(term320, term320.getClass(), "log_write_flag", term339);
        setField(term320, term320.getClass(), "daily_quest_close", term341);
        setField(term320, term320.getClass(), "weekly_quest_close", term343);
        setField(term320, term320.getClass(), "special_quest_close", term345);
        setField(term320, term320.getClass(), "nppg_close", term347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDaily_quest_close", argTypes, term320, args);
    }

};


