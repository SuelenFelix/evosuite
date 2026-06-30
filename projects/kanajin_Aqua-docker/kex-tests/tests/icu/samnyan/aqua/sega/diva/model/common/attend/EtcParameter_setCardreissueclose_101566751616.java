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

public class EtcParameter_setCardreissueclose_101566751616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467;
     Object term496;

    public EtcParameter_setCardreissueclose_101566751616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term468 = new Boolean(false);
        Boolean term470 = new Boolean(true);
        Boolean term472 = new Boolean(true);
        Boolean term474 = new Boolean(true);
        Boolean term476 = new Boolean(false);
        Boolean term478 = new Boolean(false);
        Boolean term480 = new Boolean(true);
        Boolean term482 = new Boolean(false);
        Integer term484 = new Integer(0);
        Boolean term486 = new Boolean(false);
        Boolean term488 = new Boolean(true);
        Boolean term490 = new Boolean(true);
        Boolean term492 = new Boolean(true);
        Boolean term494 = new Boolean(false);
        term467 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term467, term467.getClass(), "module_shop_close", term468);
        setField(term467, term467.getClass(), "card_reissue_close", term470);
        setField(term467, term467.getClass(), "card_renewal_close", term472);
        setField(term467, term467.getClass(), "reset_passwd_close", term474);
        setField(term467, term467.getClass(), "change_passwd_close", term476);
        setField(term467, term467.getClass(), "change_name_close", term478);
        setField(term467, term467.getClass(), "encore_mode_close", term480);
        setField(term467, term467.getClass(), "third_stg_mode_close", term482);
        setField(term467, term467.getClass(), "slow_down_threshold", term484);
        setField(term467, term467.getClass(), "log_write_flag", term486);
        setField(term467, term467.getClass(), "daily_quest_close", term488);
        setField(term467, term467.getClass(), "weekly_quest_close", term490);
        setField(term467, term467.getClass(), "special_quest_close", term492);
        setField(term467, term467.getClass(), "nppg_close", term494);
        term496 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term496;
        callMethod(klass, "setCard_reissue_close", argTypes, term467, args);
    }

};


