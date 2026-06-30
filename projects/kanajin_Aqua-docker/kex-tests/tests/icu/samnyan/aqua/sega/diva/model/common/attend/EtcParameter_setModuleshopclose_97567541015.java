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

public class EtcParameter_setModuleshopclose_97567541015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;
     Object term465;

    public EtcParameter_setModuleshopclose_97567541015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term437 = new Boolean(false);
        Boolean term439 = new Boolean(true);
        Boolean term441 = new Boolean(true);
        Boolean term443 = new Boolean(true);
        Boolean term445 = new Boolean(false);
        Boolean term447 = new Boolean(false);
        Boolean term449 = new Boolean(true);
        Boolean term451 = new Boolean(false);
        Integer term453 = new Integer(0);
        Boolean term455 = new Boolean(false);
        Boolean term457 = new Boolean(true);
        Boolean term459 = new Boolean(true);
        Boolean term461 = new Boolean(true);
        Boolean term463 = new Boolean(false);
        term436 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term436, term436.getClass(), "module_shop_close", term437);
        setField(term436, term436.getClass(), "card_reissue_close", term439);
        setField(term436, term436.getClass(), "card_renewal_close", term441);
        setField(term436, term436.getClass(), "reset_passwd_close", term443);
        setField(term436, term436.getClass(), "change_passwd_close", term445);
        setField(term436, term436.getClass(), "change_name_close", term447);
        setField(term436, term436.getClass(), "encore_mode_close", term449);
        setField(term436, term436.getClass(), "third_stg_mode_close", term451);
        setField(term436, term436.getClass(), "slow_down_threshold", term453);
        setField(term436, term436.getClass(), "log_write_flag", term455);
        setField(term436, term436.getClass(), "daily_quest_close", term457);
        setField(term436, term436.getClass(), "weekly_quest_close", term459);
        setField(term436, term436.getClass(), "special_quest_close", term461);
        setField(term436, term436.getClass(), "nppg_close", term463);
        term465 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term465;
        callMethod(klass, "setModule_shop_close", argTypes, term436, args);
    }

};


