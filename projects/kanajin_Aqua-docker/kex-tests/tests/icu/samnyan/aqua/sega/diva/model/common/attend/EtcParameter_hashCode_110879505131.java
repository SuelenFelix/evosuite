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

public class EtcParameter_hashCode_110879505131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;

    public EtcParameter_hashCode_110879505131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term931 = new Boolean(false);
        Boolean term933 = new Boolean(true);
        Boolean term935 = new Boolean(true);
        Boolean term937 = new Boolean(true);
        Boolean term939 = new Boolean(false);
        Boolean term941 = new Boolean(false);
        Boolean term943 = new Boolean(true);
        Boolean term945 = new Boolean(false);
        Integer term947 = new Integer(0);
        Boolean term949 = new Boolean(false);
        Boolean term951 = new Boolean(true);
        Boolean term953 = new Boolean(true);
        Boolean term955 = new Boolean(true);
        Boolean term957 = new Boolean(false);
        term930 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term930, term930.getClass(), "module_shop_close", term931);
        setField(term930, term930.getClass(), "card_reissue_close", term933);
        setField(term930, term930.getClass(), "card_renewal_close", term935);
        setField(term930, term930.getClass(), "reset_passwd_close", term937);
        setField(term930, term930.getClass(), "change_passwd_close", term939);
        setField(term930, term930.getClass(), "change_name_close", term941);
        setField(term930, term930.getClass(), "encore_mode_close", term943);
        setField(term930, term930.getClass(), "third_stg_mode_close", term945);
        setField(term930, term930.getClass(), "slow_down_threshold", term947);
        setField(term930, term930.getClass(), "log_write_flag", term949);
        setField(term930, term930.getClass(), "daily_quest_close", term951);
        setField(term930, term930.getClass(), "weekly_quest_close", term953);
        setField(term930, term930.getClass(), "special_quest_close", term955);
        setField(term930, term930.getClass(), "nppg_close", term957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term930, args);
    }

};


