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

public class PreStartResponse_getPlayername_15921207768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253700;

    public PreStartResponse_getPlayername_15921207768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term253858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term253857 = ((Class) term253858).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term253857).setAccessible(true);
        Object enum599 = ((Field) term253857).get((Object) null);
        Integer term253721 = new Integer(683666002);
        Integer term253723 = new Integer(1596213415);
        Integer term253725 = new Integer(-268815336);
        Integer term253727 = new Integer(-1210583429);
        Integer term253729 = new Integer(-663691365);
        Class<? extends Object> term254190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term254189 = ((Class) term254190).getDeclaredField((String) "MY_LIST_B");
        ((Field) term254189).setAccessible(true);
        Object enum600 = ((Field) term254189).get((Object) null);
        Integer term253757 = new Integer(339854490);
        Integer term253759 = new Integer(-615654495);
        Integer term253773 = new Integer(-1476117762);
        Integer term253775 = new Integer(-341962980);
        Integer term253799 = new Integer(1532716628);
        Integer term253801 = new Integer(-1801760683);
        Integer term253803 = new Integer(1141317871);
        Integer term253805 = new Integer(890669485);
        Integer term253807 = new Integer(691577392);
        Integer term253809 = new Integer(-893623680);
        Class<? extends Object> term254484 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term254483 = ((Class) term254484).getDeclaredField((String) "RESET");
        ((Field) term254483).setAccessible(true);
        Object enum601 = ((Field) term254483).get((Object) null);
        term253700 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term253789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253794 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term253700, term253700.getClass(), "ps_result", enum599);
        setField(term253700, term253700.getClass(), "accept_idx", term253721);
        setField(term253700, term253700.getClass(), "nblss_ltt_stts", term253723);
        setField(term253700, term253700.getClass(), "nblss_ltt_tckt", term253725);
        setField(term253700, term253700.getClass(), "nblss_ltt_is_opn", term253727);
        setField(term253700, term253700.getClass(), "pd_id", term253729);
        setField(term253700, term253700.getClass(), "player_name", "KPFNRywlFG");
        setField(term253700, term253700.getClass(), "sort_kind", enum600);
        setField(term253700, term253700.getClass(), "lv_num", term253757);
        setField(term253700, term253700.getClass(), "lv_pnt", term253759);
        setField(term253700, term253700.getClass(), "lv_str", "EeSPJPLqrn");
        setField(term253700, term253700.getClass(), "lv_efct_id", term253773);
        setField(term253700, term253700.getClass(), "lv_plt_id", term253775);
        setField(term253700, term253700.getClass(), "mdl_eqp_ary", "ixVPsPApNw");
        setIntField(term253790, term253790.getClass(), "year", 2021);
        setShortField(term253790, term253790.getClass(), "month", (short) 12);
        setShortField(term253790, term253790.getClass(), "day", (short) 1);
        setField(term253789, term253789.getClass(), "date", term253790);
        setByteField(term253794, term253794.getClass(), "hour", (byte) 15);
        setByteField(term253794, term253794.getClass(), "minute", (byte) 30);
        setByteField(term253794, term253794.getClass(), "second", (byte) 5);
        setIntField(term253794, term253794.getClass(), "nano", 996341606);
        setField(term253789, term253789.getClass(), "time", term253794);
        setField(term253700, term253700.getClass(), "mdl_eqp_tm", term253789);
        setField(term253700, term253700.getClass(), "skn_eqp", term253799);
        setField(term253700, term253700.getClass(), "btn_se_eqp", term253801);
        setField(term253700, term253700.getClass(), "sld_se_eqp", term253803);
        setField(term253700, term253700.getClass(), "chn_sld_se_eqp", term253805);
        setField(term253700, term253700.getClass(), "sldr_tch_se_eqp", term253807);
        setField(term253700, term253700.getClass(), "vcld_pts", term253809);
        setField(term253700, term253700.getClass(), "passwd_stat", enum601);
        setField(term253700, term253700.getClass(), "cmd", "xBABghJWNo");
        setField(term253700, term253700.getClass(), "req_id", "NpTcCfwURe");
        setField(term253700, term253700.getClass(), "stat", "TxkpqJJFUT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term253700, args);
    }

};


