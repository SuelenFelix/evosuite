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

public class PreStartResponse_getLvnum_14351326310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255822;

    public PreStartResponse_getLvnum_14351326310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term255984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term255983 = ((Class) term255984).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term255983).setAccessible(true);
        Object enum605 = ((Field) term255983).get((Object) null);
        Integer term255844 = new Integer(96566506);
        Integer term255846 = new Integer(-343325701);
        Integer term255848 = new Integer(107945604);
        Integer term255850 = new Integer(-1963464809);
        Integer term255852 = new Integer(71190297);
        Class<? extends Object> term256319 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term256318 = ((Class) term256319).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term256318).setAccessible(true);
        Object enum606 = ((Field) term256318).get((Object) null);
        Integer term255883 = new Integer(1202361360);
        Integer term255885 = new Integer(-2015048153);
        Integer term255899 = new Integer(-2063457669);
        Integer term255901 = new Integer(-1222006000);
        Integer term255925 = new Integer(2095798786);
        Integer term255927 = new Integer(-1565502840);
        Integer term255929 = new Integer(344323424);
        Integer term255931 = new Integer(9726679);
        Integer term255933 = new Integer(-25637976);
        Integer term255935 = new Integer(1555897383);
        Class<? extends Object> term256622 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term256621 = ((Class) term256622).getDeclaredField((String) "RESET");
        ((Field) term256621).setAccessible(true);
        Object enum607 = ((Field) term256621).get((Object) null);
        term255822 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term255915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255920 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term255822, term255822.getClass(), "ps_result", enum605);
        setField(term255822, term255822.getClass(), "accept_idx", term255844);
        setField(term255822, term255822.getClass(), "nblss_ltt_stts", term255846);
        setField(term255822, term255822.getClass(), "nblss_ltt_tckt", term255848);
        setField(term255822, term255822.getClass(), "nblss_ltt_is_opn", term255850);
        setField(term255822, term255822.getClass(), "pd_id", term255852);
        setField(term255822, term255822.getClass(), "player_name", "lbuoMbJEmY");
        setField(term255822, term255822.getClass(), "sort_kind", enum606);
        setField(term255822, term255822.getClass(), "lv_num", term255883);
        setField(term255822, term255822.getClass(), "lv_pnt", term255885);
        setField(term255822, term255822.getClass(), "lv_str", "mlYqXpLxYN");
        setField(term255822, term255822.getClass(), "lv_efct_id", term255899);
        setField(term255822, term255822.getClass(), "lv_plt_id", term255901);
        setField(term255822, term255822.getClass(), "mdl_eqp_ary", "NUmCDjLJOd");
        setIntField(term255916, term255916.getClass(), "year", 2028);
        setShortField(term255916, term255916.getClass(), "month", (short) 3);
        setShortField(term255916, term255916.getClass(), "day", (short) 25);
        setField(term255915, term255915.getClass(), "date", term255916);
        setByteField(term255920, term255920.getClass(), "hour", (byte) 6);
        setByteField(term255920, term255920.getClass(), "minute", (byte) 9);
        setByteField(term255920, term255920.getClass(), "second", (byte) 35);
        setIntField(term255920, term255920.getClass(), "nano", 744453524);
        setField(term255915, term255915.getClass(), "time", term255920);
        setField(term255822, term255822.getClass(), "mdl_eqp_tm", term255915);
        setField(term255822, term255822.getClass(), "skn_eqp", term255925);
        setField(term255822, term255822.getClass(), "btn_se_eqp", term255927);
        setField(term255822, term255822.getClass(), "sld_se_eqp", term255929);
        setField(term255822, term255822.getClass(), "chn_sld_se_eqp", term255931);
        setField(term255822, term255822.getClass(), "sldr_tch_se_eqp", term255933);
        setField(term255822, term255822.getClass(), "vcld_pts", term255935);
        setField(term255822, term255822.getClass(), "passwd_stat", enum607);
        setField(term255822, term255822.getClass(), "cmd", "miAgzoWkiV");
        setField(term255822, term255822.getClass(), "req_id", "teJJZHDWWb");
        setField(term255822, term255822.getClass(), "stat", "QDGurdhyNf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_num", argTypes, term255822, args);
    }

};


