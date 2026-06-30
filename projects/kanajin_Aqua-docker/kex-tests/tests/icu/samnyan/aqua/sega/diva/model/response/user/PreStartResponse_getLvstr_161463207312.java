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

public class PreStartResponse_getLvstr_161463207312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257980;

    public PreStartResponse_getLvstr_161463207312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term258131 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term258130 = ((Class) term258131).getDeclaredField((String) "FAILED");
        ((Field) term258130).setAccessible(true);
        Object enum611 = ((Field) term258130).get((Object) null);
        Integer term257992 = new Integer(1398204340);
        Integer term257994 = new Integer(229204365);
        Integer term257996 = new Integer(-461771056);
        Integer term257998 = new Integer(-243422082);
        Integer term258000 = new Integer(1384592638);
        Class<? extends Object> term258436 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term258435 = ((Class) term258436).getDeclaredField((String) "MY_LIST_A");
        ((Field) term258435).setAccessible(true);
        Object enum612 = ((Field) term258435).get((Object) null);
        Integer term258028 = new Integer(-1002370457);
        Integer term258030 = new Integer(-2014576105);
        Integer term258044 = new Integer(1296895584);
        Integer term258046 = new Integer(628918458);
        Integer term258070 = new Integer(-1274456137);
        Integer term258072 = new Integer(1041916673);
        Integer term258074 = new Integer(-601863069);
        Integer term258076 = new Integer(663292551);
        Integer term258078 = new Integer(-1885090354);
        Integer term258080 = new Integer(-2066804303);
        Class<? extends Object> term258730 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term258729 = ((Class) term258730).getDeclaredField((String) "REISSUE");
        ((Field) term258729).setAccessible(true);
        Object enum613 = ((Field) term258729).get((Object) null);
        term257980 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term258060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258065 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term257980, term257980.getClass(), "ps_result", enum611);
        setField(term257980, term257980.getClass(), "accept_idx", term257992);
        setField(term257980, term257980.getClass(), "nblss_ltt_stts", term257994);
        setField(term257980, term257980.getClass(), "nblss_ltt_tckt", term257996);
        setField(term257980, term257980.getClass(), "nblss_ltt_is_opn", term257998);
        setField(term257980, term257980.getClass(), "pd_id", term258000);
        setField(term257980, term257980.getClass(), "player_name", "iUsNqPEgsp");
        setField(term257980, term257980.getClass(), "sort_kind", enum612);
        setField(term257980, term257980.getClass(), "lv_num", term258028);
        setField(term257980, term257980.getClass(), "lv_pnt", term258030);
        setField(term257980, term257980.getClass(), "lv_str", "ODyqlitqRS");
        setField(term257980, term257980.getClass(), "lv_efct_id", term258044);
        setField(term257980, term257980.getClass(), "lv_plt_id", term258046);
        setField(term257980, term257980.getClass(), "mdl_eqp_ary", "BKEyXkrXND");
        setIntField(term258061, term258061.getClass(), "year", 2016);
        setShortField(term258061, term258061.getClass(), "month", (short) 10);
        setShortField(term258061, term258061.getClass(), "day", (short) 10);
        setField(term258060, term258060.getClass(), "date", term258061);
        setByteField(term258065, term258065.getClass(), "hour", (byte) 16);
        setByteField(term258065, term258065.getClass(), "minute", (byte) 7);
        setByteField(term258065, term258065.getClass(), "second", (byte) 16);
        setIntField(term258065, term258065.getClass(), "nano", 995200309);
        setField(term258060, term258060.getClass(), "time", term258065);
        setField(term257980, term257980.getClass(), "mdl_eqp_tm", term258060);
        setField(term257980, term257980.getClass(), "skn_eqp", term258070);
        setField(term257980, term257980.getClass(), "btn_se_eqp", term258072);
        setField(term257980, term257980.getClass(), "sld_se_eqp", term258074);
        setField(term257980, term257980.getClass(), "chn_sld_se_eqp", term258076);
        setField(term257980, term257980.getClass(), "sldr_tch_se_eqp", term258078);
        setField(term257980, term257980.getClass(), "vcld_pts", term258080);
        setField(term257980, term257980.getClass(), "passwd_stat", enum613);
        setField(term257980, term257980.getClass(), "cmd", "xpmkTXUaIW");
        setField(term257980, term257980.getClass(), "req_id", "mkwXyNcVfj");
        setField(term257980, term257980.getClass(), "stat", "JaYInVuGAK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term257980, args);
    }

};


