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

public class EtcParameter_getEncoremodeclose_11992365757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;

    public EtcParameter_getEncoremodeclose_11992365757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term205 = new Boolean(false);
        Boolean term207 = new Boolean(true);
        Boolean term209 = new Boolean(true);
        Boolean term211 = new Boolean(true);
        Boolean term213 = new Boolean(false);
        Boolean term215 = new Boolean(false);
        Boolean term217 = new Boolean(true);
        Boolean term219 = new Boolean(false);
        Integer term221 = new Integer(0);
        Boolean term223 = new Boolean(false);
        Boolean term225 = new Boolean(true);
        Boolean term227 = new Boolean(true);
        Boolean term229 = new Boolean(true);
        Boolean term231 = new Boolean(false);
        term204 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term204, term204.getClass(), "module_shop_close", term205);
        setField(term204, term204.getClass(), "card_reissue_close", term207);
        setField(term204, term204.getClass(), "card_renewal_close", term209);
        setField(term204, term204.getClass(), "reset_passwd_close", term211);
        setField(term204, term204.getClass(), "change_passwd_close", term213);
        setField(term204, term204.getClass(), "change_name_close", term215);
        setField(term204, term204.getClass(), "encore_mode_close", term217);
        setField(term204, term204.getClass(), "third_stg_mode_close", term219);
        setField(term204, term204.getClass(), "slow_down_threshold", term221);
        setField(term204, term204.getClass(), "log_write_flag", term223);
        setField(term204, term204.getClass(), "daily_quest_close", term225);
        setField(term204, term204.getClass(), "weekly_quest_close", term227);
        setField(term204, term204.getClass(), "special_quest_close", term229);
        setField(term204, term204.getClass(), "nppg_close", term231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncore_mode_close", argTypes, term204, args);
    }

};


