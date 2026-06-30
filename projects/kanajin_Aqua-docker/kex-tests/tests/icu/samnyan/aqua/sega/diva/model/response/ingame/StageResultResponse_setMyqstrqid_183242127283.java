package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_setMyqstrqid_183242127283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58479;

    public StageResultResponse_setMyqstrqid_183242127283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58479 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term58674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58679 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58479, term58479.getClass(), "chllng_kind", 1866941633);
        setIntField(term58479, term58479.getClass(), "lv_num_old", 1697296048);
        setIntField(term58479, term58479.getClass(), "lv_pnt_old", 1302075623);
        setIntField(term58479, term58479.getClass(), "lv_num", 1238707613);
        setIntField(term58479, term58479.getClass(), "lv_pnt", 1961351136);
        setField(term58479, term58479.getClass(), "lv_str", "zPDuGbsYGT");
        setIntField(term58479, term58479.getClass(), "lv_efct_id", -1546528470);
        setIntField(term58479, term58479.getClass(), "lv_plt_id", -1518971561);
        setIntField(term58479, term58479.getClass(), "vcld_pts", 1513663171);
        setIntField(term58479, term58479.getClass(), "prsnt_vcld_pts", 1527034193);
        setIntField(term58479, term58479.getClass(), "cnp_cid", 1309545946);
        setIntField(term58479, term58479.getClass(), "cnp_val", -1457812682);
        setField(term58479, term58479.getClass(), "cnp_sp", "apnNoBOovC");
        setField(term58479, term58479.getClass(), "crwd_kind", "SyGIHWAumE");
        setField(term58479, term58479.getClass(), "crwd_value", "bMQUwQqyMc");
        setField(term58479, term58479.getClass(), "crwd_str_0", "CVaGhXmAUN");
        setField(term58479, term58479.getClass(), "crwd_str_1", "KnclcuNYRb");
        setIntField(term58479, term58479.getClass(), "cerwd_kind", -161850441);
        setIntField(term58479, term58479.getClass(), "cerwd_value", 1486351894);
        setField(term58479, term58479.getClass(), "cerwd_str_0", "UDZJbJPmCC");
        setField(term58479, term58479.getClass(), "cerwd_str_1", "oVkgUUfHis");
        setField(term58479, term58479.getClass(), "ttl_str_ary", "hoCKQzIOhx");
        setField(term58479, term58479.getClass(), "ttl_plt_id_ary", "znUxTdEvUD");
        setField(term58479, term58479.getClass(), "ttl_desc_ary", "PvtJhtGffh");
        setField(term58479, term58479.getClass(), "skin_id_ary", "KReGJTSQuY");
        setField(term58479, term58479.getClass(), "skin_name_ary", "hqZmoXoMuS");
        setField(term58479, term58479.getClass(), "skin_illust_ary", "PUPJWadLXP");
        setField(term58479, term58479.getClass(), "skin_desc_ary", "TBNsemBBKA");
        setIntField(term58479, term58479.getClass(), "pdddt_flg", 1352463113);
        setIntField(term58675, term58675.getClass(), "year", 2020);
        setShortField(term58675, term58675.getClass(), "month", (short) 10);
        setShortField(term58675, term58675.getClass(), "day", (short) 25);
        setField(term58674, term58674.getClass(), "date", term58675);
        setByteField(term58679, term58679.getClass(), "hour", (byte) 18);
        setByteField(term58679, term58679.getClass(), "minute", (byte) 22);
        setByteField(term58679, term58679.getClass(), "second", (byte) 30);
        setIntField(term58679, term58679.getClass(), "nano", 948592965);
        setField(term58674, term58674.getClass(), "time", term58679);
        setField(term58479, term58479.getClass(), "pdddt_tm", term58674);
        setIntField(term58479, term58479.getClass(), "nblss_ltt_stts", 897269648);
        setIntField(term58479, term58479.getClass(), "nblss_ltt_tckt", -1020664075);
        setIntField(term58479, term58479.getClass(), "nblss_ltt_is_opn", -1412100145);
        setIntField(term58479, term58479.getClass(), "nblss_ltt_prz", -1702355599);
        setIntField(term58479, term58479.getClass(), "nblss_ltt_nxt_stts", -1477091217);
        setIntField(term58479, term58479.getClass(), "nblss_ltt_nxt_tckt", 2023226154);
        setField(term58479, term58479.getClass(), "my_qst_id", "DpNDxwXKkX");
        setField(term58479, term58479.getClass(), "my_qst_r_qid", "uxoFwkPfXf");
        setField(term58479, term58479.getClass(), "my_qst_r_knd", "OoVnZTvxUt");
        setField(term58479, term58479.getClass(), "my_qst_r_vl", "MnqnyndkhF");
        setField(term58479, term58479.getClass(), "my_qst_r_nflg", "MZzoPKpFlh");
        setField(term58479, term58479.getClass(), "my_ccd_r_qid", "skVZETaBKX");
        setField(term58479, term58479.getClass(), "my_ccd_r_hnd", "jcJNIBACPb");
        setField(term58479, term58479.getClass(), "my_ccd_r_vp", "mPQmjoknqi");
        setField(term58479, term58479.getClass(), "cmd", "gLgvePQRQT");
        setField(term58479, term58479.getClass(), "req_id", "SCmsfHIEPK");
        setField(term58479, term58479.getClass(), "stat", "dFOuezLNWb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PUWJnLuyiR";
        callMethod(klass, "setMy_qst_r_qid", argTypes, term58479, args);
    }

};


