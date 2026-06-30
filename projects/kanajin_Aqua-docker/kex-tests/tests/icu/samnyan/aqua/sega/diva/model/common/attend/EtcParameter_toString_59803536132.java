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

public class EtcParameter_toString_59803536132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public EtcParameter_toString_59803536132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term960 = new Boolean(false);
        Boolean term962 = new Boolean(true);
        Boolean term964 = new Boolean(true);
        Boolean term966 = new Boolean(true);
        Boolean term968 = new Boolean(false);
        Boolean term970 = new Boolean(false);
        Boolean term972 = new Boolean(true);
        Boolean term974 = new Boolean(false);
        Integer term976 = new Integer(0);
        Boolean term978 = new Boolean(false);
        Boolean term980 = new Boolean(true);
        Boolean term982 = new Boolean(true);
        Boolean term984 = new Boolean(true);
        Boolean term986 = new Boolean(false);
        term959 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term959, term959.getClass(), "module_shop_close", term960);
        setField(term959, term959.getClass(), "card_reissue_close", term962);
        setField(term959, term959.getClass(), "card_renewal_close", term964);
        setField(term959, term959.getClass(), "reset_passwd_close", term966);
        setField(term959, term959.getClass(), "change_passwd_close", term968);
        setField(term959, term959.getClass(), "change_name_close", term970);
        setField(term959, term959.getClass(), "encore_mode_close", term972);
        setField(term959, term959.getClass(), "third_stg_mode_close", term974);
        setField(term959, term959.getClass(), "slow_down_threshold", term976);
        setField(term959, term959.getClass(), "log_write_flag", term978);
        setField(term959, term959.getClass(), "daily_quest_close", term980);
        setField(term959, term959.getClass(), "weekly_quest_close", term982);
        setField(term959, term959.getClass(), "special_quest_close", term984);
        setField(term959, term959.getClass(), "nppg_close", term986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term959, args);
    }

};


