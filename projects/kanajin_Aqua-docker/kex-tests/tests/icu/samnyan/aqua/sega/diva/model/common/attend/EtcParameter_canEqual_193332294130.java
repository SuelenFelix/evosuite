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

public class EtcParameter_canEqual_193332294130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;
     Object term929;

    public EtcParameter_canEqual_193332294130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term901 = new Boolean(false);
        Boolean term903 = new Boolean(true);
        Boolean term905 = new Boolean(true);
        Boolean term907 = new Boolean(true);
        Boolean term909 = new Boolean(false);
        Boolean term911 = new Boolean(false);
        Boolean term913 = new Boolean(true);
        Boolean term915 = new Boolean(false);
        Integer term917 = new Integer(0);
        Boolean term919 = new Boolean(false);
        Boolean term921 = new Boolean(true);
        Boolean term923 = new Boolean(true);
        Boolean term925 = new Boolean(true);
        Boolean term927 = new Boolean(false);
        term900 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term900, term900.getClass(), "module_shop_close", term901);
        setField(term900, term900.getClass(), "card_reissue_close", term903);
        setField(term900, term900.getClass(), "card_renewal_close", term905);
        setField(term900, term900.getClass(), "reset_passwd_close", term907);
        setField(term900, term900.getClass(), "change_passwd_close", term909);
        setField(term900, term900.getClass(), "change_name_close", term911);
        setField(term900, term900.getClass(), "encore_mode_close", term913);
        setField(term900, term900.getClass(), "third_stg_mode_close", term915);
        setField(term900, term900.getClass(), "slow_down_threshold", term917);
        setField(term900, term900.getClass(), "log_write_flag", term919);
        setField(term900, term900.getClass(), "daily_quest_close", term921);
        setField(term900, term900.getClass(), "weekly_quest_close", term923);
        setField(term900, term900.getClass(), "special_quest_close", term925);
        setField(term900, term900.getClass(), "nppg_close", term927);
        term929 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term929;
        callMethod(klass, "canEqual", argTypes, term900, args);
    }

};


