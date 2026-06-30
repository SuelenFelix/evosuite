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

public class EtcParameter_getLogwriteflag_159958176110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public EtcParameter_getLogwriteflag_159958176110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term292 = new Boolean(false);
        Boolean term294 = new Boolean(true);
        Boolean term296 = new Boolean(true);
        Boolean term298 = new Boolean(true);
        Boolean term300 = new Boolean(false);
        Boolean term302 = new Boolean(false);
        Boolean term304 = new Boolean(true);
        Boolean term306 = new Boolean(false);
        Integer term308 = new Integer(0);
        Boolean term310 = new Boolean(false);
        Boolean term312 = new Boolean(true);
        Boolean term314 = new Boolean(true);
        Boolean term316 = new Boolean(true);
        Boolean term318 = new Boolean(false);
        term291 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter"));
        setField(term291, term291.getClass(), "module_shop_close", term292);
        setField(term291, term291.getClass(), "card_reissue_close", term294);
        setField(term291, term291.getClass(), "card_renewal_close", term296);
        setField(term291, term291.getClass(), "reset_passwd_close", term298);
        setField(term291, term291.getClass(), "change_passwd_close", term300);
        setField(term291, term291.getClass(), "change_name_close", term302);
        setField(term291, term291.getClass(), "encore_mode_close", term304);
        setField(term291, term291.getClass(), "third_stg_mode_close", term306);
        setField(term291, term291.getClass(), "slow_down_threshold", term308);
        setField(term291, term291.getClass(), "log_write_flag", term310);
        setField(term291, term291.getClass(), "daily_quest_close", term312);
        setField(term291, term291.getClass(), "weekly_quest_close", term314);
        setField(term291, term291.getClass(), "special_quest_close", term316);
        setField(term291, term291.getClass(), "nppg_close", term318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.EtcParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLog_write_flag", argTypes, term291, args);
    }

};


