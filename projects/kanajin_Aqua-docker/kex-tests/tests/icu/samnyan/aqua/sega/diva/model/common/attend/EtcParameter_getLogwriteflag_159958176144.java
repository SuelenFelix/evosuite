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

public class EtcParameter_getLogwriteflag_159958176144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998;

    public EtcParameter_getLogwriteflag_159958176144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term998 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term998, term998.getClass(), "module_shop_close", null);
        setField(term998, term998.getClass(), "card_reissue_close", null);
        setField(term998, term998.getClass(), "card_renewal_close", null);
        setField(term998, term998.getClass(), "reset_passwd_close", null);
        setField(term998, term998.getClass(), "change_passwd_close", null);
        setField(term998, term998.getClass(), "change_name_close", null);
        setField(term998, term998.getClass(), "encore_mode_close", null);
        setField(term998, term998.getClass(), "third_stg_mode_close", null);
        setField(term998, term998.getClass(), "slow_down_threshold", null);
        setField(term998, term998.getClass(), "log_write_flag", null);
        setField(term998, term998.getClass(), "daily_quest_close", null);
        setField(term998, term998.getClass(), "weekly_quest_close", null);
        setField(term998, term998.getClass(), "special_quest_close", null);
        setField(term998, term998.getClass(), "nppg_close", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLog_write_flag", argTypes, term998, args);
    }

};


