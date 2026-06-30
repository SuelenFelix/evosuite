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

public class PreStartResponse_getVcldpts_157565847522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268574;

    public PreStartResponse_getVcldpts_157565847522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268735 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term268734 = ((Class) term268735).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term268734).setAccessible(true);
        Object enum641 = ((Field) term268734).get((Object) null);
        Integer term268595 = new Integer(-2013924238);
        Integer term268597 = new Integer(579006268);
        Integer term268599 = new Integer(-1694747156);
        Integer term268601 = new Integer(1466373988);
        Integer term268603 = new Integer(-358526505);
        Class<? extends Object> term269067 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term269066 = ((Class) term269067).getDeclaredField((String) "COMPLEXITY");
        ((Field) term269066).setAccessible(true);
        Object enum642 = ((Field) term269066).get((Object) null);
        Integer term268632 = new Integer(1843268026);
        Integer term268634 = new Integer(954660603);
        Integer term268648 = new Integer(-1351605385);
        Integer term268650 = new Integer(278355793);
        Integer term268674 = new Integer(-310648604);
        Integer term268676 = new Integer(-648200466);
        Integer term268678 = new Integer(2007134147);
        Integer term268680 = new Integer(993388358);
        Integer term268682 = new Integer(-765191335);
        Integer term268684 = new Integer(-1697741155);
        Class<? extends Object> term269364 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term269363 = ((Class) term269364).getDeclaredField((String) "REISSUE");
        ((Field) term269363).setAccessible(true);
        Object enum643 = ((Field) term269363).get((Object) null);
        term268574 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term268664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268669 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term268574, term268574.getClass(), "ps_result", enum641);
        setField(term268574, term268574.getClass(), "accept_idx", term268595);
        setField(term268574, term268574.getClass(), "nblss_ltt_stts", term268597);
        setField(term268574, term268574.getClass(), "nblss_ltt_tckt", term268599);
        setField(term268574, term268574.getClass(), "nblss_ltt_is_opn", term268601);
        setField(term268574, term268574.getClass(), "pd_id", term268603);
        setField(term268574, term268574.getClass(), "player_name", "NzoNAsaJqr");
        setField(term268574, term268574.getClass(), "sort_kind", enum642);
        setField(term268574, term268574.getClass(), "lv_num", term268632);
        setField(term268574, term268574.getClass(), "lv_pnt", term268634);
        setField(term268574, term268574.getClass(), "lv_str", "VRKEuPftph");
        setField(term268574, term268574.getClass(), "lv_efct_id", term268648);
        setField(term268574, term268574.getClass(), "lv_plt_id", term268650);
        setField(term268574, term268574.getClass(), "mdl_eqp_ary", "DkRegMkIWt");
        setIntField(term268665, term268665.getClass(), "year", 2024);
        setShortField(term268665, term268665.getClass(), "month", (short) 4);
        setShortField(term268665, term268665.getClass(), "day", (short) 26);
        setField(term268664, term268664.getClass(), "date", term268665);
        setByteField(term268669, term268669.getClass(), "hour", (byte) 15);
        setByteField(term268669, term268669.getClass(), "minute", (byte) 12);
        setByteField(term268669, term268669.getClass(), "second", (byte) 31);
        setIntField(term268669, term268669.getClass(), "nano", 839979637);
        setField(term268664, term268664.getClass(), "time", term268669);
        setField(term268574, term268574.getClass(), "mdl_eqp_tm", term268664);
        setField(term268574, term268574.getClass(), "skn_eqp", term268674);
        setField(term268574, term268574.getClass(), "btn_se_eqp", term268676);
        setField(term268574, term268574.getClass(), "sld_se_eqp", term268678);
        setField(term268574, term268574.getClass(), "chn_sld_se_eqp", term268680);
        setField(term268574, term268574.getClass(), "sldr_tch_se_eqp", term268682);
        setField(term268574, term268574.getClass(), "vcld_pts", term268684);
        setField(term268574, term268574.getClass(), "passwd_stat", enum643);
        setField(term268574, term268574.getClass(), "cmd", "IIOFAGjcXe");
        setField(term268574, term268574.getClass(), "req_id", "XsAUdWVfqM");
        setField(term268574, term268574.getClass(), "stat", "WRKAHqtTqT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term268574, args);
    }

};


