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

public class StageResultResponse_getMyccdrvp_96151740245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35163;

    public StageResultResponse_getMyccdrvp_96151740245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35163 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term35358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35363 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term35163, term35163.getClass(), "chllng_kind", -2134711835);
        setIntField(term35163, term35163.getClass(), "lv_num_old", -1641244494);
        setIntField(term35163, term35163.getClass(), "lv_pnt_old", 1124282188);
        setIntField(term35163, term35163.getClass(), "lv_num", -489441521);
        setIntField(term35163, term35163.getClass(), "lv_pnt", 225873732);
        setField(term35163, term35163.getClass(), "lv_str", "fheZXFNQZh");
        setIntField(term35163, term35163.getClass(), "lv_efct_id", 529879356);
        setIntField(term35163, term35163.getClass(), "lv_plt_id", 18072182);
        setIntField(term35163, term35163.getClass(), "vcld_pts", 1544768934);
        setIntField(term35163, term35163.getClass(), "prsnt_vcld_pts", -383508597);
        setIntField(term35163, term35163.getClass(), "cnp_cid", -819372164);
        setIntField(term35163, term35163.getClass(), "cnp_val", 958132675);
        setField(term35163, term35163.getClass(), "cnp_sp", "YxHVWlebna");
        setField(term35163, term35163.getClass(), "crwd_kind", "IEmAQCkrPE");
        setField(term35163, term35163.getClass(), "crwd_value", "lqFGhtlNRM");
        setField(term35163, term35163.getClass(), "crwd_str_0", "GLxLHUsuLw");
        setField(term35163, term35163.getClass(), "crwd_str_1", "HuKdqrrxIm");
        setIntField(term35163, term35163.getClass(), "cerwd_kind", -689879283);
        setIntField(term35163, term35163.getClass(), "cerwd_value", 1985432430);
        setField(term35163, term35163.getClass(), "cerwd_str_0", "yJKKddLqMb");
        setField(term35163, term35163.getClass(), "cerwd_str_1", "LWEYaXeKBe");
        setField(term35163, term35163.getClass(), "ttl_str_ary", "cNoFvpHBHw");
        setField(term35163, term35163.getClass(), "ttl_plt_id_ary", "DoSWbCtsBg");
        setField(term35163, term35163.getClass(), "ttl_desc_ary", "NrXtkbXwDc");
        setField(term35163, term35163.getClass(), "skin_id_ary", "EUapSrAmOe");
        setField(term35163, term35163.getClass(), "skin_name_ary", "dUHylIprea");
        setField(term35163, term35163.getClass(), "skin_illust_ary", "FKDqHRpMcc");
        setField(term35163, term35163.getClass(), "skin_desc_ary", "mIRMQIxHUD");
        setIntField(term35163, term35163.getClass(), "pdddt_flg", -1769933499);
        setIntField(term35359, term35359.getClass(), "year", 2020);
        setShortField(term35359, term35359.getClass(), "month", (short) 5);
        setShortField(term35359, term35359.getClass(), "day", (short) 18);
        setField(term35358, term35358.getClass(), "date", term35359);
        setByteField(term35363, term35363.getClass(), "hour", (byte) 5);
        setByteField(term35363, term35363.getClass(), "minute", (byte) 46);
        setByteField(term35363, term35363.getClass(), "second", (byte) 13);
        setIntField(term35363, term35363.getClass(), "nano", 45893173);
        setField(term35358, term35358.getClass(), "time", term35363);
        setField(term35163, term35163.getClass(), "pdddt_tm", term35358);
        setIntField(term35163, term35163.getClass(), "nblss_ltt_stts", -1510932472);
        setIntField(term35163, term35163.getClass(), "nblss_ltt_tckt", 1970654816);
        setIntField(term35163, term35163.getClass(), "nblss_ltt_is_opn", 1354781442);
        setIntField(term35163, term35163.getClass(), "nblss_ltt_prz", -393590701);
        setIntField(term35163, term35163.getClass(), "nblss_ltt_nxt_stts", 86344574);
        setIntField(term35163, term35163.getClass(), "nblss_ltt_nxt_tckt", -829441157);
        setField(term35163, term35163.getClass(), "my_qst_id", "FbBMtntDbw");
        setField(term35163, term35163.getClass(), "my_qst_r_qid", "zRnpRGaHlI");
        setField(term35163, term35163.getClass(), "my_qst_r_knd", "dVHfxjbMRK");
        setField(term35163, term35163.getClass(), "my_qst_r_vl", "LzwyLxKJpw");
        setField(term35163, term35163.getClass(), "my_qst_r_nflg", "ZhWJlplAVK");
        setField(term35163, term35163.getClass(), "my_ccd_r_qid", "pnmjTuTojv");
        setField(term35163, term35163.getClass(), "my_ccd_r_hnd", "eMtshhmGEm");
        setField(term35163, term35163.getClass(), "my_ccd_r_vp", "VJUbzHGOvg");
        setField(term35163, term35163.getClass(), "cmd", "SiwcigIrfD");
        setField(term35163, term35163.getClass(), "req_id", "MFIdGVLoDo");
        setField(term35163, term35163.getClass(), "stat", "kbxgTcnXyU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_ccd_r_vp", argTypes, term35163, args);
    }

};


