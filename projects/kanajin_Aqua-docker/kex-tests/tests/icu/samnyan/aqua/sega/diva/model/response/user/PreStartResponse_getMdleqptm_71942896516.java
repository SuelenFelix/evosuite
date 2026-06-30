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

public class PreStartResponse_getMdleqptm_71942896516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262236;

    public PreStartResponse_getMdleqptm_71942896516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term262387 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term262386 = ((Class) term262387).getDeclaredField((String) "FAILED");
        ((Field) term262386).setAccessible(true);
        Object enum623 = ((Field) term262386).get((Object) null);
        Integer term262248 = new Integer(-159494544);
        Integer term262250 = new Integer(-75206835);
        Integer term262252 = new Integer(-1618206977);
        Integer term262254 = new Integer(-1747406163);
        Integer term262256 = new Integer(388157121);
        Class<? extends Object> term262692 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term262691 = ((Class) term262692).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term262691).setAccessible(true);
        Object enum624 = ((Field) term262691).get((Object) null);
        Integer term262287 = new Integer(1684998508);
        Integer term262289 = new Integer(-1476644457);
        Integer term262303 = new Integer(1270666529);
        Integer term262305 = new Integer(-1146679443);
        Integer term262329 = new Integer(-860131894);
        Integer term262331 = new Integer(-1022990421);
        Integer term262333 = new Integer(1045547089);
        Integer term262335 = new Integer(-1122880881);
        Integer term262337 = new Integer(-542712742);
        Integer term262339 = new Integer(-1254072822);
        Class<? extends Object> term262995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term262994 = ((Class) term262995).getDeclaredField((String) "MISS");
        ((Field) term262994).setAccessible(true);
        Object enum625 = ((Field) term262994).get((Object) null);
        term262236 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term262319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262324 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term262236, term262236.getClass(), "ps_result", enum623);
        setField(term262236, term262236.getClass(), "accept_idx", term262248);
        setField(term262236, term262236.getClass(), "nblss_ltt_stts", term262250);
        setField(term262236, term262236.getClass(), "nblss_ltt_tckt", term262252);
        setField(term262236, term262236.getClass(), "nblss_ltt_is_opn", term262254);
        setField(term262236, term262236.getClass(), "pd_id", term262256);
        setField(term262236, term262236.getClass(), "player_name", "oGDeaReDRG");
        setField(term262236, term262236.getClass(), "sort_kind", enum624);
        setField(term262236, term262236.getClass(), "lv_num", term262287);
        setField(term262236, term262236.getClass(), "lv_pnt", term262289);
        setField(term262236, term262236.getClass(), "lv_str", "DjDquUkDJf");
        setField(term262236, term262236.getClass(), "lv_efct_id", term262303);
        setField(term262236, term262236.getClass(), "lv_plt_id", term262305);
        setField(term262236, term262236.getClass(), "mdl_eqp_ary", "SszlMxumKX");
        setIntField(term262320, term262320.getClass(), "year", 2014);
        setShortField(term262320, term262320.getClass(), "month", (short) 8);
        setShortField(term262320, term262320.getClass(), "day", (short) 13);
        setField(term262319, term262319.getClass(), "date", term262320);
        setByteField(term262324, term262324.getClass(), "hour", (byte) 13);
        setByteField(term262324, term262324.getClass(), "minute", (byte) 15);
        setByteField(term262324, term262324.getClass(), "second", (byte) 51);
        setIntField(term262324, term262324.getClass(), "nano", 433726678);
        setField(term262319, term262319.getClass(), "time", term262324);
        setField(term262236, term262236.getClass(), "mdl_eqp_tm", term262319);
        setField(term262236, term262236.getClass(), "skn_eqp", term262329);
        setField(term262236, term262236.getClass(), "btn_se_eqp", term262331);
        setField(term262236, term262236.getClass(), "sld_se_eqp", term262333);
        setField(term262236, term262236.getClass(), "chn_sld_se_eqp", term262335);
        setField(term262236, term262236.getClass(), "sldr_tch_se_eqp", term262337);
        setField(term262236, term262236.getClass(), "vcld_pts", term262339);
        setField(term262236, term262236.getClass(), "passwd_stat", enum625);
        setField(term262236, term262236.getClass(), "cmd", "FhbYnMXUCk");
        setField(term262236, term262236.getClass(), "req_id", "MMUzzZjmHQ");
        setField(term262236, term262236.getClass(), "stat", "NSPCJaizlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_eqp_tm", argTypes, term262236, args);
    }

};


