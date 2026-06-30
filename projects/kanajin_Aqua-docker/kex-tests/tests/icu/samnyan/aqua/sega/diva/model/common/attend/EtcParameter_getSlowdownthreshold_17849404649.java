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

public class EtcParameter_getSlowdownthreshold_17849404649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;

    public EtcParameter_getSlowdownthreshold_17849404649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term263 = new Boolean(false);
        Boolean term265 = new Boolean(true);
        Boolean term267 = new Boolean(true);
        Boolean term269 = new Boolean(true);
        Boolean term271 = new Boolean(false);
        Boolean term273 = new Boolean(false);
        Boolean term275 = new Boolean(true);
        Boolean term277 = new Boolean(false);
        Integer term279 = new Integer(0);
        Boolean term281 = new Boolean(false);
        Boolean term283 = new Boolean(true);
        Boolean term285 = new Boolean(true);
        Boolean term287 = new Boolean(true);
        Boolean term289 = new Boolean(false);
        term262 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term262, term262.getClass(), "module_shop_close", term263);
        setField(term262, term262.getClass(), "card_reissue_close", term265);
        setField(term262, term262.getClass(), "card_renewal_close", term267);
        setField(term262, term262.getClass(), "reset_passwd_close", term269);
        setField(term262, term262.getClass(), "change_passwd_close", term271);
        setField(term262, term262.getClass(), "change_name_close", term273);
        setField(term262, term262.getClass(), "encore_mode_close", term275);
        setField(term262, term262.getClass(), "third_stg_mode_close", term277);
        setField(term262, term262.getClass(), "slow_down_threshold", term279);
        setField(term262, term262.getClass(), "log_write_flag", term281);
        setField(term262, term262.getClass(), "daily_quest_close", term283);
        setField(term262, term262.getClass(), "weekly_quest_close", term285);
        setField(term262, term262.getClass(), "special_quest_close", term287);
        setField(term262, term262.getClass(), "nppg_close", term289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlow_down_threshold", argTypes, term262, args);
    }

};


