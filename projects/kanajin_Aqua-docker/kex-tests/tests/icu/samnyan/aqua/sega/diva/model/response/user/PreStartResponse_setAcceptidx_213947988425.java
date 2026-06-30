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

public class PreStartResponse_setAcceptidx_213947988425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272137;
     Object term272297;

    public PreStartResponse_setAcceptidx_213947988425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term272300 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term272299 = ((Class) term272300).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term272299).setAccessible(true);
        Object enum651 = ((Field) term272299).get((Object) null);
        Integer term272158 = new Integer(844222656);
        Integer term272160 = new Integer(-18216811);
        Integer term272162 = new Integer(-1813280137);
        Integer term272164 = new Integer(719656595);
        Integer term272166 = new Integer(-1516995753);
        Class<? extends Object> term272632 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term272631 = ((Class) term272632).getDeclaredField((String) "COMPLEXITY");
        ((Field) term272631).setAccessible(true);
        Object enum652 = ((Field) term272631).get((Object) null);
        Integer term272195 = new Integer(-390501023);
        Integer term272197 = new Integer(-1667482829);
        Integer term272211 = new Integer(1116576792);
        Integer term272213 = new Integer(-942194446);
        Integer term272237 = new Integer(-938508470);
        Integer term272239 = new Integer(1242676024);
        Integer term272241 = new Integer(-1865023308);
        Integer term272243 = new Integer(1698510819);
        Integer term272245 = new Integer(-1553893255);
        Integer term272247 = new Integer(1303442927);
        Class<? extends Object> term272929 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term272928 = ((Class) term272929).getDeclaredField((String) "REISSUE");
        ((Field) term272928).setAccessible(true);
        Object enum653 = ((Field) term272928).get((Object) null);
        term272137 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term272227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272232 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term272137, term272137.getClass(), "ps_result", enum651);
        setField(term272137, term272137.getClass(), "accept_idx", term272158);
        setField(term272137, term272137.getClass(), "nblss_ltt_stts", term272160);
        setField(term272137, term272137.getClass(), "nblss_ltt_tckt", term272162);
        setField(term272137, term272137.getClass(), "nblss_ltt_is_opn", term272164);
        setField(term272137, term272137.getClass(), "pd_id", term272166);
        setField(term272137, term272137.getClass(), "player_name", "DnCwTIIzcH");
        setField(term272137, term272137.getClass(), "sort_kind", enum652);
        setField(term272137, term272137.getClass(), "lv_num", term272195);
        setField(term272137, term272137.getClass(), "lv_pnt", term272197);
        setField(term272137, term272137.getClass(), "lv_str", "ULOSEQkLaZ");
        setField(term272137, term272137.getClass(), "lv_efct_id", term272211);
        setField(term272137, term272137.getClass(), "lv_plt_id", term272213);
        setField(term272137, term272137.getClass(), "mdl_eqp_ary", "frsRnTwGAg");
        setIntField(term272228, term272228.getClass(), "year", 2029);
        setShortField(term272228, term272228.getClass(), "month", (short) 5);
        setShortField(term272228, term272228.getClass(), "day", (short) 11);
        setField(term272227, term272227.getClass(), "date", term272228);
        setByteField(term272232, term272232.getClass(), "hour", (byte) 20);
        setByteField(term272232, term272232.getClass(), "minute", (byte) 17);
        setByteField(term272232, term272232.getClass(), "second", (byte) 32);
        setIntField(term272232, term272232.getClass(), "nano", 327503582);
        setField(term272227, term272227.getClass(), "time", term272232);
        setField(term272137, term272137.getClass(), "mdl_eqp_tm", term272227);
        setField(term272137, term272137.getClass(), "skn_eqp", term272237);
        setField(term272137, term272137.getClass(), "btn_se_eqp", term272239);
        setField(term272137, term272137.getClass(), "sld_se_eqp", term272241);
        setField(term272137, term272137.getClass(), "chn_sld_se_eqp", term272243);
        setField(term272137, term272137.getClass(), "sldr_tch_se_eqp", term272245);
        setField(term272137, term272137.getClass(), "vcld_pts", term272247);
        setField(term272137, term272137.getClass(), "passwd_stat", enum653);
        setField(term272137, term272137.getClass(), "cmd", "mLdICgTzLU");
        setField(term272137, term272137.getClass(), "req_id", "MgDkHuQnRs");
        setField(term272137, term272137.getClass(), "stat", "iEeRhESASl");
        term272297 = new Integer(794568325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term272297;
        callMethod(klass, "setAccept_idx", argTypes, term272137, args);
    }

};


