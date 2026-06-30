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

public class PreStartResponse_setLvpnt_126925160133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280947;
     Object term281106;

    public PreStartResponse_setLvpnt_126925160133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term281109 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term281108 = ((Class) term281109).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term281108).setAccessible(true);
        Object enum676 = ((Field) term281108).get((Object) null);
        Integer term280968 = new Integer(-1549607466);
        Integer term280970 = new Integer(853609788);
        Integer term280972 = new Integer(-197820800);
        Integer term280974 = new Integer(723812297);
        Integer term280976 = new Integer(1639448749);
        Class<? extends Object> term281441 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term281440 = ((Class) term281441).getDeclaredField((String) "MY_LIST_A");
        ((Field) term281440).setAccessible(true);
        Object enum677 = ((Field) term281440).get((Object) null);
        Integer term281004 = new Integer(873659088);
        Integer term281006 = new Integer(-975748721);
        Integer term281020 = new Integer(433248783);
        Integer term281022 = new Integer(-507944154);
        Integer term281046 = new Integer(-1736183862);
        Integer term281048 = new Integer(897010381);
        Integer term281050 = new Integer(-15712667);
        Integer term281052 = new Integer(1964967720);
        Integer term281054 = new Integer(1351900243);
        Integer term281056 = new Integer(-330897705);
        Class<? extends Object> term281735 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term281734 = ((Class) term281735).getDeclaredField((String) "REISSUE");
        ((Field) term281734).setAccessible(true);
        Object enum678 = ((Field) term281734).get((Object) null);
        term280947 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term281036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281041 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term280947, term280947.getClass(), "ps_result", enum676);
        setField(term280947, term280947.getClass(), "accept_idx", term280968);
        setField(term280947, term280947.getClass(), "nblss_ltt_stts", term280970);
        setField(term280947, term280947.getClass(), "nblss_ltt_tckt", term280972);
        setField(term280947, term280947.getClass(), "nblss_ltt_is_opn", term280974);
        setField(term280947, term280947.getClass(), "pd_id", term280976);
        setField(term280947, term280947.getClass(), "player_name", "igRVOATJPd");
        setField(term280947, term280947.getClass(), "sort_kind", enum677);
        setField(term280947, term280947.getClass(), "lv_num", term281004);
        setField(term280947, term280947.getClass(), "lv_pnt", term281006);
        setField(term280947, term280947.getClass(), "lv_str", "DYaMGxxqDk");
        setField(term280947, term280947.getClass(), "lv_efct_id", term281020);
        setField(term280947, term280947.getClass(), "lv_plt_id", term281022);
        setField(term280947, term280947.getClass(), "mdl_eqp_ary", "kTRmkTQpRx");
        setIntField(term281037, term281037.getClass(), "year", 2018);
        setShortField(term281037, term281037.getClass(), "month", (short) 9);
        setShortField(term281037, term281037.getClass(), "day", (short) 3);
        setField(term281036, term281036.getClass(), "date", term281037);
        setByteField(term281041, term281041.getClass(), "hour", (byte) 16);
        setByteField(term281041, term281041.getClass(), "minute", (byte) 48);
        setByteField(term281041, term281041.getClass(), "second", (byte) 45);
        setIntField(term281041, term281041.getClass(), "nano", 919694917);
        setField(term281036, term281036.getClass(), "time", term281041);
        setField(term280947, term280947.getClass(), "mdl_eqp_tm", term281036);
        setField(term280947, term280947.getClass(), "skn_eqp", term281046);
        setField(term280947, term280947.getClass(), "btn_se_eqp", term281048);
        setField(term280947, term280947.getClass(), "sld_se_eqp", term281050);
        setField(term280947, term280947.getClass(), "chn_sld_se_eqp", term281052);
        setField(term280947, term280947.getClass(), "sldr_tch_se_eqp", term281054);
        setField(term280947, term280947.getClass(), "vcld_pts", term281056);
        setField(term280947, term280947.getClass(), "passwd_stat", enum678);
        setField(term280947, term280947.getClass(), "cmd", "NmXGFQkgMo");
        setField(term280947, term280947.getClass(), "req_id", "lBruaTAkIt");
        setField(term280947, term280947.getClass(), "stat", "pIQQBEGLOF");
        term281106 = new Integer(1065595802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term281106;
        callMethod(klass, "setLv_pnt", argTypes, term280947, args);
    }

};


