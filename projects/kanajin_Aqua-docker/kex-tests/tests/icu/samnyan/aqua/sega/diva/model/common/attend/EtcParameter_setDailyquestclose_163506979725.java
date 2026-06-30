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

public class EtcParameter_setDailyquestclose_163506979725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;
     Object term775;

    public EtcParameter_setDailyquestclose_163506979725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term747 = new Boolean(false);
        Boolean term749 = new Boolean(true);
        Boolean term751 = new Boolean(true);
        Boolean term753 = new Boolean(true);
        Boolean term755 = new Boolean(false);
        Boolean term757 = new Boolean(false);
        Boolean term759 = new Boolean(true);
        Boolean term761 = new Boolean(false);
        Integer term763 = new Integer(0);
        Boolean term765 = new Boolean(false);
        Boolean term767 = new Boolean(true);
        Boolean term769 = new Boolean(true);
        Boolean term771 = new Boolean(true);
        Boolean term773 = new Boolean(false);
        term746 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term746, term746.getClass(), "module_shop_close", term747);
        setField(term746, term746.getClass(), "card_reissue_close", term749);
        setField(term746, term746.getClass(), "card_renewal_close", term751);
        setField(term746, term746.getClass(), "reset_passwd_close", term753);
        setField(term746, term746.getClass(), "change_passwd_close", term755);
        setField(term746, term746.getClass(), "change_name_close", term757);
        setField(term746, term746.getClass(), "encore_mode_close", term759);
        setField(term746, term746.getClass(), "third_stg_mode_close", term761);
        setField(term746, term746.getClass(), "slow_down_threshold", term763);
        setField(term746, term746.getClass(), "log_write_flag", term765);
        setField(term746, term746.getClass(), "daily_quest_close", term767);
        setField(term746, term746.getClass(), "weekly_quest_close", term769);
        setField(term746, term746.getClass(), "special_quest_close", term771);
        setField(term746, term746.getClass(), "nppg_close", term773);
        term775 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term775;
        callMethod(klass, "setDaily_quest_close", argTypes, term746, args);
    }

};


