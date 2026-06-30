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

public class EtcParameter_getCardreissueclose_10634973662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;

    public EtcParameter_getCardreissueclose_10634973662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term60 = new Boolean(false);
        Boolean term62 = new Boolean(true);
        Boolean term64 = new Boolean(true);
        Boolean term66 = new Boolean(true);
        Boolean term68 = new Boolean(false);
        Boolean term70 = new Boolean(false);
        Boolean term72 = new Boolean(true);
        Boolean term74 = new Boolean(false);
        Integer term76 = new Integer(0);
        Boolean term78 = new Boolean(false);
        Boolean term80 = new Boolean(true);
        Boolean term82 = new Boolean(true);
        Boolean term84 = new Boolean(true);
        Boolean term86 = new Boolean(false);
        term59 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term59, term59.getClass(), "module_shop_close", term60);
        setField(term59, term59.getClass(), "card_reissue_close", term62);
        setField(term59, term59.getClass(), "card_renewal_close", term64);
        setField(term59, term59.getClass(), "reset_passwd_close", term66);
        setField(term59, term59.getClass(), "change_passwd_close", term68);
        setField(term59, term59.getClass(), "change_name_close", term70);
        setField(term59, term59.getClass(), "encore_mode_close", term72);
        setField(term59, term59.getClass(), "third_stg_mode_close", term74);
        setField(term59, term59.getClass(), "slow_down_threshold", term76);
        setField(term59, term59.getClass(), "log_write_flag", term78);
        setField(term59, term59.getClass(), "daily_quest_close", term80);
        setField(term59, term59.getClass(), "weekly_quest_close", term82);
        setField(term59, term59.getClass(), "special_quest_close", term84);
        setField(term59, term59.getClass(), "nppg_close", term86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard_reissue_close", argTypes, term59, args);
    }

};


