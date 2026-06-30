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

public class PreStartResponse_setPlayername_148906996030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277470;

    public PreStartResponse_setPlayername_148906996030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term277636 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term277635 = ((Class) term277636).getDeclaredField((String) "FAILED");
        ((Field) term277635).setAccessible(true);
        Object enum666 = ((Field) term277635).get((Object) null);
        Integer term277482 = new Integer(-1455526612);
        Integer term277484 = new Integer(-941356098);
        Integer term277486 = new Integer(-201517446);
        Integer term277488 = new Integer(-97742366);
        Integer term277490 = new Integer(1638851942);
        Class<? extends Object> term277941 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term277940 = ((Class) term277941).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term277940).setAccessible(true);
        Object enum667 = ((Field) term277940).get((Object) null);
        Integer term277521 = new Integer(1374790203);
        Integer term277523 = new Integer(1160010161);
        Integer term277537 = new Integer(-423900705);
        Integer term277539 = new Integer(-525570815);
        Integer term277563 = new Integer(754055848);
        Integer term277565 = new Integer(-19246901);
        Integer term277567 = new Integer(-370828664);
        Integer term277569 = new Integer(1168633950);
        Integer term277571 = new Integer(1607082164);
        Integer term277573 = new Integer(1890399366);
        Class<? extends Object> term278244 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term278243 = ((Class) term278244).getDeclaredField((String) "REISSUE");
        ((Field) term278243).setAccessible(true);
        Object enum668 = ((Field) term278243).get((Object) null);
        term277470 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term277553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277558 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term277470, term277470.getClass(), "ps_result", enum666);
        setField(term277470, term277470.getClass(), "accept_idx", term277482);
        setField(term277470, term277470.getClass(), "nblss_ltt_stts", term277484);
        setField(term277470, term277470.getClass(), "nblss_ltt_tckt", term277486);
        setField(term277470, term277470.getClass(), "nblss_ltt_is_opn", term277488);
        setField(term277470, term277470.getClass(), "pd_id", term277490);
        setField(term277470, term277470.getClass(), "player_name", "IaRILCkXUB");
        setField(term277470, term277470.getClass(), "sort_kind", enum667);
        setField(term277470, term277470.getClass(), "lv_num", term277521);
        setField(term277470, term277470.getClass(), "lv_pnt", term277523);
        setField(term277470, term277470.getClass(), "lv_str", "XRaUSsHhJf");
        setField(term277470, term277470.getClass(), "lv_efct_id", term277537);
        setField(term277470, term277470.getClass(), "lv_plt_id", term277539);
        setField(term277470, term277470.getClass(), "mdl_eqp_ary", "ndknwPavsb");
        setIntField(term277554, term277554.getClass(), "year", 2020);
        setShortField(term277554, term277554.getClass(), "month", (short) 10);
        setShortField(term277554, term277554.getClass(), "day", (short) 26);
        setField(term277553, term277553.getClass(), "date", term277554);
        setByteField(term277558, term277558.getClass(), "hour", (byte) 10);
        setByteField(term277558, term277558.getClass(), "minute", (byte) 50);
        setByteField(term277558, term277558.getClass(), "second", (byte) 16);
        setIntField(term277558, term277558.getClass(), "nano", 613429);
        setField(term277553, term277553.getClass(), "time", term277558);
        setField(term277470, term277470.getClass(), "mdl_eqp_tm", term277553);
        setField(term277470, term277470.getClass(), "skn_eqp", term277563);
        setField(term277470, term277470.getClass(), "btn_se_eqp", term277565);
        setField(term277470, term277470.getClass(), "sld_se_eqp", term277567);
        setField(term277470, term277470.getClass(), "chn_sld_se_eqp", term277569);
        setField(term277470, term277470.getClass(), "sldr_tch_se_eqp", term277571);
        setField(term277470, term277470.getClass(), "vcld_pts", term277573);
        setField(term277470, term277470.getClass(), "passwd_stat", enum668);
        setField(term277470, term277470.getClass(), "cmd", "XbwSBHmjuZ");
        setField(term277470, term277470.getClass(), "req_id", "vHdYsSmEmG");
        setField(term277470, term277470.getClass(), "stat", "UDIVCqBmxp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "npyBQorcHP";
        callMethod(klass, "setPlayer_name", argTypes, term277470, args);
    }

};


