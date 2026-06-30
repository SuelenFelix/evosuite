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

public class StageResultResponse_getNblsslttnxtstts_184811878936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29736;

    public StageResultResponse_getNblsslttnxtstts_184811878936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29736 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term29931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29936 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29736, term29736.getClass(), "chllng_kind", 1815951606);
        setIntField(term29736, term29736.getClass(), "lv_num_old", 1105016932);
        setIntField(term29736, term29736.getClass(), "lv_pnt_old", -365784998);
        setIntField(term29736, term29736.getClass(), "lv_num", -1893236300);
        setIntField(term29736, term29736.getClass(), "lv_pnt", -1858909368);
        setField(term29736, term29736.getClass(), "lv_str", "FxSvJCIpul");
        setIntField(term29736, term29736.getClass(), "lv_efct_id", -280113263);
        setIntField(term29736, term29736.getClass(), "lv_plt_id", 529625347);
        setIntField(term29736, term29736.getClass(), "vcld_pts", 1409095253);
        setIntField(term29736, term29736.getClass(), "prsnt_vcld_pts", 315179039);
        setIntField(term29736, term29736.getClass(), "cnp_cid", -1835923897);
        setIntField(term29736, term29736.getClass(), "cnp_val", -341287775);
        setField(term29736, term29736.getClass(), "cnp_sp", "HCjKwpexJj");
        setField(term29736, term29736.getClass(), "crwd_kind", "sCpIHVPdfl");
        setField(term29736, term29736.getClass(), "crwd_value", "lMUBBGRjfY");
        setField(term29736, term29736.getClass(), "crwd_str_0", "olYpqbolWL");
        setField(term29736, term29736.getClass(), "crwd_str_1", "MCMCjxXzjw");
        setIntField(term29736, term29736.getClass(), "cerwd_kind", -1651110911);
        setIntField(term29736, term29736.getClass(), "cerwd_value", -1934033808);
        setField(term29736, term29736.getClass(), "cerwd_str_0", "pZbbwCURge");
        setField(term29736, term29736.getClass(), "cerwd_str_1", "RsOfgdMCMv");
        setField(term29736, term29736.getClass(), "ttl_str_ary", "nsofCJqJOR");
        setField(term29736, term29736.getClass(), "ttl_plt_id_ary", "CitJiZwsjF");
        setField(term29736, term29736.getClass(), "ttl_desc_ary", "ZiyMvLArWJ");
        setField(term29736, term29736.getClass(), "skin_id_ary", "MaeokjEfWD");
        setField(term29736, term29736.getClass(), "skin_name_ary", "ocZcumnXEz");
        setField(term29736, term29736.getClass(), "skin_illust_ary", "rNNwyactDR");
        setField(term29736, term29736.getClass(), "skin_desc_ary", "QJrTMTdxyh");
        setIntField(term29736, term29736.getClass(), "pdddt_flg", 950322609);
        setIntField(term29932, term29932.getClass(), "year", 2024);
        setShortField(term29932, term29932.getClass(), "month", (short) 4);
        setShortField(term29932, term29932.getClass(), "day", (short) 24);
        setField(term29931, term29931.getClass(), "date", term29932);
        setByteField(term29936, term29936.getClass(), "hour", (byte) 7);
        setByteField(term29936, term29936.getClass(), "minute", (byte) 2);
        setByteField(term29936, term29936.getClass(), "second", (byte) 51);
        setIntField(term29936, term29936.getClass(), "nano", 635502964);
        setField(term29931, term29931.getClass(), "time", term29936);
        setField(term29736, term29736.getClass(), "pdddt_tm", term29931);
        setIntField(term29736, term29736.getClass(), "nblss_ltt_stts", -2023791789);
        setIntField(term29736, term29736.getClass(), "nblss_ltt_tckt", 353974456);
        setIntField(term29736, term29736.getClass(), "nblss_ltt_is_opn", -485108462);
        setIntField(term29736, term29736.getClass(), "nblss_ltt_prz", 1418551216);
        setIntField(term29736, term29736.getClass(), "nblss_ltt_nxt_stts", -626779272);
        setIntField(term29736, term29736.getClass(), "nblss_ltt_nxt_tckt", -1150062870);
        setField(term29736, term29736.getClass(), "my_qst_id", "rgZSPplPSs");
        setField(term29736, term29736.getClass(), "my_qst_r_qid", "NPUSTXlEKx");
        setField(term29736, term29736.getClass(), "my_qst_r_knd", "KKFprGoNpl");
        setField(term29736, term29736.getClass(), "my_qst_r_vl", "tWVISJlxKZ");
        setField(term29736, term29736.getClass(), "my_qst_r_nflg", "rOZkUKEoaf");
        setField(term29736, term29736.getClass(), "my_ccd_r_qid", "yLnzGqyHGL");
        setField(term29736, term29736.getClass(), "my_ccd_r_hnd", "IjprPXBDuY");
        setField(term29736, term29736.getClass(), "my_ccd_r_vp", "wkqPmmFDAa");
        setField(term29736, term29736.getClass(), "cmd", "rLTDtNqLyW");
        setField(term29736, term29736.getClass(), "req_id", "CLsbWobdgS");
        setField(term29736, term29736.getClass(), "stat", "TbYrjEyFPc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_nxt_stts", argTypes, term29736, args);
    }

};


