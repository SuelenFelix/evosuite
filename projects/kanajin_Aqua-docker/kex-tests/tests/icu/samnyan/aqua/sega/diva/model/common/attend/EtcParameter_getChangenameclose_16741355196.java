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

public class EtcParameter_getChangenameclose_16741355196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public EtcParameter_getChangenameclose_16741355196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term176 = new Boolean(false);
        Boolean term178 = new Boolean(true);
        Boolean term180 = new Boolean(true);
        Boolean term182 = new Boolean(true);
        Boolean term184 = new Boolean(false);
        Boolean term186 = new Boolean(false);
        Boolean term188 = new Boolean(true);
        Boolean term190 = new Boolean(false);
        Integer term192 = new Integer(0);
        Boolean term194 = new Boolean(false);
        Boolean term196 = new Boolean(true);
        Boolean term198 = new Boolean(true);
        Boolean term200 = new Boolean(true);
        Boolean term202 = new Boolean(false);
        term175 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term175, term175.getClass(), "module_shop_close", term176);
        setField(term175, term175.getClass(), "card_reissue_close", term178);
        setField(term175, term175.getClass(), "card_renewal_close", term180);
        setField(term175, term175.getClass(), "reset_passwd_close", term182);
        setField(term175, term175.getClass(), "change_passwd_close", term184);
        setField(term175, term175.getClass(), "change_name_close", term186);
        setField(term175, term175.getClass(), "encore_mode_close", term188);
        setField(term175, term175.getClass(), "third_stg_mode_close", term190);
        setField(term175, term175.getClass(), "slow_down_threshold", term192);
        setField(term175, term175.getClass(), "log_write_flag", term194);
        setField(term175, term175.getClass(), "daily_quest_close", term196);
        setField(term175, term175.getClass(), "weekly_quest_close", term198);
        setField(term175, term175.getClass(), "special_quest_close", term200);
        setField(term175, term175.getClass(), "nppg_close", term202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChange_name_close", argTypes, term175, args);
    }

};


