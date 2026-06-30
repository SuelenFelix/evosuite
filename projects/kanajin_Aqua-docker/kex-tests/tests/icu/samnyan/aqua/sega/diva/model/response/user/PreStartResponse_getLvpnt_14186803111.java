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

public class PreStartResponse_getLvpnt_14186803111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256913;

    public PreStartResponse_getLvpnt_14186803111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257069 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term257068 = ((Class) term257069).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term257068).setAccessible(true);
        Object enum608 = ((Field) term257068).get((Object) null);
        Integer term256934 = new Integer(202001407);
        Integer term256936 = new Integer(158873461);
        Integer term256938 = new Integer(-430151637);
        Integer term256940 = new Integer(-1697741339);
        Integer term256942 = new Integer(98922530);
        Class<? extends Object> term257401 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term257400 = ((Class) term257401).getDeclaredField((String) "MY_LIST_C");
        ((Field) term257400).setAccessible(true);
        Object enum609 = ((Field) term257400).get((Object) null);
        Integer term256970 = new Integer(-1388471422);
        Integer term256972 = new Integer(-1498296052);
        Integer term256986 = new Integer(2098647989);
        Integer term256988 = new Integer(1598895173);
        Integer term257012 = new Integer(1830648570);
        Integer term257014 = new Integer(-227365013);
        Integer term257016 = new Integer(11724947);
        Integer term257018 = new Integer(1953277050);
        Integer term257020 = new Integer(1283079251);
        Integer term257022 = new Integer(-523949691);
        Class<? extends Object> term257695 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term257694 = ((Class) term257695).getDeclaredField((String) "SET");
        ((Field) term257694).setAccessible(true);
        Object enum610 = ((Field) term257694).get((Object) null);
        term256913 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term257002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257007 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term256913, term256913.getClass(), "ps_result", enum608);
        setField(term256913, term256913.getClass(), "accept_idx", term256934);
        setField(term256913, term256913.getClass(), "nblss_ltt_stts", term256936);
        setField(term256913, term256913.getClass(), "nblss_ltt_tckt", term256938);
        setField(term256913, term256913.getClass(), "nblss_ltt_is_opn", term256940);
        setField(term256913, term256913.getClass(), "pd_id", term256942);
        setField(term256913, term256913.getClass(), "player_name", "FnxmVYYBUu");
        setField(term256913, term256913.getClass(), "sort_kind", enum609);
        setField(term256913, term256913.getClass(), "lv_num", term256970);
        setField(term256913, term256913.getClass(), "lv_pnt", term256972);
        setField(term256913, term256913.getClass(), "lv_str", "FcaMVDYJay");
        setField(term256913, term256913.getClass(), "lv_efct_id", term256986);
        setField(term256913, term256913.getClass(), "lv_plt_id", term256988);
        setField(term256913, term256913.getClass(), "mdl_eqp_ary", "pLLUuhaofY");
        setIntField(term257003, term257003.getClass(), "year", 2017);
        setShortField(term257003, term257003.getClass(), "month", (short) 6);
        setShortField(term257003, term257003.getClass(), "day", (short) 28);
        setField(term257002, term257002.getClass(), "date", term257003);
        setByteField(term257007, term257007.getClass(), "hour", (byte) 8);
        setByteField(term257007, term257007.getClass(), "minute", (byte) 1);
        setByteField(term257007, term257007.getClass(), "second", (byte) 14);
        setIntField(term257007, term257007.getClass(), "nano", 501033715);
        setField(term257002, term257002.getClass(), "time", term257007);
        setField(term256913, term256913.getClass(), "mdl_eqp_tm", term257002);
        setField(term256913, term256913.getClass(), "skn_eqp", term257012);
        setField(term256913, term256913.getClass(), "btn_se_eqp", term257014);
        setField(term256913, term256913.getClass(), "sld_se_eqp", term257016);
        setField(term256913, term256913.getClass(), "chn_sld_se_eqp", term257018);
        setField(term256913, term256913.getClass(), "sldr_tch_se_eqp", term257020);
        setField(term256913, term256913.getClass(), "vcld_pts", term257022);
        setField(term256913, term256913.getClass(), "passwd_stat", enum610);
        setField(term256913, term256913.getClass(), "cmd", "dCIHiLfkJL");
        setField(term256913, term256913.getClass(), "req_id", "bMYsCPikwh");
        setField(term256913, term256913.getClass(), "stat", "hZENcMRjJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_pnt", argTypes, term256913, args);
    }

};


