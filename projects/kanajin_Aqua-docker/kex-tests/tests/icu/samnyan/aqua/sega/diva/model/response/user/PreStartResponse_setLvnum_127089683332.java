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

public class PreStartResponse_setLvnum_127089683332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279902;
     Object term280051;

    public PreStartResponse_setLvnum_127089683332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term280054 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term280053 = ((Class) term280054).getDeclaredField((String) "FAILED");
        ((Field) term280053).setAccessible(true);
        Object enum673 = ((Field) term280053).get((Object) null);
        Integer term279914 = new Integer(-1252345779);
        Integer term279916 = new Integer(-2063365430);
        Integer term279918 = new Integer(812570053);
        Integer term279920 = new Integer(-1488938905);
        Integer term279922 = new Integer(1916544127);
        Class<? extends Object> term280359 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term280358 = ((Class) term280359).getDeclaredField((String) "COMPLEXITY");
        ((Field) term280358).setAccessible(true);
        Object enum674 = ((Field) term280358).get((Object) null);
        Integer term279951 = new Integer(-1133405894);
        Integer term279953 = new Integer(1289741214);
        Integer term279967 = new Integer(243280944);
        Integer term279969 = new Integer(-726681073);
        Integer term279993 = new Integer(-1724487863);
        Integer term279995 = new Integer(-128490829);
        Integer term279997 = new Integer(202214133);
        Integer term279999 = new Integer(1543091617);
        Integer term280001 = new Integer(-763166094);
        Integer term280003 = new Integer(-222941705);
        Class<? extends Object> term280656 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term280655 = ((Class) term280656).getDeclaredField((String) "RESET");
        ((Field) term280655).setAccessible(true);
        Object enum675 = ((Field) term280655).get((Object) null);
        term279902 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term279983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279988 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term279902, term279902.getClass(), "ps_result", enum673);
        setField(term279902, term279902.getClass(), "accept_idx", term279914);
        setField(term279902, term279902.getClass(), "nblss_ltt_stts", term279916);
        setField(term279902, term279902.getClass(), "nblss_ltt_tckt", term279918);
        setField(term279902, term279902.getClass(), "nblss_ltt_is_opn", term279920);
        setField(term279902, term279902.getClass(), "pd_id", term279922);
        setField(term279902, term279902.getClass(), "player_name", "GcMaBtNShc");
        setField(term279902, term279902.getClass(), "sort_kind", enum674);
        setField(term279902, term279902.getClass(), "lv_num", term279951);
        setField(term279902, term279902.getClass(), "lv_pnt", term279953);
        setField(term279902, term279902.getClass(), "lv_str", "kqGufqJbqf");
        setField(term279902, term279902.getClass(), "lv_efct_id", term279967);
        setField(term279902, term279902.getClass(), "lv_plt_id", term279969);
        setField(term279902, term279902.getClass(), "mdl_eqp_ary", "wqMYxsvXwx");
        setIntField(term279984, term279984.getClass(), "year", 2022);
        setShortField(term279984, term279984.getClass(), "month", (short) 3);
        setShortField(term279984, term279984.getClass(), "day", (short) 16);
        setField(term279983, term279983.getClass(), "date", term279984);
        setByteField(term279988, term279988.getClass(), "hour", (byte) 16);
        setByteField(term279988, term279988.getClass(), "minute", (byte) 35);
        setByteField(term279988, term279988.getClass(), "second", (byte) 38);
        setIntField(term279988, term279988.getClass(), "nano", 79329968);
        setField(term279983, term279983.getClass(), "time", term279988);
        setField(term279902, term279902.getClass(), "mdl_eqp_tm", term279983);
        setField(term279902, term279902.getClass(), "skn_eqp", term279993);
        setField(term279902, term279902.getClass(), "btn_se_eqp", term279995);
        setField(term279902, term279902.getClass(), "sld_se_eqp", term279997);
        setField(term279902, term279902.getClass(), "chn_sld_se_eqp", term279999);
        setField(term279902, term279902.getClass(), "sldr_tch_se_eqp", term280001);
        setField(term279902, term279902.getClass(), "vcld_pts", term280003);
        setField(term279902, term279902.getClass(), "passwd_stat", enum675);
        setField(term279902, term279902.getClass(), "cmd", "qUfONYtlAU");
        setField(term279902, term279902.getClass(), "req_id", "QMHmlsCFoq");
        setField(term279902, term279902.getClass(), "stat", "JlgbBmNibu");
        term280051 = new Integer(291864719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term280051;
        callMethod(klass, "setLv_num", argTypes, term279902, args);
    }

};


