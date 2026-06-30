package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_setLvpltid_81954732736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284202;
     Object term284351;

    public PreStartResponse_setLvpltid_81954732736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term284354 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term284353 = ((Class) term284354).getDeclaredField((String) "SUCCESS");
        ((Field) term284353).setAccessible(true);
        Object enum685 = ((Field) term284353).get((Object) null);
        Integer term284215 = new Integer(1956590498);
        Integer term284217 = new Integer(1467356494);
        Integer term284219 = new Integer(-26316536);
        Integer term284221 = new Integer(1716165145);
        Integer term284223 = new Integer(1692937831);
        Class<? extends Object> term284662 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term284661 = ((Class) term284662).getDeclaredField((String) "MY_LIST_A");
        ((Field) term284661).setAccessible(true);
        Object enum686 = ((Field) term284661).get((Object) null);
        Integer term284251 = new Integer(-1539747985);
        Integer term284253 = new Integer(-1982489643);
        Integer term284267 = new Integer(550892835);
        Integer term284269 = new Integer(1237549886);
        Integer term284293 = new Integer(-1945635750);
        Integer term284295 = new Integer(-1622760744);
        Integer term284297 = new Integer(2068435279);
        Integer term284299 = new Integer(-1556527718);
        Integer term284301 = new Integer(895255351);
        Integer term284303 = new Integer(-1317044799);
        Class<? extends Object> term284956 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term284955 = ((Class) term284956).getDeclaredField((String) "RESET");
        ((Field) term284955).setAccessible(true);
        Object enum687 = ((Field) term284955).get((Object) null);
        term284202 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term284283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284288 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term284202, term284202.getClass(), "ps_result", enum685);
        setField(term284202, term284202.getClass(), "accept_idx", term284215);
        setField(term284202, term284202.getClass(), "nblss_ltt_stts", term284217);
        setField(term284202, term284202.getClass(), "nblss_ltt_tckt", term284219);
        setField(term284202, term284202.getClass(), "nblss_ltt_is_opn", term284221);
        setField(term284202, term284202.getClass(), "pd_id", term284223);
        setField(term284202, term284202.getClass(), "player_name", "qfHzTgyYaj");
        setField(term284202, term284202.getClass(), "sort_kind", enum686);
        setField(term284202, term284202.getClass(), "lv_num", term284251);
        setField(term284202, term284202.getClass(), "lv_pnt", term284253);
        setField(term284202, term284202.getClass(), "lv_str", "BzOSSnQpxM");
        setField(term284202, term284202.getClass(), "lv_efct_id", term284267);
        setField(term284202, term284202.getClass(), "lv_plt_id", term284269);
        setField(term284202, term284202.getClass(), "mdl_eqp_ary", "LoFkuWLahf");
        setIntField(term284284, term284284.getClass(), "year", 2012);
        setShortField(term284284, term284284.getClass(), "month", (short) 3);
        setShortField(term284284, term284284.getClass(), "day", (short) 12);
        setField(term284283, term284283.getClass(), "date", term284284);
        setByteField(term284288, term284288.getClass(), "hour", (byte) 0);
        setByteField(term284288, term284288.getClass(), "minute", (byte) 32);
        setByteField(term284288, term284288.getClass(), "second", (byte) 14);
        setIntField(term284288, term284288.getClass(), "nano", 342342345);
        setField(term284283, term284283.getClass(), "time", term284288);
        setField(term284202, term284202.getClass(), "mdl_eqp_tm", term284283);
        setField(term284202, term284202.getClass(), "skn_eqp", term284293);
        setField(term284202, term284202.getClass(), "btn_se_eqp", term284295);
        setField(term284202, term284202.getClass(), "sld_se_eqp", term284297);
        setField(term284202, term284202.getClass(), "chn_sld_se_eqp", term284299);
        setField(term284202, term284202.getClass(), "sldr_tch_se_eqp", term284301);
        setField(term284202, term284202.getClass(), "vcld_pts", term284303);
        setField(term284202, term284202.getClass(), "passwd_stat", enum687);
        setField(term284202, term284202.getClass(), "cmd", "GwcCGdSyQT");
        setField(term284202, term284202.getClass(), "req_id", "pQLjQOCQOz");
        setField(term284202, term284202.getClass(), "stat", "RaVKdrEtNk");
        term284351 = new Integer(-1428063820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term284351;
        callMethod(klass, "setLv_plt_id", argTypes, term284202, args);
    }

};


