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

public class PreStartResponse_setPsresult_23320968624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270740;
     Object enum650;

    public PreStartResponse_setPsresult_23320968624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270913 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term270912 = ((Class) term270913).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term270912).setAccessible(true);
        Object enum647 = ((Field) term270912).get((Object) null);
        Integer term270762 = new Integer(1048271679);
        Integer term270764 = new Integer(-1529797673);
        Integer term270766 = new Integer(-868676396);
        Integer term270768 = new Integer(1922684808);
        Integer term270770 = new Integer(-2005784375);
        Class<? extends Object> term271248 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term271247 = ((Class) term271248).getDeclaredField((String) "MY_LIST_A");
        ((Field) term271247).setAccessible(true);
        Object enum648 = ((Field) term271247).get((Object) null);
        Integer term270798 = new Integer(-288604325);
        Integer term270800 = new Integer(-1268314569);
        Integer term270814 = new Integer(877649659);
        Integer term270816 = new Integer(-1332748804);
        Integer term270840 = new Integer(1774507971);
        Integer term270842 = new Integer(-1420269858);
        Integer term270844 = new Integer(-2119545015);
        Integer term270846 = new Integer(1272542218);
        Integer term270848 = new Integer(1209799204);
        Integer term270850 = new Integer(1094107751);
        Class<? extends Object> term271542 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term271541 = ((Class) term271542).getDeclaredField((String) "REISSUE");
        ((Field) term271541).setAccessible(true);
        Object enum649 = ((Field) term271541).get((Object) null);
        term270740 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term270830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270835 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term270740, term270740.getClass(), "ps_result", enum647);
        setField(term270740, term270740.getClass(), "accept_idx", term270762);
        setField(term270740, term270740.getClass(), "nblss_ltt_stts", term270764);
        setField(term270740, term270740.getClass(), "nblss_ltt_tckt", term270766);
        setField(term270740, term270740.getClass(), "nblss_ltt_is_opn", term270768);
        setField(term270740, term270740.getClass(), "pd_id", term270770);
        setField(term270740, term270740.getClass(), "player_name", "JUpDTRXGtv");
        setField(term270740, term270740.getClass(), "sort_kind", enum648);
        setField(term270740, term270740.getClass(), "lv_num", term270798);
        setField(term270740, term270740.getClass(), "lv_pnt", term270800);
        setField(term270740, term270740.getClass(), "lv_str", "cKBnwzMCia");
        setField(term270740, term270740.getClass(), "lv_efct_id", term270814);
        setField(term270740, term270740.getClass(), "lv_plt_id", term270816);
        setField(term270740, term270740.getClass(), "mdl_eqp_ary", "QWmZpWASOK");
        setIntField(term270831, term270831.getClass(), "year", 2016);
        setShortField(term270831, term270831.getClass(), "month", (short) 8);
        setShortField(term270831, term270831.getClass(), "day", (short) 24);
        setField(term270830, term270830.getClass(), "date", term270831);
        setByteField(term270835, term270835.getClass(), "hour", (byte) 22);
        setByteField(term270835, term270835.getClass(), "minute", (byte) 25);
        setByteField(term270835, term270835.getClass(), "second", (byte) 3);
        setIntField(term270835, term270835.getClass(), "nano", 185613519);
        setField(term270830, term270830.getClass(), "time", term270835);
        setField(term270740, term270740.getClass(), "mdl_eqp_tm", term270830);
        setField(term270740, term270740.getClass(), "skn_eqp", term270840);
        setField(term270740, term270740.getClass(), "btn_se_eqp", term270842);
        setField(term270740, term270740.getClass(), "sld_se_eqp", term270844);
        setField(term270740, term270740.getClass(), "chn_sld_se_eqp", term270846);
        setField(term270740, term270740.getClass(), "sldr_tch_se_eqp", term270848);
        setField(term270740, term270740.getClass(), "vcld_pts", term270850);
        setField(term270740, term270740.getClass(), "passwd_stat", enum649);
        setField(term270740, term270740.getClass(), "cmd", "ZNLWGsxniS");
        setField(term270740, term270740.getClass(), "req_id", "JARLxkvqNB");
        setField(term270740, term270740.getClass(), "stat", "tNcVErsFVe");
        Class<? extends Object> term271840 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term271839 = ((Class) term271840).getDeclaredField((String) "SUCCESS");
        ((Field) term271839).setAccessible(true);
        enum650 = ((Field) term271839).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Object[] args = new Object[1];
        args[0] = enum650;
        callMethod(klass, "setPs_result", argTypes, term270740, args);
    }

};


